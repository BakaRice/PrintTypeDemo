package com.ricemarch.printtypedemo.service.hanlder;

import com.ricemarch.printtypedemo.pojo.PrintOrderType;
import com.ricemarch.printtypedemo.pojo.ServiceOrder;

import java.util.List;

public abstract class AbstractTypeHandler {
    public abstract void processHandler(ServiceOrder serviceOrder, List<PrintOrderType> orderTypes);

    public abstract int type();
}
