/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.internal.http;

import com.oracle.bmc.datalabelingservicedataplane.model.*;
import com.oracle.bmc.datalabelingservicedataplane.requests.*;
import com.oracle.bmc.datalabelingservicedataplane.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
public class GetRecordContentConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GetRecordContentConverter.class);

    public static com.oracle.bmc.datalabelingservicedataplane.requests.GetRecordContentRequest
            interceptRequest(
                    com.oracle.bmc.datalabelingservicedataplane.requests.GetRecordContentRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.datalabelingservicedataplane.requests.GetRecordContentRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getRecordId(), "recordId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20211001")
                        .path("records")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getRecordId()))
                        .path("content");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept("application/octet-stream");

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (request.getIfNoneMatch() != null) {
            ib.header("if-none-match", request.getIfNoneMatch());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.datalabelingservicedataplane.responses.GetRecordContentResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.datalabelingservicedataplane.responses.GetRecordContentResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.datalabelingservicedataplane.responses
                                .GetRecordContentResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.datalabelingservicedataplane.responses
                                        .GetRecordContentResponse>() {
                            @Override
                            public com.oracle.bmc.datalabelingservicedataplane.responses
                                            .GetRecordContentResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.datalabelingservicedataplane.responses.GetRecordContentResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        java.io.InputStream>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    java.io.InputStream.class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    java.io.InputStream.class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<java.io.InputStream>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.datalabelingservicedataplane.responses
                                                .GetRecordContentResponse.Builder
                                        builder =
                                                com.oracle.bmc.datalabelingservicedataplane
                                                        .responses.GetRecordContentResponse
                                                        .builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                if (response.getStatusCode() != 304) {
                                    builder.inputStream(response.getItem());
                                    builder.isNotModified(false);
                                } else {
                                    builder.isNotModified(true);
                                }

                                java.util.Optional<java.util.List<String>> etagHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "etag");
                                if (etagHeader.isPresent()) {
                                    builder.etag(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "etag", etagHeader.get().get(0), String.class));
                                }

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

                                java.util.Optional<java.util.List<String>> contentLengthHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "content-length");
                                if (contentLengthHeader.isPresent()) {
                                    builder.contentLength(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "content-length",
                                                    contentLengthHeader.get().get(0),
                                                    Long.class));
                                }

                                java.util.Optional<java.util.List<String>>
                                        contentDispositionHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils
                                                        .getHeadersWithName(
                                                                headers, "content-disposition");
                                if (contentDispositionHeader.isPresent()) {
                                    builder.contentDisposition(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "content-disposition",
                                                    contentDispositionHeader.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>> contentTypeHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "content-type");
                                if (contentTypeHeader.isPresent()) {
                                    builder.contentType(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "content-type",
                                                    contentTypeHeader.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>> cacheControlHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "cache-control");
                                if (cacheControlHeader.isPresent()) {
                                    builder.cacheControl(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "cache-control",
                                                    cacheControlHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.datalabelingservicedataplane.responses
                                                .GetRecordContentResponse
                                        responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}