package com.fy.mybatis.mapper;

import com.fy.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface SelecterMapper {
    Integer getCount();
    User getById(@Param("id") Integer id);
}
