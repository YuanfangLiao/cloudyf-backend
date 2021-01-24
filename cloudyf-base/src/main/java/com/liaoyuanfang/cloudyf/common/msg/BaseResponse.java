package com.liaoyuanfang.cloudyf.common.msg;

import lombok.Data;

import java.util.List;

/**
 * @Auther: gople
 * @Date: 2021/1/24 18:01
 * @Description:
 */
@Data
public class BaseResponse {

    private Integer statusCode = 200;
    private List<String> messages;
    private Long errorCode;

    public BaseResponse(int status, List<String> messages) {
        this.statusCode = status;
        this.messages = messages;
    }

    public BaseResponse() {
    }

}