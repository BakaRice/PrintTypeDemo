package com.ricemarch.printtypedemo.service;

import com.ricemarch.printtypedemo.pojo.PrintOrderTypeCheckResp;
import com.ricemarch.printtypedemo.pojo.StoreSimpleDTO;
import com.sun.istack.internal.NotNull;

/**
 * @author tanwentao
 * @since 2023/04/05
 */
public interface IPrintServiceType {

    PrintOrderTypeCheckResp listAllPattern(@NotNull StoreSimpleDTO storeInfo);

    PrintOrderTypeCheckResp listPrintOrderType(String serviceOrderId, @NotNull StoreSimpleDTO storeInfo);
}
