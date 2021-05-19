package com.qyc.select;/**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 5:21 下午
 */

import com.qyc.connection.ZkConnection;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *@ClassName: ZkSelectChild
 *@Description:
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 5:21 下午
 */
@Service
public class ZkSelectChild {
    @Autowired
    private ZooKeeper zooKeeper;
    public List<String> zkSelectChile(String path, boolean watch){
        List list = null;
        try {
            list =  zooKeeper.getChildren(path,watch);
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("service = "+list);
        return list;
    }
}
