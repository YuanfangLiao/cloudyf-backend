package com.liaoyuanfang.cloudyf.common.controller;

import com.liaoyuanfang.cloudyf.common.msg.RestResponse;
import com.liaoyuanfang.cloudyf.common.msg.ResultObject;

import java.util.List;

/**
 * @Auther: gople
 * @Date: 2021/1/24 17:35
 * @Description: 基础Controller
 */
public class BaseController {

    public RestResponse<Object> success() {
        return new RestResponse<>(new ResultObject<Object>());
    }

    public RestResponse<?> success(ResultObject<?> resultObject) {
        return new RestResponse<>(resultObject);
    }

    public RestResponse<?> failed(ResultObject<?> resultObject, Long errorCode) {
        return new RestResponse<>(resultObject, errorCode);
    }

    public RestResponse<?> failed(ResultObject<?> resultObject, Long errorCode, String msg) {
        return new RestResponse<>(resultObject, errorCode, msg);
    }

    public RestResponse<?> failed(ResultObject<?> resultObject, Long errorCode, List<String> msgs) {
        return new RestResponse<>(resultObject, errorCode, msgs);
    }

}
