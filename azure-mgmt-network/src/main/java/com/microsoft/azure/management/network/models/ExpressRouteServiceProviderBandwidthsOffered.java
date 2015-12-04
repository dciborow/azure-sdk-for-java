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


/**
 * Contains Bandwidths offered in ExpressRouteServiceProviders.
 */
public class ExpressRouteServiceProviderBandwidthsOffered {
    /**
     * Gets the OfferName.
     */
    private String offerName;

    /**
     * Gets the ValueInMbps.
     */
    private Integer valueInMbps;

    /**
     * Get the offerName value.
     *
     * @return the offerName value
     */
    public String getOfferName() {
        return this.offerName;
    }

    /**
     * Set the offerName value.
     *
     * @param offerName the offerName value to set
     */
    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    /**
     * Get the valueInMbps value.
     *
     * @return the valueInMbps value
     */
    public Integer getValueInMbps() {
        return this.valueInMbps;
    }

    /**
     * Set the valueInMbps value.
     *
     * @param valueInMbps the valueInMbps value to set
     */
    public void setValueInMbps(Integer valueInMbps) {
        this.valueInMbps = valueInMbps;
    }

}
