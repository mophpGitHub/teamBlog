package com.whz.shiro.mapper;

import com.whz.shiro.pojo.Admin;
import org.springframework.stereotype.Component;

/**
 * @author 卫宏哲
 * @date 2020/3/8 14:13
 * @Component 把普通pojo实例化到spring容器中，相当于配置文件中的
 */
@Component
public interface AdminMapper {
    /**
     * 根据用户名查询
     * @param username
     * @return
     */
    Admin getByUsername(String username);

    /**
     * 查询管理员
     * @return
     */
    Admin getAdmin();

    /**
     * 更新
     * @param admin
     */
    void update(Admin admin);
}
