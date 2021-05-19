package com.qyc.create;/**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 3:45 下午
 */

import com.qyc.connection.ZkConnection;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;

/**
 *@ClassName: ZkCreate
 *@Description:
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 3:45 下午
 */
public class ZkCreate {

    /** 
     * @Description:  创建节点
     * @Date: 2021/5/19 
     * @Param: String path
     * @Return: boolean
     */
    public boolean createNode(String path,String data){
        /**
            @Description: 节点路径,节点数据,权限列表world cdrwa,节点类型
            无论是同步还是异步接口，ZooKeeper都不支持递归创建，即无法在父节点不存在的情况下创建一个子节点
         */
        try {
            ZkConnection.setUpZkConnection().create(path,data.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            return true;
        } catch (KeeperException e) {
            return false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
}
