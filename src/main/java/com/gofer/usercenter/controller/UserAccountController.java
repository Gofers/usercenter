package com.gofer.usercenter.controller;

import com.gofer.usercenter.mapper.UserAccountMapper;
import com.gofer.usercenter.model.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class UserAccountController {

    @Autowired
    UserAccountMapper userAccountMapper;

    @RequestMapping("id")
    public UserAccount findById(String accountid) {

        return userAccountMapper.selectById(accountid);
    }
}
