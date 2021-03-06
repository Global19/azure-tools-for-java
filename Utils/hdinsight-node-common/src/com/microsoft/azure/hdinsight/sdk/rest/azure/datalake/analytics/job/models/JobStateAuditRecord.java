/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.microsoft.azure.hdinsight.sdk.rest.azure.datalake.analytics.job.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Data Lake Analytics job state audit records for tracking the lifecycle of a job.
 */
public class JobStateAuditRecord {
    /**
     * The new state the job is in.
     */
    @JsonProperty(value = "newState", access = JsonProperty.Access.WRITE_ONLY)
    private String newState;

    /**
     * The time stamp that the state change took place.
     */
    @JsonProperty(value = "timeStamp", access = JsonProperty.Access.WRITE_ONLY)
    private String timeStamp;

    /**
     * The user who requests the change.
     */
    @JsonProperty(value = "requestedByUser", access = JsonProperty.Access.WRITE_ONLY)
    private String requestedByUser;

    /**
     * The details of the audit log.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private String details;

    /**
     * Get the new state the job is in.
     *
     * @return the newState value
     */
    public String newState() {
        return this.newState;
    }

    /**
     * Get the time stamp that the state change took place.
     *
     * @return the timeStamp value
     */
    public String timeStamp() {
        return this.timeStamp;
    }

    /**
     * Get the user who requests the change.
     *
     * @return the requestedByUser value
     */
    public String requestedByUser() {
        return this.requestedByUser;
    }

    /**
     * Get the details of the audit log.
     *
     * @return the details value
     */
    public String details() {
        return this.details;
    }

}
