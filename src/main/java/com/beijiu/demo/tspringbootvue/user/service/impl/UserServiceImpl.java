package com.beijiu.demo.tspringbootvue.user.service.impl;

import com.beijiu.demo.tspringbootvue.user.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Override
    public boolean chkUserByUsernameAndPwd(String username, String pwd) {
        return false;
    }

}
