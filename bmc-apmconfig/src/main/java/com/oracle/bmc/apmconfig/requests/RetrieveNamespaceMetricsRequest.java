/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.requests;

import com.oracle.bmc.apmconfig.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmconfig/RetrieveNamespaceMetricsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use RetrieveNamespaceMetricsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class RetrieveNamespaceMetricsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.apmconfig.model.RetrieveNamespaceMetricsDetails> {

    /**
     * The APM Domain ID the request is intended for.
     *
     */
    private String apmDomainId;

    /**
     * The APM Domain ID the request is intended for.
     *
     */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /**
     * The namespace to get the metrics for.
     */
    private com.oracle.bmc.apmconfig.model.RetrieveNamespaceMetricsDetails
            retrieveNamespaceMetricsDetails;

    /**
     * The namespace to get the metrics for.
     */
    public com.oracle.bmc.apmconfig.model.RetrieveNamespaceMetricsDetails
            getRetrieveNamespaceMetricsDetails() {
        return retrieveNamespaceMetricsDetails;
    }
    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.apmconfig.model.RetrieveNamespaceMetricsDetails getBody$() {
        return retrieveNamespaceMetricsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RetrieveNamespaceMetricsRequest,
                    com.oracle.bmc.apmconfig.model.RetrieveNamespaceMetricsDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The APM Domain ID the request is intended for.
         *
         */
        private String apmDomainId = null;

        /**
         * The APM Domain ID the request is intended for.
         *
         * @param apmDomainId the value to set
         * @return this builder instance
         */
        public Builder apmDomainId(String apmDomainId) {
            this.apmDomainId = apmDomainId;
            return this;
        }

        /**
         * The namespace to get the metrics for.
         */
        private com.oracle.bmc.apmconfig.model.RetrieveNamespaceMetricsDetails
                retrieveNamespaceMetricsDetails = null;

        /**
         * The namespace to get the metrics for.
         * @param retrieveNamespaceMetricsDetails the value to set
         * @return this builder instance
         */
        public Builder retrieveNamespaceMetricsDetails(
                com.oracle.bmc.apmconfig.model.RetrieveNamespaceMetricsDetails
                        retrieveNamespaceMetricsDetails) {
            this.retrieveNamespaceMetricsDetails = retrieveNamespaceMetricsDetails;
            return this;
        }

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(RetrieveNamespaceMetricsRequest o) {
            apmDomainId(o.getApmDomainId());
            retrieveNamespaceMetricsDetails(o.getRetrieveNamespaceMetricsDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RetrieveNamespaceMetricsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of RetrieveNamespaceMetricsRequest
         */
        public RetrieveNamespaceMetricsRequest build() {
            RetrieveNamespaceMetricsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.apmconfig.model.RetrieveNamespaceMetricsDetails body) {
            retrieveNamespaceMetricsDetails(body);
            return this;
        }

        /**
         * Build the instance of RetrieveNamespaceMetricsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RetrieveNamespaceMetricsRequest
         */
        public RetrieveNamespaceMetricsRequest buildWithoutInvocationCallback() {
            RetrieveNamespaceMetricsRequest request = new RetrieveNamespaceMetricsRequest();
            request.apmDomainId = apmDomainId;
            request.retrieveNamespaceMetricsDetails = retrieveNamespaceMetricsDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new RetrieveNamespaceMetricsRequest(apmDomainId, retrieveNamespaceMetricsDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .apmDomainId(apmDomainId)
                .retrieveNamespaceMetricsDetails(retrieveNamespaceMetricsDetails)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",retrieveNamespaceMetricsDetails=")
                .append(String.valueOf(this.retrieveNamespaceMetricsDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RetrieveNamespaceMetricsRequest)) {
            return false;
        }

        RetrieveNamespaceMetricsRequest other = (RetrieveNamespaceMetricsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(
                        this.retrieveNamespaceMetricsDetails, other.retrieveNamespaceMetricsDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.retrieveNamespaceMetricsDetails == null
                                ? 43
                                : this.retrieveNamespaceMetricsDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}