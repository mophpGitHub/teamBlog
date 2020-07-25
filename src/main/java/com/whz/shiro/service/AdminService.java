package com.whz.shiro.service;

import com.whz.shiro.pojo.Admin;

/**
 * @author 卫宏哲
 * @date 2020/3/8 14:15
 */
public interface AdminService {
    /**
     * 根据用户名查询
     *
     * @param username
     * @return
     */
    Admin getByUsername(String username);

    /**
     * 查询管理员
     *
     * @return
     */
    Admin getAdmin();
    /**
     * 更新个人信息
     * @param admin
     */
    void updateInfo(Admin admin);

    /**
     * 更新密码
     * @param admin
     */
    void updatePassword(Admin admin);
}
