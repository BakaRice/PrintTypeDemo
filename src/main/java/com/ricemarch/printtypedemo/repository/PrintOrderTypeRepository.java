package com.ricemarch.printtypedemo.repository;

import com.ricemarch.printtypedemo.pojo.PrintOrderType;
import com.ricemarch.printtypedemo.utils.StreamUtil;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class PrintOrderTypeRepository {

    private Map<String, List<PrintOrderType>> orderTypePrintTypesMp = new HashMap<>();

    public List<PrintOrderType> listAllPrintType() {
        return StreamUtil.toStream(orderTypePrintTypesMp.values())
                .flatMap(Collection::stream)
                .map(i -> new PrintOrderType(i.getPrintTypeCode(), i.getOrderTypeCode(), i.getFrontedDesc(), i.getPrintDesc(), i.getSort()))
                .sorted(Comparator.comparing(PrintOrderType::getSort, Integer::compareTo))
                .collect(Collectors.toList());
    }
}
