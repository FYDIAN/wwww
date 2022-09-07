package com.fy.mybatis.mapper;

import com.fy.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {
    int deleteMoreByArray(@Param("ids") Integer[] ids);
    /*ÅúÁ¿Ìí¼Ó*/
    int addMoreByList(@Param("emps")List<Emp> emps);
}
