package com.nemo.mqtt.study;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

import java.io.Serializable;

/**
 * 传输数据
 * https://blog.csdn.net/wodeai1235/article/details/77839152
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransData implements Serializable {

    /**
     * 设备名称
     */
    private String deviceName;
    /**
     * 设备码
     */
    private String deviceCode;

    /**
     * 设备唯一密钥
     */
    private String deviceSecret;

    /**
     * 生产商
     */
    private String manufacturer;

    /**
     * 生产批次
     */
    private String  productionBatch;

    /**
     * 生产设备密码
     */
    private String  productionPassword;






}
