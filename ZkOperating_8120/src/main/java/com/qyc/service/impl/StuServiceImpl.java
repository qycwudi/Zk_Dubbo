package com.qyc.service.impl;/**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 7:01 下午
 */

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qyc.bean.Stu;
import com.qyc.mapper.StuMapper;
import com.qyc.service.StuService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName: StuServiceImpl
 *@Description:
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 7:01 下午
 */
@Service
public class StuServiceImpl extends ServiceImpl<StuMapper, Stu> implements StuService {
    @Override
    public List<Stu> selectAllStu() {
        QueryWrapper wrapper = new QueryWrapper();
        return baseMapper.selectList(wrapper);
    }
}
