/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class UploadLogFileResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The base-64 encoded MD5 hash of the request body as computed by the server.
     */
    private String opcContentMd5;

    /**
     * Unique Oracle-assigned identifier for log data.
     */
    private String opcObjectId;

    /**
     * The returned Upload instance.
     */
    private Upload upload;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UploadLogFileResponse o) {
            opcRequestId(o.getOpcRequestId());
            opcContentMd5(o.getOpcContentMd5());
            opcObjectId(o.getOpcObjectId());
            upload(o.getUpload());

            return this;
        }
    }
}
