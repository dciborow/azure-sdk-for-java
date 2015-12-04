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
import com.microsoft.azure.management.network.models.Route;
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
import retrofit.http.PUT;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in RoutesOperations.
 */
public interface RoutesOperations {
    /**
     * The interface defining all the services for RoutesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RoutesService {
        @HTTP(path = "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}/routes/{routeName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("resourceGroupName") String resourceGroupName, @Path("routeTableName") String routeTableName, @Path("routeName") String routeName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}/routes/{routeName}")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("routeTableName") String routeTableName, @Path("routeName") String routeName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @PUT("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}/routes/{routeName}")
        Call<ResponseBody> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("routeTableName") String routeTableName, @Path("routeName") String routeName, @Path("subscriptionId") String subscriptionId, @Body Route routeParameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}/routes")
        Call<ResponseBody> list(@Path("resourceGroupName") String resourceGroupName, @Path("routeTableName") String routeTableName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * The delete route operation deletes the specified route from a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String routeTableName, String routeName) throws ServiceException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The delete route operation deletes the specified route from a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsync(String resourceGroupName, String routeTableName, String routeName, final ServiceCallback<Void> serviceCallback);

    /**
     * The Get route operation retreives information about the specified route from the route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Route object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Route> get(String resourceGroupName, String routeTableName, String routeName) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * The Get route operation retreives information about the specified route from the route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String resourceGroupName, String routeTableName, String routeName, final ServiceCallback<Route> serviceCallback);

    /**
     * The Put route operation creates/updates a route in the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param routeParameters Parameters supplied to the create/update routeoperation
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Route object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Route> createOrUpdate(String resourceGroupName, String routeTableName, String routeName, Route routeParameters) throws ServiceException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put route operation creates/updates a route in the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param routeParameters Parameters supplied to the create/update routeoperation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, String routeTableName, String routeName, Route routeParameters, final ServiceCallback<Route> serviceCallback);

    /**
     * The List network security rule opertion retrieves all the routes in a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;Route&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Route>> list(String resourceGroupName, String routeTableName) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * The List network security rule opertion retrieves all the routes in a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(String resourceGroupName, String routeTableName, final ServiceCallback<PageImpl<Route>> serviceCallback);

    /**
     * The List network security rule opertion retrieves all the routes in a route table.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;Route&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Route>> listNext(String nextPageLink) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * The List network security rule opertion retrieves all the routes in a route table.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Route>> serviceCallback);

}
