/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.loganalytics.model.*;
import com.oracle.bmc.loganalytics.requests.*;
import com.oracle.bmc.loganalytics.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class UploadLogEventsFileConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(UploadLogEventsFileConverter.class);

    public static com.oracle.bmc.loganalytics.requests.UploadLogEventsFileRequest interceptRequest(
            com.oracle.bmc.loganalytics.requests.UploadLogEventsFileRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.loganalytics.requests.UploadLogEventsFileRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Validate.notNull(request.getLogGroupId(), "logGroupId is required");
        Validate.notNull(
                request.getUploadLogEventsFileDetails(), "uploadLogEventsFileDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20200601")
                        .path("namespaces")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getNamespaceName()))
                        .path("actions")
                        .path("uploadLogEventsFile");

        target =
                target.queryParam(
                        "logGroupId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getLogGroupId()));

        if (request.getLogSet() != null) {
            target =
                    target.queryParam(
                            "logSet",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLogSet()));
        }

        if (request.getPayloadType() != null) {
            target =
                    target.queryParam(
                            "payloadType",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getPayloadType().getValue()));
        }

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (request.getContentType() != null) {
            ib.header("content-type", request.getContentType());
        }

        if (request.getOpcRetryToken() != null) {
            ib.header("opc-retry-token", request.getOpcRetryToken());
        }

        if (request.getExpect() != null) {
            ib.header("expect", request.getExpect());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.loganalytics.responses.UploadLogEventsFileResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.loganalytics.responses.UploadLogEventsFileResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.loganalytics.responses.UploadLogEventsFileResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.loganalytics.responses
                                        .UploadLogEventsFileResponse>() {
                            @Override
                            public com.oracle.bmc.loganalytics.responses.UploadLogEventsFileResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.loganalytics.responses.UploadLogEventsFileResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<Void>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    serviceDetails.get());
                                } else {
                                    responseFn = RESPONSE_CONVERSION_FACTORY.create();
                                }

                                com.oracle.bmc.http.internal.WithHeaders<Void> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.loganalytics.responses.UploadLogEventsFileResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.loganalytics.responses
                                                        .UploadLogEventsFileResponse.builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                java.util.Optional<java.util.List<String>> opcRequestIdHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>> opcObjectIdHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-object-id");
                                if (opcObjectIdHeader.isPresent()) {
                                    builder.opcObjectId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-object-id",
                                                    opcObjectIdHeader.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>> timeCreatedHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "timeCreated");
                                if (timeCreatedHeader.isPresent()) {
                                    builder.timeCreated(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "timeCreated",
                                                    timeCreatedHeader.get().get(0),
                                                    java.util.Date.class));
                                }

                                com.oracle.bmc.loganalytics.responses.UploadLogEventsFileResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}