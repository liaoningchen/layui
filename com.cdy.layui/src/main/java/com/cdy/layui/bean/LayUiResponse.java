package com.cdy.layui.bean;

import lombok.Data;

@Data
public class LayUiResponse {

    private int code;
    private String msg;
    private long count;
    private Object data;


}
