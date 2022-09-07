package com.fy.mybatis.test;

import com.fy.mybatis.mapper.DeptMapper;
import com.fy.mybatis.mapper.DynamicSQLMapper;
import com.fy.mybatis.mapper.EmpMapper;
import com.fy.mybatis.pojo.Dept;
import com.fy.mybatis.pojo.Emp;
import com.fy.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MybatisTest {

    @Test
    public void test(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> emps = mapper.getAll();
        emps.forEach(emp -> System.out.println(emp));

    }

    @Test
    public void testEmpAndTept(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndTept(1);
        System.out.println("rusult-->"+emp);

    }

    @Test
    public void testTeptAndemp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept emp = mapper.getDeptAndEmp(1);
        System.out.println("rusult-->"+emp);

    }

    @Test
    public void testEmpAndTeptByStep(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getByStep(1);
        System.out.println("rusult-->"+emp.getEmpName());

    }

    @Test
    public void testDeleteMoreByArray(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int i = mapper.deleteMoreByArray(new Integer[]{10, 11, 18});
        System.out.println("rusult-->"+i);

    }
    @Test
    public void testInsertMoreByList(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1=new Emp(null,"a1",18,"nan","qq.com");
        Emp emp2=new Emp(null,"a2",18,"nan","qq.com");
        Emp emp3=new Emp(null,"a3",18,"nan","qq.com");
        List<Emp> list = Arrays.asList(emp1,emp2,emp3);
        int i = mapper.addMoreByList(list);
        System.out.println("result-->"+i);

    }

    @Test
    public void testgetDeptById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getById(1);
        System.out.println("rusult-->"+dept);

    }
}
