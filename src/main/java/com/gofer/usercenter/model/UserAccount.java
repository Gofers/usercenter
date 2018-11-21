package com.gofer.usercenter.model;

//import com.google.common.base.Strings;
//import org.apache.ibatis.annotations.Result;
//import org.apache.ibatis.annotations.ResultMap;
//import org.apache.ibatis.annotations.ResultType;
//import org.apache.ibatis.annotations.Results;
//import org.springframework.web.bind.annotation.RequestMapping;


public class UserAccount {

    private String id;
    private String username;
    private String accountid;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    public static void main(String[] args) {
        int i=1;
        System.out.println((1<<13)-1);
    }
}
