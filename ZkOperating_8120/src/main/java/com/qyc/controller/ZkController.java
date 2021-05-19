package com.qyc.controller;/**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 3:15 下午
 */

import com.qyc.bean.Stu;
import com.qyc.select.ZkSelectChild;
import com.qyc.service.StuService;
import com.qyc.service.impl.StuServiceImpl;
import org.apache.zookeeper.ZooKeeper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *@ClassName: ZkController
 *@Description:
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 3:15 下午
 */
@RestController
@RequestMapping("zk")
public class ZkController {
//    @Autowired
//    private ZkSelectChild zkSelectChild;
//    @GetMapping("/select/{path}")
//    public List<String> select(@PathVariable("path") String path){
//        System.out.println("path = "+path);
//        if(path.equals("root")){
//            return zkSelectChild.zkSelectChile("/",false);
//        }
//        else {
//            return zkSelectChild.zkSelectChile("/"+path,false);
//        }
//    }

    @Autowired
    private StuServiceImpl stuService;
    @GetMapping("/selectStu")
    public List<Stu> selectStu(){
        return stuService.selectAllStu();
    }

    // TODO: 2021/5/19 前端接口 计划支持导入导出
}
