package com.fy.mybatis.test;

import com.fy.mybatis.mapper.UserMapper;
import com.fy.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void mybatisTest() throws IOException {
        //���غ��������ļ�
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //��ȡSqlsessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        //��ȡsqlsessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //��ȡsqlssession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //��ȡmapper�ӿ�
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //int i = mapper.insertUser();
        //sqlSession.commit();
        int delete = mapper.delete();
        System.out.println("result-->"+delete);
    }

    @Test
    public void update() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int update = mapper.update();
        System.out.println("update--->"+update);
    }

    @Test
    public void getById() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getById();
        System.out.println("usre-->"+user);
    }
    @Test
    public void getAll() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> all = mapper.getAll();
        System.out.println("alluser-->"+all);
    }
}
