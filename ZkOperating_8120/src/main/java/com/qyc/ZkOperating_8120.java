package com.qyc; /**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 3:12 下午
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *@ClassName: ZkOperating_8120
 *@Description:
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 3:12 下午
 */
@SpringBootApplication
@MapperScan({"com.qyc.mapper"})
public class ZkOperating_8120 {
    public static void main(String[] args) {
        SpringApplication.run(ZkOperating_8120.class,args);
    }
}
