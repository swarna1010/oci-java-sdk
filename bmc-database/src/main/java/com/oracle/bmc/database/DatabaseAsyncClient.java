/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.database.requests.*;
import com.oracle.bmc.database.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Database service. <br>
 * There are two ways to use async client: 1. Use AsyncHandler: using AsyncHandler, if the response
 * to the call is an {@link java.io.InputStream}, like getObject Api in object storage service,
 * developers need to process the stream in AsyncHandler, and not anywhere else, because the stream
 * will be closed right after the AsyncHandler is invoked. <br>
 * 2. Use Java Future: using Java Future, developers need to close the stream after they are done
 * with the Java Future.<br>
 * Accessing the result should be done in a mutually exclusive manner, either through the Future or
 * the AsyncHandler, but not both. If the Future is used, the caller should pass in null as the
 * AsyncHandler. If the AsyncHandler is used, it is still safe to use the Future to determine
 * whether or not the request was completed via Future.isDone/isCancelled.<br>
 * Please refer to
 * https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class DatabaseAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DatabaseAsync {
    /** Service instance for Database. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATABASE")
                    .serviceEndpointPrefix("database")
                    .serviceEndpointTemplate("https://database.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DatabaseAsyncClient.class);

    private DatabaseAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(builder, authenticationDetailsProvider);
    }

    /**
     * Create a builder for this client.
     *
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be
     * passed to the {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DatabaseAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public DatabaseAsyncClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DatabaseAsyncClient(this, authenticationDetailsProvider);
        }
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        super.setRegion(region);
    }

    @Override
    public void setRegion(String regionId) {
        super.setRegion(regionId);
    }

    @Override
    public java.util.concurrent.Future<ActivateExadataInfrastructureResponse>
            activateExadataInfrastructure(
                    ActivateExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ActivateExadataInfrastructureRequest,
                                    ActivateExadataInfrastructureResponse>
                            handler) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");
        Objects.requireNonNull(
                request.getActivateExadataInfrastructureDetails(),
                "activateExadataInfrastructureDetails is required");

        return clientCall(request, ActivateExadataInfrastructureResponse::builder)
                .logger(LOG, "activateExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "ActivateExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/ActivateExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ActivateExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("activate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExadataInfrastructure.class,
                        ActivateExadataInfrastructureResponse.Builder::exadataInfrastructure)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ActivateExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", ActivateExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ActivateExadataInfrastructureResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddStorageCapacityCloudExadataInfrastructureResponse>
            addStorageCapacityCloudExadataInfrastructure(
                    AddStorageCapacityCloudExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddStorageCapacityCloudExadataInfrastructureRequest,
                                    AddStorageCapacityCloudExadataInfrastructureResponse>
                            handler) {

        Validate.notBlank(
                request.getCloudExadataInfrastructureId(),
                "cloudExadataInfrastructureId must not be blank");

        return clientCall(request, AddStorageCapacityCloudExadataInfrastructureResponse::builder)
                .logger(LOG, "addStorageCapacityCloudExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "AddStorageCapacityCloudExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudExadataInfrastructure/AddStorageCapacityCloudExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddStorageCapacityCloudExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudExadataInfrastructures")
                .appendPathParam(request.getCloudExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("addStorageCapacity")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.database.model.CloudExadataInfrastructure.class,
                        AddStorageCapacityCloudExadataInfrastructureResponse.Builder
                                ::cloudExadataInfrastructure)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddStorageCapacityCloudExadataInfrastructureResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", AddStorageCapacityCloudExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddStorageCapacityCloudExadataInfrastructureResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddStorageCapacityExadataInfrastructureResponse>
            addStorageCapacityExadataInfrastructure(
                    AddStorageCapacityExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddStorageCapacityExadataInfrastructureRequest,
                                    AddStorageCapacityExadataInfrastructureResponse>
                            handler) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        return clientCall(request, AddStorageCapacityExadataInfrastructureResponse::builder)
                .logger(LOG, "addStorageCapacityExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "AddStorageCapacityExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/AddStorageCapacityExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddStorageCapacityExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("addStorageCapacity")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.database.model.ExadataInfrastructure.class,
                        AddStorageCapacityExadataInfrastructureResponse.Builder
                                ::exadataInfrastructure)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddStorageCapacityExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", AddStorageCapacityExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddStorageCapacityExadataInfrastructureResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddVirtualMachineToCloudVmClusterResponse>
            addVirtualMachineToCloudVmCluster(
                    AddVirtualMachineToCloudVmClusterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddVirtualMachineToCloudVmClusterRequest,
                                    AddVirtualMachineToCloudVmClusterResponse>
                            handler) {
        Objects.requireNonNull(
                request.getAddVirtualMachineToCloudVmClusterDetails(),
                "addVirtualMachineToCloudVmClusterDetails is required");

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        return clientCall(request, AddVirtualMachineToCloudVmClusterResponse::builder)
                .logger(LOG, "addVirtualMachineToCloudVmCluster")
                .serviceDetails(
                        "Database",
                        "AddVirtualMachineToCloudVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/AddVirtualMachineToCloudVmCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddVirtualMachineToCloudVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("addVirtualMachine")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.CloudVmCluster.class,
                        AddVirtualMachineToCloudVmClusterResponse.Builder::cloudVmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddVirtualMachineToCloudVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", AddVirtualMachineToCloudVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddVirtualMachineToCloudVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddVirtualMachineToVmClusterResponse>
            addVirtualMachineToVmCluster(
                    AddVirtualMachineToVmClusterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddVirtualMachineToVmClusterRequest,
                                    AddVirtualMachineToVmClusterResponse>
                            handler) {
        Objects.requireNonNull(
                request.getAddVirtualMachineToVmClusterDetails(),
                "addVirtualMachineToVmClusterDetails is required");

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        return clientCall(request, AddVirtualMachineToVmClusterResponse::builder)
                .logger(LOG, "addVirtualMachineToVmCluster")
                .serviceDetails(
                        "Database",
                        "AddVirtualMachineToVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmCluster/AddVirtualMachineToVmCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddVirtualMachineToVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("addVirtualMachine")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.VmCluster.class,
                        AddVirtualMachineToVmClusterResponse.Builder::vmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddVirtualMachineToVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", AddVirtualMachineToVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddVirtualMachineToVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AutonomousDatabaseManualRefreshResponse>
            autonomousDatabaseManualRefresh(
                    AutonomousDatabaseManualRefreshRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AutonomousDatabaseManualRefreshRequest,
                                    AutonomousDatabaseManualRefreshResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getAutonomousDatabaseManualRefreshDetails(),
                "autonomousDatabaseManualRefreshDetails is required");

        return clientCall(request, AutonomousDatabaseManualRefreshResponse::builder)
                .logger(LOG, "autonomousDatabaseManualRefresh")
                .serviceDetails(
                        "Database",
                        "AutonomousDatabaseManualRefresh",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/AutonomousDatabaseManualRefresh")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AutonomousDatabaseManualRefreshRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        AutonomousDatabaseManualRefreshResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString(
                        "etag", AutonomousDatabaseManualRefreshResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AutonomousDatabaseManualRefreshResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AutonomousDatabaseManualRefreshResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAutonomousContainerDatabaseCompartmentResponse>
            changeAutonomousContainerDatabaseCompartment(
                    ChangeAutonomousContainerDatabaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAutonomousContainerDatabaseCompartmentRequest,
                                    ChangeAutonomousContainerDatabaseCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        return clientCall(request, ChangeAutonomousContainerDatabaseCompartmentResponse::builder)
                .logger(LOG, "changeAutonomousContainerDatabaseCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeAutonomousContainerDatabaseCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabase/ChangeAutonomousContainerDatabaseCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAutonomousContainerDatabaseCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeAutonomousContainerDatabaseCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAutonomousContainerDatabaseCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAutonomousContainerDatabaseCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAutonomousDatabaseCompartmentResponse>
            changeAutonomousDatabaseCompartment(
                    ChangeAutonomousDatabaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAutonomousDatabaseCompartmentRequest,
                                    ChangeAutonomousDatabaseCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, ChangeAutonomousDatabaseCompartmentResponse::builder)
                .logger(LOG, "changeAutonomousDatabaseCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeAutonomousDatabaseCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/ChangeAutonomousDatabaseCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAutonomousDatabaseCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeAutonomousDatabaseCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAutonomousDatabaseCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAutonomousDatabaseCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAutonomousExadataInfrastructureCompartmentResponse>
            changeAutonomousExadataInfrastructureCompartment(
                    ChangeAutonomousExadataInfrastructureCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAutonomousExadataInfrastructureCompartmentRequest,
                                    ChangeAutonomousExadataInfrastructureCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        Validate.notBlank(
                request.getAutonomousExadataInfrastructureId(),
                "autonomousExadataInfrastructureId must not be blank");

        return clientCall(
                        request, ChangeAutonomousExadataInfrastructureCompartmentResponse::builder)
                .logger(LOG, "changeAutonomousExadataInfrastructureCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeAutonomousExadataInfrastructureCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousExadataInfrastructure/ChangeAutonomousExadataInfrastructureCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAutonomousExadataInfrastructureCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructures")
                .appendPathParam(request.getAutonomousExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag",
                        ChangeAutonomousExadataInfrastructureCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAutonomousExadataInfrastructureCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAutonomousExadataInfrastructureCompartmentResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAutonomousVmClusterCompartmentResponse>
            changeAutonomousVmClusterCompartment(
                    ChangeAutonomousVmClusterCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAutonomousVmClusterCompartmentRequest,
                                    ChangeAutonomousVmClusterCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeAutonomousVmClusterCompartmentDetails(),
                "changeAutonomousVmClusterCompartmentDetails is required");

        Validate.notBlank(
                request.getAutonomousVmClusterId(), "autonomousVmClusterId must not be blank");

        return clientCall(request, ChangeAutonomousVmClusterCompartmentResponse::builder)
                .logger(LOG, "changeAutonomousVmClusterCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeAutonomousVmClusterCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousVmCluster/ChangeAutonomousVmClusterCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAutonomousVmClusterCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousVmClusters")
                .appendPathParam(request.getAutonomousVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAutonomousVmClusterCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAutonomousVmClusterCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeBackupDestinationCompartmentResponse>
            changeBackupDestinationCompartment(
                    ChangeBackupDestinationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBackupDestinationCompartmentRequest,
                                    ChangeBackupDestinationCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        Validate.notBlank(
                request.getBackupDestinationId(), "backupDestinationId must not be blank");

        return clientCall(request, ChangeBackupDestinationCompartmentResponse::builder)
                .logger(LOG, "changeBackupDestinationCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeBackupDestinationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/BackupDestination/ChangeBackupDestinationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeBackupDestinationCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backupDestinations")
                .appendPathParam(request.getBackupDestinationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeBackupDestinationCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeBackupDestinationCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeBackupDestinationCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeCloudAutonomousVmClusterCompartmentResponse>
            changeCloudAutonomousVmClusterCompartment(
                    ChangeCloudAutonomousVmClusterCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCloudAutonomousVmClusterCompartmentRequest,
                                    ChangeCloudAutonomousVmClusterCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeCloudAutonomousVmClusterCompartmentDetails(),
                "changeCloudAutonomousVmClusterCompartmentDetails is required");

        Validate.notBlank(
                request.getCloudAutonomousVmClusterId(),
                "cloudAutonomousVmClusterId must not be blank");

        return clientCall(request, ChangeCloudAutonomousVmClusterCompartmentResponse::builder)
                .logger(LOG, "changeCloudAutonomousVmClusterCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeCloudAutonomousVmClusterCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudAutonomousVmCluster/ChangeCloudAutonomousVmClusterCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCloudAutonomousVmClusterCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudAutonomousVmClusters")
                .appendPathParam(request.getCloudAutonomousVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeCloudAutonomousVmClusterCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCloudAutonomousVmClusterCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeCloudExadataInfrastructureCompartmentResponse>
            changeCloudExadataInfrastructureCompartment(
                    ChangeCloudExadataInfrastructureCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCloudExadataInfrastructureCompartmentRequest,
                                    ChangeCloudExadataInfrastructureCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeCloudExadataInfrastructureCompartmentDetails(),
                "changeCloudExadataInfrastructureCompartmentDetails is required");

        Validate.notBlank(
                request.getCloudExadataInfrastructureId(),
                "cloudExadataInfrastructureId must not be blank");

        return clientCall(request, ChangeCloudExadataInfrastructureCompartmentResponse::builder)
                .logger(LOG, "changeCloudExadataInfrastructureCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeCloudExadataInfrastructureCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudExadataInfrastructure/ChangeCloudExadataInfrastructureCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCloudExadataInfrastructureCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudExadataInfrastructures")
                .appendPathParam(request.getCloudExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeCloudExadataInfrastructureCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCloudExadataInfrastructureCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeCloudVmClusterCompartmentResponse>
            changeCloudVmClusterCompartment(
                    ChangeCloudVmClusterCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCloudVmClusterCompartmentRequest,
                                    ChangeCloudVmClusterCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeCloudVmClusterCompartmentDetails(),
                "changeCloudVmClusterCompartmentDetails is required");

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        return clientCall(request, ChangeCloudVmClusterCompartmentResponse::builder)
                .logger(LOG, "changeCloudVmClusterCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeCloudVmClusterCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/ChangeCloudVmClusterCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCloudVmClusterCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeCloudVmClusterCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCloudVmClusterCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDatabaseSoftwareImageCompartmentResponse>
            changeDatabaseSoftwareImageCompartment(
                    ChangeDatabaseSoftwareImageCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseSoftwareImageCompartmentRequest,
                                    ChangeDatabaseSoftwareImageCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        Validate.notBlank(
                request.getDatabaseSoftwareImageId(), "databaseSoftwareImageId must not be blank");

        return clientCall(request, ChangeDatabaseSoftwareImageCompartmentResponse::builder)
                .logger(LOG, "changeDatabaseSoftwareImageCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeDatabaseSoftwareImageCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DatabaseSoftwareImage/ChangeDatabaseSoftwareImageCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDatabaseSoftwareImageCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databaseSoftwareImages")
                .appendPathParam(request.getDatabaseSoftwareImageId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeDatabaseSoftwareImageCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDatabaseSoftwareImageCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDatabaseSoftwareImageCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDataguardRoleResponse> changeDataguardRole(
            ChangeDataguardRoleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeDataguardRoleRequest, ChangeDataguardRoleResponse>
                    handler) {
        Objects.requireNonNull(
                request.getChangeDataguardRoleDetails(), "changeDataguardRoleDetails is required");

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        return clientCall(request, ChangeDataguardRoleResponse::builder)
                .logger(LOG, "changeDataguardRole")
                .serviceDetails(
                        "Database",
                        "ChangeDataguardRole",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabase/ChangeDataguardRole")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDataguardRoleRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeDataguardRole")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousContainerDatabase.class,
                        ChangeDataguardRoleResponse.Builder::autonomousContainerDatabase)
                .handleResponseHeaderString("etag", ChangeDataguardRoleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDataguardRoleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeDataguardRoleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDbSystemCompartmentResponse> changeDbSystemCompartment(
            ChangeDbSystemCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeDbSystemCompartmentRequest, ChangeDbSystemCompartmentResponse>
                    handler) {
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, ChangeDbSystemCompartmentResponse::builder)
                .logger(LOG, "changeDbSystemCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeDbSystemCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/ChangeDbSystemCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDbSystemCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString("etag", ChangeDbSystemCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDbSystemCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeDbSystemCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeExadataInfrastructureCompartmentResponse>
            changeExadataInfrastructureCompartment(
                    ChangeExadataInfrastructureCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExadataInfrastructureCompartmentRequest,
                                    ChangeExadataInfrastructureCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeExadataInfrastructureCompartmentDetails(),
                "changeExadataInfrastructureCompartmentDetails is required");

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        return clientCall(request, ChangeExadataInfrastructureCompartmentResponse::builder)
                .logger(LOG, "changeExadataInfrastructureCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeExadataInfrastructureCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/ChangeExadataInfrastructureCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeExadataInfrastructureCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeExadataInfrastructureCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeExadataInfrastructureCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeExternalContainerDatabaseCompartmentResponse>
            changeExternalContainerDatabaseCompartment(
                    ChangeExternalContainerDatabaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExternalContainerDatabaseCompartmentRequest,
                                    ChangeExternalContainerDatabaseCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");

        return clientCall(request, ChangeExternalContainerDatabaseCompartmentResponse::builder)
                .logger(LOG, "changeExternalContainerDatabaseCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeExternalContainerDatabaseCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/ChangeExternalContainerDatabaseCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeExternalContainerDatabaseCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeExternalContainerDatabaseCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeExternalContainerDatabaseCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeExternalContainerDatabaseCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeExternalNonContainerDatabaseCompartmentResponse>
            changeExternalNonContainerDatabaseCompartment(
                    ChangeExternalNonContainerDatabaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExternalNonContainerDatabaseCompartmentRequest,
                                    ChangeExternalNonContainerDatabaseCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");

        return clientCall(request, ChangeExternalNonContainerDatabaseCompartmentResponse::builder)
                .logger(LOG, "changeExternalNonContainerDatabaseCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeExternalNonContainerDatabaseCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/ChangeExternalNonContainerDatabaseCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeExternalNonContainerDatabaseCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeExternalNonContainerDatabaseCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeExternalNonContainerDatabaseCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeExternalNonContainerDatabaseCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeExternalPluggableDatabaseCompartmentResponse>
            changeExternalPluggableDatabaseCompartment(
                    ChangeExternalPluggableDatabaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExternalPluggableDatabaseCompartmentRequest,
                                    ChangeExternalPluggableDatabaseCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");

        return clientCall(request, ChangeExternalPluggableDatabaseCompartmentResponse::builder)
                .logger(LOG, "changeExternalPluggableDatabaseCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeExternalPluggableDatabaseCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/ChangeExternalPluggableDatabaseCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeExternalPluggableDatabaseCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeExternalPluggableDatabaseCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeExternalPluggableDatabaseCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeExternalPluggableDatabaseCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeKeyStoreCompartmentResponse> changeKeyStoreCompartment(
            ChangeKeyStoreCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeKeyStoreCompartmentRequest, ChangeKeyStoreCompartmentResponse>
                    handler) {
        Objects.requireNonNull(
                request.getChangeKeyStoreCompartmentDetails(),
                "changeKeyStoreCompartmentDetails is required");

        Validate.notBlank(request.getKeyStoreId(), "keyStoreId must not be blank");

        return clientCall(request, ChangeKeyStoreCompartmentResponse::builder)
                .logger(LOG, "changeKeyStoreCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeKeyStoreCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/KeyStore/ChangeKeyStoreCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeKeyStoreCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("keyStores")
                .appendPathParam(request.getKeyStoreId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeKeyStoreCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeKeyStoreCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeVmClusterCompartmentResponse>
            changeVmClusterCompartment(
                    ChangeVmClusterCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVmClusterCompartmentRequest,
                                    ChangeVmClusterCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeVmClusterCompartmentDetails(),
                "changeVmClusterCompartmentDetails is required");

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        return clientCall(request, ChangeVmClusterCompartmentResponse::builder)
                .logger(LOG, "changeVmClusterCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeVmClusterCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmCluster/ChangeVmClusterCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeVmClusterCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeVmClusterCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeVmClusterCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CheckExternalDatabaseConnectorConnectionStatusResponse>
            checkExternalDatabaseConnectorConnectionStatus(
                    CheckExternalDatabaseConnectorConnectionStatusRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CheckExternalDatabaseConnectorConnectionStatusRequest,
                                    CheckExternalDatabaseConnectorConnectionStatusResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalDatabaseConnectorId(),
                "externalDatabaseConnectorId must not be blank");

        return clientCall(request, CheckExternalDatabaseConnectorConnectionStatusResponse::builder)
                .logger(LOG, "checkExternalDatabaseConnectorConnectionStatus")
                .serviceDetails(
                        "Database",
                        "CheckExternalDatabaseConnectorConnectionStatus",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalDatabaseConnector/CheckExternalDatabaseConnectorConnectionStatus")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CheckExternalDatabaseConnectorConnectionStatusRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externaldatabaseconnectors")
                .appendPathParam(request.getExternalDatabaseConnectorId())
                .appendPathParam("actions")
                .appendPathParam("checkConnectionStatus")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CheckExternalDatabaseConnectorConnectionStatusResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CheckExternalDatabaseConnectorConnectionStatusResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "etag",
                        CheckExternalDatabaseConnectorConnectionStatusResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CompleteExternalBackupJobResponse> completeExternalBackupJob(
            CompleteExternalBackupJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CompleteExternalBackupJobRequest, CompleteExternalBackupJobResponse>
                    handler) {

        Validate.notBlank(request.getBackupId(), "backupId must not be blank");
        Objects.requireNonNull(
                request.getCompleteExternalBackupJobDetails(),
                "completeExternalBackupJobDetails is required");

        return clientCall(request, CompleteExternalBackupJobResponse::builder)
                .logger(LOG, "completeExternalBackupJob")
                .serviceDetails(
                        "Database",
                        "CompleteExternalBackupJob",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalBackupJob/CompleteExternalBackupJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CompleteExternalBackupJobRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalBackupJobs")
                .appendPathParam(request.getBackupId())
                .appendPathParam("actions")
                .appendPathParam("complete")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalBackupJob.class,
                        CompleteExternalBackupJobResponse.Builder::externalBackupJob)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CompleteExternalBackupJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CompleteExternalBackupJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CompleteExternalBackupJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ConfigureAutonomousDatabaseVaultKeyResponse>
            configureAutonomousDatabaseVaultKey(
                    ConfigureAutonomousDatabaseVaultKeyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureAutonomousDatabaseVaultKeyRequest,
                                    ConfigureAutonomousDatabaseVaultKeyResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getConfigureAutonomousDatabaseVaultKeyDetails(),
                "configureAutonomousDatabaseVaultKeyDetails is required");

        return clientCall(request, ConfigureAutonomousDatabaseVaultKeyResponse::builder)
                .logger(LOG, "configureAutonomousDatabaseVaultKey")
                .serviceDetails(
                        "Database",
                        "ConfigureAutonomousDatabaseVaultKey",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/ConfigureAutonomousDatabaseVaultKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConfigureAutonomousDatabaseVaultKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("configureAutonomousDatabaseVaultKey")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ConfigureAutonomousDatabaseVaultKeyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ConfigureAutonomousDatabaseVaultKeyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ConvertToPdbResponse> convertToPdb(
            ConvertToPdbRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ConvertToPdbRequest, ConvertToPdbResponse>
                    handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(request.getConvertToPdbDetails(), "convertToPdbDetails is required");

        return clientCall(request, ConvertToPdbResponse::builder)
                .logger(LOG, "convertToPdb")
                .serviceDetails(
                        "Database",
                        "ConvertToPdb",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/ConvertToPdb")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConvertToPdbRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("convertToPdb")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        ConvertToPdbResponse.Builder::database)
                .handleResponseHeaderString(
                        "opc-work-request-id", ConvertToPdbResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", ConvertToPdbResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ConvertToPdbResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAutonomousContainerDatabaseResponse>
            createAutonomousContainerDatabase(
                    CreateAutonomousContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateAutonomousContainerDatabaseRequest,
                                    CreateAutonomousContainerDatabaseResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateAutonomousContainerDatabaseDetails(),
                "createAutonomousContainerDatabaseDetails is required");

        return clientCall(request, CreateAutonomousContainerDatabaseResponse::builder)
                .logger(LOG, "createAutonomousContainerDatabase")
                .serviceDetails(
                        "Database",
                        "CreateAutonomousContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabase/CreateAutonomousContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAutonomousContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousContainerDatabase.class,
                        CreateAutonomousContainerDatabaseResponse.Builder
                                ::autonomousContainerDatabase)
                .handleResponseHeaderString(
                        "etag", CreateAutonomousContainerDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateAutonomousContainerDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateAutonomousContainerDatabaseResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAutonomousDatabaseResponse> createAutonomousDatabase(
            CreateAutonomousDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAutonomousDatabaseRequest, CreateAutonomousDatabaseResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateAutonomousDatabaseDetails(),
                "createAutonomousDatabaseDetails is required");

        return clientCall(request, CreateAutonomousDatabaseResponse::builder)
                .logger(LOG, "createAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "CreateAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/CreateAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        CreateAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString("etag", CreateAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAutonomousDatabaseBackupResponse>
            createAutonomousDatabaseBackup(
                    CreateAutonomousDatabaseBackupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateAutonomousDatabaseBackupRequest,
                                    CreateAutonomousDatabaseBackupResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateAutonomousDatabaseBackupDetails(),
                "createAutonomousDatabaseBackupDetails is required");

        return clientCall(request, CreateAutonomousDatabaseBackupResponse::builder)
                .logger(LOG, "createAutonomousDatabaseBackup")
                .serviceDetails(
                        "Database",
                        "CreateAutonomousDatabaseBackup",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseBackup/CreateAutonomousDatabaseBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAutonomousDatabaseBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabaseBackups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabaseBackup.class,
                        CreateAutonomousDatabaseBackupResponse.Builder::autonomousDatabaseBackup)
                .handleResponseHeaderString(
                        "etag", CreateAutonomousDatabaseBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateAutonomousDatabaseBackupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateAutonomousDatabaseBackupResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAutonomousVmClusterResponse> createAutonomousVmCluster(
            CreateAutonomousVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAutonomousVmClusterRequest, CreateAutonomousVmClusterResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateAutonomousVmClusterDetails(),
                "createAutonomousVmClusterDetails is required");

        return clientCall(request, CreateAutonomousVmClusterResponse::builder)
                .logger(LOG, "createAutonomousVmCluster")
                .serviceDetails(
                        "Database",
                        "CreateAutonomousVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousVmCluster/CreateAutonomousVmCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAutonomousVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousVmClusters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousVmCluster.class,
                        CreateAutonomousVmClusterResponse.Builder::autonomousVmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateAutonomousVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateAutonomousVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAutonomousVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBackupResponse> createBackup(
            CreateBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateBackupRequest, CreateBackupResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateBackupDetails(), "createBackupDetails is required");

        return clientCall(request, CreateBackupResponse::builder)
                .logger(LOG, "createBackup")
                .serviceDetails(
                        "Database",
                        "CreateBackup",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Backup/CreateBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.Backup.class,
                        CreateBackupResponse.Builder::backup)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBackupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBackupDestinationResponse> createBackupDestination(
            CreateBackupDestinationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBackupDestinationRequest, CreateBackupDestinationResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateBackupDestinationDetails(),
                "createBackupDestinationDetails is required");

        return clientCall(request, CreateBackupDestinationResponse::builder)
                .logger(LOG, "createBackupDestination")
                .serviceDetails(
                        "Database",
                        "CreateBackupDestination",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/BackupDestination/CreateBackupDestination")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBackupDestinationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backupDestinations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.BackupDestination.class,
                        CreateBackupDestinationResponse.Builder::backupDestination)
                .handleResponseHeaderString("etag", CreateBackupDestinationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBackupDestinationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCloudAutonomousVmClusterResponse>
            createCloudAutonomousVmCluster(
                    CreateCloudAutonomousVmClusterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateCloudAutonomousVmClusterRequest,
                                    CreateCloudAutonomousVmClusterResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateCloudAutonomousVmClusterDetails(),
                "createCloudAutonomousVmClusterDetails is required");

        return clientCall(request, CreateCloudAutonomousVmClusterResponse::builder)
                .logger(LOG, "createCloudAutonomousVmCluster")
                .serviceDetails(
                        "Database",
                        "CreateCloudAutonomousVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudAutonomousVmCluster/CreateCloudAutonomousVmCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCloudAutonomousVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudAutonomousVmClusters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.CloudAutonomousVmCluster.class,
                        CreateCloudAutonomousVmClusterResponse.Builder::cloudAutonomousVmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateCloudAutonomousVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", CreateCloudAutonomousVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateCloudAutonomousVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCloudExadataInfrastructureResponse>
            createCloudExadataInfrastructure(
                    CreateCloudExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateCloudExadataInfrastructureRequest,
                                    CreateCloudExadataInfrastructureResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateCloudExadataInfrastructureDetails(),
                "createCloudExadataInfrastructureDetails is required");

        return clientCall(request, CreateCloudExadataInfrastructureResponse::builder)
                .logger(LOG, "createCloudExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "CreateCloudExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudExadataInfrastructure/CreateCloudExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCloudExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudExadataInfrastructures")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.CloudExadataInfrastructure.class,
                        CreateCloudExadataInfrastructureResponse.Builder
                                ::cloudExadataInfrastructure)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateCloudExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", CreateCloudExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateCloudExadataInfrastructureResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCloudVmClusterResponse> createCloudVmCluster(
            CreateCloudVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCloudVmClusterRequest, CreateCloudVmClusterResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateCloudVmClusterDetails(),
                "createCloudVmClusterDetails is required");

        return clientCall(request, CreateCloudVmClusterResponse::builder)
                .logger(LOG, "createCloudVmCluster")
                .serviceDetails(
                        "Database",
                        "CreateCloudVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/CreateCloudVmCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCloudVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.CloudVmCluster.class,
                        CreateCloudVmClusterResponse.Builder::cloudVmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateCloudVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateCloudVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCloudVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateConsoleConnectionResponse> createConsoleConnection(
            CreateConsoleConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateConsoleConnectionRequest, CreateConsoleConnectionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateConsoleConnectionDetails(),
                "createConsoleConnectionDetails is required");

        Validate.notBlank(request.getDbNodeId(), "dbNodeId must not be blank");

        return clientCall(request, CreateConsoleConnectionResponse::builder)
                .logger(LOG, "createConsoleConnection")
                .serviceDetails(
                        "Database",
                        "CreateConsoleConnection",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ConsoleConnection/CreateConsoleConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConsoleConnectionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbNodes")
                .appendPathParam(request.getDbNodeId())
                .appendPathParam("consoleConnections")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ConsoleConnection.class,
                        CreateConsoleConnectionResponse.Builder::consoleConnection)
                .handleResponseHeaderString("etag", CreateConsoleConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConsoleConnectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDataGuardAssociationResponse>
            createDataGuardAssociation(
                    CreateDataGuardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDataGuardAssociationRequest,
                                    CreateDataGuardAssociationResponse>
                            handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(
                request.getCreateDataGuardAssociationDetails(),
                "createDataGuardAssociationDetails is required");

        return clientCall(request, CreateDataGuardAssociationResponse::builder)
                .logger(LOG, "createDataGuardAssociation")
                .serviceDetails(
                        "Database",
                        "CreateDataGuardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DataGuardAssociation/CreateDataGuardAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDataGuardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("dataGuardAssociations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DataGuardAssociation.class,
                        CreateDataGuardAssociationResponse.Builder::dataGuardAssociation)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDataGuardAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", CreateDataGuardAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDataGuardAssociationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseResponse> createDatabase(
            CreateDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDatabaseRequest, CreateDatabaseResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateNewDatabaseDetails(), "createNewDatabaseDetails is required");

        return clientCall(request, CreateDatabaseResponse::builder)
                .logger(LOG, "createDatabase")
                .serviceDetails(
                        "Database",
                        "CreateDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/CreateDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        CreateDatabaseResponse.Builder::database)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseSoftwareImageResponse>
            createDatabaseSoftwareImage(
                    CreateDatabaseSoftwareImageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseSoftwareImageRequest,
                                    CreateDatabaseSoftwareImageResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateDatabaseSoftwareImageDetails(),
                "createDatabaseSoftwareImageDetails is required");

        return clientCall(request, CreateDatabaseSoftwareImageResponse::builder)
                .logger(LOG, "createDatabaseSoftwareImage")
                .serviceDetails(
                        "Database",
                        "CreateDatabaseSoftwareImage",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DatabaseSoftwareImage/CreateDatabaseSoftwareImage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDatabaseSoftwareImageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databaseSoftwareImages")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DatabaseSoftwareImage.class,
                        CreateDatabaseSoftwareImageResponse.Builder::databaseSoftwareImage)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDatabaseSoftwareImageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", CreateDatabaseSoftwareImageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDatabaseSoftwareImageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDbHomeResponse> createDbHome(
            CreateDbHomeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateDbHomeRequest, CreateDbHomeResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDbHomeWithDbSystemIdDetails(),
                "createDbHomeWithDbSystemIdDetails is required");

        return clientCall(request, CreateDbHomeResponse::builder)
                .logger(LOG, "createDbHome")
                .serviceDetails(
                        "Database",
                        "CreateDbHome",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbHome/CreateDbHome")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDbHomeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbHomes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DbHome.class,
                        CreateDbHomeResponse.Builder::dbHome)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDbHomeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateDbHomeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDbHomeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateExadataInfrastructureResponse>
            createExadataInfrastructure(
                    CreateExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExadataInfrastructureRequest,
                                    CreateExadataInfrastructureResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateExadataInfrastructureDetails(),
                "createExadataInfrastructureDetails is required");

        return clientCall(request, CreateExadataInfrastructureResponse::builder)
                .logger(LOG, "createExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "CreateExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/CreateExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExadataInfrastructure.class,
                        CreateExadataInfrastructureResponse.Builder::exadataInfrastructure)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", CreateExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateExadataInfrastructureResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateExternalBackupJobResponse> createExternalBackupJob(
            CreateExternalBackupJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateExternalBackupJobRequest, CreateExternalBackupJobResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateExternalBackupJobDetails(),
                "createExternalBackupJobDetails is required");

        return clientCall(request, CreateExternalBackupJobResponse::builder)
                .logger(LOG, "createExternalBackupJob")
                .serviceDetails(
                        "Database",
                        "CreateExternalBackupJob",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalBackupJob/CreateExternalBackupJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExternalBackupJobRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalBackupJobs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalBackupJob.class,
                        CreateExternalBackupJobResponse.Builder::externalBackupJob)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateExternalBackupJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateExternalBackupJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateExternalBackupJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateExternalContainerDatabaseResponse>
            createExternalContainerDatabase(
                    CreateExternalContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalContainerDatabaseRequest,
                                    CreateExternalContainerDatabaseResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateExternalContainerDatabaseDetails(),
                "createExternalContainerDatabaseDetails is required");

        return clientCall(request, CreateExternalContainerDatabaseResponse::builder)
                .logger(LOG, "createExternalContainerDatabase")
                .serviceDetails(
                        "Database",
                        "CreateExternalContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/CreateExternalContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExternalContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalContainerDatabase.class,
                        CreateExternalContainerDatabaseResponse.Builder::externalContainerDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateExternalContainerDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", CreateExternalContainerDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateExternalContainerDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateExternalDatabaseConnectorResponse>
            createExternalDatabaseConnector(
                    CreateExternalDatabaseConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalDatabaseConnectorRequest,
                                    CreateExternalDatabaseConnectorResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateExternalDatabaseConnectorDetails(),
                "createExternalDatabaseConnectorDetails is required");

        return clientCall(request, CreateExternalDatabaseConnectorResponse::builder)
                .logger(LOG, "createExternalDatabaseConnector")
                .serviceDetails(
                        "Database",
                        "CreateExternalDatabaseConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalDatabaseConnector/CreateExternalDatabaseConnector")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExternalDatabaseConnectorRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externaldatabaseconnectors")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalDatabaseConnector.class,
                        CreateExternalDatabaseConnectorResponse.Builder::externalDatabaseConnector)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateExternalDatabaseConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", CreateExternalDatabaseConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateExternalDatabaseConnectorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateExternalNonContainerDatabaseResponse>
            createExternalNonContainerDatabase(
                    CreateExternalNonContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalNonContainerDatabaseRequest,
                                    CreateExternalNonContainerDatabaseResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateExternalNonContainerDatabaseDetails(),
                "createExternalNonContainerDatabaseDetails is required");

        return clientCall(request, CreateExternalNonContainerDatabaseResponse::builder)
                .logger(LOG, "createExternalNonContainerDatabase")
                .serviceDetails(
                        "Database",
                        "CreateExternalNonContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/CreateExternalNonContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExternalNonContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalNonContainerDatabase.class,
                        CreateExternalNonContainerDatabaseResponse.Builder
                                ::externalNonContainerDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateExternalNonContainerDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", CreateExternalNonContainerDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateExternalNonContainerDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateExternalPluggableDatabaseResponse>
            createExternalPluggableDatabase(
                    CreateExternalPluggableDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalPluggableDatabaseRequest,
                                    CreateExternalPluggableDatabaseResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateExternalPluggableDatabaseDetails(),
                "createExternalPluggableDatabaseDetails is required");

        return clientCall(request, CreateExternalPluggableDatabaseResponse::builder)
                .logger(LOG, "createExternalPluggableDatabase")
                .serviceDetails(
                        "Database",
                        "CreateExternalPluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/CreateExternalPluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExternalPluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalPluggableDatabase.class,
                        CreateExternalPluggableDatabaseResponse.Builder::externalPluggableDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateExternalPluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", CreateExternalPluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateExternalPluggableDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateKeyStoreResponse> createKeyStore(
            CreateKeyStoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateKeyStoreRequest, CreateKeyStoreResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateKeyStoreDetails(), "createKeyStoreDetails is required");

        return clientCall(request, CreateKeyStoreResponse::builder)
                .logger(LOG, "createKeyStore")
                .serviceDetails(
                        "Database",
                        "CreateKeyStore",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/KeyStore/CreateKeyStore")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateKeyStoreRequest::builder)
                .basePath("/20160918")
                .appendPathParam("keyStores")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.KeyStore.class,
                        CreateKeyStoreResponse.Builder::keyStore)
                .handleResponseHeaderString("etag", CreateKeyStoreResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateKeyStoreResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePluggableDatabaseResponse> createPluggableDatabase(
            CreatePluggableDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePluggableDatabaseRequest, CreatePluggableDatabaseResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreatePluggableDatabaseDetails(),
                "createPluggableDatabaseDetails is required");

        return clientCall(request, CreatePluggableDatabaseResponse::builder)
                .logger(LOG, "createPluggableDatabase")
                .serviceDetails(
                        "Database",
                        "CreatePluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/CreatePluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        CreatePluggableDatabaseResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreatePluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreatePluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePluggableDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateVmClusterResponse> createVmCluster(
            CreateVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVmClusterRequest, CreateVmClusterResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateVmClusterDetails(), "createVmClusterDetails is required");

        return clientCall(request, CreateVmClusterResponse::builder)
                .logger(LOG, "createVmCluster")
                .serviceDetails(
                        "Database",
                        "CreateVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmCluster/CreateVmCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.VmCluster.class,
                        CreateVmClusterResponse.Builder::vmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateVmClusterNetworkResponse> createVmClusterNetwork(
            CreateVmClusterNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVmClusterNetworkRequest, CreateVmClusterNetworkResponse>
                    handler) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");
        Objects.requireNonNull(
                request.getVmClusterNetworkDetails(), "vmClusterNetworkDetails is required");

        return clientCall(request, CreateVmClusterNetworkResponse::builder)
                .logger(LOG, "createVmClusterNetwork")
                .serviceDetails(
                        "Database",
                        "CreateVmClusterNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterNetwork/CreateVmClusterNetwork")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVmClusterNetworkRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.VmClusterNetwork.class,
                        CreateVmClusterNetworkResponse.Builder::vmClusterNetwork)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateVmClusterNetworkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateVmClusterNetworkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVmClusterNetworkResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DbNodeActionResponse> dbNodeAction(
            DbNodeActionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DbNodeActionRequest, DbNodeActionResponse>
                    handler) {

        Validate.notBlank(request.getDbNodeId(), "dbNodeId must not be blank");
        Objects.requireNonNull(request.getAction(), "action is required");

        return clientCall(request, DbNodeActionResponse::builder)
                .logger(LOG, "dbNodeAction")
                .serviceDetails(
                        "Database",
                        "DbNodeAction",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbNode/DbNodeAction")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DbNodeActionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbNodes")
                .appendPathParam(request.getDbNodeId())
                .appendQueryParam("action", request.getAction())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.database.model.DbNode.class,
                        DbNodeActionResponse.Builder::dbNode)
                .handleResponseHeaderString(
                        "opc-work-request-id", DbNodeActionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", DbNodeActionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", DbNodeActionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAutonomousDatabaseResponse> deleteAutonomousDatabase(
            DeleteAutonomousDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAutonomousDatabaseRequest, DeleteAutonomousDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, DeleteAutonomousDatabaseResponse::builder)
                .logger(LOG, "deleteAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "DeleteAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/DeleteAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAutonomousVmClusterResponse> deleteAutonomousVmCluster(
            DeleteAutonomousVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAutonomousVmClusterRequest, DeleteAutonomousVmClusterResponse>
                    handler) {

        Validate.notBlank(
                request.getAutonomousVmClusterId(), "autonomousVmClusterId must not be blank");

        return clientCall(request, DeleteAutonomousVmClusterResponse::builder)
                .logger(LOG, "deleteAutonomousVmCluster")
                .serviceDetails(
                        "Database",
                        "DeleteAutonomousVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousVmCluster/DeleteAutonomousVmCluster")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAutonomousVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousVmClusters")
                .appendPathParam(request.getAutonomousVmClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteAutonomousVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAutonomousVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupResponse> deleteBackup(
            DeleteBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteBackupRequest, DeleteBackupResponse>
                    handler) {

        Validate.notBlank(request.getBackupId(), "backupId must not be blank");

        return clientCall(request, DeleteBackupResponse::builder)
                .logger(LOG, "deleteBackup")
                .serviceDetails(
                        "Database",
                        "DeleteBackup",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Backup/DeleteBackup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backups")
                .appendPathParam(request.getBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBackupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupDestinationResponse> deleteBackupDestination(
            DeleteBackupDestinationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBackupDestinationRequest, DeleteBackupDestinationResponse>
                    handler) {

        Validate.notBlank(
                request.getBackupDestinationId(), "backupDestinationId must not be blank");

        return clientCall(request, DeleteBackupDestinationResponse::builder)
                .logger(LOG, "deleteBackupDestination")
                .serviceDetails(
                        "Database",
                        "DeleteBackupDestination",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/BackupDestination/DeleteBackupDestination")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBackupDestinationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backupDestinations")
                .appendPathParam(request.getBackupDestinationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBackupDestinationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCloudAutonomousVmClusterResponse>
            deleteCloudAutonomousVmCluster(
                    DeleteCloudAutonomousVmClusterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteCloudAutonomousVmClusterRequest,
                                    DeleteCloudAutonomousVmClusterResponse>
                            handler) {

        Validate.notBlank(
                request.getCloudAutonomousVmClusterId(),
                "cloudAutonomousVmClusterId must not be blank");

        return clientCall(request, DeleteCloudAutonomousVmClusterResponse::builder)
                .logger(LOG, "deleteCloudAutonomousVmCluster")
                .serviceDetails(
                        "Database",
                        "DeleteCloudAutonomousVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudAutonomousVmCluster/DeleteCloudAutonomousVmCluster")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCloudAutonomousVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudAutonomousVmClusters")
                .appendPathParam(request.getCloudAutonomousVmClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteCloudAutonomousVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteCloudAutonomousVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCloudExadataInfrastructureResponse>
            deleteCloudExadataInfrastructure(
                    DeleteCloudExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteCloudExadataInfrastructureRequest,
                                    DeleteCloudExadataInfrastructureResponse>
                            handler) {

        Validate.notBlank(
                request.getCloudExadataInfrastructureId(),
                "cloudExadataInfrastructureId must not be blank");

        return clientCall(request, DeleteCloudExadataInfrastructureResponse::builder)
                .logger(LOG, "deleteCloudExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "DeleteCloudExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudExadataInfrastructure/DeleteCloudExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCloudExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudExadataInfrastructures")
                .appendPathParam(request.getCloudExadataInfrastructureId())
                .appendQueryParam("isDeleteVmClusters", request.getIsDeleteVmClusters())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteCloudExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteCloudExadataInfrastructureResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCloudVmClusterResponse> deleteCloudVmCluster(
            DeleteCloudVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCloudVmClusterRequest, DeleteCloudVmClusterResponse>
                    handler) {

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        return clientCall(request, DeleteCloudVmClusterResponse::builder)
                .logger(LOG, "deleteCloudVmCluster")
                .serviceDetails(
                        "Database",
                        "DeleteCloudVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/DeleteCloudVmCluster")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCloudVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteCloudVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCloudVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteConsoleConnectionResponse> deleteConsoleConnection(
            DeleteConsoleConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteConsoleConnectionRequest, DeleteConsoleConnectionResponse>
                    handler) {

        Validate.notBlank(request.getDbNodeId(), "dbNodeId must not be blank");

        Validate.notBlank(
                request.getConsoleConnectionId(), "consoleConnectionId must not be blank");

        return clientCall(request, DeleteConsoleConnectionResponse::builder)
                .logger(LOG, "deleteConsoleConnection")
                .serviceDetails(
                        "Database",
                        "DeleteConsoleConnection",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ConsoleConnection/DeleteConsoleConnection")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteConsoleConnectionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbNodes")
                .appendPathParam(request.getDbNodeId())
                .appendPathParam("consoleConnections")
                .appendPathParam(request.getConsoleConnectionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConsoleConnectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseResponse> deleteDatabase(
            DeleteDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDatabaseRequest, DeleteDatabaseResponse>
                    handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        return clientCall(request, DeleteDatabaseResponse::builder)
                .logger(LOG, "deleteDatabase")
                .serviceDetails(
                        "Database",
                        "DeleteDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/DeleteDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendQueryParam("performFinalBackup", request.getPerformFinalBackup())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseSoftwareImageResponse>
            deleteDatabaseSoftwareImage(
                    DeleteDatabaseSoftwareImageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseSoftwareImageRequest,
                                    DeleteDatabaseSoftwareImageResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseSoftwareImageId(), "databaseSoftwareImageId must not be blank");

        return clientCall(request, DeleteDatabaseSoftwareImageResponse::builder)
                .logger(LOG, "deleteDatabaseSoftwareImage")
                .serviceDetails(
                        "Database",
                        "DeleteDatabaseSoftwareImage",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DatabaseSoftwareImage/DeleteDatabaseSoftwareImage")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDatabaseSoftwareImageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databaseSoftwareImages")
                .appendPathParam(request.getDatabaseSoftwareImageId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDatabaseSoftwareImageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDatabaseSoftwareImageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDbHomeResponse> deleteDbHome(
            DeleteDbHomeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteDbHomeRequest, DeleteDbHomeResponse>
                    handler) {

        Validate.notBlank(request.getDbHomeId(), "dbHomeId must not be blank");

        return clientCall(request, DeleteDbHomeResponse::builder)
                .logger(LOG, "deleteDbHome")
                .serviceDetails(
                        "Database",
                        "DeleteDbHome",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbHome/DeleteDbHome")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDbHomeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbHomes")
                .appendPathParam(request.getDbHomeId())
                .appendQueryParam("performFinalBackup", request.getPerformFinalBackup())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDbHomeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDbHomeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteExadataInfrastructureResponse>
            deleteExadataInfrastructure(
                    DeleteExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExadataInfrastructureRequest,
                                    DeleteExadataInfrastructureResponse>
                            handler) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        return clientCall(request, DeleteExadataInfrastructureResponse::builder)
                .logger(LOG, "deleteExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "DeleteExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/DeleteExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteExadataInfrastructureResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalContainerDatabaseResponse>
            deleteExternalContainerDatabase(
                    DeleteExternalContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalContainerDatabaseRequest,
                                    DeleteExternalContainerDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");

        return clientCall(request, DeleteExternalContainerDatabaseResponse::builder)
                .logger(LOG, "deleteExternalContainerDatabase")
                .serviceDetails(
                        "Database",
                        "DeleteExternalContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/DeleteExternalContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExternalContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteExternalContainerDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteExternalContainerDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalDatabaseConnectorResponse>
            deleteExternalDatabaseConnector(
                    DeleteExternalDatabaseConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalDatabaseConnectorRequest,
                                    DeleteExternalDatabaseConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalDatabaseConnectorId(),
                "externalDatabaseConnectorId must not be blank");

        return clientCall(request, DeleteExternalDatabaseConnectorResponse::builder)
                .logger(LOG, "deleteExternalDatabaseConnector")
                .serviceDetails(
                        "Database",
                        "DeleteExternalDatabaseConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalDatabaseConnector/DeleteExternalDatabaseConnector")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExternalDatabaseConnectorRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externaldatabaseconnectors")
                .appendPathParam(request.getExternalDatabaseConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteExternalDatabaseConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteExternalDatabaseConnectorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalNonContainerDatabaseResponse>
            deleteExternalNonContainerDatabase(
                    DeleteExternalNonContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalNonContainerDatabaseRequest,
                                    DeleteExternalNonContainerDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");

        return clientCall(request, DeleteExternalNonContainerDatabaseResponse::builder)
                .logger(LOG, "deleteExternalNonContainerDatabase")
                .serviceDetails(
                        "Database",
                        "DeleteExternalNonContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/DeleteExternalNonContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExternalNonContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteExternalNonContainerDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteExternalNonContainerDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalPluggableDatabaseResponse>
            deleteExternalPluggableDatabase(
                    DeleteExternalPluggableDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalPluggableDatabaseRequest,
                                    DeleteExternalPluggableDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");

        return clientCall(request, DeleteExternalPluggableDatabaseResponse::builder)
                .logger(LOG, "deleteExternalPluggableDatabase")
                .serviceDetails(
                        "Database",
                        "DeleteExternalPluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/DeleteExternalPluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExternalPluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteExternalPluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteExternalPluggableDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyStoreResponse> deleteKeyStore(
            DeleteKeyStoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteKeyStoreRequest, DeleteKeyStoreResponse>
                    handler) {

        Validate.notBlank(request.getKeyStoreId(), "keyStoreId must not be blank");

        return clientCall(request, DeleteKeyStoreResponse::builder)
                .logger(LOG, "deleteKeyStore")
                .serviceDetails(
                        "Database",
                        "DeleteKeyStore",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/KeyStore/DeleteKeyStore")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteKeyStoreRequest::builder)
                .basePath("/20160918")
                .appendPathParam("keyStores")
                .appendPathParam(request.getKeyStoreId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteKeyStoreResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePluggableDatabaseResponse> deletePluggableDatabase(
            DeletePluggableDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePluggableDatabaseRequest, DeletePluggableDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");

        return clientCall(request, DeletePluggableDatabaseResponse::builder)
                .logger(LOG, "deletePluggableDatabase")
                .serviceDetails(
                        "Database",
                        "DeletePluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/DeletePluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeletePluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeletePluggableDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteVmClusterResponse> deleteVmCluster(
            DeleteVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteVmClusterRequest, DeleteVmClusterResponse>
                    handler) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        return clientCall(request, DeleteVmClusterResponse::builder)
                .logger(LOG, "deleteVmCluster")
                .serviceDetails(
                        "Database",
                        "DeleteVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmCluster/DeleteVmCluster")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteVmClusterNetworkResponse> deleteVmClusterNetwork(
            DeleteVmClusterNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteVmClusterNetworkRequest, DeleteVmClusterNetworkResponse>
                    handler) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        Validate.notBlank(request.getVmClusterNetworkId(), "vmClusterNetworkId must not be blank");

        return clientCall(request, DeleteVmClusterNetworkResponse::builder)
                .logger(LOG, "deleteVmClusterNetwork")
                .serviceDetails(
                        "Database",
                        "DeleteVmClusterNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterNetwork/DeleteVmClusterNetwork")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVmClusterNetworkRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .appendPathParam(request.getVmClusterNetworkId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteVmClusterNetworkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVmClusterNetworkResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeregisterAutonomousDatabaseDataSafeResponse>
            deregisterAutonomousDatabaseDataSafe(
                    DeregisterAutonomousDatabaseDataSafeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeregisterAutonomousDatabaseDataSafeRequest,
                                    DeregisterAutonomousDatabaseDataSafeResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, DeregisterAutonomousDatabaseDataSafeResponse::builder)
                .logger(LOG, "deregisterAutonomousDatabaseDataSafe")
                .serviceDetails(
                        "Database",
                        "DeregisterAutonomousDatabaseDataSafe",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/DeregisterAutonomousDatabaseDataSafe")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeregisterAutonomousDatabaseDataSafeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("deregisterDataSafe")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeregisterAutonomousDatabaseDataSafeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeregisterAutonomousDatabaseDataSafeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableAutonomousDatabaseManagementResponse>
            disableAutonomousDatabaseManagement(
                    DisableAutonomousDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableAutonomousDatabaseManagementRequest,
                                    DisableAutonomousDatabaseManagementResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, DisableAutonomousDatabaseManagementResponse::builder)
                .logger(LOG, "disableAutonomousDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "DisableAutonomousDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/DisableAutonomousDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableAutonomousDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableAutonomousDatabaseManagementResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableAutonomousDatabaseManagementResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableAutonomousDatabaseOperationsInsightsResponse>
            disableAutonomousDatabaseOperationsInsights(
                    DisableAutonomousDatabaseOperationsInsightsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableAutonomousDatabaseOperationsInsightsRequest,
                                    DisableAutonomousDatabaseOperationsInsightsResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, DisableAutonomousDatabaseOperationsInsightsResponse::builder)
                .logger(LOG, "disableAutonomousDatabaseOperationsInsights")
                .serviceDetails(
                        "Database",
                        "DisableAutonomousDatabaseOperationsInsights",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/DisableAutonomousDatabaseOperationsInsights")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableAutonomousDatabaseOperationsInsightsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableOperationsInsights")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableAutonomousDatabaseOperationsInsightsResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableAutonomousDatabaseOperationsInsightsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableDatabaseManagementResponse> disableDatabaseManagement(
            DisableDatabaseManagementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableDatabaseManagementRequest, DisableDatabaseManagementResponse>
                    handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        return clientCall(request, DisableDatabaseManagementResponse::builder)
                .logger(LOG, "disableDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "DisableDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/DisableDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        DisableDatabaseManagementResponse.Builder::database)
                .handleResponseHeaderString("etag", DisableDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableDatabaseManagementResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DisableDatabaseManagementResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableExternalContainerDatabaseDatabaseManagementResponse>
            disableExternalContainerDatabaseDatabaseManagement(
                    DisableExternalContainerDatabaseDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalContainerDatabaseDatabaseManagementRequest,
                                    DisableExternalContainerDatabaseDatabaseManagementResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");

        return clientCall(
                        request,
                        DisableExternalContainerDatabaseDatabaseManagementResponse::builder)
                .logger(LOG, "disableExternalContainerDatabaseDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "DisableExternalContainerDatabaseDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/DisableExternalContainerDatabaseDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableExternalContainerDatabaseDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "etag",
                        DisableExternalContainerDatabaseDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalContainerDatabaseDatabaseManagementResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalContainerDatabaseDatabaseManagementResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableExternalContainerDatabaseStackMonitoringResponse>
            disableExternalContainerDatabaseStackMonitoring(
                    DisableExternalContainerDatabaseStackMonitoringRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalContainerDatabaseStackMonitoringRequest,
                                    DisableExternalContainerDatabaseStackMonitoringResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");

        return clientCall(request, DisableExternalContainerDatabaseStackMonitoringResponse::builder)
                .logger(LOG, "disableExternalContainerDatabaseStackMonitoring")
                .serviceDetails(
                        "Database",
                        "DisableExternalContainerDatabaseStackMonitoring",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/DisableExternalContainerDatabaseStackMonitoring")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableExternalContainerDatabaseStackMonitoringRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableStackMonitoring")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalContainerDatabaseStackMonitoringResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalContainerDatabaseStackMonitoringResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    DisableExternalNonContainerDatabaseDatabaseManagementResponse>
            disableExternalNonContainerDatabaseDatabaseManagement(
                    DisableExternalNonContainerDatabaseDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalNonContainerDatabaseDatabaseManagementRequest,
                                    DisableExternalNonContainerDatabaseDatabaseManagementResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");

        return clientCall(
                        request,
                        DisableExternalNonContainerDatabaseDatabaseManagementResponse::builder)
                .logger(LOG, "disableExternalNonContainerDatabaseDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "DisableExternalNonContainerDatabaseDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/DisableExternalNonContainerDatabaseDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        DisableExternalNonContainerDatabaseDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "etag",
                        DisableExternalNonContainerDatabaseDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalNonContainerDatabaseDatabaseManagementResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalNonContainerDatabaseDatabaseManagementResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    DisableExternalNonContainerDatabaseOperationsInsightsResponse>
            disableExternalNonContainerDatabaseOperationsInsights(
                    DisableExternalNonContainerDatabaseOperationsInsightsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalNonContainerDatabaseOperationsInsightsRequest,
                                    DisableExternalNonContainerDatabaseOperationsInsightsResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");

        return clientCall(
                        request,
                        DisableExternalNonContainerDatabaseOperationsInsightsResponse::builder)
                .logger(LOG, "disableExternalNonContainerDatabaseOperationsInsights")
                .serviceDetails(
                        "Database",
                        "DisableExternalNonContainerDatabaseOperationsInsights",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/DisableExternalNonContainerDatabaseOperationsInsights")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        DisableExternalNonContainerDatabaseOperationsInsightsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableOperationsInsights")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "etag",
                        DisableExternalNonContainerDatabaseOperationsInsightsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalNonContainerDatabaseOperationsInsightsResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalNonContainerDatabaseOperationsInsightsResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableExternalNonContainerDatabaseStackMonitoringResponse>
            disableExternalNonContainerDatabaseStackMonitoring(
                    DisableExternalNonContainerDatabaseStackMonitoringRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalNonContainerDatabaseStackMonitoringRequest,
                                    DisableExternalNonContainerDatabaseStackMonitoringResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");

        return clientCall(
                        request,
                        DisableExternalNonContainerDatabaseStackMonitoringResponse::builder)
                .logger(LOG, "disableExternalNonContainerDatabaseStackMonitoring")
                .serviceDetails(
                        "Database",
                        "DisableExternalNonContainerDatabaseStackMonitoring",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/DisableExternalNonContainerDatabaseStackMonitoring")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableExternalNonContainerDatabaseStackMonitoringRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableStackMonitoring")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalNonContainerDatabaseStackMonitoringResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalNonContainerDatabaseStackMonitoringResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableExternalPluggableDatabaseDatabaseManagementResponse>
            disableExternalPluggableDatabaseDatabaseManagement(
                    DisableExternalPluggableDatabaseDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalPluggableDatabaseDatabaseManagementRequest,
                                    DisableExternalPluggableDatabaseDatabaseManagementResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");

        return clientCall(
                        request,
                        DisableExternalPluggableDatabaseDatabaseManagementResponse::builder)
                .logger(LOG, "disableExternalPluggableDatabaseDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "DisableExternalPluggableDatabaseDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/DisableExternalPluggableDatabaseDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableExternalPluggableDatabaseDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "etag",
                        DisableExternalPluggableDatabaseDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalPluggableDatabaseDatabaseManagementResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalPluggableDatabaseDatabaseManagementResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableExternalPluggableDatabaseOperationsInsightsResponse>
            disableExternalPluggableDatabaseOperationsInsights(
                    DisableExternalPluggableDatabaseOperationsInsightsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalPluggableDatabaseOperationsInsightsRequest,
                                    DisableExternalPluggableDatabaseOperationsInsightsResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");

        return clientCall(
                        request,
                        DisableExternalPluggableDatabaseOperationsInsightsResponse::builder)
                .logger(LOG, "disableExternalPluggableDatabaseOperationsInsights")
                .serviceDetails(
                        "Database",
                        "DisableExternalPluggableDatabaseOperationsInsights",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/DisableExternalPluggableDatabaseOperationsInsights")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableExternalPluggableDatabaseOperationsInsightsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableOperationsInsights")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "etag",
                        DisableExternalPluggableDatabaseOperationsInsightsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalPluggableDatabaseOperationsInsightsResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalPluggableDatabaseOperationsInsightsResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableExternalPluggableDatabaseStackMonitoringResponse>
            disableExternalPluggableDatabaseStackMonitoring(
                    DisableExternalPluggableDatabaseStackMonitoringRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalPluggableDatabaseStackMonitoringRequest,
                                    DisableExternalPluggableDatabaseStackMonitoringResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");

        return clientCall(request, DisableExternalPluggableDatabaseStackMonitoringResponse::builder)
                .logger(LOG, "disableExternalPluggableDatabaseStackMonitoring")
                .serviceDetails(
                        "Database",
                        "DisableExternalPluggableDatabaseStackMonitoring",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/DisableExternalPluggableDatabaseStackMonitoring")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableExternalPluggableDatabaseStackMonitoringRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableStackMonitoring")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalPluggableDatabaseStackMonitoringResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalPluggableDatabaseStackMonitoringResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisablePluggableDatabaseManagementResponse>
            disablePluggableDatabaseManagement(
                    DisablePluggableDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisablePluggableDatabaseManagementRequest,
                                    DisablePluggableDatabaseManagementResponse>
                            handler) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");

        return clientCall(request, DisablePluggableDatabaseManagementResponse::builder)
                .logger(LOG, "disablePluggableDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "DisablePluggableDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/DisablePluggableDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisablePluggableDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disablePluggableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        DisablePluggableDatabaseManagementResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString(
                        "etag", DisablePluggableDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisablePluggableDatabaseManagementResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisablePluggableDatabaseManagementResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DownloadExadataInfrastructureConfigFileResponse>
            downloadExadataInfrastructureConfigFile(
                    DownloadExadataInfrastructureConfigFileRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadExadataInfrastructureConfigFileRequest,
                                    DownloadExadataInfrastructureConfigFileResponse>
                            handler) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        return clientCall(request, DownloadExadataInfrastructureConfigFileResponse::builder)
                .logger(LOG, "downloadExadataInfrastructureConfigFile")
                .serviceDetails(
                        "Database",
                        "DownloadExadataInfrastructureConfigFile",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/DownloadExadataInfrastructureConfigFile")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadExadataInfrastructureConfigFileRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("downloadConfigFile")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        java.io.InputStream.class,
                        DownloadExadataInfrastructureConfigFileResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "etag", DownloadExadataInfrastructureConfigFileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DownloadExadataInfrastructureConfigFileResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length",
                        DownloadExadataInfrastructureConfigFileResponse.Builder::contentLength)
                .handleResponseHeaderDate(
                        "last-modified",
                        DownloadExadataInfrastructureConfigFileResponse.Builder::lastModified)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DownloadValidationReportResponse> downloadValidationReport(
            DownloadValidationReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DownloadValidationReportRequest, DownloadValidationReportResponse>
                    handler) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        Validate.notBlank(request.getVmClusterNetworkId(), "vmClusterNetworkId must not be blank");

        return clientCall(request, DownloadValidationReportResponse::builder)
                .logger(LOG, "downloadValidationReport")
                .serviceDetails(
                        "Database",
                        "DownloadValidationReport",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterNetwork/DownloadValidationReport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadValidationReportRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .appendPathParam(request.getVmClusterNetworkId())
                .appendPathParam("actions")
                .appendPathParam("downloadValidationReport")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        java.io.InputStream.class,
                        DownloadValidationReportResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", DownloadValidationReportResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", DownloadValidationReportResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length", DownloadValidationReportResponse.Builder::contentLength)
                .handleResponseHeaderDate(
                        "last-modified", DownloadValidationReportResponse.Builder::lastModified)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DownloadVmClusterNetworkConfigFileResponse>
            downloadVmClusterNetworkConfigFile(
                    DownloadVmClusterNetworkConfigFileRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadVmClusterNetworkConfigFileRequest,
                                    DownloadVmClusterNetworkConfigFileResponse>
                            handler) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        Validate.notBlank(request.getVmClusterNetworkId(), "vmClusterNetworkId must not be blank");

        return clientCall(request, DownloadVmClusterNetworkConfigFileResponse::builder)
                .logger(LOG, "downloadVmClusterNetworkConfigFile")
                .serviceDetails(
                        "Database",
                        "DownloadVmClusterNetworkConfigFile",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterNetwork/DownloadVmClusterNetworkConfigFile")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadVmClusterNetworkConfigFileRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .appendPathParam(request.getVmClusterNetworkId())
                .appendPathParam("actions")
                .appendPathParam("downloadConfigFile")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        java.io.InputStream.class,
                        DownloadVmClusterNetworkConfigFileResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "etag", DownloadVmClusterNetworkConfigFileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DownloadVmClusterNetworkConfigFileResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length",
                        DownloadVmClusterNetworkConfigFileResponse.Builder::contentLength)
                .handleResponseHeaderDate(
                        "last-modified",
                        DownloadVmClusterNetworkConfigFileResponse.Builder::lastModified)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableAutonomousDatabaseManagementResponse>
            enableAutonomousDatabaseManagement(
                    EnableAutonomousDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableAutonomousDatabaseManagementRequest,
                                    EnableAutonomousDatabaseManagementResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, EnableAutonomousDatabaseManagementResponse::builder)
                .logger(LOG, "enableAutonomousDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "EnableAutonomousDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/EnableAutonomousDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableAutonomousDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableAutonomousDatabaseManagementResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableAutonomousDatabaseManagementResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableAutonomousDatabaseOperationsInsightsResponse>
            enableAutonomousDatabaseOperationsInsights(
                    EnableAutonomousDatabaseOperationsInsightsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableAutonomousDatabaseOperationsInsightsRequest,
                                    EnableAutonomousDatabaseOperationsInsightsResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, EnableAutonomousDatabaseOperationsInsightsResponse::builder)
                .logger(LOG, "enableAutonomousDatabaseOperationsInsights")
                .serviceDetails(
                        "Database",
                        "EnableAutonomousDatabaseOperationsInsights",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/EnableAutonomousDatabaseOperationsInsights")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableAutonomousDatabaseOperationsInsightsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableOperationsInsights")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableAutonomousDatabaseOperationsInsightsResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableAutonomousDatabaseOperationsInsightsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableDatabaseManagementResponse> enableDatabaseManagement(
            EnableDatabaseManagementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableDatabaseManagementRequest, EnableDatabaseManagementResponse>
                    handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableDatabaseManagementDetails(),
                "enableDatabaseManagementDetails is required");

        return clientCall(request, EnableDatabaseManagementResponse::builder)
                .logger(LOG, "enableDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "EnableDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/EnableDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        EnableDatabaseManagementResponse.Builder::database)
                .handleResponseHeaderString("etag", EnableDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableDatabaseManagementResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", EnableDatabaseManagementResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableExternalContainerDatabaseDatabaseManagementResponse>
            enableExternalContainerDatabaseDatabaseManagement(
                    EnableExternalContainerDatabaseDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalContainerDatabaseDatabaseManagementRequest,
                                    EnableExternalContainerDatabaseDatabaseManagementResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalContainerDatabaseDatabaseManagementDetails(),
                "enableExternalContainerDatabaseDatabaseManagementDetails is required");

        return clientCall(
                        request, EnableExternalContainerDatabaseDatabaseManagementResponse::builder)
                .logger(LOG, "enableExternalContainerDatabaseDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "EnableExternalContainerDatabaseDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/EnableExternalContainerDatabaseDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableExternalContainerDatabaseDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag",
                        EnableExternalContainerDatabaseDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalContainerDatabaseDatabaseManagementResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalContainerDatabaseDatabaseManagementResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableExternalContainerDatabaseStackMonitoringResponse>
            enableExternalContainerDatabaseStackMonitoring(
                    EnableExternalContainerDatabaseStackMonitoringRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalContainerDatabaseStackMonitoringRequest,
                                    EnableExternalContainerDatabaseStackMonitoringResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalContainerDatabaseStackMonitoringDetails(),
                "enableExternalContainerDatabaseStackMonitoringDetails is required");

        return clientCall(request, EnableExternalContainerDatabaseStackMonitoringResponse::builder)
                .logger(LOG, "enableExternalContainerDatabaseStackMonitoring")
                .serviceDetails(
                        "Database",
                        "EnableExternalContainerDatabaseStackMonitoring",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/EnableExternalContainerDatabaseStackMonitoring")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableExternalContainerDatabaseStackMonitoringRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableStackMonitoring")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalContainerDatabaseStackMonitoringResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalContainerDatabaseStackMonitoringResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableExternalNonContainerDatabaseDatabaseManagementResponse>
            enableExternalNonContainerDatabaseDatabaseManagement(
                    EnableExternalNonContainerDatabaseDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalNonContainerDatabaseDatabaseManagementRequest,
                                    EnableExternalNonContainerDatabaseDatabaseManagementResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalNonContainerDatabaseDatabaseManagementDetails(),
                "enableExternalNonContainerDatabaseDatabaseManagementDetails is required");

        return clientCall(
                        request,
                        EnableExternalNonContainerDatabaseDatabaseManagementResponse::builder)
                .logger(LOG, "enableExternalNonContainerDatabaseDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "EnableExternalNonContainerDatabaseDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/EnableExternalNonContainerDatabaseDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        EnableExternalNonContainerDatabaseDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag",
                        EnableExternalNonContainerDatabaseDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalNonContainerDatabaseDatabaseManagementResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalNonContainerDatabaseDatabaseManagementResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableExternalNonContainerDatabaseOperationsInsightsResponse>
            enableExternalNonContainerDatabaseOperationsInsights(
                    EnableExternalNonContainerDatabaseOperationsInsightsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalNonContainerDatabaseOperationsInsightsRequest,
                                    EnableExternalNonContainerDatabaseOperationsInsightsResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalNonContainerDatabaseOperationsInsightsDetails(),
                "enableExternalNonContainerDatabaseOperationsInsightsDetails is required");

        return clientCall(
                        request,
                        EnableExternalNonContainerDatabaseOperationsInsightsResponse::builder)
                .logger(LOG, "enableExternalNonContainerDatabaseOperationsInsights")
                .serviceDetails(
                        "Database",
                        "EnableExternalNonContainerDatabaseOperationsInsights",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/EnableExternalNonContainerDatabaseOperationsInsights")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        EnableExternalNonContainerDatabaseOperationsInsightsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableOperationsInsights")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag",
                        EnableExternalNonContainerDatabaseOperationsInsightsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalNonContainerDatabaseOperationsInsightsResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalNonContainerDatabaseOperationsInsightsResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableExternalNonContainerDatabaseStackMonitoringResponse>
            enableExternalNonContainerDatabaseStackMonitoring(
                    EnableExternalNonContainerDatabaseStackMonitoringRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalNonContainerDatabaseStackMonitoringRequest,
                                    EnableExternalNonContainerDatabaseStackMonitoringResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalNonContainerDatabaseStackMonitoringDetails(),
                "enableExternalNonContainerDatabaseStackMonitoringDetails is required");

        return clientCall(
                        request, EnableExternalNonContainerDatabaseStackMonitoringResponse::builder)
                .logger(LOG, "enableExternalNonContainerDatabaseStackMonitoring")
                .serviceDetails(
                        "Database",
                        "EnableExternalNonContainerDatabaseStackMonitoring",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/EnableExternalNonContainerDatabaseStackMonitoring")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableExternalNonContainerDatabaseStackMonitoringRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableStackMonitoring")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalNonContainerDatabaseStackMonitoringResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalNonContainerDatabaseStackMonitoringResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableExternalPluggableDatabaseDatabaseManagementResponse>
            enableExternalPluggableDatabaseDatabaseManagement(
                    EnableExternalPluggableDatabaseDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalPluggableDatabaseDatabaseManagementRequest,
                                    EnableExternalPluggableDatabaseDatabaseManagementResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalPluggableDatabaseDatabaseManagementDetails(),
                "enableExternalPluggableDatabaseDatabaseManagementDetails is required");

        return clientCall(
                        request, EnableExternalPluggableDatabaseDatabaseManagementResponse::builder)
                .logger(LOG, "enableExternalPluggableDatabaseDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "EnableExternalPluggableDatabaseDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/EnableExternalPluggableDatabaseDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableExternalPluggableDatabaseDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag",
                        EnableExternalPluggableDatabaseDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalPluggableDatabaseDatabaseManagementResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalPluggableDatabaseDatabaseManagementResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableExternalPluggableDatabaseOperationsInsightsResponse>
            enableExternalPluggableDatabaseOperationsInsights(
                    EnableExternalPluggableDatabaseOperationsInsightsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalPluggableDatabaseOperationsInsightsRequest,
                                    EnableExternalPluggableDatabaseOperationsInsightsResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalPluggableDatabaseOperationsInsightsDetails(),
                "enableExternalPluggableDatabaseOperationsInsightsDetails is required");

        return clientCall(
                        request, EnableExternalPluggableDatabaseOperationsInsightsResponse::builder)
                .logger(LOG, "enableExternalPluggableDatabaseOperationsInsights")
                .serviceDetails(
                        "Database",
                        "EnableExternalPluggableDatabaseOperationsInsights",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/EnableExternalPluggableDatabaseOperationsInsights")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableExternalPluggableDatabaseOperationsInsightsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableOperationsInsights")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag",
                        EnableExternalPluggableDatabaseOperationsInsightsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalPluggableDatabaseOperationsInsightsResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalPluggableDatabaseOperationsInsightsResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableExternalPluggableDatabaseStackMonitoringResponse>
            enableExternalPluggableDatabaseStackMonitoring(
                    EnableExternalPluggableDatabaseStackMonitoringRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalPluggableDatabaseStackMonitoringRequest,
                                    EnableExternalPluggableDatabaseStackMonitoringResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalPluggableDatabaseStackMonitoringDetails(),
                "enableExternalPluggableDatabaseStackMonitoringDetails is required");

        return clientCall(request, EnableExternalPluggableDatabaseStackMonitoringResponse::builder)
                .logger(LOG, "enableExternalPluggableDatabaseStackMonitoring")
                .serviceDetails(
                        "Database",
                        "EnableExternalPluggableDatabaseStackMonitoring",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/EnableExternalPluggableDatabaseStackMonitoring")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableExternalPluggableDatabaseStackMonitoringRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableStackMonitoring")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalPluggableDatabaseStackMonitoringResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalPluggableDatabaseStackMonitoringResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnablePluggableDatabaseManagementResponse>
            enablePluggableDatabaseManagement(
                    EnablePluggableDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnablePluggableDatabaseManagementRequest,
                                    EnablePluggableDatabaseManagementResponse>
                            handler) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnablePluggableDatabaseManagementDetails(),
                "enablePluggableDatabaseManagementDetails is required");

        return clientCall(request, EnablePluggableDatabaseManagementResponse::builder)
                .logger(LOG, "enablePluggableDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "EnablePluggableDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/EnablePluggableDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnablePluggableDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enablePluggableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        EnablePluggableDatabaseManagementResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString(
                        "etag", EnablePluggableDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnablePluggableDatabaseManagementResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnablePluggableDatabaseManagementResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<FailOverAutonomousDatabaseResponse>
            failOverAutonomousDatabase(
                    FailOverAutonomousDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    FailOverAutonomousDatabaseRequest,
                                    FailOverAutonomousDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, FailOverAutonomousDatabaseResponse::builder)
                .logger(LOG, "failOverAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "FailOverAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/FailOverAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(FailOverAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("failover")
                .appendQueryParam("peerDbId", request.getPeerDbId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        FailOverAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString(
                        "etag", FailOverAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", FailOverAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        FailOverAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    FailoverAutonomousContainerDatabaseDataguardAssociationResponse>
            failoverAutonomousContainerDatabaseDataguardAssociation(
                    FailoverAutonomousContainerDatabaseDataguardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    FailoverAutonomousContainerDatabaseDataguardAssociationRequest,
                                    FailoverAutonomousContainerDatabaseDataguardAssociationResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        Validate.notBlank(
                request.getAutonomousContainerDatabaseDataguardAssociationId(),
                "autonomousContainerDatabaseDataguardAssociationId must not be blank");

        return clientCall(
                        request,
                        FailoverAutonomousContainerDatabaseDataguardAssociationResponse::builder)
                .logger(LOG, "failoverAutonomousContainerDatabaseDataguardAssociation")
                .serviceDetails(
                        "Database",
                        "FailoverAutonomousContainerDatabaseDataguardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabaseDataguardAssociation/FailoverAutonomousContainerDatabaseDataguardAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        FailoverAutonomousContainerDatabaseDataguardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("autonomousContainerDatabaseDataguardAssociations")
                .appendPathParam(request.getAutonomousContainerDatabaseDataguardAssociationId())
                .appendPathParam("actions")
                .appendPathParam("failover")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.database.model
                                .AutonomousContainerDatabaseDataguardAssociation.class,
                        FailoverAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::autonomousContainerDatabaseDataguardAssociation)
                .handleResponseHeaderString(
                        "etag",
                        FailoverAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        FailoverAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        FailoverAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<FailoverDataGuardAssociationResponse>
            failoverDataGuardAssociation(
                    FailoverDataGuardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    FailoverDataGuardAssociationRequest,
                                    FailoverDataGuardAssociationResponse>
                            handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        Validate.notBlank(
                request.getDataGuardAssociationId(), "dataGuardAssociationId must not be blank");
        Objects.requireNonNull(
                request.getFailoverDataGuardAssociationDetails(),
                "failoverDataGuardAssociationDetails is required");

        return clientCall(request, FailoverDataGuardAssociationResponse::builder)
                .logger(LOG, "failoverDataGuardAssociation")
                .serviceDetails(
                        "Database",
                        "FailoverDataGuardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DataGuardAssociation/FailoverDataGuardAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(FailoverDataGuardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("dataGuardAssociations")
                .appendPathParam(request.getDataGuardAssociationId())
                .appendPathParam("actions")
                .appendPathParam("failover")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DataGuardAssociation.class,
                        FailoverDataGuardAssociationResponse.Builder::dataGuardAssociation)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        FailoverDataGuardAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", FailoverDataGuardAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        FailoverDataGuardAssociationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateAutonomousDatabaseWalletResponse>
            generateAutonomousDatabaseWallet(
                    GenerateAutonomousDatabaseWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateAutonomousDatabaseWalletRequest,
                                    GenerateAutonomousDatabaseWalletResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getGenerateAutonomousDatabaseWalletDetails(),
                "generateAutonomousDatabaseWalletDetails is required");

        return clientCall(request, GenerateAutonomousDatabaseWalletResponse::builder)
                .logger(LOG, "generateAutonomousDatabaseWallet")
                .serviceDetails(
                        "Database",
                        "GenerateAutonomousDatabaseWallet",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/GenerateAutonomousDatabaseWallet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateAutonomousDatabaseWalletRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("generateWallet")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        GenerateAutonomousDatabaseWalletResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "etag", GenerateAutonomousDatabaseWalletResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateAutonomousDatabaseWalletResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length",
                        GenerateAutonomousDatabaseWalletResponse.Builder::contentLength)
                .handleResponseHeaderDate(
                        "last-modified",
                        GenerateAutonomousDatabaseWalletResponse.Builder::lastModified)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateRecommendedVmClusterNetworkResponse>
            generateRecommendedVmClusterNetwork(
                    GenerateRecommendedVmClusterNetworkRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateRecommendedVmClusterNetworkRequest,
                                    GenerateRecommendedVmClusterNetworkResponse>
                            handler) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");
        Objects.requireNonNull(
                request.getGenerateRecommendedNetworkDetails(),
                "generateRecommendedNetworkDetails is required");

        return clientCall(request, GenerateRecommendedVmClusterNetworkResponse::builder)
                .logger(LOG, "generateRecommendedVmClusterNetwork")
                .serviceDetails(
                        "Database",
                        "GenerateRecommendedVmClusterNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/GenerateRecommendedVmClusterNetwork")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateRecommendedVmClusterNetworkRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .appendPathParam("actions")
                .appendPathParam("generateRecommendedNetwork")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.VmClusterNetworkDetails.class,
                        GenerateRecommendedVmClusterNetworkResponse.Builder
                                ::vmClusterNetworkDetails)
                .handleResponseHeaderString(
                        "etag", GenerateRecommendedVmClusterNetworkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateRecommendedVmClusterNetworkResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousContainerDatabaseResponse>
            getAutonomousContainerDatabase(
                    GetAutonomousContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousContainerDatabaseRequest,
                                    GetAutonomousContainerDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        return clientCall(request, GetAutonomousContainerDatabaseResponse::builder)
                .logger(LOG, "getAutonomousContainerDatabase")
                .serviceDetails(
                        "Database",
                        "GetAutonomousContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabase/GetAutonomousContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousContainerDatabase.class,
                        GetAutonomousContainerDatabaseResponse.Builder::autonomousContainerDatabase)
                .handleResponseHeaderString(
                        "etag", GetAutonomousContainerDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAutonomousContainerDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousContainerDatabaseDataguardAssociationResponse>
            getAutonomousContainerDatabaseDataguardAssociation(
                    GetAutonomousContainerDatabaseDataguardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousContainerDatabaseDataguardAssociationRequest,
                                    GetAutonomousContainerDatabaseDataguardAssociationResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        Validate.notBlank(
                request.getAutonomousContainerDatabaseDataguardAssociationId(),
                "autonomousContainerDatabaseDataguardAssociationId must not be blank");

        return clientCall(
                        request,
                        GetAutonomousContainerDatabaseDataguardAssociationResponse::builder)
                .logger(LOG, "getAutonomousContainerDatabaseDataguardAssociation")
                .serviceDetails(
                        "Database",
                        "GetAutonomousContainerDatabaseDataguardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabaseDataguardAssociation/GetAutonomousContainerDatabaseDataguardAssociation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousContainerDatabaseDataguardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("autonomousContainerDatabaseDataguardAssociations")
                .appendPathParam(request.getAutonomousContainerDatabaseDataguardAssociationId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model
                                .AutonomousContainerDatabaseDataguardAssociation.class,
                        GetAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::autonomousContainerDatabaseDataguardAssociation)
                .handleResponseHeaderString(
                        "etag",
                        GetAutonomousContainerDatabaseDataguardAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousDatabaseResponse> getAutonomousDatabase(
            GetAutonomousDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAutonomousDatabaseRequest, GetAutonomousDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, GetAutonomousDatabaseResponse::builder)
                .logger(LOG, "getAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "GetAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/GetAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        GetAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString("etag", GetAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAutonomousDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousDatabaseBackupResponse>
            getAutonomousDatabaseBackup(
                    GetAutonomousDatabaseBackupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousDatabaseBackupRequest,
                                    GetAutonomousDatabaseBackupResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseBackupId(),
                "autonomousDatabaseBackupId must not be blank");

        return clientCall(request, GetAutonomousDatabaseBackupResponse::builder)
                .logger(LOG, "getAutonomousDatabaseBackup")
                .serviceDetails(
                        "Database",
                        "GetAutonomousDatabaseBackup",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseBackup/GetAutonomousDatabaseBackup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousDatabaseBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabaseBackups")
                .appendPathParam(request.getAutonomousDatabaseBackupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabaseBackup.class,
                        GetAutonomousDatabaseBackupResponse.Builder::autonomousDatabaseBackup)
                .handleResponseHeaderString(
                        "etag", GetAutonomousDatabaseBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAutonomousDatabaseBackupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousDatabaseDataguardAssociationResponse>
            getAutonomousDatabaseDataguardAssociation(
                    GetAutonomousDatabaseDataguardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousDatabaseDataguardAssociationRequest,
                                    GetAutonomousDatabaseDataguardAssociationResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        Validate.notBlank(
                request.getAutonomousDatabaseDataguardAssociationId(),
                "autonomousDatabaseDataguardAssociationId must not be blank");

        return clientCall(request, GetAutonomousDatabaseDataguardAssociationResponse::builder)
                .logger(LOG, "getAutonomousDatabaseDataguardAssociation")
                .serviceDetails(
                        "Database",
                        "GetAutonomousDatabaseDataguardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseDataguardAssociation/GetAutonomousDatabaseDataguardAssociation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousDatabaseDataguardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("autonomousDatabaseDataguardAssociations")
                .appendPathParam(request.getAutonomousDatabaseDataguardAssociationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabaseDataguardAssociation.class,
                        GetAutonomousDatabaseDataguardAssociationResponse.Builder
                                ::autonomousDatabaseDataguardAssociation)
                .handleResponseHeaderString(
                        "etag", GetAutonomousDatabaseDataguardAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAutonomousDatabaseDataguardAssociationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousDatabaseRegionalWalletResponse>
            getAutonomousDatabaseRegionalWallet(
                    GetAutonomousDatabaseRegionalWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousDatabaseRegionalWalletRequest,
                                    GetAutonomousDatabaseRegionalWalletResponse>
                            handler) {

        return clientCall(request, GetAutonomousDatabaseRegionalWalletResponse::builder)
                .logger(LOG, "getAutonomousDatabaseRegionalWallet")
                .serviceDetails(
                        "Database",
                        "GetAutonomousDatabaseRegionalWallet",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseWallet/GetAutonomousDatabaseRegionalWallet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousDatabaseRegionalWalletRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam("wallet")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabaseWallet.class,
                        GetAutonomousDatabaseRegionalWalletResponse.Builder
                                ::autonomousDatabaseWallet)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAutonomousDatabaseRegionalWalletResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousDatabaseWalletResponse>
            getAutonomousDatabaseWallet(
                    GetAutonomousDatabaseWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousDatabaseWalletRequest,
                                    GetAutonomousDatabaseWalletResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, GetAutonomousDatabaseWalletResponse::builder)
                .logger(LOG, "getAutonomousDatabaseWallet")
                .serviceDetails(
                        "Database",
                        "GetAutonomousDatabaseWallet",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseWallet/GetAutonomousDatabaseWallet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousDatabaseWalletRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("wallet")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabaseWallet.class,
                        GetAutonomousDatabaseWalletResponse.Builder::autonomousDatabaseWallet)
                .handleResponseHeaderString(
                        "opc-request-id", GetAutonomousDatabaseWalletResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousExadataInfrastructureResponse>
            getAutonomousExadataInfrastructure(
                    GetAutonomousExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousExadataInfrastructureRequest,
                                    GetAutonomousExadataInfrastructureResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousExadataInfrastructureId(),
                "autonomousExadataInfrastructureId must not be blank");

        return clientCall(request, GetAutonomousExadataInfrastructureResponse::builder)
                .logger(LOG, "getAutonomousExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "GetAutonomousExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousExadataInfrastructure/GetAutonomousExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructures")
                .appendPathParam(request.getAutonomousExadataInfrastructureId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousExadataInfrastructure.class,
                        GetAutonomousExadataInfrastructureResponse.Builder
                                ::autonomousExadataInfrastructure)
                .handleResponseHeaderString(
                        "etag", GetAutonomousExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAutonomousExadataInfrastructureResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousPatchResponse> getAutonomousPatch(
            GetAutonomousPatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAutonomousPatchRequest, GetAutonomousPatchResponse>
                    handler) {

        Validate.notBlank(request.getAutonomousPatchId(), "autonomousPatchId must not be blank");

        return clientCall(request, GetAutonomousPatchResponse::builder)
                .logger(LOG, "getAutonomousPatch")
                .serviceDetails(
                        "Database",
                        "GetAutonomousPatch",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousPatch/GetAutonomousPatch")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousPatchRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousPatches")
                .appendPathParam(request.getAutonomousPatchId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousPatch.class,
                        GetAutonomousPatchResponse.Builder::autonomousPatch)
                .handleResponseHeaderString("etag", GetAutonomousPatchResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAutonomousPatchResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousVmClusterResponse> getAutonomousVmCluster(
            GetAutonomousVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAutonomousVmClusterRequest, GetAutonomousVmClusterResponse>
                    handler) {

        Validate.notBlank(
                request.getAutonomousVmClusterId(), "autonomousVmClusterId must not be blank");

        return clientCall(request, GetAutonomousVmClusterResponse::builder)
                .logger(LOG, "getAutonomousVmCluster")
                .serviceDetails(
                        "Database",
                        "GetAutonomousVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousVmCluster/GetAutonomousVmCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousVmClusters")
                .appendPathParam(request.getAutonomousVmClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousVmCluster.class,
                        GetAutonomousVmClusterResponse.Builder::autonomousVmCluster)
                .handleResponseHeaderString("etag", GetAutonomousVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAutonomousVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBackupResponse> getBackup(
            GetBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBackupRequest, GetBackupResponse>
                    handler) {

        Validate.notBlank(request.getBackupId(), "backupId must not be blank");

        return clientCall(request, GetBackupResponse::builder)
                .logger(LOG, "getBackup")
                .serviceDetails(
                        "Database",
                        "GetBackup",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Backup/GetBackup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backups")
                .appendPathParam(request.getBackupId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.Backup.class,
                        GetBackupResponse.Builder::backup)
                .handleResponseHeaderString("etag", GetBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBackupDestinationResponse> getBackupDestination(
            GetBackupDestinationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBackupDestinationRequest, GetBackupDestinationResponse>
                    handler) {

        Validate.notBlank(
                request.getBackupDestinationId(), "backupDestinationId must not be blank");

        return clientCall(request, GetBackupDestinationResponse::builder)
                .logger(LOG, "getBackupDestination")
                .serviceDetails(
                        "Database",
                        "GetBackupDestination",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/BackupDestination/GetBackupDestination")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBackupDestinationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backupDestinations")
                .appendPathParam(request.getBackupDestinationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.BackupDestination.class,
                        GetBackupDestinationResponse.Builder::backupDestination)
                .handleResponseHeaderString("etag", GetBackupDestinationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackupDestinationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCloudAutonomousVmClusterResponse>
            getCloudAutonomousVmCluster(
                    GetCloudAutonomousVmClusterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCloudAutonomousVmClusterRequest,
                                    GetCloudAutonomousVmClusterResponse>
                            handler) {

        Validate.notBlank(
                request.getCloudAutonomousVmClusterId(),
                "cloudAutonomousVmClusterId must not be blank");

        return clientCall(request, GetCloudAutonomousVmClusterResponse::builder)
                .logger(LOG, "getCloudAutonomousVmCluster")
                .serviceDetails(
                        "Database",
                        "GetCloudAutonomousVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudAutonomousVmCluster/GetCloudAutonomousVmCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCloudAutonomousVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudAutonomousVmClusters")
                .appendPathParam(request.getCloudAutonomousVmClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.CloudAutonomousVmCluster.class,
                        GetCloudAutonomousVmClusterResponse.Builder::cloudAutonomousVmCluster)
                .handleResponseHeaderString(
                        "etag", GetCloudAutonomousVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCloudAutonomousVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCloudExadataInfrastructureResponse>
            getCloudExadataInfrastructure(
                    GetCloudExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCloudExadataInfrastructureRequest,
                                    GetCloudExadataInfrastructureResponse>
                            handler) {

        Validate.notBlank(
                request.getCloudExadataInfrastructureId(),
                "cloudExadataInfrastructureId must not be blank");

        return clientCall(request, GetCloudExadataInfrastructureResponse::builder)
                .logger(LOG, "getCloudExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "GetCloudExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudExadataInfrastructure/GetCloudExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCloudExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudExadataInfrastructures")
                .appendPathParam(request.getCloudExadataInfrastructureId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.CloudExadataInfrastructure.class,
                        GetCloudExadataInfrastructureResponse.Builder::cloudExadataInfrastructure)
                .handleResponseHeaderString(
                        "etag", GetCloudExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetCloudExadataInfrastructureResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCloudExadataInfrastructureUnallocatedResourcesResponse>
            getCloudExadataInfrastructureUnallocatedResources(
                    GetCloudExadataInfrastructureUnallocatedResourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCloudExadataInfrastructureUnallocatedResourcesRequest,
                                    GetCloudExadataInfrastructureUnallocatedResourcesResponse>
                            handler) {

        Validate.notBlank(
                request.getCloudExadataInfrastructureId(),
                "cloudExadataInfrastructureId must not be blank");

        return clientCall(
                        request, GetCloudExadataInfrastructureUnallocatedResourcesResponse::builder)
                .logger(LOG, "getCloudExadataInfrastructureUnallocatedResources")
                .serviceDetails(
                        "Database",
                        "GetCloudExadataInfrastructureUnallocatedResources",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudExadataInfrastructureUnallocatedResources/GetCloudExadataInfrastructureUnallocatedResources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCloudExadataInfrastructureUnallocatedResourcesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudExadataInfrastructures")
                .appendPathParam(request.getCloudExadataInfrastructureId())
                .appendPathParam("unAllocatedResources")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.CloudExadataInfrastructureUnallocatedResources
                                .class,
                        GetCloudExadataInfrastructureUnallocatedResourcesResponse.Builder
                                ::cloudExadataInfrastructureUnallocatedResources)
                .handleResponseHeaderString(
                        "etag",
                        GetCloudExadataInfrastructureUnallocatedResourcesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetCloudExadataInfrastructureUnallocatedResourcesResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCloudVmClusterResponse> getCloudVmCluster(
            GetCloudVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCloudVmClusterRequest, GetCloudVmClusterResponse>
                    handler) {

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        return clientCall(request, GetCloudVmClusterResponse::builder)
                .logger(LOG, "getCloudVmCluster")
                .serviceDetails(
                        "Database",
                        "GetCloudVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/GetCloudVmCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCloudVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.CloudVmCluster.class,
                        GetCloudVmClusterResponse.Builder::cloudVmCluster)
                .handleResponseHeaderString("etag", GetCloudVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCloudVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCloudVmClusterIormConfigResponse>
            getCloudVmClusterIormConfig(
                    GetCloudVmClusterIormConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCloudVmClusterIormConfigRequest,
                                    GetCloudVmClusterIormConfigResponse>
                            handler) {

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        return clientCall(request, GetCloudVmClusterIormConfigResponse::builder)
                .logger(LOG, "getCloudVmClusterIormConfig")
                .serviceDetails(
                        "Database",
                        "GetCloudVmClusterIormConfig",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/GetCloudVmClusterIormConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCloudVmClusterIormConfigRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .appendPathParam("CloudVmClusterIormConfig")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.ExadataIormConfig.class,
                        GetCloudVmClusterIormConfigResponse.Builder::exadataIormConfig)
                .handleResponseHeaderString(
                        "opc-request-id", GetCloudVmClusterIormConfigResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetCloudVmClusterIormConfigResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCloudVmClusterUpdateResponse> getCloudVmClusterUpdate(
            GetCloudVmClusterUpdateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCloudVmClusterUpdateRequest, GetCloudVmClusterUpdateResponse>
                    handler) {

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        Validate.notBlank(request.getUpdateId(), "updateId must not be blank");

        return clientCall(request, GetCloudVmClusterUpdateResponse::builder)
                .logger(LOG, "getCloudVmClusterUpdate")
                .serviceDetails(
                        "Database",
                        "GetCloudVmClusterUpdate",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Update/GetCloudVmClusterUpdate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCloudVmClusterUpdateRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .appendPathParam("updates")
                .appendPathParam(request.getUpdateId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.Update.class,
                        GetCloudVmClusterUpdateResponse.Builder::update)
                .handleResponseHeaderString(
                        "opc-request-id", GetCloudVmClusterUpdateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCloudVmClusterUpdateHistoryEntryResponse>
            getCloudVmClusterUpdateHistoryEntry(
                    GetCloudVmClusterUpdateHistoryEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCloudVmClusterUpdateHistoryEntryRequest,
                                    GetCloudVmClusterUpdateHistoryEntryResponse>
                            handler) {

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        Validate.notBlank(
                request.getUpdateHistoryEntryId(), "updateHistoryEntryId must not be blank");

        return clientCall(request, GetCloudVmClusterUpdateHistoryEntryResponse::builder)
                .logger(LOG, "getCloudVmClusterUpdateHistoryEntry")
                .serviceDetails(
                        "Database",
                        "GetCloudVmClusterUpdateHistoryEntry",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/UpdateHistoryEntry/GetCloudVmClusterUpdateHistoryEntry")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCloudVmClusterUpdateHistoryEntryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .appendPathParam("updateHistoryEntries")
                .appendPathParam(request.getUpdateHistoryEntryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.UpdateHistoryEntry.class,
                        GetCloudVmClusterUpdateHistoryEntryResponse.Builder::updateHistoryEntry)
                .handleResponseHeaderString(
                        "etag", GetCloudVmClusterUpdateHistoryEntryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetCloudVmClusterUpdateHistoryEntryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetConsoleConnectionResponse> getConsoleConnection(
            GetConsoleConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConsoleConnectionRequest, GetConsoleConnectionResponse>
                    handler) {

        Validate.notBlank(request.getDbNodeId(), "dbNodeId must not be blank");

        Validate.notBlank(
                request.getConsoleConnectionId(), "consoleConnectionId must not be blank");

        return clientCall(request, GetConsoleConnectionResponse::builder)
                .logger(LOG, "getConsoleConnection")
                .serviceDetails(
                        "Database",
                        "GetConsoleConnection",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ConsoleConnection/GetConsoleConnection")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConsoleConnectionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbNodes")
                .appendPathParam(request.getDbNodeId())
                .appendPathParam("consoleConnections")
                .appendPathParam(request.getConsoleConnectionId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.ConsoleConnection.class,
                        GetConsoleConnectionResponse.Builder::consoleConnection)
                .handleResponseHeaderString("etag", GetConsoleConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConsoleConnectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDataGuardAssociationResponse> getDataGuardAssociation(
            GetDataGuardAssociationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>
                    handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        Validate.notBlank(
                request.getDataGuardAssociationId(), "dataGuardAssociationId must not be blank");

        return clientCall(request, GetDataGuardAssociationResponse::builder)
                .logger(LOG, "getDataGuardAssociation")
                .serviceDetails(
                        "Database",
                        "GetDataGuardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DataGuardAssociation/GetDataGuardAssociation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataGuardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("dataGuardAssociations")
                .appendPathParam(request.getDataGuardAssociationId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.DataGuardAssociation.class,
                        GetDataGuardAssociationResponse.Builder::dataGuardAssociation)
                .handleResponseHeaderString("etag", GetDataGuardAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDataGuardAssociationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseResponse> getDatabase(
            GetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDatabaseRequest, GetDatabaseResponse>
                    handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        return clientCall(request, GetDatabaseResponse::builder)
                .logger(LOG, "getDatabase")
                .serviceDetails(
                        "Database",
                        "GetDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/GetDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        GetDatabaseResponse.Builder::database)
                .handleResponseHeaderString("etag", GetDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseSoftwareImageResponse> getDatabaseSoftwareImage(
            GetDatabaseSoftwareImageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseSoftwareImageRequest, GetDatabaseSoftwareImageResponse>
                    handler) {

        Validate.notBlank(
                request.getDatabaseSoftwareImageId(), "databaseSoftwareImageId must not be blank");

        return clientCall(request, GetDatabaseSoftwareImageResponse::builder)
                .logger(LOG, "getDatabaseSoftwareImage")
                .serviceDetails(
                        "Database",
                        "GetDatabaseSoftwareImage",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DatabaseSoftwareImage/GetDatabaseSoftwareImage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseSoftwareImageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databaseSoftwareImages")
                .appendPathParam(request.getDatabaseSoftwareImageId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.DatabaseSoftwareImage.class,
                        GetDatabaseSoftwareImageResponse.Builder::databaseSoftwareImage)
                .handleResponseHeaderString("etag", GetDatabaseSoftwareImageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatabaseSoftwareImageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseUpgradeHistoryEntryResponse>
            getDatabaseUpgradeHistoryEntry(
                    GetDatabaseUpgradeHistoryEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseUpgradeHistoryEntryRequest,
                                    GetDatabaseUpgradeHistoryEntryResponse>
                            handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        Validate.notBlank(
                request.getUpgradeHistoryEntryId(), "upgradeHistoryEntryId must not be blank");

        return clientCall(request, GetDatabaseUpgradeHistoryEntryResponse::builder)
                .logger(LOG, "getDatabaseUpgradeHistoryEntry")
                .serviceDetails(
                        "Database",
                        "GetDatabaseUpgradeHistoryEntry",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DatabaseUpgradeHistoryEntry/GetDatabaseUpgradeHistoryEntry")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseUpgradeHistoryEntryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("upgradeHistoryEntries")
                .appendPathParam(request.getUpgradeHistoryEntryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.DatabaseUpgradeHistoryEntry.class,
                        GetDatabaseUpgradeHistoryEntryResponse.Builder::databaseUpgradeHistoryEntry)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDatabaseUpgradeHistoryEntryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDbHomeResponse> getDbHome(
            GetDbHomeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDbHomeRequest, GetDbHomeResponse>
                    handler) {

        Validate.notBlank(request.getDbHomeId(), "dbHomeId must not be blank");

        return clientCall(request, GetDbHomeResponse::builder)
                .logger(LOG, "getDbHome")
                .serviceDetails(
                        "Database",
                        "GetDbHome",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbHome/GetDbHome")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbHomeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbHomes")
                .appendPathParam(request.getDbHomeId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.DbHome.class,
                        GetDbHomeResponse.Builder::dbHome)
                .handleResponseHeaderString("etag", GetDbHomeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDbHomeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDbHomePatchResponse> getDbHomePatch(
            GetDbHomePatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDbHomePatchRequest, GetDbHomePatchResponse>
                    handler) {

        Validate.notBlank(request.getDbHomeId(), "dbHomeId must not be blank");

        Validate.notBlank(request.getPatchId(), "patchId must not be blank");

        return clientCall(request, GetDbHomePatchResponse::builder)
                .logger(LOG, "getDbHomePatch")
                .serviceDetails(
                        "Database",
                        "GetDbHomePatch",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Patch/GetDbHomePatch")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbHomePatchRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbHomes")
                .appendPathParam(request.getDbHomeId())
                .appendPathParam("patches")
                .appendPathParam(request.getPatchId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.Patch.class,
                        GetDbHomePatchResponse.Builder::patch)
                .handleResponseHeaderString(
                        "opc-request-id", GetDbHomePatchResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDbHomePatchHistoryEntryResponse>
            getDbHomePatchHistoryEntry(
                    GetDbHomePatchHistoryEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDbHomePatchHistoryEntryRequest,
                                    GetDbHomePatchHistoryEntryResponse>
                            handler) {

        Validate.notBlank(request.getDbHomeId(), "dbHomeId must not be blank");

        Validate.notBlank(
                request.getPatchHistoryEntryId(), "patchHistoryEntryId must not be blank");

        return clientCall(request, GetDbHomePatchHistoryEntryResponse::builder)
                .logger(LOG, "getDbHomePatchHistoryEntry")
                .serviceDetails(
                        "Database",
                        "GetDbHomePatchHistoryEntry",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PatchHistoryEntry/GetDbHomePatchHistoryEntry")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbHomePatchHistoryEntryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbHomes")
                .appendPathParam(request.getDbHomeId())
                .appendPathParam("patchHistoryEntries")
                .appendPathParam(request.getPatchHistoryEntryId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.PatchHistoryEntry.class,
                        GetDbHomePatchHistoryEntryResponse.Builder::patchHistoryEntry)
                .handleResponseHeaderString(
                        "etag", GetDbHomePatchHistoryEntryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDbHomePatchHistoryEntryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDbNodeResponse> getDbNode(
            GetDbNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDbNodeRequest, GetDbNodeResponse>
                    handler) {

        Validate.notBlank(request.getDbNodeId(), "dbNodeId must not be blank");

        return clientCall(request, GetDbNodeResponse::builder)
                .logger(LOG, "getDbNode")
                .serviceDetails(
                        "Database",
                        "GetDbNode",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbNode/GetDbNode")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbNodeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbNodes")
                .appendPathParam(request.getDbNodeId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.DbNode.class,
                        GetDbNodeResponse.Builder::dbNode)
                .handleResponseHeaderString("etag", GetDbNodeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDbNodeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDbServerResponse> getDbServer(
            GetDbServerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDbServerRequest, GetDbServerResponse>
                    handler) {
        Objects.requireNonNull(
                request.getExadataInfrastructureId(), "exadataInfrastructureId is required");

        Validate.notBlank(request.getDbServerId(), "dbServerId must not be blank");

        return clientCall(request, GetDbServerResponse::builder)
                .logger(LOG, "getDbServer")
                .serviceDetails(
                        "Database",
                        "GetDbServer",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbServer/GetDbServer")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbServerRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbServers")
                .appendPathParam(request.getDbServerId())
                .appendQueryParam("exadataInfrastructureId", request.getExadataInfrastructureId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.DbServer.class,
                        GetDbServerResponse.Builder::dbServer)
                .handleResponseHeaderString("etag", GetDbServerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDbServerResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDbSystemResponse> getDbSystem(
            GetDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDbSystemRequest, GetDbSystemResponse>
                    handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, GetDbSystemResponse::builder)
                .logger(LOG, "getDbSystem")
                .serviceDetails(
                        "Database",
                        "GetDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/GetDbSystem")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbSystemRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.DbSystem.class,
                        GetDbSystemResponse.Builder::dbSystem)
                .handleResponseHeaderString("etag", GetDbSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDbSystemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDbSystemPatchResponse> getDbSystemPatch(
            GetDbSystemPatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDbSystemPatchRequest, GetDbSystemPatchResponse>
                    handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        Validate.notBlank(request.getPatchId(), "patchId must not be blank");

        return clientCall(request, GetDbSystemPatchResponse::builder)
                .logger(LOG, "getDbSystemPatch")
                .serviceDetails(
                        "Database",
                        "GetDbSystemPatch",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Patch/GetDbSystemPatch")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbSystemPatchRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("patches")
                .appendPathParam(request.getPatchId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.Patch.class,
                        GetDbSystemPatchResponse.Builder::patch)
                .handleResponseHeaderString(
                        "opc-request-id", GetDbSystemPatchResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDbSystemPatchHistoryEntryResponse>
            getDbSystemPatchHistoryEntry(
                    GetDbSystemPatchHistoryEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDbSystemPatchHistoryEntryRequest,
                                    GetDbSystemPatchHistoryEntryResponse>
                            handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        Validate.notBlank(
                request.getPatchHistoryEntryId(), "patchHistoryEntryId must not be blank");

        return clientCall(request, GetDbSystemPatchHistoryEntryResponse::builder)
                .logger(LOG, "getDbSystemPatchHistoryEntry")
                .serviceDetails(
                        "Database",
                        "GetDbSystemPatchHistoryEntry",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PatchHistoryEntry/GetDbSystemPatchHistoryEntry")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbSystemPatchHistoryEntryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("patchHistoryEntries")
                .appendPathParam(request.getPatchHistoryEntryId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.PatchHistoryEntry.class,
                        GetDbSystemPatchHistoryEntryResponse.Builder::patchHistoryEntry)
                .handleResponseHeaderString(
                        "etag", GetDbSystemPatchHistoryEntryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDbSystemPatchHistoryEntryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDbSystemUpgradeHistoryEntryResponse>
            getDbSystemUpgradeHistoryEntry(
                    GetDbSystemUpgradeHistoryEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDbSystemUpgradeHistoryEntryRequest,
                                    GetDbSystemUpgradeHistoryEntryResponse>
                            handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        Validate.notBlank(
                request.getUpgradeHistoryEntryId(), "upgradeHistoryEntryId must not be blank");

        return clientCall(request, GetDbSystemUpgradeHistoryEntryResponse::builder)
                .logger(LOG, "getDbSystemUpgradeHistoryEntry")
                .serviceDetails(
                        "Database",
                        "GetDbSystemUpgradeHistoryEntry",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystemUpgradeHistoryEntry/GetDbSystemUpgradeHistoryEntry")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbSystemUpgradeHistoryEntryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("upgradeHistoryEntries")
                .appendPathParam(request.getUpgradeHistoryEntryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntry.class,
                        GetDbSystemUpgradeHistoryEntryResponse.Builder::dbSystemUpgradeHistoryEntry)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDbSystemUpgradeHistoryEntryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExadataInfrastructureResponse> getExadataInfrastructure(
            GetExadataInfrastructureRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExadataInfrastructureRequest, GetExadataInfrastructureResponse>
                    handler) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        return clientCall(request, GetExadataInfrastructureResponse::builder)
                .logger(LOG, "getExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "GetExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/GetExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendListQueryParam(
                        "excludedFields",
                        request.getExcludedFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.ExadataInfrastructure.class,
                        GetExadataInfrastructureResponse.Builder::exadataInfrastructure)
                .handleResponseHeaderString("etag", GetExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExadataInfrastructureResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExadataInfrastructureOcpusResponse>
            getExadataInfrastructureOcpus(
                    GetExadataInfrastructureOcpusRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExadataInfrastructureOcpusRequest,
                                    GetExadataInfrastructureOcpusResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousExadataInfrastructureId(),
                "autonomousExadataInfrastructureId must not be blank");

        return clientCall(request, GetExadataInfrastructureOcpusResponse::builder)
                .logger(LOG, "getExadataInfrastructureOcpus")
                .serviceDetails(
                        "Database",
                        "GetExadataInfrastructureOcpus",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/OCPUs/GetExadataInfrastructureOcpus")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExadataInfrastructureOcpusRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructures")
                .appendPathParam(request.getAutonomousExadataInfrastructureId())
                .appendPathParam("ocpus")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.OCPUs.class,
                        GetExadataInfrastructureOcpusResponse.Builder::oCPUs)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExadataInfrastructureOcpusResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExadataIormConfigResponse> getExadataIormConfig(
            GetExadataIormConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExadataIormConfigRequest, GetExadataIormConfigResponse>
                    handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, GetExadataIormConfigResponse::builder)
                .logger(LOG, "getExadataIormConfig")
                .serviceDetails(
                        "Database",
                        "GetExadataIormConfig",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/GetExadataIormConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExadataIormConfigRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("ExadataIormConfig")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.ExadataIormConfig.class,
                        GetExadataIormConfigResponse.Builder::exadataIormConfig)
                .handleResponseHeaderString(
                        "opc-request-id", GetExadataIormConfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalBackupJobResponse> getExternalBackupJob(
            GetExternalBackupJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExternalBackupJobRequest, GetExternalBackupJobResponse>
                    handler) {

        Validate.notBlank(request.getBackupId(), "backupId must not be blank");

        return clientCall(request, GetExternalBackupJobResponse::builder)
                .logger(LOG, "getExternalBackupJob")
                .serviceDetails(
                        "Database",
                        "GetExternalBackupJob",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalBackupJob/GetExternalBackupJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalBackupJobRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalBackupJobs")
                .appendPathParam(request.getBackupId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.ExternalBackupJob.class,
                        GetExternalBackupJobResponse.Builder::externalBackupJob)
                .handleResponseHeaderString("etag", GetExternalBackupJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalBackupJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalContainerDatabaseResponse>
            getExternalContainerDatabase(
                    GetExternalContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalContainerDatabaseRequest,
                                    GetExternalContainerDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");

        return clientCall(request, GetExternalContainerDatabaseResponse::builder)
                .logger(LOG, "getExternalContainerDatabase")
                .serviceDetails(
                        "Database",
                        "GetExternalContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/GetExternalContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.ExternalContainerDatabase.class,
                        GetExternalContainerDatabaseResponse.Builder::externalContainerDatabase)
                .handleResponseHeaderString(
                        "etag", GetExternalContainerDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalContainerDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalDatabaseConnectorResponse>
            getExternalDatabaseConnector(
                    GetExternalDatabaseConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalDatabaseConnectorRequest,
                                    GetExternalDatabaseConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalDatabaseConnectorId(),
                "externalDatabaseConnectorId must not be blank");

        return clientCall(request, GetExternalDatabaseConnectorResponse::builder)
                .logger(LOG, "getExternalDatabaseConnector")
                .serviceDetails(
                        "Database",
                        "GetExternalDatabaseConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalDatabaseConnector/GetExternalDatabaseConnector")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalDatabaseConnectorRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externaldatabaseconnectors")
                .appendPathParam(request.getExternalDatabaseConnectorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.ExternalDatabaseConnector.class,
                        GetExternalDatabaseConnectorResponse.Builder::externalDatabaseConnector)
                .handleResponseHeaderString(
                        "etag", GetExternalDatabaseConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalDatabaseConnectorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalNonContainerDatabaseResponse>
            getExternalNonContainerDatabase(
                    GetExternalNonContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalNonContainerDatabaseRequest,
                                    GetExternalNonContainerDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");

        return clientCall(request, GetExternalNonContainerDatabaseResponse::builder)
                .logger(LOG, "getExternalNonContainerDatabase")
                .serviceDetails(
                        "Database",
                        "GetExternalNonContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/GetExternalNonContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalNonContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.ExternalNonContainerDatabase.class,
                        GetExternalNonContainerDatabaseResponse.Builder
                                ::externalNonContainerDatabase)
                .handleResponseHeaderString(
                        "etag", GetExternalNonContainerDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalNonContainerDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalPluggableDatabaseResponse>
            getExternalPluggableDatabase(
                    GetExternalPluggableDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalPluggableDatabaseRequest,
                                    GetExternalPluggableDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");

        return clientCall(request, GetExternalPluggableDatabaseResponse::builder)
                .logger(LOG, "getExternalPluggableDatabase")
                .serviceDetails(
                        "Database",
                        "GetExternalPluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/GetExternalPluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalPluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.ExternalPluggableDatabase.class,
                        GetExternalPluggableDatabaseResponse.Builder::externalPluggableDatabase)
                .handleResponseHeaderString(
                        "etag", GetExternalPluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalPluggableDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetInfrastructureTargetVersionsResponse>
            getInfrastructureTargetVersions(
                    GetInfrastructureTargetVersionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetInfrastructureTargetVersionsRequest,
                                    GetInfrastructureTargetVersionsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetInfrastructureTargetVersionsResponse::builder)
                .logger(LOG, "getInfrastructureTargetVersions")
                .serviceDetails(
                        "Database",
                        "GetInfrastructureTargetVersions",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/InfrastructureTargetVersion/GetInfrastructureTargetVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInfrastructureTargetVersionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("infrastructureTargetVersions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("targetResourceId", request.getTargetResourceId())
                .appendEnumQueryParam("targetResourceType", request.getTargetResourceType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.InfrastructureTargetVersion.class,
                        GetInfrastructureTargetVersionsResponse.Builder
                                ::infrastructureTargetVersion)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetInfrastructureTargetVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        GetInfrastructureTargetVersionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetKeyStoreResponse> getKeyStore(
            GetKeyStoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetKeyStoreRequest, GetKeyStoreResponse>
                    handler) {

        Validate.notBlank(request.getKeyStoreId(), "keyStoreId must not be blank");

        return clientCall(request, GetKeyStoreResponse::builder)
                .logger(LOG, "getKeyStore")
                .serviceDetails(
                        "Database",
                        "GetKeyStore",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/KeyStore/GetKeyStore")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetKeyStoreRequest::builder)
                .basePath("/20160918")
                .appendPathParam("keyStores")
                .appendPathParam(request.getKeyStoreId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.KeyStore.class,
                        GetKeyStoreResponse.Builder::keyStore)
                .handleResponseHeaderString("etag", GetKeyStoreResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetKeyStoreResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMaintenanceRunResponse> getMaintenanceRun(
            GetMaintenanceRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMaintenanceRunRequest, GetMaintenanceRunResponse>
                    handler) {

        Validate.notBlank(request.getMaintenanceRunId(), "maintenanceRunId must not be blank");

        return clientCall(request, GetMaintenanceRunResponse::builder)
                .logger(LOG, "getMaintenanceRun")
                .serviceDetails(
                        "Database",
                        "GetMaintenanceRun",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/MaintenanceRun/GetMaintenanceRun")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMaintenanceRunRequest::builder)
                .basePath("/20160918")
                .appendPathParam("maintenanceRuns")
                .appendPathParam(request.getMaintenanceRunId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.MaintenanceRun.class,
                        GetMaintenanceRunResponse.Builder::maintenanceRun)
                .handleResponseHeaderString("etag", GetMaintenanceRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMaintenanceRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMaintenanceRunHistoryResponse> getMaintenanceRunHistory(
            GetMaintenanceRunHistoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMaintenanceRunHistoryRequest, GetMaintenanceRunHistoryResponse>
                    handler) {

        Validate.notBlank(
                request.getMaintenanceRunHistoryId(), "maintenanceRunHistoryId must not be blank");

        return clientCall(request, GetMaintenanceRunHistoryResponse::builder)
                .logger(LOG, "getMaintenanceRunHistory")
                .serviceDetails(
                        "Database",
                        "GetMaintenanceRunHistory",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/MaintenanceRunHistory/GetMaintenanceRunHistory")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMaintenanceRunHistoryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("maintenanceRunHistory")
                .appendPathParam(request.getMaintenanceRunHistoryId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.MaintenanceRunHistory.class,
                        GetMaintenanceRunHistoryResponse.Builder::maintenanceRunHistory)
                .handleResponseHeaderString("etag", GetMaintenanceRunHistoryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMaintenanceRunHistoryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPdbConversionHistoryEntryResponse>
            getPdbConversionHistoryEntry(
                    GetPdbConversionHistoryEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetPdbConversionHistoryEntryRequest,
                                    GetPdbConversionHistoryEntryResponse>
                            handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        Validate.notBlank(
                request.getPdbConversionHistoryEntryId(),
                "pdbConversionHistoryEntryId must not be blank");

        return clientCall(request, GetPdbConversionHistoryEntryResponse::builder)
                .logger(LOG, "getPdbConversionHistoryEntry")
                .serviceDetails(
                        "Database",
                        "GetPdbConversionHistoryEntry",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PdbConversionHistoryEntry/GetPdbConversionHistoryEntry")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPdbConversionHistoryEntryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("pdbConversionHistoryEntries")
                .appendPathParam(request.getPdbConversionHistoryEntryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.PdbConversionHistoryEntry.class,
                        GetPdbConversionHistoryEntryResponse.Builder::pdbConversionHistoryEntry)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetPdbConversionHistoryEntryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPluggableDatabaseResponse> getPluggableDatabase(
            GetPluggableDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPluggableDatabaseRequest, GetPluggableDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");

        return clientCall(request, GetPluggableDatabaseResponse::builder)
                .logger(LOG, "getPluggableDatabase")
                .serviceDetails(
                        "Database",
                        "GetPluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/GetPluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        GetPluggableDatabaseResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString("etag", GetPluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPluggableDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetVmClusterResponse> getVmCluster(
            GetVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetVmClusterRequest, GetVmClusterResponse>
                    handler) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        return clientCall(request, GetVmClusterResponse::builder)
                .logger(LOG, "getVmCluster")
                .serviceDetails(
                        "Database",
                        "GetVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmCluster/GetVmCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.VmCluster.class,
                        GetVmClusterResponse.Builder::vmCluster)
                .handleResponseHeaderString("etag", GetVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetVmClusterNetworkResponse> getVmClusterNetwork(
            GetVmClusterNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVmClusterNetworkRequest, GetVmClusterNetworkResponse>
                    handler) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        Validate.notBlank(request.getVmClusterNetworkId(), "vmClusterNetworkId must not be blank");

        return clientCall(request, GetVmClusterNetworkResponse::builder)
                .logger(LOG, "getVmClusterNetwork")
                .serviceDetails(
                        "Database",
                        "GetVmClusterNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterNetwork/GetVmClusterNetwork")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVmClusterNetworkRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .appendPathParam(request.getVmClusterNetworkId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.VmClusterNetwork.class,
                        GetVmClusterNetworkResponse.Builder::vmClusterNetwork)
                .handleResponseHeaderString("etag", GetVmClusterNetworkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVmClusterNetworkResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetVmClusterPatchResponse> getVmClusterPatch(
            GetVmClusterPatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVmClusterPatchRequest, GetVmClusterPatchResponse>
                    handler) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        Validate.notBlank(request.getPatchId(), "patchId must not be blank");

        return clientCall(request, GetVmClusterPatchResponse::builder)
                .logger(LOG, "getVmClusterPatch")
                .serviceDetails(
                        "Database",
                        "GetVmClusterPatch",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Patch/GetVmClusterPatch")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVmClusterPatchRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("patches")
                .appendPathParam(request.getPatchId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.Patch.class,
                        GetVmClusterPatchResponse.Builder::patch)
                .handleResponseHeaderString(
                        "opc-request-id", GetVmClusterPatchResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetVmClusterPatchHistoryEntryResponse>
            getVmClusterPatchHistoryEntry(
                    GetVmClusterPatchHistoryEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetVmClusterPatchHistoryEntryRequest,
                                    GetVmClusterPatchHistoryEntryResponse>
                            handler) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        Validate.notBlank(
                request.getPatchHistoryEntryId(), "patchHistoryEntryId must not be blank");

        return clientCall(request, GetVmClusterPatchHistoryEntryResponse::builder)
                .logger(LOG, "getVmClusterPatchHistoryEntry")
                .serviceDetails(
                        "Database",
                        "GetVmClusterPatchHistoryEntry",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PatchHistoryEntry/GetVmClusterPatchHistoryEntry")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVmClusterPatchHistoryEntryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("patchHistoryEntries")
                .appendPathParam(request.getPatchHistoryEntryId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.PatchHistoryEntry.class,
                        GetVmClusterPatchHistoryEntryResponse.Builder::patchHistoryEntry)
                .handleResponseHeaderString(
                        "etag", GetVmClusterPatchHistoryEntryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetVmClusterPatchHistoryEntryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetVmClusterUpdateResponse> getVmClusterUpdate(
            GetVmClusterUpdateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVmClusterUpdateRequest, GetVmClusterUpdateResponse>
                    handler) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        Validate.notBlank(request.getUpdateId(), "updateId must not be blank");

        return clientCall(request, GetVmClusterUpdateResponse::builder)
                .logger(LOG, "getVmClusterUpdate")
                .serviceDetails(
                        "Database",
                        "GetVmClusterUpdate",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterUpdate/GetVmClusterUpdate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVmClusterUpdateRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("updates")
                .appendPathParam(request.getUpdateId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.VmClusterUpdate.class,
                        GetVmClusterUpdateResponse.Builder::vmClusterUpdate)
                .handleResponseHeaderString(
                        "opc-request-id", GetVmClusterUpdateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetVmClusterUpdateHistoryEntryResponse>
            getVmClusterUpdateHistoryEntry(
                    GetVmClusterUpdateHistoryEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetVmClusterUpdateHistoryEntryRequest,
                                    GetVmClusterUpdateHistoryEntryResponse>
                            handler) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        Validate.notBlank(
                request.getUpdateHistoryEntryId(), "updateHistoryEntryId must not be blank");

        return clientCall(request, GetVmClusterUpdateHistoryEntryResponse::builder)
                .logger(LOG, "getVmClusterUpdateHistoryEntry")
                .serviceDetails(
                        "Database",
                        "GetVmClusterUpdateHistoryEntry",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterUpdateHistoryEntry/GetVmClusterUpdateHistoryEntry")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVmClusterUpdateHistoryEntryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("updateHistoryEntries")
                .appendPathParam(request.getUpdateHistoryEntryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.VmClusterUpdateHistoryEntry.class,
                        GetVmClusterUpdateHistoryEntryResponse.Builder::vmClusterUpdateHistoryEntry)
                .handleResponseHeaderString(
                        "etag", GetVmClusterUpdateHistoryEntryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetVmClusterUpdateHistoryEntryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<LaunchAutonomousExadataInfrastructureResponse>
            launchAutonomousExadataInfrastructure(
                    LaunchAutonomousExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    LaunchAutonomousExadataInfrastructureRequest,
                                    LaunchAutonomousExadataInfrastructureResponse>
                            handler) {
        Objects.requireNonNull(
                request.getLaunchAutonomousExadataInfrastructureDetails(),
                "launchAutonomousExadataInfrastructureDetails is required");

        return clientCall(request, LaunchAutonomousExadataInfrastructureResponse::builder)
                .logger(LOG, "launchAutonomousExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "LaunchAutonomousExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousExadataInfrastructure/LaunchAutonomousExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(LaunchAutonomousExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructures")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousExadataInfrastructure.class,
                        LaunchAutonomousExadataInfrastructureResponse.Builder
                                ::autonomousExadataInfrastructure)
                .handleResponseHeaderString(
                        "etag", LaunchAutonomousExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        LaunchAutonomousExadataInfrastructureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        LaunchAutonomousExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<LaunchDbSystemResponse> launchDbSystem(
            LaunchDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            LaunchDbSystemRequest, LaunchDbSystemResponse>
                    handler) {
        Objects.requireNonNull(
                request.getLaunchDbSystemDetails(), "launchDbSystemDetails is required");

        return clientCall(request, LaunchDbSystemResponse::builder)
                .logger(LOG, "launchDbSystem")
                .serviceDetails(
                        "Database",
                        "LaunchDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/LaunchDbSystem")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(LaunchDbSystemRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DbSystem.class,
                        LaunchDbSystemResponse.Builder::dbSystem)
                .handleResponseHeaderString(
                        "opc-work-request-id", LaunchDbSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", LaunchDbSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", LaunchDbSystemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousContainerDatabaseDataguardAssociationsResponse>
            listAutonomousContainerDatabaseDataguardAssociations(
                    ListAutonomousContainerDatabaseDataguardAssociationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousContainerDatabaseDataguardAssociationsRequest,
                                    ListAutonomousContainerDatabaseDataguardAssociationsResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        return clientCall(
                        request,
                        ListAutonomousContainerDatabaseDataguardAssociationsResponse::builder)
                .logger(LOG, "listAutonomousContainerDatabaseDataguardAssociations")
                .serviceDetails(
                        "Database",
                        "ListAutonomousContainerDatabaseDataguardAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabaseDataguardAssociation/ListAutonomousContainerDatabaseDataguardAssociations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(
                        ListAutonomousContainerDatabaseDataguardAssociationsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("autonomousContainerDatabaseDataguardAssociations")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model
                                .AutonomousContainerDatabaseDataguardAssociation.class,
                        ListAutonomousContainerDatabaseDataguardAssociationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousContainerDatabaseDataguardAssociationsResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAutonomousContainerDatabaseDataguardAssociationsResponse.Builder
                                ::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousContainerDatabaseVersionsResponse>
            listAutonomousContainerDatabaseVersions(
                    ListAutonomousContainerDatabaseVersionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousContainerDatabaseVersionsRequest,
                                    ListAutonomousContainerDatabaseVersionsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getServiceComponent(), "serviceComponent is required");

        return clientCall(request, ListAutonomousContainerDatabaseVersionsResponse::builder)
                .logger(LOG, "listAutonomousContainerDatabaseVersions")
                .serviceDetails(
                        "Database",
                        "ListAutonomousContainerDatabaseVersions",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabaseVersionSummary/ListAutonomousContainerDatabaseVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousContainerDatabaseVersionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabaseVersions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("serviceComponent", request.getServiceComponent())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousContainerDatabaseVersionSummary
                                .class,
                        ListAutonomousContainerDatabaseVersionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousContainerDatabaseVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAutonomousContainerDatabaseVersionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousContainerDatabasesResponse>
            listAutonomousContainerDatabases(
                    ListAutonomousContainerDatabasesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousContainerDatabasesRequest,
                                    ListAutonomousContainerDatabasesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAutonomousContainerDatabasesResponse::builder)
                .logger(LOG, "listAutonomousContainerDatabases")
                .serviceDetails(
                        "Database",
                        "ListAutonomousContainerDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabase/ListAutonomousContainerDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousContainerDatabasesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "autonomousExadataInfrastructureId",
                        request.getAutonomousExadataInfrastructureId())
                .appendQueryParam("autonomousVmClusterId", request.getAutonomousVmClusterId())
                .appendEnumQueryParam("infrastructureType", request.getInfrastructureType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam(
                        "serviceLevelAgreementType", request.getServiceLevelAgreementType())
                .appendQueryParam(
                        "cloudAutonomousVmClusterId", request.getCloudAutonomousVmClusterId())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousContainerDatabaseSummary.class,
                        ListAutonomousContainerDatabasesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousContainerDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAutonomousContainerDatabasesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousDatabaseBackupsResponse>
            listAutonomousDatabaseBackups(
                    ListAutonomousDatabaseBackupsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousDatabaseBackupsRequest,
                                    ListAutonomousDatabaseBackupsResponse>
                            handler) {

        return clientCall(request, ListAutonomousDatabaseBackupsResponse::builder)
                .logger(LOG, "listAutonomousDatabaseBackups")
                .serviceDetails(
                        "Database",
                        "ListAutonomousDatabaseBackups",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseBackup/ListAutonomousDatabaseBackups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousDatabaseBackupsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabaseBackups")
                .appendQueryParam("autonomousDatabaseId", request.getAutonomousDatabaseId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousDatabaseBackupSummary.class,
                        ListAutonomousDatabaseBackupsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousDatabaseBackupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAutonomousDatabaseBackupsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousDatabaseCharacterSetsResponse>
            listAutonomousDatabaseCharacterSets(
                    ListAutonomousDatabaseCharacterSetsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousDatabaseCharacterSetsRequest,
                                    ListAutonomousDatabaseCharacterSetsResponse>
                            handler) {

        return clientCall(request, ListAutonomousDatabaseCharacterSetsResponse::builder)
                .logger(LOG, "listAutonomousDatabaseCharacterSets")
                .serviceDetails(
                        "Database",
                        "ListAutonomousDatabaseCharacterSets",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseCharacterSets/ListAutonomousDatabaseCharacterSets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousDatabaseCharacterSetsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabaseCharacterSets")
                .appendQueryParam("isShared", request.getIsShared())
                .appendEnumQueryParam("characterSetType", request.getCharacterSetType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousDatabaseCharacterSets.class,
                        ListAutonomousDatabaseCharacterSetsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousDatabaseCharacterSetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAutonomousDatabaseCharacterSetsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousDatabaseClonesResponse>
            listAutonomousDatabaseClones(
                    ListAutonomousDatabaseClonesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousDatabaseClonesRequest,
                                    ListAutonomousDatabaseClonesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, ListAutonomousDatabaseClonesResponse::builder)
                .logger(LOG, "listAutonomousDatabaseClones")
                .serviceDetails(
                        "Database",
                        "ListAutonomousDatabaseClones",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/ListAutonomousDatabaseClones")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousDatabaseClonesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("clones")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("cloneType", request.getCloneType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousDatabaseSummary.class,
                        ListAutonomousDatabaseClonesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousDatabaseClonesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAutonomousDatabaseClonesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousDatabaseDataguardAssociationsResponse>
            listAutonomousDatabaseDataguardAssociations(
                    ListAutonomousDatabaseDataguardAssociationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousDatabaseDataguardAssociationsRequest,
                                    ListAutonomousDatabaseDataguardAssociationsResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, ListAutonomousDatabaseDataguardAssociationsResponse::builder)
                .logger(LOG, "listAutonomousDatabaseDataguardAssociations")
                .serviceDetails(
                        "Database",
                        "ListAutonomousDatabaseDataguardAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseDataguardAssociation/ListAutonomousDatabaseDataguardAssociations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousDatabaseDataguardAssociationsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("autonomousDatabaseDataguardAssociations")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousDatabaseDataguardAssociation.class,
                        ListAutonomousDatabaseDataguardAssociationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousDatabaseDataguardAssociationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAutonomousDatabaseDataguardAssociationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousDatabaseRefreshableClonesResponse>
            listAutonomousDatabaseRefreshableClones(
                    ListAutonomousDatabaseRefreshableClonesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousDatabaseRefreshableClonesRequest,
                                    ListAutonomousDatabaseRefreshableClonesResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, ListAutonomousDatabaseRefreshableClonesResponse::builder)
                .logger(LOG, "listAutonomousDatabaseRefreshableClones")
                .serviceDetails(
                        "Database",
                        "ListAutonomousDatabaseRefreshableClones",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/ListAutonomousDatabaseRefreshableClones")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousDatabaseRefreshableClonesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("refreshableClones")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.RefreshableCloneCollection.class,
                        ListAutonomousDatabaseRefreshableClonesResponse.Builder
                                ::refreshableCloneCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousDatabaseRefreshableClonesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAutonomousDatabaseRefreshableClonesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousDatabasesResponse> listAutonomousDatabases(
            ListAutonomousDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAutonomousDatabasesRequest, ListAutonomousDatabasesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAutonomousDatabasesResponse::builder)
                .logger(LOG, "listAutonomousDatabases")
                .serviceDetails(
                        "Database",
                        "ListAutonomousDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/ListAutonomousDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousDatabasesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "autonomousContainerDatabaseId", request.getAutonomousContainerDatabaseId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("infrastructureType", request.getInfrastructureType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("dbWorkload", request.getDbWorkload())
                .appendQueryParam("dbVersion", request.getDbVersion())
                .appendQueryParam("isFreeTier", request.getIsFreeTier())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("isRefreshableClone", request.getIsRefreshableClone())
                .appendQueryParam("isDataGuardEnabled", request.getIsDataGuardEnabled())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousDatabaseSummary.class,
                        ListAutonomousDatabasesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListAutonomousDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAutonomousDatabasesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousDbPreviewVersionsResponse>
            listAutonomousDbPreviewVersions(
                    ListAutonomousDbPreviewVersionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousDbPreviewVersionsRequest,
                                    ListAutonomousDbPreviewVersionsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAutonomousDbPreviewVersionsResponse::builder)
                .logger(LOG, "listAutonomousDbPreviewVersions")
                .serviceDetails(
                        "Database",
                        "ListAutonomousDbPreviewVersions",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDbPreviewVersionSummary/ListAutonomousDbPreviewVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousDbPreviewVersionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDbPreviewVersions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousDbPreviewVersionSummary.class,
                        ListAutonomousDbPreviewVersionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousDbPreviewVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAutonomousDbPreviewVersionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousDbVersionsResponse> listAutonomousDbVersions(
            ListAutonomousDbVersionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAutonomousDbVersionsRequest, ListAutonomousDbVersionsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAutonomousDbVersionsResponse::builder)
                .logger(LOG, "listAutonomousDbVersions")
                .serviceDetails(
                        "Database",
                        "ListAutonomousDbVersions",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDbVersionSummary/ListAutonomousDbVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousDbVersionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDbVersions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("dbWorkload", request.getDbWorkload())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousDbVersionSummary.class,
                        ListAutonomousDbVersionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListAutonomousDbVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAutonomousDbVersionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousExadataInfrastructureShapesResponse>
            listAutonomousExadataInfrastructureShapes(
                    ListAutonomousExadataInfrastructureShapesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousExadataInfrastructureShapesRequest,
                                    ListAutonomousExadataInfrastructureShapesResponse>
                            handler) {
        Objects.requireNonNull(request.getAvailabilityDomain(), "availabilityDomain is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAutonomousExadataInfrastructureShapesResponse::builder)
                .logger(LOG, "listAutonomousExadataInfrastructureShapes")
                .serviceDetails(
                        "Database",
                        "ListAutonomousExadataInfrastructureShapes",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousExadataInfrastructureShapeSummary/ListAutonomousExadataInfrastructureShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousExadataInfrastructureShapesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructureShapes")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousExadataInfrastructureShapeSummary
                                .class,
                        ListAutonomousExadataInfrastructureShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousExadataInfrastructureShapesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAutonomousExadataInfrastructureShapesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousExadataInfrastructuresResponse>
            listAutonomousExadataInfrastructures(
                    ListAutonomousExadataInfrastructuresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousExadataInfrastructuresRequest,
                                    ListAutonomousExadataInfrastructuresResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAutonomousExadataInfrastructuresResponse::builder)
                .logger(LOG, "listAutonomousExadataInfrastructures")
                .serviceDetails(
                        "Database",
                        "ListAutonomousExadataInfrastructures",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousExadataInfrastructure/ListAutonomousExadataInfrastructures")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousExadataInfrastructuresRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructures")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousExadataInfrastructureSummary.class,
                        ListAutonomousExadataInfrastructuresResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousExadataInfrastructuresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAutonomousExadataInfrastructuresResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousVmClustersResponse> listAutonomousVmClusters(
            ListAutonomousVmClustersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAutonomousVmClustersRequest, ListAutonomousVmClustersResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAutonomousVmClustersResponse::builder)
                .logger(LOG, "listAutonomousVmClusters")
                .serviceDetails(
                        "Database",
                        "ListAutonomousVmClusters",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousVmCluster/ListAutonomousVmClusters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousVmClustersRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousVmClusters")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("exadataInfrastructureId", request.getExadataInfrastructureId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousVmClusterSummary.class,
                        ListAutonomousVmClustersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListAutonomousVmClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAutonomousVmClustersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBackupDestinationResponse> listBackupDestination(
            ListBackupDestinationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBackupDestinationRequest, ListBackupDestinationResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListBackupDestinationResponse::builder)
                .logger(LOG, "listBackupDestination")
                .serviceDetails(
                        "Database",
                        "ListBackupDestination",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/BackupDestinationSummary/ListBackupDestination")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBackupDestinationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backupDestinations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("type", request.getType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.BackupDestinationSummary.class,
                        ListBackupDestinationResponse.Builder::items)
                .handleResponseHeaderString("etag", ListBackupDestinationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ListBackupDestinationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBackupDestinationResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBackupsResponse> listBackups(
            ListBackupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListBackupsRequest, ListBackupsResponse>
                    handler) {

        return clientCall(request, ListBackupsResponse::builder)
                .logger(LOG, "listBackups")
                .serviceDetails(
                        "Database",
                        "ListBackups",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Backup/ListBackups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBackupsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backups")
                .appendQueryParam("databaseId", request.getDatabaseId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.BackupSummary.class,
                        ListBackupsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListBackupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBackupsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCloudAutonomousVmClustersResponse>
            listCloudAutonomousVmClusters(
                    ListCloudAutonomousVmClustersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCloudAutonomousVmClustersRequest,
                                    ListCloudAutonomousVmClustersResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCloudAutonomousVmClustersResponse::builder)
                .logger(LOG, "listCloudAutonomousVmClusters")
                .serviceDetails(
                        "Database",
                        "ListCloudAutonomousVmClusters",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudAutonomousVmCluster/ListCloudAutonomousVmClusters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCloudAutonomousVmClustersRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudAutonomousVmClusters")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "cloudExadataInfrastructureId", request.getCloudExadataInfrastructureId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.CloudAutonomousVmClusterSummary.class,
                        ListCloudAutonomousVmClustersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListCloudAutonomousVmClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCloudAutonomousVmClustersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCloudExadataInfrastructuresResponse>
            listCloudExadataInfrastructures(
                    ListCloudExadataInfrastructuresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCloudExadataInfrastructuresRequest,
                                    ListCloudExadataInfrastructuresResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCloudExadataInfrastructuresResponse::builder)
                .logger(LOG, "listCloudExadataInfrastructures")
                .serviceDetails(
                        "Database",
                        "ListCloudExadataInfrastructures",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudExadataInfrastructure/ListCloudExadataInfrastructures")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCloudExadataInfrastructuresRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudExadataInfrastructures")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.CloudExadataInfrastructureSummary.class,
                        ListCloudExadataInfrastructuresResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListCloudExadataInfrastructuresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListCloudExadataInfrastructuresResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCloudVmClusterUpdateHistoryEntriesResponse>
            listCloudVmClusterUpdateHistoryEntries(
                    ListCloudVmClusterUpdateHistoryEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCloudVmClusterUpdateHistoryEntriesRequest,
                                    ListCloudVmClusterUpdateHistoryEntriesResponse>
                            handler) {

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        return clientCall(request, ListCloudVmClusterUpdateHistoryEntriesResponse::builder)
                .logger(LOG, "listCloudVmClusterUpdateHistoryEntries")
                .serviceDetails(
                        "Database",
                        "ListCloudVmClusterUpdateHistoryEntries",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/UpdateHistoryEntry/ListCloudVmClusterUpdateHistoryEntries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCloudVmClusterUpdateHistoryEntriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .appendPathParam("updateHistoryEntries")
                .appendEnumQueryParam("updateType", request.getUpdateType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.UpdateHistoryEntrySummary.class,
                        ListCloudVmClusterUpdateHistoryEntriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListCloudVmClusterUpdateHistoryEntriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListCloudVmClusterUpdateHistoryEntriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCloudVmClusterUpdatesResponse> listCloudVmClusterUpdates(
            ListCloudVmClusterUpdatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCloudVmClusterUpdatesRequest, ListCloudVmClusterUpdatesResponse>
                    handler) {

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        return clientCall(request, ListCloudVmClusterUpdatesResponse::builder)
                .logger(LOG, "listCloudVmClusterUpdates")
                .serviceDetails(
                        "Database",
                        "ListCloudVmClusterUpdates",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Update/ListCloudVmClusterUpdates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCloudVmClusterUpdatesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .appendPathParam("updates")
                .appendEnumQueryParam("updateType", request.getUpdateType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.UpdateSummary.class,
                        ListCloudVmClusterUpdatesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListCloudVmClusterUpdatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCloudVmClusterUpdatesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCloudVmClustersResponse> listCloudVmClusters(
            ListCloudVmClustersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCloudVmClustersRequest, ListCloudVmClustersResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCloudVmClustersResponse::builder)
                .logger(LOG, "listCloudVmClusters")
                .serviceDetails(
                        "Database",
                        "ListCloudVmClusters",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/ListCloudVmClusters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCloudVmClustersRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "cloudExadataInfrastructureId", request.getCloudExadataInfrastructureId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.CloudVmClusterSummary.class,
                        ListCloudVmClustersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListCloudVmClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCloudVmClustersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListConsoleConnectionsResponse> listConsoleConnections(
            ListConsoleConnectionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListConsoleConnectionsRequest, ListConsoleConnectionsResponse>
                    handler) {

        Validate.notBlank(request.getDbNodeId(), "dbNodeId must not be blank");

        return clientCall(request, ListConsoleConnectionsResponse::builder)
                .logger(LOG, "listConsoleConnections")
                .serviceDetails(
                        "Database",
                        "ListConsoleConnections",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ConsoleConnection/ListConsoleConnections")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConsoleConnectionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbNodes")
                .appendPathParam(request.getDbNodeId())
                .appendPathParam("consoleConnections")
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.ConsoleConnectionSummary.class,
                        ListConsoleConnectionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListConsoleConnectionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConsoleConnectionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListContainerDatabasePatchesResponse>
            listContainerDatabasePatches(
                    ListContainerDatabasePatchesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListContainerDatabasePatchesRequest,
                                    ListContainerDatabasePatchesResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListContainerDatabasePatchesResponse::builder)
                .logger(LOG, "listContainerDatabasePatches")
                .serviceDetails(
                        "Database",
                        "ListContainerDatabasePatches",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousPatch/ListContainerDatabasePatches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListContainerDatabasePatchesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("patches")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousPatchSummary.class,
                        ListContainerDatabasePatchesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListContainerDatabasePatchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListContainerDatabasePatchesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDataGuardAssociationsResponse> listDataGuardAssociations(
            ListDataGuardAssociationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataGuardAssociationsRequest, ListDataGuardAssociationsResponse>
                    handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        return clientCall(request, ListDataGuardAssociationsResponse::builder)
                .logger(LOG, "listDataGuardAssociations")
                .serviceDetails(
                        "Database",
                        "ListDataGuardAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DataGuardAssociation/ListDataGuardAssociations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataGuardAssociationsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("dataGuardAssociations")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.DataGuardAssociationSummary.class,
                        ListDataGuardAssociationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataGuardAssociationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDataGuardAssociationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseSoftwareImagesResponse>
            listDatabaseSoftwareImages(
                    ListDatabaseSoftwareImagesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseSoftwareImagesRequest,
                                    ListDatabaseSoftwareImagesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDatabaseSoftwareImagesResponse::builder)
                .logger(LOG, "listDatabaseSoftwareImages")
                .serviceDetails(
                        "Database",
                        "ListDatabaseSoftwareImages",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DatabaseSoftwareImage/ListDatabaseSoftwareImages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatabaseSoftwareImagesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databaseSoftwareImages")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("imageType", request.getImageType())
                .appendEnumQueryParam("imageShapeFamily", request.getImageShapeFamily())
                .appendQueryParam("isUpgradeSupported", request.getIsUpgradeSupported())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.DatabaseSoftwareImageSummary.class,
                        ListDatabaseSoftwareImagesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDatabaseSoftwareImagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatabaseSoftwareImagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseUpgradeHistoryEntriesResponse>
            listDatabaseUpgradeHistoryEntries(
                    ListDatabaseUpgradeHistoryEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseUpgradeHistoryEntriesRequest,
                                    ListDatabaseUpgradeHistoryEntriesResponse>
                            handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        return clientCall(request, ListDatabaseUpgradeHistoryEntriesResponse::builder)
                .logger(LOG, "listDatabaseUpgradeHistoryEntries")
                .serviceDetails(
                        "Database",
                        "ListDatabaseUpgradeHistoryEntries",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/ListDatabaseUpgradeHistoryEntries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatabaseUpgradeHistoryEntriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("upgradeHistoryEntries")
                .appendEnumQueryParam("upgradeAction", request.getUpgradeAction())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.DatabaseUpgradeHistoryEntrySummary.class,
                        ListDatabaseUpgradeHistoryEntriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDatabaseUpgradeHistoryEntriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDatabaseUpgradeHistoryEntriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDatabasesResponse> listDatabases(
            ListDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDatabasesRequest, ListDatabasesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDatabasesResponse::builder)
                .logger(LOG, "listDatabases")
                .serviceDetails(
                        "Database",
                        "ListDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/ListDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatabasesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("dbHomeId", request.getDbHomeId())
                .appendQueryParam("systemId", request.getSystemId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("dbName", request.getDbName())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.DatabaseSummary.class,
                        ListDatabasesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatabasesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDbHomePatchHistoryEntriesResponse>
            listDbHomePatchHistoryEntries(
                    ListDbHomePatchHistoryEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDbHomePatchHistoryEntriesRequest,
                                    ListDbHomePatchHistoryEntriesResponse>
                            handler) {

        Validate.notBlank(request.getDbHomeId(), "dbHomeId must not be blank");

        return clientCall(request, ListDbHomePatchHistoryEntriesResponse::builder)
                .logger(LOG, "listDbHomePatchHistoryEntries")
                .serviceDetails(
                        "Database",
                        "ListDbHomePatchHistoryEntries",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PatchHistoryEntry/ListDbHomePatchHistoryEntries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbHomePatchHistoryEntriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbHomes")
                .appendPathParam(request.getDbHomeId())
                .appendPathParam("patchHistoryEntries")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.PatchHistoryEntrySummary.class,
                        ListDbHomePatchHistoryEntriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDbHomePatchHistoryEntriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbHomePatchHistoryEntriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDbHomePatchesResponse> listDbHomePatches(
            ListDbHomePatchesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDbHomePatchesRequest, ListDbHomePatchesResponse>
                    handler) {

        Validate.notBlank(request.getDbHomeId(), "dbHomeId must not be blank");

        return clientCall(request, ListDbHomePatchesResponse::builder)
                .logger(LOG, "listDbHomePatches")
                .serviceDetails(
                        "Database",
                        "ListDbHomePatches",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Patch/ListDbHomePatches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbHomePatchesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbHomes")
                .appendPathParam(request.getDbHomeId())
                .appendPathParam("patches")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.PatchSummary.class,
                        ListDbHomePatchesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDbHomePatchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbHomePatchesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDbHomesResponse> listDbHomes(
            ListDbHomesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDbHomesRequest, ListDbHomesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDbHomesResponse::builder)
                .logger(LOG, "listDbHomes")
                .serviceDetails(
                        "Database",
                        "ListDbHomes",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbHome/ListDbHomes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbHomesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbHomes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("dbSystemId", request.getDbSystemId())
                .appendQueryParam("vmClusterId", request.getVmClusterId())
                .appendQueryParam("backupId", request.getBackupId())
                .appendQueryParam("dbVersion", request.getDbVersion())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.DbHomeSummary.class,
                        ListDbHomesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDbHomesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbHomesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDbNodesResponse> listDbNodes(
            ListDbNodesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDbNodesRequest, ListDbNodesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDbNodesResponse::builder)
                .logger(LOG, "listDbNodes")
                .serviceDetails(
                        "Database",
                        "ListDbNodes",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbNode/ListDbNodes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbNodesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbNodes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("dbSystemId", request.getDbSystemId())
                .appendQueryParam("vmClusterId", request.getVmClusterId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("dbServerId", request.getDbServerId())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.DbNodeSummary.class,
                        ListDbNodesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDbNodesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbNodesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDbServersResponse> listDbServers(
            ListDbServersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDbServersRequest, ListDbServersResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getExadataInfrastructureId(), "exadataInfrastructureId is required");

        return clientCall(request, ListDbServersResponse::builder)
                .logger(LOG, "listDbServers")
                .serviceDetails(
                        "Database",
                        "ListDbServers",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbServer/ListDbServers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbServersRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbServers")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("exadataInfrastructureId", request.getExadataInfrastructureId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.DbServerSummary.class,
                        ListDbServersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDbServersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbServersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDbSystemComputePerformancesResponse>
            listDbSystemComputePerformances(
                    ListDbSystemComputePerformancesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDbSystemComputePerformancesRequest,
                                    ListDbSystemComputePerformancesResponse>
                            handler) {

        return clientCall(request, ListDbSystemComputePerformancesResponse::builder)
                .logger(LOG, "listDbSystemComputePerformances")
                .serviceDetails(
                        "Database",
                        "ListDbSystemComputePerformances",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystemComputePerformanceSummary/ListDbSystemComputePerformances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbSystemComputePerformancesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystemComputePerformance")
                .appendQueryParam("dbSystemShape", request.getDbSystemShape())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.DbSystemComputePerformanceSummary.class,
                        ListDbSystemComputePerformancesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDbSystemComputePerformancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDbSystemComputePerformancesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDbSystemPatchHistoryEntriesResponse>
            listDbSystemPatchHistoryEntries(
                    ListDbSystemPatchHistoryEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDbSystemPatchHistoryEntriesRequest,
                                    ListDbSystemPatchHistoryEntriesResponse>
                            handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, ListDbSystemPatchHistoryEntriesResponse::builder)
                .logger(LOG, "listDbSystemPatchHistoryEntries")
                .serviceDetails(
                        "Database",
                        "ListDbSystemPatchHistoryEntries",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PatchHistoryEntry/ListDbSystemPatchHistoryEntries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbSystemPatchHistoryEntriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("patchHistoryEntries")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.PatchHistoryEntrySummary.class,
                        ListDbSystemPatchHistoryEntriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDbSystemPatchHistoryEntriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDbSystemPatchHistoryEntriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDbSystemPatchesResponse> listDbSystemPatches(
            ListDbSystemPatchesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDbSystemPatchesRequest, ListDbSystemPatchesResponse>
                    handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, ListDbSystemPatchesResponse::builder)
                .logger(LOG, "listDbSystemPatches")
                .serviceDetails(
                        "Database",
                        "ListDbSystemPatches",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Patch/ListDbSystemPatches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbSystemPatchesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("patches")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.PatchSummary.class,
                        ListDbSystemPatchesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDbSystemPatchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbSystemPatchesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDbSystemShapesResponse> listDbSystemShapes(
            ListDbSystemShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDbSystemShapesRequest, ListDbSystemShapesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDbSystemShapesResponse::builder)
                .logger(LOG, "listDbSystemShapes")
                .serviceDetails(
                        "Database",
                        "ListDbSystemShapes",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystemShapeSummary/ListDbSystemShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbSystemShapesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystemShapes")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.DbSystemShapeSummary.class,
                        ListDbSystemShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDbSystemShapesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbSystemShapesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDbSystemStoragePerformancesResponse>
            listDbSystemStoragePerformances(
                    ListDbSystemStoragePerformancesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDbSystemStoragePerformancesRequest,
                                    ListDbSystemStoragePerformancesResponse>
                            handler) {
        Objects.requireNonNull(request.getStorageManagement(), "storageManagement is required");

        return clientCall(request, ListDbSystemStoragePerformancesResponse::builder)
                .logger(LOG, "listDbSystemStoragePerformances")
                .serviceDetails(
                        "Database",
                        "ListDbSystemStoragePerformances",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystemStoragePerformanceSummary/ListDbSystemStoragePerformances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbSystemStoragePerformancesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystemStoragePerformance")
                .appendEnumQueryParam("storageManagement", request.getStorageManagement())
                .appendQueryParam("shapeType", request.getShapeType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.DbSystemStoragePerformanceSummary.class,
                        ListDbSystemStoragePerformancesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDbSystemStoragePerformancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDbSystemStoragePerformancesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDbSystemUpgradeHistoryEntriesResponse>
            listDbSystemUpgradeHistoryEntries(
                    ListDbSystemUpgradeHistoryEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDbSystemUpgradeHistoryEntriesRequest,
                                    ListDbSystemUpgradeHistoryEntriesResponse>
                            handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, ListDbSystemUpgradeHistoryEntriesResponse::builder)
                .logger(LOG, "listDbSystemUpgradeHistoryEntries")
                .serviceDetails(
                        "Database",
                        "ListDbSystemUpgradeHistoryEntries",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystemUpgradeHistoryEntry/ListDbSystemUpgradeHistoryEntries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbSystemUpgradeHistoryEntriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("upgradeHistoryEntries")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("upgradeAction", request.getUpgradeAction())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntrySummary.class,
                        ListDbSystemUpgradeHistoryEntriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDbSystemUpgradeHistoryEntriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDbSystemUpgradeHistoryEntriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDbSystemsResponse> listDbSystems(
            ListDbSystemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDbSystemsRequest, ListDbSystemsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDbSystemsResponse::builder)
                .logger(LOG, "listDbSystems")
                .serviceDetails(
                        "Database",
                        "ListDbSystems",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/ListDbSystems")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbSystemsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("backupId", request.getBackupId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.DbSystemSummary.class,
                        ListDbSystemsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDbSystemsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbSystemsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDbVersionsResponse> listDbVersions(
            ListDbVersionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDbVersionsRequest, ListDbVersionsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDbVersionsResponse::builder)
                .logger(LOG, "listDbVersions")
                .serviceDetails(
                        "Database",
                        "ListDbVersions",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbVersionSummary/ListDbVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbVersionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbVersions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("dbSystemShape", request.getDbSystemShape())
                .appendQueryParam("dbSystemId", request.getDbSystemId())
                .appendEnumQueryParam("storageManagement", request.getStorageManagement())
                .appendQueryParam("isUpgradeSupported", request.getIsUpgradeSupported())
                .appendQueryParam(
                        "isDatabaseSoftwareImageSupported",
                        request.getIsDatabaseSoftwareImageSupported())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.DbVersionSummary.class,
                        ListDbVersionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDbVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbVersionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExadataInfrastructuresResponse>
            listExadataInfrastructures(
                    ListExadataInfrastructuresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExadataInfrastructuresRequest,
                                    ListExadataInfrastructuresResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListExadataInfrastructuresResponse::builder)
                .logger(LOG, "listExadataInfrastructures")
                .serviceDetails(
                        "Database",
                        "ListExadataInfrastructures",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/ListExadataInfrastructures")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExadataInfrastructuresRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendListQueryParam(
                        "excludedFields",
                        request.getExcludedFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.ExadataInfrastructureSummary.class,
                        ListExadataInfrastructuresResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListExadataInfrastructuresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExadataInfrastructuresResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalContainerDatabasesResponse>
            listExternalContainerDatabases(
                    ListExternalContainerDatabasesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalContainerDatabasesRequest,
                                    ListExternalContainerDatabasesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListExternalContainerDatabasesResponse::builder)
                .logger(LOG, "listExternalContainerDatabases")
                .serviceDetails(
                        "Database",
                        "ListExternalContainerDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/ListExternalContainerDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalContainerDatabasesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.ExternalContainerDatabaseSummary.class,
                        ListExternalContainerDatabasesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListExternalContainerDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListExternalContainerDatabasesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalDatabaseConnectorsResponse>
            listExternalDatabaseConnectors(
                    ListExternalDatabaseConnectorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalDatabaseConnectorsRequest,
                                    ListExternalDatabaseConnectorsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getExternalDatabaseId(), "externalDatabaseId is required");

        return clientCall(request, ListExternalDatabaseConnectorsResponse::builder)
                .logger(LOG, "listExternalDatabaseConnectors")
                .serviceDetails(
                        "Database",
                        "ListExternalDatabaseConnectors",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalDatabaseConnector/ListExternalDatabaseConnectors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalDatabaseConnectorsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externaldatabaseconnectors")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("externalDatabaseId", request.getExternalDatabaseId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.ExternalDatabaseConnectorSummary.class,
                        ListExternalDatabaseConnectorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListExternalDatabaseConnectorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListExternalDatabaseConnectorsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalNonContainerDatabasesResponse>
            listExternalNonContainerDatabases(
                    ListExternalNonContainerDatabasesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalNonContainerDatabasesRequest,
                                    ListExternalNonContainerDatabasesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListExternalNonContainerDatabasesResponse::builder)
                .logger(LOG, "listExternalNonContainerDatabases")
                .serviceDetails(
                        "Database",
                        "ListExternalNonContainerDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/ListExternalNonContainerDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalNonContainerDatabasesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.ExternalNonContainerDatabaseSummary.class,
                        ListExternalNonContainerDatabasesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListExternalNonContainerDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListExternalNonContainerDatabasesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalPluggableDatabasesResponse>
            listExternalPluggableDatabases(
                    ListExternalPluggableDatabasesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalPluggableDatabasesRequest,
                                    ListExternalPluggableDatabasesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListExternalPluggableDatabasesResponse::builder)
                .logger(LOG, "listExternalPluggableDatabases")
                .serviceDetails(
                        "Database",
                        "ListExternalPluggableDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/ListExternalPluggableDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalPluggableDatabasesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "externalContainerDatabaseId", request.getExternalContainerDatabaseId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.ExternalPluggableDatabaseSummary.class,
                        ListExternalPluggableDatabasesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListExternalPluggableDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListExternalPluggableDatabasesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFlexComponentsResponse> listFlexComponents(
            ListFlexComponentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFlexComponentsRequest, ListFlexComponentsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListFlexComponentsResponse::builder)
                .logger(LOG, "listFlexComponents")
                .serviceDetails(
                        "Database",
                        "ListFlexComponents",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/FlexComponentCollection/ListFlexComponents")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFlexComponentsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystemShapes")
                .appendPathParam("flexComponents")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.FlexComponentCollection.class,
                        ListFlexComponentsResponse.Builder::flexComponentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFlexComponentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFlexComponentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListGiVersionsResponse> listGiVersions(
            ListGiVersionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListGiVersionsRequest, ListGiVersionsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListGiVersionsResponse::builder)
                .logger(LOG, "listGiVersions")
                .serviceDetails(
                        "Database",
                        "ListGiVersions",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/GiVersionSummary/ListGiVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGiVersionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("giVersions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("shape", request.getShape())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.GiVersionSummary.class,
                        ListGiVersionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListGiVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGiVersionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListKeyStoresResponse> listKeyStores(
            ListKeyStoresRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListKeyStoresRequest, ListKeyStoresResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListKeyStoresResponse::builder)
                .logger(LOG, "listKeyStores")
                .serviceDetails(
                        "Database",
                        "ListKeyStores",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/KeyStoreSummary/ListKeyStores")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListKeyStoresRequest::builder)
                .basePath("/20160918")
                .appendPathParam("keyStores")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.KeyStoreSummary.class,
                        ListKeyStoresResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListKeyStoresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListKeyStoresResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMaintenanceRunHistoryResponse> listMaintenanceRunHistory(
            ListMaintenanceRunHistoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaintenanceRunHistoryRequest, ListMaintenanceRunHistoryResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMaintenanceRunHistoryResponse::builder)
                .logger(LOG, "listMaintenanceRunHistory")
                .serviceDetails(
                        "Database",
                        "ListMaintenanceRunHistory",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/MaintenanceRunHistory/ListMaintenanceRunHistory")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMaintenanceRunHistoryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("maintenanceRunHistory")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("targetResourceId", request.getTargetResourceId())
                .appendEnumQueryParam("targetResourceType", request.getTargetResourceType())
                .appendEnumQueryParam("maintenanceType", request.getMaintenanceType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendEnumQueryParam("maintenanceSubtype", request.getMaintenanceSubtype())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.MaintenanceRunHistorySummary.class,
                        ListMaintenanceRunHistoryResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListMaintenanceRunHistoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMaintenanceRunHistoryResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMaintenanceRunsResponse> listMaintenanceRuns(
            ListMaintenanceRunsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaintenanceRunsRequest, ListMaintenanceRunsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMaintenanceRunsResponse::builder)
                .logger(LOG, "listMaintenanceRuns")
                .serviceDetails(
                        "Database",
                        "ListMaintenanceRuns",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/MaintenanceRun/ListMaintenanceRuns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMaintenanceRunsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("maintenanceRuns")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("targetResourceId", request.getTargetResourceId())
                .appendEnumQueryParam("targetResourceType", request.getTargetResourceType())
                .appendEnumQueryParam("maintenanceType", request.getMaintenanceType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendEnumQueryParam("maintenanceSubtype", request.getMaintenanceSubtype())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.MaintenanceRunSummary.class,
                        ListMaintenanceRunsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListMaintenanceRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMaintenanceRunsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPdbConversionHistoryEntriesResponse>
            listPdbConversionHistoryEntries(
                    ListPdbConversionHistoryEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListPdbConversionHistoryEntriesRequest,
                                    ListPdbConversionHistoryEntriesResponse>
                            handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        return clientCall(request, ListPdbConversionHistoryEntriesResponse::builder)
                .logger(LOG, "listPdbConversionHistoryEntries")
                .serviceDetails(
                        "Database",
                        "ListPdbConversionHistoryEntries",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/ListPdbConversionHistoryEntries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPdbConversionHistoryEntriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("pdbConversionHistoryEntries")
                .appendEnumQueryParam("pdbConversionAction", request.getPdbConversionAction())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.PdbConversionHistoryEntrySummary.class,
                        ListPdbConversionHistoryEntriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListPdbConversionHistoryEntriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListPdbConversionHistoryEntriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPluggableDatabasesResponse> listPluggableDatabases(
            ListPluggableDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPluggableDatabasesRequest, ListPluggableDatabasesResponse>
                    handler) {

        return clientCall(request, ListPluggableDatabasesResponse::builder)
                .logger(LOG, "listPluggableDatabases")
                .serviceDetails(
                        "Database",
                        "ListPluggableDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/ListPluggableDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPluggableDatabasesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("databaseId", request.getDatabaseId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("pdbName", request.getPdbName())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.PluggableDatabaseSummary.class,
                        ListPluggableDatabasesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListPluggableDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPluggableDatabasesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVmClusterNetworksResponse> listVmClusterNetworks(
            ListVmClusterNetworksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVmClusterNetworksRequest, ListVmClusterNetworksResponse>
                    handler) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVmClusterNetworksResponse::builder)
                .logger(LOG, "listVmClusterNetworks")
                .serviceDetails(
                        "Database",
                        "ListVmClusterNetworks",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterNetwork/ListVmClusterNetworks")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVmClusterNetworksRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.VmClusterNetworkSummary.class,
                        ListVmClusterNetworksResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListVmClusterNetworksResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVmClusterNetworksResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVmClusterPatchHistoryEntriesResponse>
            listVmClusterPatchHistoryEntries(
                    ListVmClusterPatchHistoryEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListVmClusterPatchHistoryEntriesRequest,
                                    ListVmClusterPatchHistoryEntriesResponse>
                            handler) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        return clientCall(request, ListVmClusterPatchHistoryEntriesResponse::builder)
                .logger(LOG, "listVmClusterPatchHistoryEntries")
                .serviceDetails(
                        "Database",
                        "ListVmClusterPatchHistoryEntries",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PatchHistoryEntry/ListVmClusterPatchHistoryEntries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVmClusterPatchHistoryEntriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("patchHistoryEntries")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.PatchHistoryEntrySummary.class,
                        ListVmClusterPatchHistoryEntriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListVmClusterPatchHistoryEntriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListVmClusterPatchHistoryEntriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVmClusterPatchesResponse> listVmClusterPatches(
            ListVmClusterPatchesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVmClusterPatchesRequest, ListVmClusterPatchesResponse>
                    handler) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        return clientCall(request, ListVmClusterPatchesResponse::builder)
                .logger(LOG, "listVmClusterPatches")
                .serviceDetails(
                        "Database",
                        "ListVmClusterPatches",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Patch/ListVmClusterPatches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVmClusterPatchesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("patches")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.PatchSummary.class,
                        ListVmClusterPatchesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListVmClusterPatchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVmClusterPatchesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVmClusterUpdateHistoryEntriesResponse>
            listVmClusterUpdateHistoryEntries(
                    ListVmClusterUpdateHistoryEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListVmClusterUpdateHistoryEntriesRequest,
                                    ListVmClusterUpdateHistoryEntriesResponse>
                            handler) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        return clientCall(request, ListVmClusterUpdateHistoryEntriesResponse::builder)
                .logger(LOG, "listVmClusterUpdateHistoryEntries")
                .serviceDetails(
                        "Database",
                        "ListVmClusterUpdateHistoryEntries",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterUpdateHistoryEntry/ListVmClusterUpdateHistoryEntries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVmClusterUpdateHistoryEntriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("updateHistoryEntries")
                .appendEnumQueryParam("updateType", request.getUpdateType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.VmClusterUpdateHistoryEntrySummary.class,
                        ListVmClusterUpdateHistoryEntriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListVmClusterUpdateHistoryEntriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListVmClusterUpdateHistoryEntriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVmClusterUpdatesResponse> listVmClusterUpdates(
            ListVmClusterUpdatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVmClusterUpdatesRequest, ListVmClusterUpdatesResponse>
                    handler) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        return clientCall(request, ListVmClusterUpdatesResponse::builder)
                .logger(LOG, "listVmClusterUpdates")
                .serviceDetails(
                        "Database",
                        "ListVmClusterUpdates",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterUpdate/ListVmClusterUpdates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVmClusterUpdatesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("updates")
                .appendEnumQueryParam("updateType", request.getUpdateType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.VmClusterUpdateSummary.class,
                        ListVmClusterUpdatesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListVmClusterUpdatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVmClusterUpdatesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVmClustersResponse> listVmClusters(
            ListVmClustersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVmClustersRequest, ListVmClustersResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVmClustersResponse::builder)
                .logger(LOG, "listVmClusters")
                .serviceDetails(
                        "Database",
                        "ListVmClusters",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmCluster/ListVmClusters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVmClustersRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("exadataInfrastructureId", request.getExadataInfrastructureId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.VmClusterSummary.class,
                        ListVmClustersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListVmClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVmClustersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<LocalClonePluggableDatabaseResponse>
            localClonePluggableDatabase(
                    LocalClonePluggableDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    LocalClonePluggableDatabaseRequest,
                                    LocalClonePluggableDatabaseResponse>
                            handler) {
        Objects.requireNonNull(
                request.getLocalClonePluggableDatabaseDetails(),
                "localClonePluggableDatabaseDetails is required");

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");

        return clientCall(request, LocalClonePluggableDatabaseResponse::builder)
                .logger(LOG, "localClonePluggableDatabase")
                .serviceDetails(
                        "Database",
                        "LocalClonePluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/LocalClonePluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(LocalClonePluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("localClone")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        LocalClonePluggableDatabaseResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        LocalClonePluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", LocalClonePluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", LocalClonePluggableDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<MigrateExadataDbSystemResourceModelResponse>
            migrateExadataDbSystemResourceModel(
                    MigrateExadataDbSystemResourceModelRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    MigrateExadataDbSystemResourceModelRequest,
                                    MigrateExadataDbSystemResourceModelResponse>
                            handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, MigrateExadataDbSystemResourceModelResponse::builder)
                .logger(LOG, "migrateExadataDbSystemResourceModel")
                .serviceDetails(
                        "Database",
                        "MigrateExadataDbSystemResourceModel",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/MigrateExadataDbSystemResourceModel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(MigrateExadataDbSystemResourceModelRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("actions")
                .appendPathParam("migration")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.database.model.ExadataDbSystemMigration.class,
                        MigrateExadataDbSystemResourceModelResponse.Builder
                                ::exadataDbSystemMigration)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        MigrateExadataDbSystemResourceModelResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        MigrateExadataDbSystemResourceModelResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", MigrateExadataDbSystemResourceModelResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<MigrateVaultKeyResponse> migrateVaultKey(
            MigrateVaultKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            MigrateVaultKeyRequest, MigrateVaultKeyResponse>
                    handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(
                request.getMigrateVaultKeyDetails(), "migrateVaultKeyDetails is required");

        return clientCall(request, MigrateVaultKeyResponse::builder)
                .logger(LOG, "migrateVaultKey")
                .serviceDetails(
                        "Database",
                        "MigrateVaultKey",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/MigrateVaultKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(MigrateVaultKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("migrateKey")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        MigrateVaultKeyResponse.Builder::database)
                .handleResponseHeaderString("etag", MigrateVaultKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", MigrateVaultKeyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", MigrateVaultKeyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ModifyDatabaseManagementResponse> modifyDatabaseManagement(
            ModifyDatabaseManagementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ModifyDatabaseManagementRequest, ModifyDatabaseManagementResponse>
                    handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(
                request.getModifyDatabaseManagementDetails(),
                "modifyDatabaseManagementDetails is required");

        return clientCall(request, ModifyDatabaseManagementResponse::builder)
                .logger(LOG, "modifyDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "ModifyDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/ModifyDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ModifyDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("modifyDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        ModifyDatabaseManagementResponse.Builder::database)
                .handleResponseHeaderString("etag", ModifyDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ModifyDatabaseManagementResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ModifyDatabaseManagementResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ModifyPluggableDatabaseManagementResponse>
            modifyPluggableDatabaseManagement(
                    ModifyPluggableDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ModifyPluggableDatabaseManagementRequest,
                                    ModifyPluggableDatabaseManagementResponse>
                            handler) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getModifyPluggableDatabaseManagementDetails(),
                "modifyPluggableDatabaseManagementDetails is required");

        return clientCall(request, ModifyPluggableDatabaseManagementResponse::builder)
                .logger(LOG, "modifyPluggableDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "ModifyPluggableDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/ModifyPluggableDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ModifyPluggableDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("modifyPluggableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        ModifyPluggableDatabaseManagementResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString(
                        "etag", ModifyPluggableDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ModifyPluggableDatabaseManagementResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ModifyPluggableDatabaseManagementResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RegisterAutonomousDatabaseDataSafeResponse>
            registerAutonomousDatabaseDataSafe(
                    RegisterAutonomousDatabaseDataSafeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RegisterAutonomousDatabaseDataSafeRequest,
                                    RegisterAutonomousDatabaseDataSafeResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, RegisterAutonomousDatabaseDataSafeResponse::builder)
                .logger(LOG, "registerAutonomousDatabaseDataSafe")
                .serviceDetails(
                        "Database",
                        "RegisterAutonomousDatabaseDataSafe",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/RegisterAutonomousDatabaseDataSafe")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RegisterAutonomousDatabaseDataSafeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("registerDataSafe")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RegisterAutonomousDatabaseDataSafeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RegisterAutonomousDatabaseDataSafeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    ReinstateAutonomousContainerDatabaseDataguardAssociationResponse>
            reinstateAutonomousContainerDatabaseDataguardAssociation(
                    ReinstateAutonomousContainerDatabaseDataguardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ReinstateAutonomousContainerDatabaseDataguardAssociationRequest,
                                    ReinstateAutonomousContainerDatabaseDataguardAssociationResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        Validate.notBlank(
                request.getAutonomousContainerDatabaseDataguardAssociationId(),
                "autonomousContainerDatabaseDataguardAssociationId must not be blank");

        return clientCall(
                        request,
                        ReinstateAutonomousContainerDatabaseDataguardAssociationResponse::builder)
                .logger(LOG, "reinstateAutonomousContainerDatabaseDataguardAssociation")
                .serviceDetails(
                        "Database",
                        "ReinstateAutonomousContainerDatabaseDataguardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabaseDataguardAssociation/ReinstateAutonomousContainerDatabaseDataguardAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        ReinstateAutonomousContainerDatabaseDataguardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("autonomousContainerDatabaseDataguardAssociations")
                .appendPathParam(request.getAutonomousContainerDatabaseDataguardAssociationId())
                .appendPathParam("actions")
                .appendPathParam("reinstate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.database.model
                                .AutonomousContainerDatabaseDataguardAssociation.class,
                        ReinstateAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::autonomousContainerDatabaseDataguardAssociation)
                .handleResponseHeaderString(
                        "etag",
                        ReinstateAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ReinstateAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ReinstateAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ReinstateDataGuardAssociationResponse>
            reinstateDataGuardAssociation(
                    ReinstateDataGuardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ReinstateDataGuardAssociationRequest,
                                    ReinstateDataGuardAssociationResponse>
                            handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        Validate.notBlank(
                request.getDataGuardAssociationId(), "dataGuardAssociationId must not be blank");
        Objects.requireNonNull(
                request.getReinstateDataGuardAssociationDetails(),
                "reinstateDataGuardAssociationDetails is required");

        return clientCall(request, ReinstateDataGuardAssociationResponse::builder)
                .logger(LOG, "reinstateDataGuardAssociation")
                .serviceDetails(
                        "Database",
                        "ReinstateDataGuardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DataGuardAssociation/ReinstateDataGuardAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ReinstateDataGuardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("dataGuardAssociations")
                .appendPathParam(request.getDataGuardAssociationId())
                .appendPathParam("actions")
                .appendPathParam("reinstate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DataGuardAssociation.class,
                        ReinstateDataGuardAssociationResponse.Builder::dataGuardAssociation)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ReinstateDataGuardAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", ReinstateDataGuardAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ReinstateDataGuardAssociationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoteClonePluggableDatabaseResponse>
            remoteClonePluggableDatabase(
                    RemoteClonePluggableDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoteClonePluggableDatabaseRequest,
                                    RemoteClonePluggableDatabaseResponse>
                            handler) {
        Objects.requireNonNull(
                request.getRemoteClonePluggableDatabaseDetails(),
                "remoteClonePluggableDatabaseDetails is required");

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");

        return clientCall(request, RemoteClonePluggableDatabaseResponse::builder)
                .logger(LOG, "remoteClonePluggableDatabase")
                .serviceDetails(
                        "Database",
                        "RemoteClonePluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/RemoteClonePluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoteClonePluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("remoteClone")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        RemoteClonePluggableDatabaseResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoteClonePluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", RemoteClonePluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoteClonePluggableDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveVirtualMachineFromCloudVmClusterResponse>
            removeVirtualMachineFromCloudVmCluster(
                    RemoveVirtualMachineFromCloudVmClusterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveVirtualMachineFromCloudVmClusterRequest,
                                    RemoveVirtualMachineFromCloudVmClusterResponse>
                            handler) {
        Objects.requireNonNull(
                request.getRemoveVirtualMachineFromCloudVmClusterDetails(),
                "removeVirtualMachineFromCloudVmClusterDetails is required");

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        return clientCall(request, RemoveVirtualMachineFromCloudVmClusterResponse::builder)
                .logger(LOG, "removeVirtualMachineFromCloudVmCluster")
                .serviceDetails(
                        "Database",
                        "RemoveVirtualMachineFromCloudVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/RemoveVirtualMachineFromCloudVmCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveVirtualMachineFromCloudVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("removeVirtualMachine")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.CloudVmCluster.class,
                        RemoveVirtualMachineFromCloudVmClusterResponse.Builder::cloudVmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveVirtualMachineFromCloudVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", RemoveVirtualMachineFromCloudVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveVirtualMachineFromCloudVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveVirtualMachineFromVmClusterResponse>
            removeVirtualMachineFromVmCluster(
                    RemoveVirtualMachineFromVmClusterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveVirtualMachineFromVmClusterRequest,
                                    RemoveVirtualMachineFromVmClusterResponse>
                            handler) {
        Objects.requireNonNull(
                request.getRemoveVirtualMachineFromVmClusterDetails(),
                "removeVirtualMachineFromVmClusterDetails is required");

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        return clientCall(request, RemoveVirtualMachineFromVmClusterResponse::builder)
                .logger(LOG, "removeVirtualMachineFromVmCluster")
                .serviceDetails(
                        "Database",
                        "RemoveVirtualMachineFromVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmCluster/RemoveVirtualMachineFromVmCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveVirtualMachineFromVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("removeVirtualMachine")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.VmCluster.class,
                        RemoveVirtualMachineFromVmClusterResponse.Builder::vmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveVirtualMachineFromVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", RemoveVirtualMachineFromVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveVirtualMachineFromVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ResizeVmClusterNetworkResponse> resizeVmClusterNetwork(
            ResizeVmClusterNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResizeVmClusterNetworkRequest, ResizeVmClusterNetworkResponse>
                    handler) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        Validate.notBlank(request.getVmClusterNetworkId(), "vmClusterNetworkId must not be blank");
        Objects.requireNonNull(
                request.getResizeVmClusterNetworkDetails(),
                "resizeVmClusterNetworkDetails is required");

        return clientCall(request, ResizeVmClusterNetworkResponse::builder)
                .logger(LOG, "resizeVmClusterNetwork")
                .serviceDetails(
                        "Database",
                        "ResizeVmClusterNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterNetwork/ResizeVmClusterNetwork")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResizeVmClusterNetworkRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .appendPathParam(request.getVmClusterNetworkId())
                .appendPathParam("actions")
                .appendPathParam("resize")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.VmClusterNetwork.class,
                        ResizeVmClusterNetworkResponse.Builder::vmClusterNetwork)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ResizeVmClusterNetworkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", ResizeVmClusterNetworkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ResizeVmClusterNetworkResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RestartAutonomousContainerDatabaseResponse>
            restartAutonomousContainerDatabase(
                    RestartAutonomousContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RestartAutonomousContainerDatabaseRequest,
                                    RestartAutonomousContainerDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        return clientCall(request, RestartAutonomousContainerDatabaseResponse::builder)
                .logger(LOG, "restartAutonomousContainerDatabase")
                .serviceDetails(
                        "Database",
                        "RestartAutonomousContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabase/RestartAutonomousContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestartAutonomousContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("restart")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousContainerDatabase.class,
                        RestartAutonomousContainerDatabaseResponse.Builder
                                ::autonomousContainerDatabase)
                .handleResponseHeaderString(
                        "etag", RestartAutonomousContainerDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RestartAutonomousContainerDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RestartAutonomousContainerDatabaseResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RestartAutonomousDatabaseResponse> restartAutonomousDatabase(
            RestartAutonomousDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RestartAutonomousDatabaseRequest, RestartAutonomousDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, RestartAutonomousDatabaseResponse::builder)
                .logger(LOG, "restartAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "RestartAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/RestartAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestartAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("restart")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        RestartAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString("etag", RestartAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RestartAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RestartAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RestoreAutonomousDatabaseResponse> restoreAutonomousDatabase(
            RestoreAutonomousDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RestoreAutonomousDatabaseRequest, RestoreAutonomousDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getRestoreAutonomousDatabaseDetails(),
                "restoreAutonomousDatabaseDetails is required");

        return clientCall(request, RestoreAutonomousDatabaseResponse::builder)
                .logger(LOG, "restoreAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "RestoreAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/RestoreAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestoreAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("restore")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        RestoreAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString("etag", RestoreAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RestoreAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RestoreAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RestoreDatabaseResponse> restoreDatabase(
            RestoreDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RestoreDatabaseRequest, RestoreDatabaseResponse>
                    handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(
                request.getRestoreDatabaseDetails(), "restoreDatabaseDetails is required");

        return clientCall(request, RestoreDatabaseResponse::builder)
                .logger(LOG, "restoreDatabase")
                .serviceDetails(
                        "Database",
                        "RestoreDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/RestoreDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestoreDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("restore")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        RestoreDatabaseResponse.Builder::database)
                .handleResponseHeaderString(
                        "opc-work-request-id", RestoreDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", RestoreDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RestoreDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RotateAutonomousContainerDatabaseEncryptionKeyResponse>
            rotateAutonomousContainerDatabaseEncryptionKey(
                    RotateAutonomousContainerDatabaseEncryptionKeyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RotateAutonomousContainerDatabaseEncryptionKeyRequest,
                                    RotateAutonomousContainerDatabaseEncryptionKeyResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        return clientCall(request, RotateAutonomousContainerDatabaseEncryptionKeyResponse::builder)
                .logger(LOG, "rotateAutonomousContainerDatabaseEncryptionKey")
                .serviceDetails(
                        "Database",
                        "RotateAutonomousContainerDatabaseEncryptionKey",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabase/RotateAutonomousContainerDatabaseEncryptionKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateAutonomousContainerDatabaseEncryptionKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("rotateKey")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousContainerDatabase.class,
                        RotateAutonomousContainerDatabaseEncryptionKeyResponse.Builder
                                ::autonomousContainerDatabase)
                .handleResponseHeaderString(
                        "etag",
                        RotateAutonomousContainerDatabaseEncryptionKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RotateAutonomousContainerDatabaseEncryptionKeyResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RotateAutonomousContainerDatabaseEncryptionKeyResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RotateAutonomousDatabaseEncryptionKeyResponse>
            rotateAutonomousDatabaseEncryptionKey(
                    RotateAutonomousDatabaseEncryptionKeyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RotateAutonomousDatabaseEncryptionKeyRequest,
                                    RotateAutonomousDatabaseEncryptionKeyResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, RotateAutonomousDatabaseEncryptionKeyResponse::builder)
                .logger(LOG, "rotateAutonomousDatabaseEncryptionKey")
                .serviceDetails(
                        "Database",
                        "RotateAutonomousDatabaseEncryptionKey",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/RotateAutonomousDatabaseEncryptionKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateAutonomousDatabaseEncryptionKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("rotateKey")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        RotateAutonomousDatabaseEncryptionKeyResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString(
                        "etag", RotateAutonomousDatabaseEncryptionKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RotateAutonomousDatabaseEncryptionKeyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RotateAutonomousDatabaseEncryptionKeyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RotateCloudAutonomousVmClusterOrdsCertsResponse>
            rotateCloudAutonomousVmClusterOrdsCerts(
                    RotateCloudAutonomousVmClusterOrdsCertsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RotateCloudAutonomousVmClusterOrdsCertsRequest,
                                    RotateCloudAutonomousVmClusterOrdsCertsResponse>
                            handler) {

        Validate.notBlank(
                request.getCloudAutonomousVmClusterId(),
                "cloudAutonomousVmClusterId must not be blank");

        return clientCall(request, RotateCloudAutonomousVmClusterOrdsCertsResponse::builder)
                .logger(LOG, "rotateCloudAutonomousVmClusterOrdsCerts")
                .serviceDetails(
                        "Database",
                        "RotateCloudAutonomousVmClusterOrdsCerts",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudAutonomousVmCluster/RotateCloudAutonomousVmClusterOrdsCerts")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateCloudAutonomousVmClusterOrdsCertsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudAutonomousVmClusters")
                .appendPathParam(request.getCloudAutonomousVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("rotateOrdsCerts")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RotateCloudAutonomousVmClusterOrdsCertsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RotateCloudAutonomousVmClusterOrdsCertsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RotateCloudAutonomousVmClusterSslCertsResponse>
            rotateCloudAutonomousVmClusterSslCerts(
                    RotateCloudAutonomousVmClusterSslCertsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RotateCloudAutonomousVmClusterSslCertsRequest,
                                    RotateCloudAutonomousVmClusterSslCertsResponse>
                            handler) {

        Validate.notBlank(
                request.getCloudAutonomousVmClusterId(),
                "cloudAutonomousVmClusterId must not be blank");

        return clientCall(request, RotateCloudAutonomousVmClusterSslCertsResponse::builder)
                .logger(LOG, "rotateCloudAutonomousVmClusterSslCerts")
                .serviceDetails(
                        "Database",
                        "RotateCloudAutonomousVmClusterSslCerts",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudAutonomousVmCluster/RotateCloudAutonomousVmClusterSslCerts")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateCloudAutonomousVmClusterSslCertsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudAutonomousVmClusters")
                .appendPathParam(request.getCloudAutonomousVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("rotateSslCerts")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RotateCloudAutonomousVmClusterSslCertsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RotateCloudAutonomousVmClusterSslCertsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RotateOrdsCertsResponse> rotateOrdsCerts(
            RotateOrdsCertsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RotateOrdsCertsRequest, RotateOrdsCertsResponse>
                    handler) {

        Validate.notBlank(
                request.getAutonomousExadataInfrastructureId(),
                "autonomousExadataInfrastructureId must not be blank");

        return clientCall(request, RotateOrdsCertsResponse::builder)
                .logger(LOG, "rotateOrdsCerts")
                .serviceDetails(
                        "Database",
                        "RotateOrdsCerts",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousExadataInfrastructure/RotateOrdsCerts")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateOrdsCertsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructures")
                .appendPathParam(request.getAutonomousExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("rotateOrdsCerts")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", RotateOrdsCertsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RotateOrdsCertsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RotateSslCertsResponse> rotateSslCerts(
            RotateSslCertsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RotateSslCertsRequest, RotateSslCertsResponse>
                    handler) {

        Validate.notBlank(
                request.getAutonomousExadataInfrastructureId(),
                "autonomousExadataInfrastructureId must not be blank");

        return clientCall(request, RotateSslCertsResponse::builder)
                .logger(LOG, "rotateSslCerts")
                .serviceDetails(
                        "Database",
                        "RotateSslCerts",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousExadataInfrastructure/RotateSslCerts")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateSslCertsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructures")
                .appendPathParam(request.getAutonomousExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("rotateSslCerts")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", RotateSslCertsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RotateSslCertsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RotateVaultKeyResponse> rotateVaultKey(
            RotateVaultKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RotateVaultKeyRequest, RotateVaultKeyResponse>
                    handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        return clientCall(request, RotateVaultKeyResponse::builder)
                .logger(LOG, "rotateVaultKey")
                .serviceDetails(
                        "Database",
                        "RotateVaultKey",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/RotateVaultKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateVaultKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("rotateKey")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        RotateVaultKeyResponse.Builder::database)
                .handleResponseHeaderString("etag", RotateVaultKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", RotateVaultKeyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RotateVaultKeyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ScanExternalContainerDatabasePluggableDatabasesResponse>
            scanExternalContainerDatabasePluggableDatabases(
                    ScanExternalContainerDatabasePluggableDatabasesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ScanExternalContainerDatabasePluggableDatabasesRequest,
                                    ScanExternalContainerDatabasePluggableDatabasesResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getExternalDatabaseConnectorId(),
                "externalDatabaseConnectorId is required");

        return clientCall(request, ScanExternalContainerDatabasePluggableDatabasesResponse::builder)
                .logger(LOG, "scanExternalContainerDatabasePluggableDatabases")
                .serviceDetails(
                        "Database",
                        "ScanExternalContainerDatabasePluggableDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/ScanExternalContainerDatabasePluggableDatabases")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScanExternalContainerDatabasePluggableDatabasesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("scanPluggableDatabases")
                .appendQueryParam(
                        "externalDatabaseConnectorId", request.getExternalDatabaseConnectorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ScanExternalContainerDatabasePluggableDatabasesResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ScanExternalContainerDatabasePluggableDatabasesResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ShrinkAutonomousDatabaseResponse> shrinkAutonomousDatabase(
            ShrinkAutonomousDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ShrinkAutonomousDatabaseRequest, ShrinkAutonomousDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, ShrinkAutonomousDatabaseResponse::builder)
                .logger(LOG, "shrinkAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "ShrinkAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/ShrinkAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ShrinkAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("shrink")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        ShrinkAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString("etag", ShrinkAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ShrinkAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ShrinkAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartAutonomousDatabaseResponse> startAutonomousDatabase(
            StartAutonomousDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartAutonomousDatabaseRequest, StartAutonomousDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, StartAutonomousDatabaseResponse::builder)
                .logger(LOG, "startAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "StartAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/StartAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        StartAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString("etag", StartAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StartAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StartAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartPluggableDatabaseResponse> startPluggableDatabase(
            StartPluggableDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartPluggableDatabaseRequest, StartPluggableDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");

        return clientCall(request, StartPluggableDatabaseResponse::builder)
                .logger(LOG, "startPluggableDatabase")
                .serviceDetails(
                        "Database",
                        "StartPluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/StartPluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartPluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        StartPluggableDatabaseResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StartPluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", StartPluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StartPluggableDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopAutonomousDatabaseResponse> stopAutonomousDatabase(
            StopAutonomousDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopAutonomousDatabaseRequest, StopAutonomousDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, StopAutonomousDatabaseResponse::builder)
                .logger(LOG, "stopAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "StopAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/StopAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        StopAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString("etag", StopAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StopAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StopAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopPluggableDatabaseResponse> stopPluggableDatabase(
            StopPluggableDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopPluggableDatabaseRequest, StopPluggableDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");

        return clientCall(request, StopPluggableDatabaseResponse::builder)
                .logger(LOG, "stopPluggableDatabase")
                .serviceDetails(
                        "Database",
                        "StopPluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/StopPluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopPluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        StopPluggableDatabaseResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StopPluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", StopPluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StopPluggableDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse>
            switchoverAutonomousContainerDatabaseDataguardAssociation(
                    SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest,
                                    SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        Validate.notBlank(
                request.getAutonomousContainerDatabaseDataguardAssociationId(),
                "autonomousContainerDatabaseDataguardAssociationId must not be blank");

        return clientCall(
                        request,
                        SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse::builder)
                .logger(LOG, "switchoverAutonomousContainerDatabaseDataguardAssociation")
                .serviceDetails(
                        "Database",
                        "SwitchoverAutonomousContainerDatabaseDataguardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabaseDataguardAssociation/SwitchoverAutonomousContainerDatabaseDataguardAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("autonomousContainerDatabaseDataguardAssociations")
                .appendPathParam(request.getAutonomousContainerDatabaseDataguardAssociationId())
                .appendPathParam("actions")
                .appendPathParam("switchover")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.database.model
                                .AutonomousContainerDatabaseDataguardAssociation.class,
                        SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::autonomousContainerDatabaseDataguardAssociation)
                .handleResponseHeaderString(
                        "etag",
                        SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SwitchoverAutonomousDatabaseResponse>
            switchoverAutonomousDatabase(
                    SwitchoverAutonomousDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SwitchoverAutonomousDatabaseRequest,
                                    SwitchoverAutonomousDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, SwitchoverAutonomousDatabaseResponse::builder)
                .logger(LOG, "switchoverAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "SwitchoverAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/SwitchoverAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SwitchoverAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("switchover")
                .appendQueryParam("peerDbId", request.getPeerDbId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        SwitchoverAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString(
                        "etag", SwitchoverAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SwitchoverAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        SwitchoverAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SwitchoverDataGuardAssociationResponse>
            switchoverDataGuardAssociation(
                    SwitchoverDataGuardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SwitchoverDataGuardAssociationRequest,
                                    SwitchoverDataGuardAssociationResponse>
                            handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        Validate.notBlank(
                request.getDataGuardAssociationId(), "dataGuardAssociationId must not be blank");
        Objects.requireNonNull(
                request.getSwitchoverDataGuardAssociationDetails(),
                "switchoverDataGuardAssociationDetails is required");

        return clientCall(request, SwitchoverDataGuardAssociationResponse::builder)
                .logger(LOG, "switchoverDataGuardAssociation")
                .serviceDetails(
                        "Database",
                        "SwitchoverDataGuardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DataGuardAssociation/SwitchoverDataGuardAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SwitchoverDataGuardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("dataGuardAssociations")
                .appendPathParam(request.getDataGuardAssociationId())
                .appendPathParam("actions")
                .appendPathParam("switchover")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DataGuardAssociation.class,
                        SwitchoverDataGuardAssociationResponse.Builder::dataGuardAssociation)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        SwitchoverDataGuardAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", SwitchoverDataGuardAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SwitchoverDataGuardAssociationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<TerminateAutonomousContainerDatabaseResponse>
            terminateAutonomousContainerDatabase(
                    TerminateAutonomousContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    TerminateAutonomousContainerDatabaseRequest,
                                    TerminateAutonomousContainerDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        return clientCall(request, TerminateAutonomousContainerDatabaseResponse::builder)
                .logger(LOG, "terminateAutonomousContainerDatabase")
                .serviceDetails(
                        "Database",
                        "TerminateAutonomousContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabase/TerminateAutonomousContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(TerminateAutonomousContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        TerminateAutonomousContainerDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        TerminateAutonomousContainerDatabaseResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<TerminateAutonomousExadataInfrastructureResponse>
            terminateAutonomousExadataInfrastructure(
                    TerminateAutonomousExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    TerminateAutonomousExadataInfrastructureRequest,
                                    TerminateAutonomousExadataInfrastructureResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousExadataInfrastructureId(),
                "autonomousExadataInfrastructureId must not be blank");

        return clientCall(request, TerminateAutonomousExadataInfrastructureResponse::builder)
                .logger(LOG, "terminateAutonomousExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "TerminateAutonomousExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousExadataInfrastructure/TerminateAutonomousExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(TerminateAutonomousExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructures")
                .appendPathParam(request.getAutonomousExadataInfrastructureId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        TerminateAutonomousExadataInfrastructureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        TerminateAutonomousExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<TerminateDbSystemResponse> terminateDbSystem(
            TerminateDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TerminateDbSystemRequest, TerminateDbSystemResponse>
                    handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, TerminateDbSystemResponse::builder)
                .logger(LOG, "terminateDbSystem")
                .serviceDetails(
                        "Database",
                        "TerminateDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/TerminateDbSystem")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(TerminateDbSystemRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", TerminateDbSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", TerminateDbSystemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAutonomousContainerDatabaseResponse>
            updateAutonomousContainerDatabase(
                    UpdateAutonomousContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutonomousContainerDatabaseRequest,
                                    UpdateAutonomousContainerDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAutonomousContainerDatabaseDetails(),
                "updateAutonomousContainerDatabaseDetails is required");

        return clientCall(request, UpdateAutonomousContainerDatabaseResponse::builder)
                .logger(LOG, "updateAutonomousContainerDatabase")
                .serviceDetails(
                        "Database",
                        "UpdateAutonomousContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabase/UpdateAutonomousContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAutonomousContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousContainerDatabase.class,
                        UpdateAutonomousContainerDatabaseResponse.Builder
                                ::autonomousContainerDatabase)
                .handleResponseHeaderString(
                        "etag", UpdateAutonomousContainerDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAutonomousContainerDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAutonomousContainerDatabaseResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    UpdateAutonomousContainerDatabaseDataguardAssociationResponse>
            updateAutonomousContainerDatabaseDataguardAssociation(
                    UpdateAutonomousContainerDatabaseDataguardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutonomousContainerDatabaseDataguardAssociationRequest,
                                    UpdateAutonomousContainerDatabaseDataguardAssociationResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        Validate.notBlank(
                request.getAutonomousContainerDatabaseDataguardAssociationId(),
                "autonomousContainerDatabaseDataguardAssociationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAutonomousContainerDatabaseDataGuardAssociationDetails(),
                "updateAutonomousContainerDatabaseDataGuardAssociationDetails is required");

        return clientCall(
                        request,
                        UpdateAutonomousContainerDatabaseDataguardAssociationResponse::builder)
                .logger(LOG, "updateAutonomousContainerDatabaseDataguardAssociation")
                .serviceDetails(
                        "Database",
                        "UpdateAutonomousContainerDatabaseDataguardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabaseDataguardAssociation/UpdateAutonomousContainerDatabaseDataguardAssociation")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(
                        UpdateAutonomousContainerDatabaseDataguardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("autonomousContainerDatabaseDataguardAssociations")
                .appendPathParam(request.getAutonomousContainerDatabaseDataguardAssociationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model
                                .AutonomousContainerDatabaseDataguardAssociation.class,
                        UpdateAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::autonomousContainerDatabaseDataguardAssociation)
                .handleResponseHeaderString(
                        "etag",
                        UpdateAutonomousContainerDatabaseDataguardAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAutonomousDatabaseResponse> updateAutonomousDatabase(
            UpdateAutonomousDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAutonomousDatabaseRequest, UpdateAutonomousDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAutonomousDatabaseDetails(),
                "updateAutonomousDatabaseDetails is required");

        return clientCall(request, UpdateAutonomousDatabaseResponse::builder)
                .logger(LOG, "updateAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "UpdateAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/UpdateAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        UpdateAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString("etag", UpdateAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAutonomousDatabaseRegionalWalletResponse>
            updateAutonomousDatabaseRegionalWallet(
                    UpdateAutonomousDatabaseRegionalWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutonomousDatabaseRegionalWalletRequest,
                                    UpdateAutonomousDatabaseRegionalWalletResponse>
                            handler) {
        Objects.requireNonNull(
                request.getUpdateAutonomousDatabaseWalletDetails(),
                "updateAutonomousDatabaseWalletDetails is required");

        return clientCall(request, UpdateAutonomousDatabaseRegionalWalletResponse::builder)
                .logger(LOG, "updateAutonomousDatabaseRegionalWallet")
                .serviceDetails(
                        "Database",
                        "UpdateAutonomousDatabaseRegionalWallet",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseWallet/UpdateAutonomousDatabaseRegionalWallet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAutonomousDatabaseRegionalWalletRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam("wallet")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAutonomousDatabaseRegionalWalletResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAutonomousDatabaseRegionalWalletResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAutonomousDatabaseWalletResponse>
            updateAutonomousDatabaseWallet(
                    UpdateAutonomousDatabaseWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutonomousDatabaseWalletRequest,
                                    UpdateAutonomousDatabaseWalletResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAutonomousDatabaseWalletDetails(),
                "updateAutonomousDatabaseWalletDetails is required");

        return clientCall(request, UpdateAutonomousDatabaseWalletResponse::builder)
                .logger(LOG, "updateAutonomousDatabaseWallet")
                .serviceDetails(
                        "Database",
                        "UpdateAutonomousDatabaseWallet",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseWallet/UpdateAutonomousDatabaseWallet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAutonomousDatabaseWalletRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("wallet")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAutonomousDatabaseWalletResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAutonomousDatabaseWalletResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAutonomousExadataInfrastructureResponse>
            updateAutonomousExadataInfrastructure(
                    UpdateAutonomousExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutonomousExadataInfrastructureRequest,
                                    UpdateAutonomousExadataInfrastructureResponse>
                            handler) {

        Validate.notBlank(
                request.getAutonomousExadataInfrastructureId(),
                "autonomousExadataInfrastructureId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAutonomousExadataInfrastructuresDetails(),
                "updateAutonomousExadataInfrastructuresDetails is required");

        return clientCall(request, UpdateAutonomousExadataInfrastructureResponse::builder)
                .logger(LOG, "updateAutonomousExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "UpdateAutonomousExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousExadataInfrastructure/UpdateAutonomousExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAutonomousExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructures")
                .appendPathParam(request.getAutonomousExadataInfrastructureId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousExadataInfrastructure.class,
                        UpdateAutonomousExadataInfrastructureResponse.Builder
                                ::autonomousExadataInfrastructure)
                .handleResponseHeaderString(
                        "etag", UpdateAutonomousExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAutonomousExadataInfrastructureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAutonomousExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAutonomousVmClusterResponse> updateAutonomousVmCluster(
            UpdateAutonomousVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAutonomousVmClusterRequest, UpdateAutonomousVmClusterResponse>
                    handler) {

        Validate.notBlank(
                request.getAutonomousVmClusterId(), "autonomousVmClusterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAutonomousVmClusterDetails(),
                "updateAutonomousVmClusterDetails is required");

        return clientCall(request, UpdateAutonomousVmClusterResponse::builder)
                .logger(LOG, "updateAutonomousVmCluster")
                .serviceDetails(
                        "Database",
                        "UpdateAutonomousVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousVmCluster/UpdateAutonomousVmCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAutonomousVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousVmClusters")
                .appendPathParam(request.getAutonomousVmClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousVmCluster.class,
                        UpdateAutonomousVmClusterResponse.Builder::autonomousVmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAutonomousVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpdateAutonomousVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAutonomousVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBackupDestinationResponse> updateBackupDestination(
            UpdateBackupDestinationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBackupDestinationRequest, UpdateBackupDestinationResponse>
                    handler) {

        Validate.notBlank(
                request.getBackupDestinationId(), "backupDestinationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBackupDestinationDetails(),
                "updateBackupDestinationDetails is required");

        return clientCall(request, UpdateBackupDestinationResponse::builder)
                .logger(LOG, "updateBackupDestination")
                .serviceDetails(
                        "Database",
                        "UpdateBackupDestination",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/BackupDestination/UpdateBackupDestination")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBackupDestinationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backupDestinations")
                .appendPathParam(request.getBackupDestinationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.BackupDestination.class,
                        UpdateBackupDestinationResponse.Builder::backupDestination)
                .handleResponseHeaderString("etag", UpdateBackupDestinationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBackupDestinationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCloudAutonomousVmClusterResponse>
            updateCloudAutonomousVmCluster(
                    UpdateCloudAutonomousVmClusterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateCloudAutonomousVmClusterRequest,
                                    UpdateCloudAutonomousVmClusterResponse>
                            handler) {

        Validate.notBlank(
                request.getCloudAutonomousVmClusterId(),
                "cloudAutonomousVmClusterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCloudAutonomousVmClusterDetails(),
                "updateCloudAutonomousVmClusterDetails is required");

        return clientCall(request, UpdateCloudAutonomousVmClusterResponse::builder)
                .logger(LOG, "updateCloudAutonomousVmCluster")
                .serviceDetails(
                        "Database",
                        "UpdateCloudAutonomousVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudAutonomousVmCluster/UpdateCloudAutonomousVmCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCloudAutonomousVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudAutonomousVmClusters")
                .appendPathParam(request.getCloudAutonomousVmClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.CloudAutonomousVmCluster.class,
                        UpdateCloudAutonomousVmClusterResponse.Builder::cloudAutonomousVmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateCloudAutonomousVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateCloudAutonomousVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateCloudAutonomousVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCloudExadataInfrastructureResponse>
            updateCloudExadataInfrastructure(
                    UpdateCloudExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateCloudExadataInfrastructureRequest,
                                    UpdateCloudExadataInfrastructureResponse>
                            handler) {

        Validate.notBlank(
                request.getCloudExadataInfrastructureId(),
                "cloudExadataInfrastructureId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCloudExadataInfrastructureDetails(),
                "updateCloudExadataInfrastructureDetails is required");

        return clientCall(request, UpdateCloudExadataInfrastructureResponse::builder)
                .logger(LOG, "updateCloudExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "UpdateCloudExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudExadataInfrastructure/UpdateCloudExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCloudExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudExadataInfrastructures")
                .appendPathParam(request.getCloudExadataInfrastructureId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.CloudExadataInfrastructure.class,
                        UpdateCloudExadataInfrastructureResponse.Builder
                                ::cloudExadataInfrastructure)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateCloudExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateCloudExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateCloudExadataInfrastructureResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCloudVmClusterResponse> updateCloudVmCluster(
            UpdateCloudVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCloudVmClusterRequest, UpdateCloudVmClusterResponse>
                    handler) {

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCloudVmClusterDetails(),
                "updateCloudVmClusterDetails is required");

        return clientCall(request, UpdateCloudVmClusterResponse::builder)
                .logger(LOG, "updateCloudVmCluster")
                .serviceDetails(
                        "Database",
                        "UpdateCloudVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/UpdateCloudVmCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCloudVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.CloudVmCluster.class,
                        UpdateCloudVmClusterResponse.Builder::cloudVmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateCloudVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpdateCloudVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCloudVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCloudVmClusterIormConfigResponse>
            updateCloudVmClusterIormConfig(
                    UpdateCloudVmClusterIormConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateCloudVmClusterIormConfigRequest,
                                    UpdateCloudVmClusterIormConfigResponse>
                            handler) {

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");
        Objects.requireNonNull(
                request.getCloudVmClusterIormConfigUpdateDetails(),
                "cloudVmClusterIormConfigUpdateDetails is required");

        return clientCall(request, UpdateCloudVmClusterIormConfigResponse::builder)
                .logger(LOG, "updateCloudVmClusterIormConfig")
                .serviceDetails(
                        "Database",
                        "UpdateCloudVmClusterIormConfig",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/UpdateCloudVmClusterIormConfig")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCloudVmClusterIormConfigRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .appendPathParam("CloudVmClusterIormConfig")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExadataIormConfig.class,
                        UpdateCloudVmClusterIormConfigResponse.Builder::exadataIormConfig)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateCloudVmClusterIormConfigResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateCloudVmClusterIormConfigResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateCloudVmClusterIormConfigResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataGuardAssociationResponse>
            updateDataGuardAssociation(
                    UpdateDataGuardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDataGuardAssociationRequest,
                                    UpdateDataGuardAssociationResponse>
                            handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        Validate.notBlank(
                request.getDataGuardAssociationId(), "dataGuardAssociationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDataGuardAssociationDetails(),
                "updateDataGuardAssociationDetails is required");

        return clientCall(request, UpdateDataGuardAssociationResponse::builder)
                .logger(LOG, "updateDataGuardAssociation")
                .serviceDetails(
                        "Database",
                        "UpdateDataGuardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DataGuardAssociation/UpdateDataGuardAssociation")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDataGuardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("dataGuardAssociations")
                .appendPathParam(request.getDataGuardAssociationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DataGuardAssociation.class,
                        UpdateDataGuardAssociationResponse.Builder::dataGuardAssociation)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDataGuardAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateDataGuardAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDataGuardAssociationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseResponse> updateDatabase(
            UpdateDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDatabaseRequest, UpdateDatabaseResponse>
                    handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDatabaseDetails(), "updateDatabaseDetails is required");

        return clientCall(request, UpdateDatabaseResponse::builder)
                .logger(LOG, "updateDatabase")
                .serviceDetails(
                        "Database",
                        "UpdateDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/UpdateDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        UpdateDatabaseResponse.Builder::database)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpdateDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseSoftwareImageResponse>
            updateDatabaseSoftwareImage(
                    UpdateDatabaseSoftwareImageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseSoftwareImageRequest,
                                    UpdateDatabaseSoftwareImageResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseSoftwareImageId(), "databaseSoftwareImageId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDatabaseSoftwareImageDetails(),
                "updateDatabaseSoftwareImageDetails is required");

        return clientCall(request, UpdateDatabaseSoftwareImageResponse::builder)
                .logger(LOG, "updateDatabaseSoftwareImage")
                .serviceDetails(
                        "Database",
                        "UpdateDatabaseSoftwareImage",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DatabaseSoftwareImage/UpdateDatabaseSoftwareImage")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDatabaseSoftwareImageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databaseSoftwareImages")
                .appendPathParam(request.getDatabaseSoftwareImageId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DatabaseSoftwareImage.class,
                        UpdateDatabaseSoftwareImageResponse.Builder::databaseSoftwareImage)
                .handleResponseHeaderString(
                        "etag", UpdateDatabaseSoftwareImageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDatabaseSoftwareImageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDbHomeResponse> updateDbHome(
            UpdateDbHomeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateDbHomeRequest, UpdateDbHomeResponse>
                    handler) {

        Validate.notBlank(request.getDbHomeId(), "dbHomeId must not be blank");
        Objects.requireNonNull(request.getUpdateDbHomeDetails(), "updateDbHomeDetails is required");

        return clientCall(request, UpdateDbHomeResponse::builder)
                .logger(LOG, "updateDbHome")
                .serviceDetails(
                        "Database",
                        "UpdateDbHome",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbHome/UpdateDbHome")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDbHomeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbHomes")
                .appendPathParam(request.getDbHomeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DbHome.class,
                        UpdateDbHomeResponse.Builder::dbHome)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDbHomeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpdateDbHomeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDbHomeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDbSystemResponse> updateDbSystem(
            UpdateDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDbSystemRequest, UpdateDbSystemResponse>
                    handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDbSystemDetails(), "updateDbSystemDetails is required");

        return clientCall(request, UpdateDbSystemResponse::builder)
                .logger(LOG, "updateDbSystem")
                .serviceDetails(
                        "Database",
                        "UpdateDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/UpdateDbSystem")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDbSystemRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DbSystem.class,
                        UpdateDbSystemResponse.Builder::dbSystem)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDbSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpdateDbSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDbSystemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExadataInfrastructureResponse>
            updateExadataInfrastructure(
                    UpdateExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExadataInfrastructureRequest,
                                    UpdateExadataInfrastructureResponse>
                            handler) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExadataInfrastructureDetails(),
                "updateExadataInfrastructureDetails is required");

        return clientCall(request, UpdateExadataInfrastructureResponse::builder)
                .logger(LOG, "updateExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "UpdateExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/UpdateExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExadataInfrastructure.class,
                        UpdateExadataInfrastructureResponse.Builder::exadataInfrastructure)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateExadataInfrastructureResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExadataIormConfigResponse> updateExadataIormConfig(
            UpdateExadataIormConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExadataIormConfigRequest, UpdateExadataIormConfigResponse>
                    handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");
        Objects.requireNonNull(
                request.getExadataIormConfigUpdateDetails(),
                "exadataIormConfigUpdateDetails is required");

        return clientCall(request, UpdateExadataIormConfigResponse::builder)
                .logger(LOG, "updateExadataIormConfig")
                .serviceDetails(
                        "Database",
                        "UpdateExadataIormConfig",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/UpdateExadataIormConfig")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExadataIormConfigRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("ExadataIormConfig")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExadataIormConfig.class,
                        UpdateExadataIormConfigResponse.Builder::exadataIormConfig)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateExadataIormConfigResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateExadataIormConfigResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateExadataIormConfigResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalContainerDatabaseResponse>
            updateExternalContainerDatabase(
                    UpdateExternalContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalContainerDatabaseRequest,
                                    UpdateExternalContainerDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalContainerDatabaseDetails(),
                "updateExternalContainerDatabaseDetails is required");

        return clientCall(request, UpdateExternalContainerDatabaseResponse::builder)
                .logger(LOG, "updateExternalContainerDatabase")
                .serviceDetails(
                        "Database",
                        "UpdateExternalContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/UpdateExternalContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalContainerDatabase.class,
                        UpdateExternalContainerDatabaseResponse.Builder::externalContainerDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateExternalContainerDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateExternalContainerDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateExternalContainerDatabaseResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalDatabaseConnectorResponse>
            updateExternalDatabaseConnector(
                    UpdateExternalDatabaseConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalDatabaseConnectorRequest,
                                    UpdateExternalDatabaseConnectorResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalDatabaseConnectorId(),
                "externalDatabaseConnectorId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalDatabaseConnectorDetails(),
                "updateExternalDatabaseConnectorDetails is required");

        return clientCall(request, UpdateExternalDatabaseConnectorResponse::builder)
                .logger(LOG, "updateExternalDatabaseConnector")
                .serviceDetails(
                        "Database",
                        "UpdateExternalDatabaseConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalDatabaseConnector/UpdateExternalDatabaseConnector")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalDatabaseConnectorRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externaldatabaseconnectors")
                .appendPathParam(request.getExternalDatabaseConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalDatabaseConnector.class,
                        UpdateExternalDatabaseConnectorResponse.Builder::externalDatabaseConnector)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateExternalDatabaseConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateExternalDatabaseConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateExternalDatabaseConnectorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalNonContainerDatabaseResponse>
            updateExternalNonContainerDatabase(
                    UpdateExternalNonContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalNonContainerDatabaseRequest,
                                    UpdateExternalNonContainerDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalNonContainerDatabaseDetails(),
                "updateExternalNonContainerDatabaseDetails is required");

        return clientCall(request, UpdateExternalNonContainerDatabaseResponse::builder)
                .logger(LOG, "updateExternalNonContainerDatabase")
                .serviceDetails(
                        "Database",
                        "UpdateExternalNonContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/UpdateExternalNonContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalNonContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalNonContainerDatabase.class,
                        UpdateExternalNonContainerDatabaseResponse.Builder
                                ::externalNonContainerDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateExternalNonContainerDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateExternalNonContainerDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateExternalNonContainerDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalPluggableDatabaseResponse>
            updateExternalPluggableDatabase(
                    UpdateExternalPluggableDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalPluggableDatabaseRequest,
                                    UpdateExternalPluggableDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalPluggableDatabaseDetails(),
                "updateExternalPluggableDatabaseDetails is required");

        return clientCall(request, UpdateExternalPluggableDatabaseResponse::builder)
                .logger(LOG, "updateExternalPluggableDatabase")
                .serviceDetails(
                        "Database",
                        "UpdateExternalPluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/UpdateExternalPluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalPluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalPluggableDatabase.class,
                        UpdateExternalPluggableDatabaseResponse.Builder::externalPluggableDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateExternalPluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateExternalPluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateExternalPluggableDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateKeyStoreResponse> updateKeyStore(
            UpdateKeyStoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateKeyStoreRequest, UpdateKeyStoreResponse>
                    handler) {

        Validate.notBlank(request.getKeyStoreId(), "keyStoreId must not be blank");
        Objects.requireNonNull(
                request.getUpdateKeyStoreDetails(), "updateKeyStoreDetails is required");

        return clientCall(request, UpdateKeyStoreResponse::builder)
                .logger(LOG, "updateKeyStore")
                .serviceDetails(
                        "Database",
                        "UpdateKeyStore",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/KeyStore/UpdateKeyStore")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateKeyStoreRequest::builder)
                .basePath("/20160918")
                .appendPathParam("keyStores")
                .appendPathParam(request.getKeyStoreId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.KeyStore.class,
                        UpdateKeyStoreResponse.Builder::keyStore)
                .handleResponseHeaderString("etag", UpdateKeyStoreResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateKeyStoreResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateMaintenanceRunResponse> updateMaintenanceRun(
            UpdateMaintenanceRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMaintenanceRunRequest, UpdateMaintenanceRunResponse>
                    handler) {

        Validate.notBlank(request.getMaintenanceRunId(), "maintenanceRunId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMaintenanceRunDetails(),
                "updateMaintenanceRunDetails is required");

        return clientCall(request, UpdateMaintenanceRunResponse::builder)
                .logger(LOG, "updateMaintenanceRun")
                .serviceDetails(
                        "Database",
                        "UpdateMaintenanceRun",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/MaintenanceRun/UpdateMaintenanceRun")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMaintenanceRunRequest::builder)
                .basePath("/20160918")
                .appendPathParam("maintenanceRuns")
                .appendPathParam(request.getMaintenanceRunId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.MaintenanceRun.class,
                        UpdateMaintenanceRunResponse.Builder::maintenanceRun)
                .handleResponseHeaderString("etag", UpdateMaintenanceRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMaintenanceRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePluggableDatabaseResponse> updatePluggableDatabase(
            UpdatePluggableDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePluggableDatabaseRequest, UpdatePluggableDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePluggableDatabaseDetails(),
                "updatePluggableDatabaseDetails is required");

        return clientCall(request, UpdatePluggableDatabaseResponse::builder)
                .logger(LOG, "updatePluggableDatabase")
                .serviceDetails(
                        "Database",
                        "UpdatePluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/UpdatePluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        UpdatePluggableDatabaseResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdatePluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpdatePluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePluggableDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateVmClusterResponse> updateVmCluster(
            UpdateVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVmClusterRequest, UpdateVmClusterResponse>
                    handler) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateVmClusterDetails(), "updateVmClusterDetails is required");

        return clientCall(request, UpdateVmClusterResponse::builder)
                .logger(LOG, "updateVmCluster")
                .serviceDetails(
                        "Database",
                        "UpdateVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmCluster/UpdateVmCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.VmCluster.class,
                        UpdateVmClusterResponse.Builder::vmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpdateVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateVmClusterNetworkResponse> updateVmClusterNetwork(
            UpdateVmClusterNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVmClusterNetworkRequest, UpdateVmClusterNetworkResponse>
                    handler) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        Validate.notBlank(request.getVmClusterNetworkId(), "vmClusterNetworkId must not be blank");
        Objects.requireNonNull(
                request.getUpdateVmClusterNetworkDetails(),
                "updateVmClusterNetworkDetails is required");

        return clientCall(request, UpdateVmClusterNetworkResponse::builder)
                .logger(LOG, "updateVmClusterNetwork")
                .serviceDetails(
                        "Database",
                        "UpdateVmClusterNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterNetwork/UpdateVmClusterNetwork")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVmClusterNetworkRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .appendPathParam(request.getVmClusterNetworkId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.VmClusterNetwork.class,
                        UpdateVmClusterNetworkResponse.Builder::vmClusterNetwork)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateVmClusterNetworkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpdateVmClusterNetworkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVmClusterNetworkResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpgradeDatabaseResponse> upgradeDatabase(
            UpgradeDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpgradeDatabaseRequest, UpgradeDatabaseResponse>
                    handler) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(
                request.getUpgradeDatabaseDetails(), "upgradeDatabaseDetails is required");

        return clientCall(request, UpgradeDatabaseResponse::builder)
                .logger(LOG, "upgradeDatabase")
                .serviceDetails(
                        "Database",
                        "UpgradeDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/UpgradeDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpgradeDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("upgrade")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        UpgradeDatabaseResponse.Builder::database)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpgradeDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpgradeDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpgradeDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpgradeDbSystemResponse> upgradeDbSystem(
            UpgradeDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpgradeDbSystemRequest, UpgradeDbSystemResponse>
                    handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");
        Objects.requireNonNull(
                request.getUpgradeDbSystemDetails(), "upgradeDbSystemDetails is required");

        return clientCall(request, UpgradeDbSystemResponse::builder)
                .logger(LOG, "upgradeDbSystem")
                .serviceDetails(
                        "Database",
                        "UpgradeDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/UpgradeDbSystem")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpgradeDbSystemRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("actions")
                .appendPathParam("upgrade")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DbSystem.class,
                        UpgradeDbSystemResponse.Builder::dbSystem)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpgradeDbSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpgradeDbSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpgradeDbSystemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateVmClusterNetworkResponse> validateVmClusterNetwork(
            ValidateVmClusterNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ValidateVmClusterNetworkRequest, ValidateVmClusterNetworkResponse>
                    handler) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        Validate.notBlank(request.getVmClusterNetworkId(), "vmClusterNetworkId must not be blank");

        return clientCall(request, ValidateVmClusterNetworkResponse::builder)
                .logger(LOG, "validateVmClusterNetwork")
                .serviceDetails(
                        "Database",
                        "ValidateVmClusterNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterNetwork/ValidateVmClusterNetwork")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateVmClusterNetworkRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .appendPathParam(request.getVmClusterNetworkId())
                .appendPathParam("actions")
                .appendPathParam("validate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.database.model.VmClusterNetwork.class,
                        ValidateVmClusterNetworkResponse.Builder::vmClusterNetwork)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ValidateVmClusterNetworkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", ValidateVmClusterNetworkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ValidateVmClusterNetworkResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DatabaseAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DatabaseAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DatabaseAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DatabaseAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DatabaseAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DatabaseAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DatabaseAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider);
    }
}
