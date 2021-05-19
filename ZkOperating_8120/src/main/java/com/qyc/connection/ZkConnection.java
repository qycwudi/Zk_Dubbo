package com.qyc.connection;/**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 3:26 下午
 */

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;


import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 *@ClassName: ZkConnection
 *@Description: 连接zookeeper服务器，注意计数器
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 3:26 下午
 */
public class ZkConnection {
    private static ZooKeeper zooKeeper = null;

    /**
     * @Description: 建立连接
     * @Date: 2021/5/19
     * @Param:
     * @Return: ZooKeeper
     */
    public static ZooKeeper setUpZkConnection()  {
        if(zooKeeper!=null){
            return zooKeeper;
        }
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            zooKeeper = new ZooKeeper("127.0.0.1:2181", 1000, new Watcher() {
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

    /**
     * @Description: 关闭连接
     * @Date: 2021/5/19
     * @Param:
     * @Return:
     */
    public static void clouseZkConnection()  {
        try {
            zooKeeper.close();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
        }
    }
}
