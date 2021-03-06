/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.microsoft.azure.hdinsight.sdk.rest.azure.datalake.analytics.accounts.models;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters used to create a new compute policy while creating a new Data
 * Lake Analytics account.
 */
@JsonFlatten
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateComputePolicyWithAccountParameters {
    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class Properties {
        /**
         * The AAD object identifier for the entity to create a policy for.
         */
        @JsonProperty(value = "objectId", required = true)
        private UUID objectId;

        /**
         * The type of AAD object the object identifier refers to. Possible values
         * include: 'User', 'Group', 'ServicePrincipal'.
         */
        @JsonProperty(value = "objectType", required = true)
        private AADObjectType objectType;

        /**
         * The maximum degree of parallelism per job this user can use to submit
         * jobs. This property, the min priority per job property, or both must be
         * passed.
         */
        @JsonProperty(value = "maxDegreeOfParallelismPerJob")
        private Integer maxDegreeOfParallelismPerJob;

        /**
         * The minimum priority per job this user can use to submit jobs. This
         * property, the max degree of parallelism per job property, or both must
         * be passed.
         */
        @JsonProperty(value = "minPriorityPerJob")
        private Integer minPriorityPerJob;
    }

    /**
     * The properties
     */
    @JsonProperty(value = "properties")
    private Properties properties;

    /**
     * The unique name of the compute policy to create.
     */
    @JsonProperty(value = "name", required = true)
    private String name;


    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the CreateComputePolicyWithAccountParameters object itself.
     */
    public CreateComputePolicyWithAccountParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the objectId value.
     *
     * @return the objectId value
     */
    public UUID objectId() {
        return properties == null ? null : properties.objectId;
    }

    /**
     * Set the objectId value.
     *
     * @param objectId the objectId value to set
     * @return the CreateComputePolicyWithAccountParameters object itself.
     */
    public CreateComputePolicyWithAccountParameters withObjectId(UUID objectId) {
        if (this.properties == null) {
            this.properties = new Properties();
        }

        this.properties.objectId = objectId;
        return this;
    }

    /**
     * Get the objectType value.
     *
     * @return the objectType value
     */
    public AADObjectType objectType() {
        return properties == null ? null : properties.objectType;
    }

    /**
     * Set the objectType value.
     *
     * @param objectType the objectType value to set
     * @return the CreateComputePolicyWithAccountParameters object itself.
     */
    public CreateComputePolicyWithAccountParameters withObjectType(AADObjectType objectType) {
        if (this.properties == null) {
            this.properties = new Properties();
        }

        this.properties.objectType = objectType;
        return this;
    }

    /**
     * Get the maxDegreeOfParallelismPerJob value.
     *
     * @return the maxDegreeOfParallelismPerJob value
     */
    public Integer maxDegreeOfParallelismPerJob() {
        return properties == null ? null : properties.maxDegreeOfParallelismPerJob;
    }

    /**
     * Set the maxDegreeOfParallelismPerJob value.
     *
     * @param maxDegreeOfParallelismPerJob the maxDegreeOfParallelismPerJob value to set
     * @return the CreateComputePolicyWithAccountParameters object itself.
     */
    public CreateComputePolicyWithAccountParameters withMaxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob) {
        if (this.properties == null) {
            this.properties = new Properties();
        }

        this.properties.maxDegreeOfParallelismPerJob = maxDegreeOfParallelismPerJob;
        return this;
    }

    /**
     * Get the minPriorityPerJob value.
     *
     * @return the minPriorityPerJob value
     */
    public Integer minPriorityPerJob() {
        return properties == null ? null : properties.minPriorityPerJob;
    }

    /**
     * Set the minPriorityPerJob value.
     *
     * @param minPriorityPerJob the minPriorityPerJob value to set
     * @return the CreateComputePolicyWithAccountParameters object itself.
     */
    public CreateComputePolicyWithAccountParameters withMinPriorityPerJob(Integer minPriorityPerJob) {
        if (this.properties == null) {
            this.properties = new Properties();
        }

        this.properties.minPriorityPerJob = minPriorityPerJob;
        return this;
    }

}
