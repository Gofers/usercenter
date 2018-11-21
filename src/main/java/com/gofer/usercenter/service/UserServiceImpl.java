package com.gofer.usercenter.service;

import com.gofer.usercenter.mapper.UserAccountMapper;
import com.gofer.usercenter.model.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserAccountMapper userAccountMapper;

    @Override
    public void insertAccount() {
        userAccountMapper.insertUser();
        throw new RuntimeException();
    }

    @Override
    public UserAccount insert(UserAccount userAccount) {
        UserAccount lastUserAccount=userAccountMapper.getAllUser().stream()
                .findFirst()
                .get();
        System.out.println(lastUserAccount);
        userAccount=lastUserAccount;

        String newUserId=(userAccountMapper.findAllUser()
                .stream()
                .count()+1)+"";
        userAccount.setId(newUserId);
        userAccountMapper.insert(userAccount);
        return userAccount;
    }
}
