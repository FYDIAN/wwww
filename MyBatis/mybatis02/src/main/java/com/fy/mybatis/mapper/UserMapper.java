package com.fy.mybatis.mapper;

import com.fy.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

    /*
    * ����û�
    * */
    int insertUser();
    int delete();
    int update();
    User getById();
    List<User> getAll();
}
