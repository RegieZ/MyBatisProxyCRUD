package com.regino.dao;

import com.regino.domain.User;

import java.util.List;

public interface UserMapper {

    // 查询所有
    public List<User> findAll();

    // 新增
    public void save(User user);

    // 修改
    public void update(User user);

    // 删除
    public void delete(Integer id);

    // 查询一个
    public User findById(Integer id);
}