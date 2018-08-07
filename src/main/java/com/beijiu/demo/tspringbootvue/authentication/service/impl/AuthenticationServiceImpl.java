package com.beijiu.demo.tspringbootvue.authentication.service.impl;

import com.beijiu.demo.tspringbootvue.authentication.service.IAuthenticationService;
import com.beijiu.demo.tspringbootvue.user.service.IUserService;
import com.beijiu.demo.tspringbootvue.user.service.impl.UserServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("authenticationService")
public class AuthenticationServiceImpl implements IAuthenticationService {

    @Resource(name = "userService")
    private IUserService userService;

    @Override
    public boolean loginChk(String username, String pwd) {
        return userService.chkUserByUsernameAndPwd(username, pwd);
    }
}
