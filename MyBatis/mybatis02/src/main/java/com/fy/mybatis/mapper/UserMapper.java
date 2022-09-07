package com.fy.mybatis.mapper;

import com.fy.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

    /*
    * ÃÌº””√ªß
    * */
    int insertUser();
    int delete();
    int update();
    User getById();
    List<User> getAll();
}
