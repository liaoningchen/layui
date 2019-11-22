package com.cdy.layui.bean;

import lombok.Data;

@Data
public class LayUiRequest {

    int page;

    int limit;

    String field;

    String order;
}
