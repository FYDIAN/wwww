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
         //���غ��������ļ�
         InputStream is= Resources.getResourceAsStream("mybatis-config.xml");
         //��ȡSQLsessionFactoryBuildrer
         SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
         //��ȡSQLsessionFactory
         SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
         //��ȡSQLsession
         SqlSession sqlSession = sqlSessionFactory.openSession();
         //��ȡmapper�ӿ�
         UserMapper mapper=sqlSession.getMapper(UserMapper.class);

         //���Թ���
         int i = mapper.insertUser();

          //�ύ����
          sqlSession.commit();
         System.out.println("i---->"+i);
     }
}
