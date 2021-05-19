# Zk_Dubbo
## Zookeeper
### 安装
[https://zookeeper.apache.org/doc/r3.7.0/zookeeperStarted.html#sc_Download](https://zookeeper.apache.org/doc/r3.7.0/zookeeperStarted.html#sc_Download)

下载安装包后更改conf文件

配置环境变量（可有可无）

启动：sudo ./zkServer.sh start

连接：./zkCli.sh -server 127.0.0.1:2181    退出 quit

停止：sudo ./zkServer.sh stop

### 命令

ls /  查看文件

create 创建节点

create -e 创建临时节点

create -s 持久节点

set 修改值

watch 监听

delete 删除

rmr 递归删除

stat / 查看状态


## Dubbo
### 后端

下载代码：git clone [https://github.com/apache/dubbo-admin.git](https://github.com/apache/dubbo-admin.git)

配置：在 dubbo-admin-server/src/main/resources/application.properties中指定注册中心地址

构建：mvn clean package -Dmaven.test.skip=true

启动：cd dubbo-admin-distribution/target; java -jar dubbo-admin-0.1.jar

### 前端

dubbo admin ui

npm install

更改后台端口：vue.config.js 

```json
proxy: {
      '/': {
        target: 'http://localhost:8090/',
        changeOrigin: true,
        pathRewrite: {
          '^/': '/'
        }
      }
    }
  },
```

npm run dev

账号密码  root

