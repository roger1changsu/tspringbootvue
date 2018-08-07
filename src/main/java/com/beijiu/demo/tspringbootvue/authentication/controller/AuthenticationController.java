package com.beijiu.demo.tspringbootvue.authentication.controller;

import com.beijiu.demo.tspringbootvue.authentication.vo.LoginRequestVO;
import com.beijiu.demo.tspringbootvue.authentication.service.IAuthenticationService;
import com.beijiu.demo.tspringbootvue.common.RespCode;
import com.beijiu.demo.tspringbootvue.common.RespEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AuthenticationController {

    @Resource(name = "authenticationService")
    private IAuthenticationService authenticationService;

    @RequestMapping("/api/login")
    public RespEntity loginCheck(LoginRequestVO loginReq) {
        if (authenticationService.loginChk(loginReq.getUsername(), loginReq.getPassword())) {
            return new RespEntity(RespCode.SUCCESS);
        } else {
            return new RespEntity(RespCode.FAILURE_LOGIN_FAILED);
        }
    }
}
