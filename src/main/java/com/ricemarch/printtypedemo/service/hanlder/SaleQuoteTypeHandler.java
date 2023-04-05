package com.ricemarch.printtypedemo.service.hanlder;

import com.ricemarch.printtypedemo.pojo.PrintOrderType;
import com.ricemarch.printtypedemo.pojo.ServiceOrder;

import java.util.List;

public class SaleQuoteTypeHandler extends AbstractTypeHandler {
    @Override
    public void processHandler(ServiceOrder serviceOrder, List<PrintOrderType> orderTypes) {

    }

    @Override
    public int type() {
        return 3;
    }
}
