package com.gofer.usercenter.mapper;

import com.gofer.usercenter.model.UserAccount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserAccountMapperTest {


    @Autowired
    UserAccountMapper userAccountMapper;

    @Test
    public void getAllUser() {
        System.out.println(userAccountMapper.getAllUser());

    }

    @Test
    public void findAllUser() {
        System.out.println(userAccountMapper.findAllUser());
    }
}