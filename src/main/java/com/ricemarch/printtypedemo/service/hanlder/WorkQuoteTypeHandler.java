package com.ricemarch.printtypedemo.service.hanlder;

import com.ricemarch.printtypedemo.pojo.PrintOrderType;
import com.ricemarch.printtypedemo.pojo.ServiceOrder;

import java.util.List;

/**
 * 工单报价单
 */
public class WorkQuoteTypeHandler extends AbstractTypeHandler {
    @Override
    public void processHandler(ServiceOrder serviceOrder, List<PrintOrderType> orderTypes) {

    }

    @Override
    public int type() {
        return 1;
    }
}
