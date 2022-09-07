package com.fy.mybatis.test;

import com.fy.mybatis.mapper.ParameterMapper;
import com.fy.mybatis.mapper.SelecterMapper;
import com.fy.mybatis.mapper.SqlMapper;
import com.fy.mybatis.pojo.User;
import com.fy.mybatis.utlis.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMapper {
    @Test
    public void testmapper() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> allUser = mapper.getAllUser();
        System.out.println("allUser-->"+allUser);
    }
    @Test
    public void getByName() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.getUsreByname("wsd");
        System.out.println("User-->"+user);
    }

    @Test
    public void login() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.login("wsd","123");
        System.out.println("User-->"+user);
    }

    @Test
    public void loginByMap() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String,Object> map=new HashMap<>();
        map.put("username","wsd");
        map.put("password","123");
        User user = mapper.loginByMap(map);
        System.out.println("User-->"+user);
    }

    @Test
    public void addUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        int result = mapper.insertUser(new User(null, "hhh", "pwd", 18, "nv", "@qq.com"));
        System.out.println("result-->"+result);
    }

    @Test
    public void getcont() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelecterMapper mapper = sqlSession.getMapper(SelecterMapper.class);
        Integer count = mapper.getCount();
        System.out.println("result-->"+count);
    }
    @Test
        public void getById() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelecterMapper mapper = sqlSession.getMapper(SelecterMapper.class);
        User user = mapper.getById(5);
        System.out.println("result-->"+user);

    }

    @Test
    public void getByLike() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        List user = mapper.getByLike("g");
        System.out.println("result-->"+user);

    }

    @Test
    public void deleteMore() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        int i = mapper.deleteMore("12,25,26");
        System.out.println("result-->"+i);

    }
}
