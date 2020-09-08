/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.responses;

import com.oracle.bmc.logging.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListUnifiedAgentConfigurationsResponse {

    /**
     * For list pagination. When this header appears in the response, additional pages
     * of results remain. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * For list pagination. When this header appears in the response, previous pages
     * of results exist. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcPreviousPage;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned UnifiedAgentConfigurationCollection instance.
     */
    private UnifiedAgentConfigurationCollection unifiedAgentConfigurationCollection;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListUnifiedAgentConfigurationsResponse o) {
            opcNextPage(o.getOpcNextPage());
            opcPreviousPage(o.getOpcPreviousPage());
            opcRequestId(o.getOpcRequestId());
            unifiedAgentConfigurationCollection(o.getUnifiedAgentConfigurationCollection());

            return this;
        }
    }
}
