package com.qyc;/**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 12:42 上午
 */

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *@ClassName: Consumer8101
 *@Description:
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 12:42 上午
 */
@SpringBootApplication
@EnableDubbo
public class Consumer8101 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer8101.class,args);
    }
}
