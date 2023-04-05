package com.ricemarch.printtypedemo.pojo;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class StoreSimpleDTO {
    private final Long storeId;
    private final Long tenantId;
    private final Long tenantIdNew;

    public StoreSimpleDTO(Long storeId, Long tenantId, Long tenantIdNew) {
        this.storeId = storeId;
        this.tenantId = tenantId;
        this.tenantIdNew = tenantIdNew;
    }
}
