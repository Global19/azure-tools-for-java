/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.microsoft.azure.hdinsight.sdk.rest.azure.synapse.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error details.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorDetail {
    /**
     * Error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Error target.
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * Get error message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set error message.
     *
     * @param message the message value to set
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set error code.
     *
     * @param code the code value to set
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get error target.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set error target.
     *
     * @param target the target value to set
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail withTarget(String target) {
        this.target = target;
        return this;
    }

}
