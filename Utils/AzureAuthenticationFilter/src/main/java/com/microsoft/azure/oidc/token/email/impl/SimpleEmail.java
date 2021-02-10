/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.microsoft.azure.oidc.token.email.impl;

import com.microsoft.azure.oidc.exception.PreconditionException;
import com.microsoft.azure.oidc.token.email.Email;

final class SimpleEmail implements Email {
    private final String value;

    public SimpleEmail(final String value) {
        if(value == null) {
            throw new PreconditionException("Required parameter is null");
        }
        this.value = value;
    }
    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SimpleEmail other = (SimpleEmail) obj;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }
}
