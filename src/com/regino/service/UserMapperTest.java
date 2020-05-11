package com.regino.service;

import com.regino.dao.UserMapper;
import com.regino.domain.User;
import com.regino.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class UserMapperTest {

    // 模拟service测试
    // 查询所有
    @Test
    public void testFindAll() throws Exception {
        // 通过MyBatis根据接口规范创建实现类
        SqlSession sqlSession = MyBatisUtils.openSession();
        // 创建代理对象（实现类）
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 执行SQL
        List<User> list = userMapper.findAll();
        System.out.println(list);

        // 关闭会话
        MyBatisUtils.close(sqlSession);
    }

    // 新增
    @Test
    public void testSave()throws Exception{
        // 通过MyBatis根据接口规范创建实现类
        SqlSession sqlSession = MyBatisUtils.openSession();
        // 创建代理对象（实现类）
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 执行SQL
        User user = new User();
        user.setUsername("Regino");
        user.setSex("男");
        user.setAddress("CSDN");
        user.setBirthday(new Date());
        userMapper.save(user);

        // 关闭会话
        MyBatisUtils.close(sqlSession);
    }

    // 修改
    @Test
    public void testUpdate()throws Exception{
        // 通过MyBatis根据接口规范创建实现类
        SqlSession sqlSession = MyBatisUtils.openSession();
        // 创建代理对象（实现类）
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 执行SQL
        User user = new User();
        user.setId(51);
        user.setUsername("Regina");
        user.setSex("女");
        user.setAddress("CSDN");
        user.setBirthday(new Date());
        userMapper.update(user);

        // 关闭会话
        MyBatisUtils.close(sqlSession);
    }

    // 删除
    @Test
    public void testDelete()throws Exception{
        // 通过MyBatis根据接口规范创建实现类
        SqlSession sqlSession = MyBatisUtils.openSession();
        // 创建代理对象（实现类）
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 执行SQL
        userMapper.delete(50);

        // 关闭会话
        MyBatisUtils.close(sqlSession);
    }

    // 查询一个
    @Test
    public void testFindById()throws Exception{
        // 通过MyBatis根据接口规范创建实现类
        SqlSession sqlSession = MyBatisUtils.openSession();
        // 创建代理对象（实现类）
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 执行SQL
        User user = userMapper.findById(41);
        System.out.println(user);

        // 关闭会话
        MyBatisUtils.close(sqlSession);
    }
}