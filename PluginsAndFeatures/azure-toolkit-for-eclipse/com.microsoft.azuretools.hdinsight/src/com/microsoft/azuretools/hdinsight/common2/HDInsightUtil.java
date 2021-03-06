/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.microsoft.azuretools.hdinsight.common2;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import com.microsoft.azuretools.azurecommons.helpers.NotNull;
import com.microsoft.azuretools.azurecommons.helpers.Nullable;
import com.microsoft.azuretools.hdinsight.Activator;
import com.microsoft.azuretools.hdinsight.SparkSubmissionToolWindowView;

import rx.subjects.ReplaySubject;

import com.microsoft.azure.hdinsight.common.MessageInfoType;
import static com.microsoft.azure.hdinsight.common.MessageInfoType.*;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Optional;

public class HDInsightUtil {
    private static SparkSubmissionToolWindowView sparkSubmissionToolWindowView;

    // The replay subject for the message showed in HDInsight tool window
    // The replay subject will replay all notifications before the initialization is
    // done
    // The replay buffer size is 1MB.
    @NotNull
    @SuppressWarnings("null")
    private static ReplaySubject<SimpleImmutableEntry<MessageInfoType, String>> toolWindowMessageSubject =
            ReplaySubject.create(1024 * 1024);

    @NotNull
    public static ReplaySubject<SimpleImmutableEntry<MessageInfoType, String>> getToolWindowMessageSubject() {
        return toolWindowMessageSubject;
    }

    @Nullable
    public static SparkSubmissionToolWindowView getSparkSubmissionToolWindowView() {
        if (sparkSubmissionToolWindowView == null) {
            Display.getDefault().syncExec(new Runnable() {
                @Override
                public void run() {
                    try {
                        sparkSubmissionToolWindowView = (SparkSubmissionToolWindowView) PlatformUI.getWorkbench()
                                .getActiveWorkbenchWindow().getActivePage()
                                .showView(SparkSubmissionToolWindowView.class.getName());

                        Optional.ofNullable(sparkSubmissionToolWindowView)
                                .ifPresent(view -> resetToolWindowMessageSubject(view));
                    } catch (PartInitException e) {
                        Activator.getDefault().log(e.getMessage(), e);
                    }
                }
            });
        }
        return sparkSubmissionToolWindowView;
    }

    public static synchronized void setHyperLinkWithText(final String text, final String hyperlinkUrl, final String anchorText) {
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                SparkSubmissionToolWindowView view = getSparkSubmissionToolWindowView();

                if (view != null) {
                    view.setHyperLinkWithText(text, hyperlinkUrl, anchorText);
                }
            }
        });
    }

    public static void showInfoOnSubmissionMessageWindow(@NotNull final String message) {
        showInfoOnSubmissionMessageWindow(Info, message, false);
    }

    public static void showErrorMessageOnSubmissionMessageWindow(@NotNull final String message) {
        showInfoOnSubmissionMessageWindow(Error, message, false);
    }

    public static void showWarningMessageOnSubmissionMessageWindow(@NotNull final String message) {
        showInfoOnSubmissionMessageWindow(Warning, message, false);
    }

    private static void showInfoOnSubmissionMessageWindow(@NotNull final MessageInfoType type,
                                                          @NotNull final String message,
                                                          final boolean isNeedClear) {
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                showSubmissionMessage(getSparkSubmissionToolWindowView(), message, type, isNeedClear);
            }
        });
    }

    private static void resetToolWindowMessageSubject(@Nullable SparkSubmissionToolWindowView sparkSubmissionToolWindowView) {
        if (sparkSubmissionToolWindowView == null) {
            return;
        }

        toolWindowMessageSubject = ReplaySubject.create(1024 * 1024);

        getToolWindowMessageSubject().subscribe(entry -> {
            String message = entry.getValue();

            switch (entry.getKey()) {
            case Error:
                sparkSubmissionToolWindowView.setError(message);
                break;
            case Info:
                sparkSubmissionToolWindowView.setInfo(message);
                break;
            case Warning:
                sparkSubmissionToolWindowView.setWarning(message);
                break;
            default:
                break;
            }
        });
    }

    private static void showSubmissionMessage(@Nullable SparkSubmissionToolWindowView sparkSubmissionView,
                                              @NotNull String message,
                                              @NotNull MessageInfoType type,
                                              final boolean isNeedClear) {
        if (isNeedClear && sparkSubmissionView != null) {
            sparkSubmissionView.clearAll();
            resetToolWindowMessageSubject(sparkSubmissionView);
        }

        getToolWindowMessageSubject().onNext(new SimpleImmutableEntry<>(type, message));
    }
}
