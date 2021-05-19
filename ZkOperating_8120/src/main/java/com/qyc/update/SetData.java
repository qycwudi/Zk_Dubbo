package com.qyc.update;/**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 4:55 下午
 */

import com.qyc.connection.ZkConnection;
import org.apache.zookeeper.KeeperException;

/**
 *@ClassName: setData
 *@Description:
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 4:55 下午
 */
public class SetData {
    public boolean setData(String path,String data,String ver){
        try {
            ZkConnection.setUpZkConnection().setData(path,data.getBytes(),Integer.parseInt(ver));
        } catch (KeeperException e) {
            e.printStackTrace();
            return false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
}
