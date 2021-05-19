package com.qyc;/**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 12:43 上午
 */

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *@ClassName: Producer8102
 *@Description:
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 12:43 上午
 */
@SpringBootApplication
@EnableDubbo
public class Producer8102 {
    public static void main(String[] args) {
        SpringApplication.run(Producer8102.class,args);
    }
}
