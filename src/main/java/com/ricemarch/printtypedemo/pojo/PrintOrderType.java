package com.ricemarch.printtypedemo.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 单据类型
 */
@Getter
@Setter
@ToString
public class PrintOrderType {
    private int printTypeCode;
    private String orderTypeCode;
    private String frontedDesc;
    private String printDesc;
    private int sort;

    public PrintOrderType(int printTypeCode, String orderTypeCode, String frontedDesc, String printDesc, int sort) {
        this.printTypeCode = printTypeCode;
        this.orderTypeCode = orderTypeCode;
        this.frontedDesc = frontedDesc;
        this.printDesc = printDesc;
        this.sort = sort;
    }
}
