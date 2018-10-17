package com.gofer.usercenter.service;

import com.gofer.usercenter.model.UserAccount;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface UserService {


    void insertAccount();

    UserAccount insert(UserAccount userAccount);
}
