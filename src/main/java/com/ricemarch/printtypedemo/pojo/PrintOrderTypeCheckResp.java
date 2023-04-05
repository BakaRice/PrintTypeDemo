package com.ricemarch.printtypedemo.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * 单据打印类型Resp
 */
@Getter
@Setter
public class PrintOrderTypeCheckResp implements Serializable {

    public static final long serialVersion = -1L;

    private String serviceOrderId;

    private List<PrintOrderType> printOrderTypes;
}
