package com.fy.mybatis.mapper;

import com.fy.mybatis.pojo.Dept;
import com.fy.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    Dept getById(@Param("did")Integer did);
    Dept getDeptAndEmp(@Param("did") Integer did);

}
