package com.websocker.study;


import lombok.Data;

import java.io.Serializable;

@Data
public class MsgResult implements Serializable {


    private String fromUserId;
    private String toUserId;
    //内容
    private String msg;

    /**
     * 状态  0群发 1单发
     */
    private Integer status;


    //{"fromUserId":"1","toUserId":"2","msg":"我是来自1号用户","status":1}
    //{"fromUserId":"2","toUserId":"1","msg":"我是来自2号用户","status":1}
    //{"fromUserId":"2","toUserId":"1","msg":"群发","status":0}
}
