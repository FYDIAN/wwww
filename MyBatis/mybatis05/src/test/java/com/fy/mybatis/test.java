package com.fy.mybatis;

import com.fy.mybatis.mapper.EmpMapper;
import com.fy.mybatis.pojo.Emp;
import com.fy.mybatis.pojo.EmpExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.awt.print.Pageable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {
    @Test
    public void testMapper(){
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
            SqlSessionFactory sessionFactory = sqlSessionFactoryBuilder.build(is);
            SqlSession sqlSession = sessionFactory.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            /*int i = mapper.deleteByPrimaryKey(1);
            System.out.println(i);*/
            PageHelper.startPage(2, 3);
            List<Emp> emps=mapper.selectByExample(null);
            emps.forEach(emp -> System.out.println(emp));

          /*  根据条件查找*/
            /*EmpExample empExample=new EmpExample();
            empExample.createCriteria().andEmpNameEqualTo("刘芳");
            List<Emp> emps = mapper.selectByExample(empExample);
            emps.forEach(emp -> System.out.println(emp));*/

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
