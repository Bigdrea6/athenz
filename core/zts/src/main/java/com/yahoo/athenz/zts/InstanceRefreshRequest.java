//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zts;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.yahoo.rdl.*;

//
// InstanceRefreshRequest - InstanceRefreshRequest - a certificate refresh
// request
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstanceRefreshRequest {
    public String csr;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer expiryTime;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String keyId;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String namespace;

    public InstanceRefreshRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return csr;
    }
    public InstanceRefreshRequest setExpiryTime(Integer expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }
    public Integer getExpiryTime() {
        return expiryTime;
    }
    public InstanceRefreshRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return keyId;
    }
    public InstanceRefreshRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return namespace;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != InstanceRefreshRequest.class) {
                return false;
            }
            InstanceRefreshRequest a = (InstanceRefreshRequest) another;
            if (csr == null ? a.csr != null : !csr.equals(a.csr)) {
                return false;
            }
            if (expiryTime == null ? a.expiryTime != null : !expiryTime.equals(a.expiryTime)) {
                return false;
            }
            if (keyId == null ? a.keyId != null : !keyId.equals(a.keyId)) {
                return false;
            }
            if (namespace == null ? a.namespace != null : !namespace.equals(a.namespace)) {
                return false;
            }
        }
        return true;
    }
}
