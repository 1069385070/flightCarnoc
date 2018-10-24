package com.heyang.ssm.dao;

import com.heyang.ssm.pojo.User;

import java.util.List;

public interface UserDao {

    /**
     * 增加
     * @param user
     * @return
     */
    public int addUser(User user);

    /**
     * 删除
     * @param user
     * @return
     */
    public int deleteUser(Integer user);

    /**
     * 修改
     * @param user
     * @return
     */
    public int updateUser(User user);

    /**
     * 根据ID查询
     * @param userId
     * @return
     */
    public User getUserById(Integer userId);


    /**
     * 得到所有的用户
     * @return
     */
    public List<User> getAllUser();

    /**
     * 综合查询
     * @param user
     * @return
     */
    public List<User> getUser(User user);
}
