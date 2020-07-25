package com.whz.shiro.service;

import com.whz.shiro.pojo.User;
import com.whz.shiro.utils.Page;

import java.util.List;

/**
 * @author 卫宏哲
 * @date 2020/3/8 14:16
 */
public interface UserService {
    /**
     * 保存
     *
     * @param user
     */
    void save(User user);

    /**
     * 更新
     *
     * @param user
     */
    void update(User user);

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    User getById(Integer id);

    /**
     * 根据id删除
     *
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 分页查询
     *
     * @param page
     * @return
     */
    Page<User> getByPage(Page<User> page);

    /**
     * 重置密码为123456
     * @param userIds
     */
    void resetPwd(List<Integer> userIds);

    /**
     * 注册
     * @param user
     */
    void register(User user);

    /**
     * 根据用户名查询
     * @param username
     * @return
     */
    User getByUsername(String username);

    /**
     * 修改个人信息
     * @param user
     */
    void updateInfo(User user);


}
