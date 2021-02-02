package com.liaoyuanfang.cloudyf.sso.controller;

import com.liaoyuanfang.cloudyf.common.controller.BaseController;
import com.liaoyuanfang.cloudyf.common.msg.RestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: gople
 * @Date: 2021/1/24 17:34
 * @Description:
 */
@RestController
@RequestMapping("/sso/register")
@Slf4j
public class RegisterController extends BaseController {

    @GetMapping("/info")
    @ResponseBody
    public RestResponse getInfo(HttpServletRequest request){
        String userName = request.getParameter("userName");

        log.info(userName);



        return success();
    }

}
