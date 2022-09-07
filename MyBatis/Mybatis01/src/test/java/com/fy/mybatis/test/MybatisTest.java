package com.fy.mybatis.test;


import com.fy.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {

     @Test
    public void testMybatis() throws IOException {
         //加载核心配置文件
         InputStream is= Resources.getResourceAsStream("mybatis-config.xml");
         //获取SQLsessionFactoryBuildrer
         SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
         //获取SQLsessionFactory
         SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
         //获取SQLsession
         SqlSession sqlSession = sqlSessionFactory.openSession();
         //获取mapper接口
         UserMapper mapper=sqlSession.getMapper(UserMapper.class);

         //测试功能
         int i = mapper.insertUser();

          //提交事务
          sqlSession.commit();
         System.out.println("i---->"+i);
     }
}
