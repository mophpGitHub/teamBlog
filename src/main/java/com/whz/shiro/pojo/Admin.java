package com.whz.shiro.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 卫宏哲
 * @date 2020/3/8 14:01
 * 管理员
 * 序列化
 * serialVersionUID
 * 序列化时为了保持版本的兼容性
 */
@Data
public class Admin implements Serializable {

    private static final long serialVersionUID = 169915810554522554L;

    /**
     * 管理员id
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 头像
     */
    private String header;

    /**
     * 签名
     */
    private String signature;

    /**
     * 介绍
     */
    private String comment;

    /**
     * 账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

}
