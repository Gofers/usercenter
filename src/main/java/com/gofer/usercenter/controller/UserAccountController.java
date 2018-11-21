package com.gofer.usercenter.controller;

import com.gofer.usercenter.mapper.UserAccountMapper;
import com.gofer.usercenter.model.UserAccount;
import com.gofers.usercenterapi.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 73956
 */
@RestController
@RequestMapping("account")
public class UserAccountController {

    @Autowired
    UserAccountMapper userAccountMapper;

    @RequestMapping("id")
    public UserInfo findById(@RequestBody String accountId) {
        UserAccount userAccount = userAccountMapper.selectById(accountId);
        UserInfo userInfo =new UserInfo();
        userInfo.setUserName(userAccount.getUsername());
        System.out.println(userAccount.toString());
        System.out.println("asdf");



        return userInfo;

    }
}
