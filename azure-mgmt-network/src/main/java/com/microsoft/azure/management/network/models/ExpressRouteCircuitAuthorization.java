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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Authorization in a ExpressRouteCircuit resource.
 */
public class ExpressRouteCircuitAuthorization extends SubResource {
    /**
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Gets or sets the authorization key.
     */
    @JsonProperty(value = "properties.authorizationKey")
    private String authorizationKey;

    /**
     * Gets or sets AuthorizationUseStatus. Possible values for this property
     * include: 'Available', 'InUse'.
     */
    @JsonProperty(value = "properties.authorizationUseStatus")
    private String authorizationUseStatus;

    /**
     * Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     */
    public void setEtag(String etag) {
        this.etag = etag;
    }

    /**
     * Get the authorizationKey value.
     *
     * @return the authorizationKey value
     */
    public String getAuthorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set the authorizationKey value.
     *
     * @param authorizationKey the authorizationKey value to set
     */
    public void setAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
    }

    /**
     * Get the authorizationUseStatus value.
     *
     * @return the authorizationUseStatus value
     */
    public String getAuthorizationUseStatus() {
        return this.authorizationUseStatus;
    }

    /**
     * Set the authorizationUseStatus value.
     *
     * @param authorizationUseStatus the authorizationUseStatus value to set
     */
    public void setAuthorizationUseStatus(String authorizationUseStatus) {
        this.authorizationUseStatus = authorizationUseStatus;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     */
    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

}
