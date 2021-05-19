package com.qyc.bean;/**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 6:49 下午
 */

import lombok.Data;

import java.io.Serializable;

/**
 *@ClassName: Stu
 *@Description:
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 6:49 下午
 */
@Data
public class Stu implements Serializable {
    private long id;
    private String name;
    private int age;
}
