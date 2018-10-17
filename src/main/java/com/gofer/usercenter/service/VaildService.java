package com.gofer.usercenter.service;

public interface VaildService {

    String generateVerifyCode(String userId);

    String verifyLoginCode(String userId, String verifyCode);
}
