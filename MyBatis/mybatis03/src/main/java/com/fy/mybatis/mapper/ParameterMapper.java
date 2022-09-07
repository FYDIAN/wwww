package com.fy.mybatis.mapper;

import com.fy.mybatis.pojo.User;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {
    List<User> getAllUser();
    User getUsreByname(String username);
    User login(String username ,String password);
    User loginByMap(Map<String,Object> map);
    int insertUser(User user);
}
