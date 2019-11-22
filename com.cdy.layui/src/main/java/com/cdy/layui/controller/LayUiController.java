package com.cdy.layui.controller;

import com.cdy.layui.bean.Device;
import com.cdy.layui.bean.LayUiRequest;
import com.cdy.layui.bean.LayUiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LayUiController {

    @PostMapping("/get/list")
    public LayUiResponse getList(LayUiRequest layUiRequest) {
        LayUiResponse layUiResponse = new LayUiResponse();
        layUiResponse.setCode(0);
        layUiResponse.setCount(100);
        int startPage = layUiRequest.getPage()*layUiRequest.getLimit();
        int endPage = startPage+layUiRequest.getLimit();
        List<Device> deviceList = new ArrayList<>();
        for (int i=startPage;i<startPage+endPage;i++){
            Device device = new Device();
            device.setDeviceName("name"+i);
            device.setDeviceNumber("number"+i);
            device.setDeviceType("type"+i);
            deviceList.add(device);
        }
        layUiResponse.setData(deviceList);
        return layUiResponse;
    }
}
