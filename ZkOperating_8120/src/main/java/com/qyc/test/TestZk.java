package com.qyc.test;/**
 * @CreatAuthor: qiangyuecheng
 * @CreatDate: 2021/5/19 4:24 下午
 */

import com.qyc.connection.ZkConnection;
import com.qyc.create.ZkCreate;
import com.qyc.delete.ZkDelete;
import com.qyc.select.Exists;
import com.qyc.select.ZkSelectAll;
import com.qyc.select.ZkSelectChild;
import com.qyc.select.ZkSelectNode;
import com.qyc.update.SetData;
import org.apache.zookeeper.data.Stat;

import java.util.List;

/**
 *@ClassName: TestZk
 *@Description:
 *@Author: qiangyuecheng
 *@Date: 2021/5/19 4:24 下午
 */
public class TestZk {
    public static void main(String[] args) {
        /**
            @Description: 建立连接
         */
       if(ZkConnection.setUpZkConnection()!=null){
           ZkCreate zkCreate = new ZkCreate();
           /**
               @Description: 创建节点
            */
           System.out.println("zkCreate.createNode = " + zkCreate.createNode("/ruyixingDevelopment/ZkOperating_8120/password", "Qycssg!0"));

           /**
               @Description: 更新节点
            */
//           SetData setData = new SetData();
//           System.out.println(" setData ="+setData.setData("/create1/qyc","url","-1"));

           /**
               @Description: 查看节点数据
            */
//           ZkSelectNode zkSelectNode = new ZkSelectNode();
//           System.out.println(zkSelectNode.zkSelectNode("/create1/qyc",false,new Stat()));

           /**
               @Description: 查看child
            */
//           ZkSelectChild zkSelectChild = new ZkSelectChild();
//           List<String> fatherlist = zkSelectChild.zkSelectChile("/",false);


           /**
               @Description: 查看全部
            */
//           ZkSelectAll zkSelectAll = new ZkSelectAll();
//           List<String> list = zkSelectAll.selectAll("/");
//           for (String str :
//                   list) {
//               System.out.print(str+",");
//           }
           /**
               @Description: 判断节点是否存在
            */
//           Exists exists = new Exists();
//           System.out.println("exists.exists() = " + exists.exists("/create1/qyc",false));
           /**
               @Description: 删除节点
            */

//           ZkDelete zkDelete = new ZkDelete();
//           zkDelete.zkDeleteNode("/create1/qyc","1");
           /**
               @Description: 关闭连接
            */
           ZkConnection.clouseZkConnection();
       }
    }
}
