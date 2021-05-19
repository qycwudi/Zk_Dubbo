package com.qyc.controller;/**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 12:54 上午
 */

import com.qyc.service.Impl.TicketsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName: TickController
 *@Description:
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 12:54 上午
 */
@RestController
@RequestMapping("/ticket")
public class TickController {
    @Autowired
    private TicketsServiceImpl ticketsService;
    @GetMapping("sell/{name}")
    public String sell(@PathVariable("name") String name){
        return ticketsService.tickets(name);
    }
}
