UEditor-for-aliyun-OSS使用配置
=====

UEditor-for-aliyun-OSS v1.0.0提供两种配置模式：

### 1. 标准模式：


    即不配置OSSKey.properties文件，该功能同ueditor官方提供的功能一致。
    

### 2. 高级模式：


    即启用UEditor-for-aliyun-OSS模式，配置及使用方法如下：


    1) 把/src/ueditor1_4_3-utf8-jsp文件下的所有文件拷贝到项目的WebContent或webapp目录下（该文件来自ueditor官网修改后的版本）。


    2) 将lib文件夹下的jar包拷贝到项目的lib目录下，导入项目。


    3) 配置OSSKey.properties文件，配置如下：

```
    # ALIYUN OSSClient Configure 
    useStatus=true
    bucketName=bucketmy-bucket-nameamesdfswers
    key=75W7vDuyu04e1XYS
    secret=
    ## endPoint=http://images.qikemi.com/
    endPoint=http://images.qikemi.com/
```
    4) 将/ueditor/src/main/webapp/index.jsp文件放在WebContent或webapp，注意修改ueditor.config.js，ueditor.all.js，ueditor.css等的引用路径。
    
    5) 启动项目，访问即可。

### 技术支持

邮箱：me@xiexianbin.cn xianbinxie@163.com

QQ群：20038301
