package com.pigfly.service;
import com.pigfly.entity.User;
public interface UserService {
    /**
     * 新增用户
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    boolean updateUser(User user);


    /**
     * 删除用户
     * @param id
     * @return
     */
    boolean deleteUser(int id);

    /**
     * 根据用户名字查询用户信息
     * @param userName
     */
    User findUserByName(String userName);

    /**
     * 根据用户ID查询用户信息
     * @param userId
     */
    User findUserById(int userId);

    /**
     * 根据用户ID查询用户信息
     * @param userAge
     */
    User findUserByAge(int userAge);
}
