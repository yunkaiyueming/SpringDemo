package com.myatispoint;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;


public class MyBatisTest {
    /** * MyBatis SqlSessionFactory * SqlSessionFactory????SqlSession????????????SqlSession??????????commit?rollback?close???? * @return */
    private static SqlSessionFactory getSessionFactory() {
        SqlSessionFactory sessionFactory = null;
        String resource = "configuration.xml";
        try {
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }

    //使用mybatis 构建sql
    public static void main2(String[] args) {
        SqlSession sqlSession = getSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findById("1");
        System.out.println(user);

        User u1 = new User(10,"cc");
        userMapper.addUser(u1);

        List<User> uinfos = userMapper.getAllUser();
        for(User u : uinfos){
            System.out.println(u);
        }

        User u2 = new User("1",10,"dd");
        userMapper.updateUser(u2);

        userMapper.delUserById("1");

        sqlSession.commit();//手动提交事务
        sqlSession.close();


    }

    //构建People sql
    public static void main(String[] args) {
        SqlSession sqlSession = getSessionFactory().openSession();
        PeopleMapper userMapper = sqlSession.getMapper(PeopleMapper.class);
        People user = userMapper.findById("1");
        System.out.println(user);

        People u1 = new People(10,"cc");
        System.out.println("insertid:"+ userMapper.addUser(u1));

        List<People> uinfos = userMapper.getAllUser();
        for(People u : uinfos){
            System.out.println(u);
        }

        People u2 = new People("3",50,"cc");
        System.out.println("update: "+ userMapper.updateUser(u2));

        System.out.println("delete: "+ userMapper.delUserById("1"));

        sqlSession.commit();//手动提交事务
        sqlSession.close();

    }
}