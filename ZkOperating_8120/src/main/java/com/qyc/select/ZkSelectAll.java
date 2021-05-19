package com.qyc.select;/**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 5:41 下午
 */

import com.qyc.connection.ZkConnection;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *@ClassName: ZkSelectAll
 *@Description:
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 5:41 下午
 */
public class ZkSelectAll {

    public List<String> selectAll(String path){
        try {
                return ZkConnection.setUpZkConnection().getChildren(path,false);
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
