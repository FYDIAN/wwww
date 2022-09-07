package com.fy.mybatis.test;

import com.fy.mybatis.mapper.CatchMapper;
import com.fy.mybatis.pojo.Emp;
import com.fy.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class CatchTest {
    @Test
    public void Catch(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CatchMapper mapper = sqlSession.getMapper(CatchMapper.class);
        Emp emp = mapper.getByEid(1);
        System.out.println("result-->"+emp);
    }
}
