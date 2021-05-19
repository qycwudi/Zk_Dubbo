package com.qyc.service;/**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 7:00 下午
 */

import com.qyc.bean.Stu;

import java.util.List;

/**
 *@ClassName: StuService
 *@Description:
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 7:00 下午
 */
public interface StuService {
    List<Stu> selectAllStu();
}
