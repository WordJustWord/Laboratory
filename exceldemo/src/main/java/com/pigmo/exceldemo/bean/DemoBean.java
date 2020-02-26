package com.pigmo.exceldemo.bean;

import com.pigmo.exceldemo.annotation.ExcelElement;
import lombok.Data;

@Data
public class DemoBean {
    @ExcelElement("名称")
    private String name;
    @ExcelElement("编码")
    private String code;
    @ExcelElement("类型")
    private String type;
    @ExcelElement("客户端")
    private String client;
}
