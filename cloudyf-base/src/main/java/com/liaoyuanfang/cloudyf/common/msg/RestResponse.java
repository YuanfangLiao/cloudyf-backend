package com.liaoyuanfang.cloudyf.common.msg;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: gople
 * @Date: 2021/1/24 18:02
 * @Description:
 */
@Data
public class RestResponse<T> extends BaseResponse {

    private ResultObject<T> resultObject = new ResultObject<>();

    public RestResponse(ResultObject<T> resultObject) {
        super(200, resultObject.getErrorMsgs());
        if (resultObject.isFailed()) {
            super.setStatusCode(500);
        }
    }

    public RestResponse(ResultObject<T> resultObject, Long errorCode) {
        super(200, resultObject.getErrorMsgs());
        if (resultObject.isFailed()) {
            setStatusCode(500);
        }
        super.setErrorCode(errorCode);
    }

    public RestResponse(ResultObject<T> resultObject, Long errorCode, String msg) {
        super(200, resultObject.getErrorMsgs());
        if (resultObject.isFailed()) {
            setStatusCode(500);
        }
        super.setErrorCode(errorCode);
        List<String> msgList = new ArrayList<>();
        msgList.add(msg);
        super.setMessages(msgList);
    }

    public RestResponse(ResultObject<T> resultObject, Long errorCode, List<String> msgs) {
        super(200, resultObject.getErrorMsgs());
        if (resultObject.isFailed()) {
            setStatusCode(500);
        }
        super.setErrorCode(errorCode);
        super.setMessages(msgs);
    }

}
