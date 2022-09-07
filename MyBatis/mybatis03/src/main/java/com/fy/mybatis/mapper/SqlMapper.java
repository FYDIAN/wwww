package com.fy.mybatis.mapper;

import com.fy.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SqlMapper {
    List<User> getByLike(@Param("username") String username);
    int deleteMore(@Param("ids") String ids);
}
