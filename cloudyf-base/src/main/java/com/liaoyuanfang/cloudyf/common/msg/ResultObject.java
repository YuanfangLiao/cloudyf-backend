package com.liaoyuanfang.cloudyf.common.msg;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: gople
 * @Date: 2021/1/24 18:05
 * @Description:
 */
@Data
@Slf4j
public class ResultObject<T> {

    private T result;

    private Integer errorCode;

    private List<String> errorMsgs = new ArrayList<>();

    private boolean successFlag = true;

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
        this.successFlag = false;
        //手工回滚异常
        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        log.info("事务回滚成功");
    }

    public void setErrorMsg(String msg) {
        this.errorMsgs.add(msg);
    }

    public String getErrorMsg() {
        if (!CollectionUtils.isEmpty(errorMsgs) && errorMsgs.size() > 0) {
            return errorMsgs.get(0);
        }
        return null;
    }

    public List<String> getErrorMsgs() {
        if (!CollectionUtils.isEmpty(errorMsgs)) {
            return errorMsgs;
        }
        return null;
    }

    public boolean isSuccess() {
        return successFlag;
    }

    public boolean isFailed() {
        return !successFlag;
    }

}
