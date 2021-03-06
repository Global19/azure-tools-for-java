/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.microsoft.azure.hdinsight.sdk.rest.azure.datalake.analytics.job.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Data Lake Analytics job statistics vertex stage information.
 */
public class JobStatisticsVertexStage {
    /**
     * The amount of data read, in bytes.
     */
    @JsonProperty(value = "dataRead", access = JsonProperty.Access.WRITE_ONLY)
    private Long dataRead;

    /**
     * The amount of data read across multiple pods, in bytes.
     */
    @JsonProperty(value = "dataReadCrossPod", access = JsonProperty.Access.WRITE_ONLY)
    private Long dataReadCrossPod;

    /**
     * The amount of data read in one pod, in bytes.
     */
    @JsonProperty(value = "dataReadIntraPod", access = JsonProperty.Access.WRITE_ONLY)
    private Long dataReadIntraPod;

    /**
     * The amount of data remaining to be read, in bytes.
     */
    @JsonProperty(value = "dataToRead", access = JsonProperty.Access.WRITE_ONLY)
    private Long dataToRead;

    /**
     * The amount of data written, in bytes.
     */
    @JsonProperty(value = "dataWritten", access = JsonProperty.Access.WRITE_ONLY)
    private Long dataWritten;

    /**
     * The number of duplicates that were discarded.
     */
    @JsonProperty(value = "duplicateDiscardCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer duplicateDiscardCount;

    /**
     * The number of failures that occured in this stage.
     */
    @JsonProperty(value = "failedCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer failedCount;

    /**
     * The maximum amount of data read in a single vertex, in bytes.
     */
    @JsonProperty(value = "maxVertexDataRead", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxVertexDataRead;

    /**
     * The minimum amount of data read in a single vertex, in bytes.
     */
    @JsonProperty(value = "minVertexDataRead", access = JsonProperty.Access.WRITE_ONLY)
    private Long minVertexDataRead;

    /**
     * The number of read failures in this stage.
     */
    @JsonProperty(value = "readFailureCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer readFailureCount;

    /**
     * The number of vertices that were revoked during this stage.
     */
    @JsonProperty(value = "revocationCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer revocationCount;

    /**
     * The number of currently running vertices in this stage.
     */
    @JsonProperty(value = "runningCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer runningCount;

    /**
     * The number of currently scheduled vertices in this stage.
     */
    @JsonProperty(value = "scheduledCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer scheduledCount;

    /**
     * The name of this stage in job execution.
     */
    @JsonProperty(value = "stageName", access = JsonProperty.Access.WRITE_ONLY)
    private String stageName;

    /**
     * The number of vertices that succeeded in this stage.
     */
    @JsonProperty(value = "succeededCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer succeededCount;

    /**
     * The amount of temporary data written, in bytes.
     */
    @JsonProperty(value = "tempDataWritten", access = JsonProperty.Access.WRITE_ONLY)
    private Long tempDataWritten;

    /**
     * The total vertex count for this stage.
     */
    @JsonProperty(value = "totalCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalCount;

    /**
     * The amount of time that failed vertices took up in this stage.
     */
    @JsonProperty(value = "totalFailedTime", access = JsonProperty.Access.WRITE_ONLY)
    private String totalFailedTime;

    /**
     * The current progress of this stage, as a percentage.
     */
    @JsonProperty(value = "totalProgress", access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalProgress;

    /**
     * The amount of time all successful vertices took in this stage.
     */
    @JsonProperty(value = "totalSucceededTime", access = JsonProperty.Access.WRITE_ONLY)
    private String totalSucceededTime;

    /**
     * The sum of the peak memory usage of all the vertices in the stage, in bytes.
     */
    @JsonProperty(value = "totalPeakMemUsage", access = JsonProperty.Access.WRITE_ONLY)
    private Long totalPeakMemUsage;

    /**
     * The sum of the total execution time of all the vertices in the stage.
     */
    @JsonProperty(value = "totalExecutionTime", access = JsonProperty.Access.WRITE_ONLY)
    private String totalExecutionTime;

    /**
     * the vertex with the maximum amount of data read.
     */
    @JsonProperty(value = "maxDataReadVertex")
    private JobStatisticsVertex maxDataReadVertex;

    /**
     * the vertex with the maximum execution time.
     */
    @JsonProperty(value = "maxExecutionTimeVertex")
    private JobStatisticsVertex maxExecutionTimeVertex;

    /**
     * the vertex with the maximum peak memory usage.
     */
    @JsonProperty(value = "maxPeakMemUsageVertex")
    private JobStatisticsVertex maxPeakMemUsageVertex;

    /**
     * The estimated vertex CPU core count.
     */
    @JsonProperty(value = "estimatedVertexCpuCoreCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer estimatedVertexCpuCoreCount;

    /**
     * The estimated vertex peak CPU core count.
     */
    @JsonProperty(value = "estimatedVertexPeakCpuCoreCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer estimatedVertexPeakCpuCoreCount;

    /**
     * The estimated vertex memory size, in bytes.
     */
    @JsonProperty(value = "estimatedVertexMemSize", access = JsonProperty.Access.WRITE_ONLY)
    private Long estimatedVertexMemSize;

    /**
     * The statistics information for the allocated container CPU core count.
     */
    @JsonProperty(value = "allocatedContainerCpuCoreCount")
    private ResourceUsageStatistics allocatedContainerCpuCoreCount;

    /**
     * The statistics information for the allocated container memory size.
     */
    @JsonProperty(value = "allocatedContainerMemSize")
    private ResourceUsageStatistics allocatedContainerMemSize;

    /**
     * The statistics information for the used vertex CPU core count.
     */
    @JsonProperty(value = "usedVertexCpuCoreCount")
    private ResourceUsageStatistics usedVertexCpuCoreCount;

    /**
     * The statistics information for the used vertex peak memory size.
     */
    @JsonProperty(value = "usedVertexPeakMemSize")
    private ResourceUsageStatistics usedVertexPeakMemSize;

    /**
     * Get the amount of data read, in bytes.
     *
     * @return the dataRead value
     */
    public Long dataRead() {
        return this.dataRead;
    }

    /**
     * Get the amount of data read across multiple pods, in bytes.
     *
     * @return the dataReadCrossPod value
     */
    public Long dataReadCrossPod() {
        return this.dataReadCrossPod;
    }

    /**
     * Get the amount of data read in one pod, in bytes.
     *
     * @return the dataReadIntraPod value
     */
    public Long dataReadIntraPod() {
        return this.dataReadIntraPod;
    }

    /**
     * Get the amount of data remaining to be read, in bytes.
     *
     * @return the dataToRead value
     */
    public Long dataToRead() {
        return this.dataToRead;
    }

    /**
     * Get the amount of data written, in bytes.
     *
     * @return the dataWritten value
     */
    public Long dataWritten() {
        return this.dataWritten;
    }

    /**
     * Get the number of duplicates that were discarded.
     *
     * @return the duplicateDiscardCount value
     */
    public Integer duplicateDiscardCount() {
        return this.duplicateDiscardCount;
    }

    /**
     * Get the number of failures that occured in this stage.
     *
     * @return the failedCount value
     */
    public Integer failedCount() {
        return this.failedCount;
    }

    /**
     * Get the maximum amount of data read in a single vertex, in bytes.
     *
     * @return the maxVertexDataRead value
     */
    public Long maxVertexDataRead() {
        return this.maxVertexDataRead;
    }

    /**
     * Get the minimum amount of data read in a single vertex, in bytes.
     *
     * @return the minVertexDataRead value
     */
    public Long minVertexDataRead() {
        return this.minVertexDataRead;
    }

    /**
     * Get the number of read failures in this stage.
     *
     * @return the readFailureCount value
     */
    public Integer readFailureCount() {
        return this.readFailureCount;
    }

    /**
     * Get the number of vertices that were revoked during this stage.
     *
     * @return the revocationCount value
     */
    public Integer revocationCount() {
        return this.revocationCount;
    }

    /**
     * Get the number of currently running vertices in this stage.
     *
     * @return the runningCount value
     */
    public Integer runningCount() {
        return this.runningCount;
    }

    /**
     * Get the number of currently scheduled vertices in this stage.
     *
     * @return the scheduledCount value
     */
    public Integer scheduledCount() {
        return this.scheduledCount;
    }

    /**
     * Get the name of this stage in job execution.
     *
     * @return the stageName value
     */
    public String stageName() {
        return this.stageName;
    }

    /**
     * Get the number of vertices that succeeded in this stage.
     *
     * @return the succeededCount value
     */
    public Integer succeededCount() {
        return this.succeededCount;
    }

    /**
     * Get the amount of temporary data written, in bytes.
     *
     * @return the tempDataWritten value
     */
    public Long tempDataWritten() {
        return this.tempDataWritten;
    }

    /**
     * Get the total vertex count for this stage.
     *
     * @return the totalCount value
     */
    public Integer totalCount() {
        return this.totalCount;
    }

    /**
     * Get the amount of time that failed vertices took up in this stage.
     *
     * @return the totalFailedTime value
     */
    public String totalFailedTime() {
        return this.totalFailedTime;
    }

    /**
     * Get the current progress of this stage, as a percentage.
     *
     * @return the totalProgress value
     */
    public Integer totalProgress() {
        return this.totalProgress;
    }

    /**
     * Get the amount of time all successful vertices took in this stage.
     *
     * @return the totalSucceededTime value
     */
    public String totalSucceededTime() {
        return this.totalSucceededTime;
    }

    /**
     * Get the sum of the peak memory usage of all the vertices in the stage, in bytes.
     *
     * @return the totalPeakMemUsage value
     */
    public Long totalPeakMemUsage() {
        return this.totalPeakMemUsage;
    }

    /**
     * Get the sum of the total execution time of all the vertices in the stage.
     *
     * @return the totalExecutionTime value
     */
    public String totalExecutionTime() {
        return this.totalExecutionTime;
    }

    /**
     * Get the vertex with the maximum amount of data read.
     *
     * @return the maxDataReadVertex value
     */
    public JobStatisticsVertex maxDataReadVertex() {
        return this.maxDataReadVertex;
    }

    /**
     * Set the vertex with the maximum amount of data read.
     *
     * @param maxDataReadVertex the maxDataReadVertex value to set
     * @return the JobStatisticsVertexStage object itself.
     */
    public JobStatisticsVertexStage withMaxDataReadVertex(JobStatisticsVertex maxDataReadVertex) {
        this.maxDataReadVertex = maxDataReadVertex;
        return this;
    }

    /**
     * Get the vertex with the maximum execution time.
     *
     * @return the maxExecutionTimeVertex value
     */
    public JobStatisticsVertex maxExecutionTimeVertex() {
        return this.maxExecutionTimeVertex;
    }

    /**
     * Set the vertex with the maximum execution time.
     *
     * @param maxExecutionTimeVertex the maxExecutionTimeVertex value to set
     * @return the JobStatisticsVertexStage object itself.
     */
    public JobStatisticsVertexStage withMaxExecutionTimeVertex(JobStatisticsVertex maxExecutionTimeVertex) {
        this.maxExecutionTimeVertex = maxExecutionTimeVertex;
        return this;
    }

    /**
     * Get the vertex with the maximum peak memory usage.
     *
     * @return the maxPeakMemUsageVertex value
     */
    public JobStatisticsVertex maxPeakMemUsageVertex() {
        return this.maxPeakMemUsageVertex;
    }

    /**
     * Set the vertex with the maximum peak memory usage.
     *
     * @param maxPeakMemUsageVertex the maxPeakMemUsageVertex value to set
     * @return the JobStatisticsVertexStage object itself.
     */
    public JobStatisticsVertexStage withMaxPeakMemUsageVertex(JobStatisticsVertex maxPeakMemUsageVertex) {
        this.maxPeakMemUsageVertex = maxPeakMemUsageVertex;
        return this;
    }

    /**
     * Get the estimated vertex CPU core count.
     *
     * @return the estimatedVertexCpuCoreCount value
     */
    public Integer estimatedVertexCpuCoreCount() {
        return this.estimatedVertexCpuCoreCount;
    }

    /**
     * Get the estimated vertex peak CPU core count.
     *
     * @return the estimatedVertexPeakCpuCoreCount value
     */
    public Integer estimatedVertexPeakCpuCoreCount() {
        return this.estimatedVertexPeakCpuCoreCount;
    }

    /**
     * Get the estimated vertex memory size, in bytes.
     *
     * @return the estimatedVertexMemSize value
     */
    public Long estimatedVertexMemSize() {
        return this.estimatedVertexMemSize;
    }

    /**
     * Get the statistics information for the allocated container CPU core count.
     *
     * @return the allocatedContainerCpuCoreCount value
     */
    public ResourceUsageStatistics allocatedContainerCpuCoreCount() {
        return this.allocatedContainerCpuCoreCount;
    }

    /**
     * Set the statistics information for the allocated container CPU core count.
     *
     * @param allocatedContainerCpuCoreCount the allocatedContainerCpuCoreCount value to set
     * @return the JobStatisticsVertexStage object itself.
     */
    public JobStatisticsVertexStage withAllocatedContainerCpuCoreCount(ResourceUsageStatistics allocatedContainerCpuCoreCount) {
        this.allocatedContainerCpuCoreCount = allocatedContainerCpuCoreCount;
        return this;
    }

    /**
     * Get the statistics information for the allocated container memory size.
     *
     * @return the allocatedContainerMemSize value
     */
    public ResourceUsageStatistics allocatedContainerMemSize() {
        return this.allocatedContainerMemSize;
    }

    /**
     * Set the statistics information for the allocated container memory size.
     *
     * @param allocatedContainerMemSize the allocatedContainerMemSize value to set
     * @return the JobStatisticsVertexStage object itself.
     */
    public JobStatisticsVertexStage withAllocatedContainerMemSize(ResourceUsageStatistics allocatedContainerMemSize) {
        this.allocatedContainerMemSize = allocatedContainerMemSize;
        return this;
    }

    /**
     * Get the statistics information for the used vertex CPU core count.
     *
     * @return the usedVertexCpuCoreCount value
     */
    public ResourceUsageStatistics usedVertexCpuCoreCount() {
        return this.usedVertexCpuCoreCount;
    }

    /**
     * Set the statistics information for the used vertex CPU core count.
     *
     * @param usedVertexCpuCoreCount the usedVertexCpuCoreCount value to set
     * @return the JobStatisticsVertexStage object itself.
     */
    public JobStatisticsVertexStage withUsedVertexCpuCoreCount(ResourceUsageStatistics usedVertexCpuCoreCount) {
        this.usedVertexCpuCoreCount = usedVertexCpuCoreCount;
        return this;
    }

    /**
     * Get the statistics information for the used vertex peak memory size.
     *
     * @return the usedVertexPeakMemSize value
     */
    public ResourceUsageStatistics usedVertexPeakMemSize() {
        return this.usedVertexPeakMemSize;
    }

    /**
     * Set the statistics information for the used vertex peak memory size.
     *
     * @param usedVertexPeakMemSize the usedVertexPeakMemSize value to set
     * @return the JobStatisticsVertexStage object itself.
     */
    public JobStatisticsVertexStage withUsedVertexPeakMemSize(ResourceUsageStatistics usedVertexPeakMemSize) {
        this.usedVertexPeakMemSize = usedVertexPeakMemSize;
        return this;
    }

}
