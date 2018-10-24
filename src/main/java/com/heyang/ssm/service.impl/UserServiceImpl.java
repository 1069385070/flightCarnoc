package com.heyang.ssm.service.impl;

import com.heyang.ssm.dao.UserDao;
import com.heyang.ssm.pojo.User;
import com.heyang.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public int deleteUser(Integer user) {
        return userDao.deleteUser(user);
    }

    @Override
    public List<User> getUser(User user) {
        return userDao.getUser(user);
    }
}
