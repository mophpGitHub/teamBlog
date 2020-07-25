package com.whz.shiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/*
*  @author 卫宏哲
*  @date
* */

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.whz.shiro.mapper")

public class ShiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiroApplication.class, args);
    }

}
