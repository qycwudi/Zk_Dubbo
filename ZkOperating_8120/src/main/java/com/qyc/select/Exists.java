package com.qyc.select;/**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 5:30 下午
 */

import com.qyc.connection.ZkConnection;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.data.Stat;

/**
 *@ClassName: Exists
 *@Description:
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 5:30 下午
 */
public class Exists {
    public Stat exists(String path,boolean state){
        Stat stat = null;
        try {
            stat = ZkConnection.setUpZkConnection().exists(path,state);
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return stat;
    }
}
