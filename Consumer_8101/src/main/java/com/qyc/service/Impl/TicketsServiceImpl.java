package com.qyc.service.Impl;/**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 12:45 上午
 */

import com.qyc.service.SellTicketsService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 *@ClassName: SellTicketsServiceImpl
 *@Description:
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 12:45 上午
 */
@Service
public class TicketsServiceImpl {
    @DubboReference
    private SellTicketsService service;
    public String tickets(String name) {
        return service.SellTickets(name);
    }
}

