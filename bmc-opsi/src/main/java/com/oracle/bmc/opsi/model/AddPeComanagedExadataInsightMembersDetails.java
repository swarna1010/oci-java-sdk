/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The information about the members of Exadata system to be added. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AddPeComanagedExadataInsightMembersDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entitySource")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AddPeComanagedExadataInsightMembersDetails
        extends AddExadataInsightMembersDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("memberEntityDetails")
        private java.util.List<CreatePeComanagedExadataVmclusterDetails> memberEntityDetails;

        public Builder memberEntityDetails(
                java.util.List<CreatePeComanagedExadataVmclusterDetails> memberEntityDetails) {
            this.memberEntityDetails = memberEntityDetails;
            this.__explicitlySet__.add("memberEntityDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddPeComanagedExadataInsightMembersDetails build() {
            AddPeComanagedExadataInsightMembersDetails model =
                    new AddPeComanagedExadataInsightMembersDetails(this.memberEntityDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddPeComanagedExadataInsightMembersDetails model) {
            if (model.wasPropertyExplicitlySet("memberEntityDetails")) {
                this.memberEntityDetails(model.getMemberEntityDetails());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public AddPeComanagedExadataInsightMembersDetails(
            java.util.List<CreatePeComanagedExadataVmclusterDetails> memberEntityDetails) {
        super();
        this.memberEntityDetails = memberEntityDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("memberEntityDetails")
    private final java.util.List<CreatePeComanagedExadataVmclusterDetails> memberEntityDetails;

    public java.util.List<CreatePeComanagedExadataVmclusterDetails> getMemberEntityDetails() {
        return memberEntityDetails;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AddPeComanagedExadataInsightMembersDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", memberEntityDetails=").append(String.valueOf(this.memberEntityDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddPeComanagedExadataInsightMembersDetails)) {
            return false;
        }

        AddPeComanagedExadataInsightMembersDetails other =
                (AddPeComanagedExadataInsightMembersDetails) o;
        return java.util.Objects.equals(this.memberEntityDetails, other.memberEntityDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.memberEntityDetails == null
                                ? 43
                                : this.memberEntityDetails.hashCode());
        return result;
    }
}