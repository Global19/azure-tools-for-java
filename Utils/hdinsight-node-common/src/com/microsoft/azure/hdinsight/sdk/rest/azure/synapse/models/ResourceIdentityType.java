/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.microsoft.azure.hdinsight.sdk.rest.azure.synapse.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ResourceIdentityType.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum ResourceIdentityType {
    /** Enum value None. */
    NONE("None"),

    /** Enum value SystemAssigned. */
    SYSTEM_ASSIGNED("SystemAssigned");

    /** The actual serialized value for a ResourceIdentityType instance. */
    private String value;

    ResourceIdentityType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ResourceIdentityType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ResourceIdentityType object, or null if unable to parse.
     */
    @JsonCreator
    public static ResourceIdentityType fromString(String value) {
        ResourceIdentityType[] items = ResourceIdentityType.values();
        for (ResourceIdentityType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
