/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.azure.management.network.models.VirtualNetworkGateway;
import com.microsoft.azure.management.network.models.VpnClientParameters;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.HTTP;
import retrofit.http.Path;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualNetworkGatewaysOperations.
 */
public interface VirtualNetworkGatewaysOperations {
    /**
     * The interface defining all the services for VirtualNetworkGatewaysOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VirtualNetworkGatewaysService {
        @PUT("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualnetworkgateways/{virtualNetworkGatewayName}")
        Call<ResponseBody> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("virtualNetworkGatewayName") String virtualNetworkGatewayName, @Path("subscriptionId") String subscriptionId, @Body VirtualNetworkGateway parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualnetworkgateways/{virtualNetworkGatewayName}")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("virtualNetworkGatewayName") String virtualNetworkGatewayName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @HTTP(path = "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworkGateways/{virtualNetworkGatewayName}/", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("resourceGroupName") String resourceGroupName, @Path("virtualNetworkGatewayName") String virtualNetworkGatewayName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworkGateways")
        Call<ResponseBody> list(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @POST("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualnetworkgateways/{virtualNetworkGatewayName}/reset")
        Call<ResponseBody> reset(@Path("resourceGroupName") String resourceGroupName, @Path("virtualNetworkGatewayName") String virtualNetworkGatewayName, @Path("subscriptionId") String subscriptionId, @Body VirtualNetworkGateway parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @POST("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualnetworkgateways/{virtualNetworkGatewayName}/generatevpnclientpackage")
        Call<ResponseBody> generatevpnclientpackage(@Path("resourceGroupName") String resourceGroupName, @Path("virtualNetworkGatewayName") String virtualNetworkGatewayName, @Path("subscriptionId") String subscriptionId, @Body VpnClientParameters parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * The Put VirtualNetworkGateway operation creates/updates a virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the Begin Create or update Virtual Network Gateway operation through Network resource provider.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the VirtualNetworkGateway object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualNetworkGateway> createOrUpdate(String resourceGroupName, String virtualNetworkGatewayName, VirtualNetworkGateway parameters) throws ServiceException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put VirtualNetworkGateway operation creates/updates a virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the Begin Create or update Virtual Network Gateway operation through Network resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, String virtualNetworkGatewayName, VirtualNetworkGateway parameters, final ServiceCallback<VirtualNetworkGateway> serviceCallback);

    /**
     * The Get VirtualNetworkGateway operation retrieves information about the specified virtual network gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualNetworkGateway object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualNetworkGateway> get(String resourceGroupName, String virtualNetworkGatewayName) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * The Get VirtualNetworkGateway operation retrieves information about the specified virtual network gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String resourceGroupName, String virtualNetworkGatewayName, final ServiceCallback<VirtualNetworkGateway> serviceCallback);

    /**
     * The Delete VirtualNetworkGateway operation deletes the specifed virtual network Gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String virtualNetworkGatewayName) throws ServiceException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Delete VirtualNetworkGateway operation deletes the specifed virtual network Gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsync(String resourceGroupName, String virtualNetworkGatewayName, final ServiceCallback<Void> serviceCallback);

    /**
     * The List VirtualNetworkGateways opertion retrieves all the virtual network gateways stored.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;VirtualNetworkGateway&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<VirtualNetworkGateway>> list(String resourceGroupName) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * The List VirtualNetworkGateways opertion retrieves all the virtual network gateways stored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(String resourceGroupName, final ServiceCallback<PageImpl<VirtualNetworkGateway>> serviceCallback);

    /**
     * The Reset VirtualNetworkGateway operation resets the primary of the virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the Begin Reset Virtual Network Gateway operation through Network resource provider.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the VirtualNetworkGateway object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualNetworkGateway> reset(String resourceGroupName, String virtualNetworkGatewayName, VirtualNetworkGateway parameters) throws ServiceException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Reset VirtualNetworkGateway operation resets the primary of the virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the Begin Reset Virtual Network Gateway operation through Network resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> resetAsync(String resourceGroupName, String virtualNetworkGatewayName, VirtualNetworkGateway parameters, final ServiceCallback<VirtualNetworkGateway> serviceCallback);

    /**
     * The Generatevpnclientpackage operation generates Vpn client package for P2S client of the virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the Begin Generating  Virtual Network Gateway Vpn client package operation through Network resource provider.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the String object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<String> generatevpnclientpackage(String resourceGroupName, String virtualNetworkGatewayName, VpnClientParameters parameters) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * The Generatevpnclientpackage operation generates Vpn client package for P2S client of the virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the Begin Generating  Virtual Network Gateway Vpn client package operation through Network resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> generatevpnclientpackageAsync(String resourceGroupName, String virtualNetworkGatewayName, VpnClientParameters parameters, final ServiceCallback<String> serviceCallback);

    /**
     * The List VirtualNetworkGateways opertion retrieves all the virtual network gateways stored.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;VirtualNetworkGateway&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<VirtualNetworkGateway>> listNext(String nextPageLink) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * The List VirtualNetworkGateways opertion retrieves all the virtual network gateways stored.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<VirtualNetworkGateway>> serviceCallback);

}
