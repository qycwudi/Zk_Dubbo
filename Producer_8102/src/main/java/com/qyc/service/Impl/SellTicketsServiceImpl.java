package com.qyc.service.Impl;/**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 12:45 上午
 */

import com.qyc.service.SellTicketsService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 *@ClassName: SellTicketsServiceImpl
 *@Description:
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 12:45 上午
 */
@DubboService
public class SellTicketsServiceImpl implements SellTicketsService {
    @Override
    public String SellTickets(String name) {
        return name+"要购票";
    }
}

