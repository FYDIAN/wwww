package com.fy.mybatis.mapper;

import com.fy.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    List<Emp> getAll();
    Emp getEmpAndTept(@Param("eid") Integer eid);
    Emp getByStep(@Param("eid") Integer eid);
}
