package com.gofer.usercenter.mapper;

import com.gofer.usercenter.model.UserAccount;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserAccountMapper {

    /**
     * 返回所有用户
     * @return 所有accounts
     */
    @Select("select * from user_account")
    List<UserAccount> getAllUser();


    /**
     * 通过用户id查找用户
     * @param userId
     * @return
     */
    UserAccount selectById(@Param("accountid") String accountid);




    /**
     * 查找所有用户
     * @return 返回所有用户列表
     */
    @Select("select * from user_account")
    List<UserAccount> findAllUser();


    @Insert("INSERT INTO usercenter.user_account (user_name,id,user_id) VALUE ('fzz',4,'34') ")
    void insertUser();


    int insert(UserAccount userAccount);



}
