package com.fy.mybatis.mapper;

import com.fy.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface CatchMapper {
    Emp getByEid(@Param("eid")Integer eid);
}
