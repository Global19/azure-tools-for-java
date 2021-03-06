/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.microsoft.azure.hdinsight.sdk.rest.azure.datalake.analytics.job.models;

import java.util.UUID;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Job Pipeline Information, showing the relationship of jobs and recurrences of those jobs in a pipeline.
 */
public class JobPipelineInformation {
    /**
     * The job relationship pipeline identifier (a GUID).
     */
    @JsonProperty(value = "pipelineId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID pipelineId;

    /**
     * The friendly name of the job relationship pipeline, which does not need to be unique.
     */
    @JsonProperty(value = "pipelineName", access = JsonProperty.Access.WRITE_ONLY)
    private String pipelineName;

    /**
     * The pipeline uri, unique, links to the originating service for this pipeline.
     */
    @JsonProperty(value = "pipelineUri", access = JsonProperty.Access.WRITE_ONLY)
    private String pipelineUri;

    /**
     * The number of jobs in this pipeline that have failed.
     */
    @JsonProperty(value = "numJobsFailed", access = JsonProperty.Access.WRITE_ONLY)
    private Integer numJobsFailed;

    /**
     * The number of jobs in this pipeline that have been canceled.
     */
    @JsonProperty(value = "numJobsCanceled", access = JsonProperty.Access.WRITE_ONLY)
    private Integer numJobsCanceled;

    /**
     * The number of jobs in this pipeline that have succeeded.
     */
    @JsonProperty(value = "numJobsSucceeded", access = JsonProperty.Access.WRITE_ONLY)
    private Integer numJobsSucceeded;

    /**
     * The number of job execution hours that resulted in failed jobs.
     */
    @JsonProperty(value = "auHoursFailed", access = JsonProperty.Access.WRITE_ONLY)
    private Double auHoursFailed;

    /**
     * The number of job execution hours that resulted in canceled jobs.
     */
    @JsonProperty(value = "auHoursCanceled", access = JsonProperty.Access.WRITE_ONLY)
    private Double auHoursCanceled;

    /**
     * The number of job execution hours that resulted in successful jobs.
     */
    @JsonProperty(value = "auHoursSucceeded", access = JsonProperty.Access.WRITE_ONLY)
    private Double auHoursSucceeded;

    /**
     * The last time a job in this pipeline was submitted.
     */
    @JsonProperty(value = "lastSubmitTime", access = JsonProperty.Access.WRITE_ONLY)
    private String lastSubmitTime;

    /**
     * The list of recurrence identifiers representing each run of this pipeline.
     */
    @JsonProperty(value = "runs", access = JsonProperty.Access.WRITE_ONLY)
    private List<JobPipelineRunInformation> runs;

    /**
     * The list of recurrence identifiers representing each run of this pipeline.
     */
    @JsonProperty(value = "recurrences", access = JsonProperty.Access.WRITE_ONLY)
    private List<UUID> recurrences;

    /**
     * Get the job relationship pipeline identifier (a GUID).
     *
     * @return the pipelineId value
     */
    public UUID pipelineId() {
        return this.pipelineId;
    }

    /**
     * Get the friendly name of the job relationship pipeline, which does not need to be unique.
     *
     * @return the pipelineName value
     */
    public String pipelineName() {
        return this.pipelineName;
    }

    /**
     * Get the pipeline uri, unique, links to the originating service for this pipeline.
     *
     * @return the pipelineUri value
     */
    public String pipelineUri() {
        return this.pipelineUri;
    }

    /**
     * Get the number of jobs in this pipeline that have failed.
     *
     * @return the numJobsFailed value
     */
    public Integer numJobsFailed() {
        return this.numJobsFailed;
    }

    /**
     * Get the number of jobs in this pipeline that have been canceled.
     *
     * @return the numJobsCanceled value
     */
    public Integer numJobsCanceled() {
        return this.numJobsCanceled;
    }

    /**
     * Get the number of jobs in this pipeline that have succeeded.
     *
     * @return the numJobsSucceeded value
     */
    public Integer numJobsSucceeded() {
        return this.numJobsSucceeded;
    }

    /**
     * Get the number of job execution hours that resulted in failed jobs.
     *
     * @return the auHoursFailed value
     */
    public Double auHoursFailed() {
        return this.auHoursFailed;
    }

    /**
     * Get the number of job execution hours that resulted in canceled jobs.
     *
     * @return the auHoursCanceled value
     */
    public Double auHoursCanceled() {
        return this.auHoursCanceled;
    }

    /**
     * Get the number of job execution hours that resulted in successful jobs.
     *
     * @return the auHoursSucceeded value
     */
    public Double auHoursSucceeded() {
        return this.auHoursSucceeded;
    }

    /**
     * Get the last time a job in this pipeline was submitted.
     *
     * @return the lastSubmitTime value
     */
    public String lastSubmitTime() {
        return this.lastSubmitTime;
    }

    /**
     * Get the list of recurrence identifiers representing each run of this pipeline.
     *
     * @return the runs value
     */
    public List<JobPipelineRunInformation> runs() {
        return this.runs;
    }

    /**
     * Get the list of recurrence identifiers representing each run of this pipeline.
     *
     * @return the recurrences value
     */
    public List<UUID> recurrences() {
        return this.recurrences;
    }

}
