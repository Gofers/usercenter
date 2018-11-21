package com.gofer.usercenter.controller;


import com.gofer.usercenter.model.UserAccount;
import com.gofer.usercenter.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class Test {
    private final static Logger LOGGER = LoggerFactory.getLogger(Test.class);

    @Autowired
    UserService userService;

    @RequestMapping("asdf")
    public String qwer(String userid) {
        return userid;
    }




    @RequestMapping("test")
    @Transactional(rollbackFor = {})
    public void asdf() {
        userService.insert(new UserAccount());
        System.out.println("qwer");

    }



    public static void main(String[] args) {

        try {
            throw new RuntimeException("qwer");
        } catch (Exception e) {
            LOGGER.error("clock send award honey error,clockDate:{},userId:{}", "asdf","zxcv",e);

        }
    }
}
