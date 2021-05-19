package com.qyc.select;/**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 5:20 下午
 */

import com.qyc.connection.ZkConnection;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *@ClassName: ZkSelectNode
 *@Description:
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 5:20 下午
 */
@Service
public class ZkSelectNode {
    @Autowired
    private ZooKeeper zooKeeper;
    public String zkSelectNode(String path, boolean watch, Stat stat){
        String nodeMess = null;
        try {
            byte[] node = zooKeeper.getData(path,watch,stat);
            nodeMess = new String(node);
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return nodeMess;
    }

    public String zkSelectNodeByZk(ZooKeeper zooKeepers,String path, boolean watch, Stat stat){
        String nodeMess = null;
        try {
            byte[] node = zooKeepers.getData(path,watch,stat);
            nodeMess = new String(node);
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return nodeMess;
    }
}
