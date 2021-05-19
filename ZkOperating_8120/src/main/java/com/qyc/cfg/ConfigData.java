package com.qyc.cfg;/**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 6:00 下午
 */

import com.qyc.select.ZkSelectNode;
import org.apache.ibatis.annotations.Param;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 *@ClassName: ConfigData
 *@Description:
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 6:00 下午
 */
@Configuration

public class ConfigData {

    @Value("${zk.ip}")
    private String zkIp;

    @Value("${root.node}")
    private String rootNode;
    @Bean
    public ZooKeeper createZookeeperConnection(){
        ZooKeeper zooKeeper = null;
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            zooKeeper = new ZooKeeper(zkIp, 1000, new Watcher() {
                @Override
                public void process(WatchedEvent watchedEvent) {
                    if(watchedEvent.getState()==Event.KeeperState.SyncConnected){
                        System.out.println("建立连接成功");
                        countDownLatch.countDown();
                    }
                }
            });
            countDownLatch.await();
            System.out.println("getSessionId: "+zooKeeper.getSessionId());

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }finally {
        }
        return zooKeeper;
    }



    @Bean
    @Primary
    public DataSourceProperties dataSourseCfg(){
        ZkSelectNode zkSelectNode = new ZkSelectNode();
        DataSourceProperties dataSourceProperties = new DataSourceProperties();
        // TODO: 2021/5/19 后期自动扫描 全局配置
        dataSourceProperties.setUrl(zkSelectNode.zkSelectNodeByZk(createZookeeperConnection(),rootNode+"/url",false,new Stat()));
        dataSourceProperties.setDriverClassName(zkSelectNode.zkSelectNodeByZk(createZookeeperConnection(),rootNode+"/driver",false,new Stat()));
        dataSourceProperties.setUsername(zkSelectNode.zkSelectNodeByZk(createZookeeperConnection(),rootNode+"/username",false,new Stat()));
        dataSourceProperties.setPassword(zkSelectNode.zkSelectNodeByZk(createZookeeperConnection(),rootNode+"/password",false,new Stat()));
        System.out.println(dataSourceProperties.getUrl());
        System.out.println(dataSourceProperties.getDriverClassName());
        System.out.println(dataSourceProperties.getUsername());
        System.out.println(dataSourceProperties.getPassword());
        return dataSourceProperties;
    }
}
