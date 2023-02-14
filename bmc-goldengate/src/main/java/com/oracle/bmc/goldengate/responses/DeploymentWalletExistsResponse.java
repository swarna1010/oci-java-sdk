/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.responses;

import com.oracle.bmc.goldengate.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class DeploymentWalletExistsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please include the request ID.
     *
     */
    private String opcRequestId;

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please include the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * The returned DeploymentWalletExistsResponseDetails instance.
     */
    private com.oracle.bmc.goldengate.model.DeploymentWalletExistsResponseDetails
            deploymentWalletExistsResponseDetails;

    /**
     * The returned DeploymentWalletExistsResponseDetails instance.
     * @return the value
     */
    public com.oracle.bmc.goldengate.model.DeploymentWalletExistsResponseDetails
            getDeploymentWalletExistsResponseDetails() {
        return deploymentWalletExistsResponseDetails;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "deploymentWalletExistsResponseDetails"
    })
    private DeploymentWalletExistsResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.goldengate.model.DeploymentWalletExistsResponseDetails
                    deploymentWalletExistsResponseDetails) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.deploymentWalletExistsResponseDetails = deploymentWalletExistsResponseDetails;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private javax.ws.rs.core.MultivaluedMap<String, String> headers;

        public Builder headers(javax.ws.rs.core.MultivaluedMap<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please include the request ID.
         *
         */
        private String opcRequestId;

        /**
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please include the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * The returned DeploymentWalletExistsResponseDetails instance.
         */
        private com.oracle.bmc.goldengate.model.DeploymentWalletExistsResponseDetails
                deploymentWalletExistsResponseDetails;

        /**
         * The returned DeploymentWalletExistsResponseDetails instance.
         * @param deploymentWalletExistsResponseDetails the value to set
         * @return this builder
         */
        public Builder deploymentWalletExistsResponseDetails(
                com.oracle.bmc.goldengate.model.DeploymentWalletExistsResponseDetails
                        deploymentWalletExistsResponseDetails) {
            this.deploymentWalletExistsResponseDetails = deploymentWalletExistsResponseDetails;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(DeploymentWalletExistsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            deploymentWalletExistsResponseDetails(o.getDeploymentWalletExistsResponseDetails());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public DeploymentWalletExistsResponse build() {
            return new DeploymentWalletExistsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    etag,
                    deploymentWalletExistsResponseDetails);
        }
    }

    /**
     * Return a new builder for this response object.
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",deploymentWalletExistsResponseDetails=")
                .append(String.valueOf(deploymentWalletExistsResponseDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentWalletExistsResponse)) {
            return false;
        }

        DeploymentWalletExistsResponse other = (DeploymentWalletExistsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(
                        this.deploymentWalletExistsResponseDetails,
                        other.deploymentWalletExistsResponseDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentWalletExistsResponseDetails == null
                                ? 43
                                : this.deploymentWalletExistsResponseDetails.hashCode());
        return result;
    }
}