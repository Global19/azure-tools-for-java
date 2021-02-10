/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.microsoft.azure.hdinsight.sdk.rest.spark.task;

public class ShuffleWriteMetrics {
    private long bytesWritten;

    private long recordsWritten;

    private long writeTime;

    public long getBytesWritten ()
    {
        return bytesWritten;
    }

    public void setBytesWritten (long bytesWritten)
    {
        this.bytesWritten = bytesWritten;
    }

    public long getRecordsWritten ()
    {
        return recordsWritten;
    }

    public void setRecordsWritten (long recordsWritten)
    {
        this.recordsWritten = recordsWritten;
    }

    public long getWriteTime ()
    {
        return writeTime;
    }

    public void setWriteTime (long writeTime)
    {
        this.writeTime = writeTime;
    }
}
