/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network.models;

import java.util.List;

/**
 * The List Usages operation response.
 */
public class UsagesListResult {
    /**
     * Gets or sets the list Network Resource Usages.
     */
    private List<Usage> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<Usage> getValue() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     */
    public void setValue(List<Usage> value) {
        this.value = value;
    }

}
