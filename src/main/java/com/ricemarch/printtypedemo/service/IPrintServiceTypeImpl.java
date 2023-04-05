package com.ricemarch.printtypedemo.service;

import com.ricemarch.printtypedemo.pojo.PrintOrderType;
import com.ricemarch.printtypedemo.pojo.PrintOrderTypeCheckResp;
import com.ricemarch.printtypedemo.pojo.StoreSimpleDTO;
import com.ricemarch.printtypedemo.repository.PrintOrderTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPrintServiceTypeImpl implements IPrintServiceType {

    @Autowired
    private PrintOrderTypeRepository repository;

    @Override
    public PrintOrderTypeCheckResp listAllPattern(StoreSimpleDTO storeInfo) {
        List<PrintOrderType> printOrderTypes = repository.listAllPrintType();


        return null;
    }

    @Override
    public PrintOrderTypeCheckResp listPrintOrderType(String serviceOrderId, StoreSimpleDTO storeInfo) {
        return null;
    }
}
