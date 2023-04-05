package com.ricemarch.printtypedemo.service.hanlder;

import com.ricemarch.printtypedemo.pojo.PrintOrderType;
import com.ricemarch.printtypedemo.pojo.ServiceOrder;
import com.ricemarch.printtypedemo.service.hanlder.AbstractTypeHandler;

import java.util.List;

public class JiangsuStatementTypeHandler extends AbstractTypeHandler {


    @Override
    public void processHandler(ServiceOrder serviceOrder, List<PrintOrderType> orderTypes) {

//        orderTypes.add()
    }

    @Override
    public int type() {
        return 5;
    }
}
