package com.qyc.delete;/**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 5:18 下午
 */

import com.qyc.connection.ZkConnection;
import org.apache.zookeeper.KeeperException;

/**
 *@ClassName: ZkDelete
 *@Description:
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 5:18 下午
 */
public class ZkDelete {
    public boolean zkDeleteNode(String path,String ver){
        try {
            ZkConnection.setUpZkConnection().delete(path,Integer.parseInt(ver));
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        } catch (KeeperException e) {
            e.printStackTrace();
        }
        return true;
    }
}
