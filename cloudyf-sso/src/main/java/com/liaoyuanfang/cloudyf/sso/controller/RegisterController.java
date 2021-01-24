package com.liaoyuanfang.cloudyf.sso.controller;

import com.liaoyuanfang.cloudyf.common.controller.BaseController;
import com.liaoyuanfang.cloudyf.common.msg.RestResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: gople
 * @Date: 2021/1/24 17:34
 * @Description:
 */
@RestController
@RequestMapping("/sso/register")
public class RegisterController extends BaseController {

    @GetMapping("/info")
    @ResponseBody
    public RestResponse getInfo(){
        return success();
    }

}
