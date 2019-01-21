package com.nemo.mqtt.study;


import lombok.Data;

import java.io.Serializable;

@Data
public class JsonData implements Serializable {

    private Integer code;


    private Object  data;

    private String msg;


    public static  JsonData success(Object o){
        JsonData tJsonData = new JsonData();
        tJsonData.setData(o);
        tJsonData.setCode(200);
        tJsonData.setMsg("success");
        return tJsonData;
    }

}
