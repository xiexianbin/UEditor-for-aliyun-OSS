UEditor-for-aliyun-OSS使用配置
=====

## Build [![Build Status](https://travis-ci.org/XieXianbin/UEditor-for-aliyun-OSS.svg?branch=master)](https://travis-ci.org/XieXianbin/UEditor-for-aliyun-OSS)[![Issue Stats](http://www.issuestats.com/github/XieXianbin/UEditor-for-aliyun-OSS/badge/issue)](http://www.issuestats.com/github/XieXianbin/UEditor-for-aliyun-OSS)

## 版本说明

1. UEditor-for-aliyun-OSS-v1.2.1-beta和v1.4。3之前的版本均对应ueditor的官方[v1.4.3版本](https://github.com/fex-team/ueditor/tree/v1.4.3 "ueditor v1.4.3 代码")

2. UEditor-for-aliyun-OSS-v1.2.1-beta之后版本将于ueditor官方保持一致。即UEditor-for-aliyun-OSS-v1.4.3.1版本对应ueditor的v1.4.3.1版本。

## Maven

```
<dependency>
  <groupId>cn.xiexianbin.ueditor</groupId>
  <artifactId>UEditor-for-aliyun-OSS</artifactId>
  <version>1.4.3</version>
</dependency>
```

## 使用

UEditor-for-aliyun-OSS提供两种配置模式：

### 1. 标准模式：

配置文件OSSKey.properties位于src/main/resources目录下（及java的classpath目录下），若不配置OSSKey.properties文件或配置useStatus=false，该功能同ueditor官方提供的功能一致；否则，将启用ue的高级功能。。


### 2. 高级模式：

即启用UEditor-for-aliyun-OSS模式，配置及使用方法如下：


1) 把/src/ueditor1_4_3-utf8-jsp文件下的所有文件拷贝到项目的目录下（该文件来自ueditor官网修改后的版本）。


2) 到 https://github.com/XieXianbin/UEditor-for-aliyun-OSS/releases  下载UEditor-for-aliyun-OSS-1.2.0-beta.jar包，与从/src/lib文件夹下的jar包一同拷贝到项目的lib目录下，导入项目。


3) 将/src/OSSKey.properties拷贝到src/main/resources目录下，配置OSSKey.properties文件，修改如下：

```
## ALIYUN OSSClient Configure 

# Ueditor use or not story image to ALIYUN OSS, values true/false
# default value false
useStatus=true

# ALIYUN OSS bucket info
bucketName=ali--cdn-shenzhen
key=
secret=

# auto create Bucket to default (HangZhou) zone, values true/false
# default value false
autoCreateBucket=false

## ALIYUN OSS URL
# The Oss Client Endpoind to auth, like http://oss-cn-shenzhen.aliyuncs.com/
ossCliendEndPoint=http://oss-cn-shenzhen.aliyuncs.com/

# ossEndPoint=http://ali--cdn.oss-cn-shenzhen.aliyuncs.com/
ossEndPoint=http://ali--cdn-shenzhen.oss-cn-shenzhen.aliyuncs.com/

## ALIYUN CDN URL
# Ueditor use or not use ALIYUN CDN, values true/false
# default value false, when useCDN=true, the cdnEndPoint will used.
useCDN=false
#cdnEndPoint=http(s)://cdn.xiexianbin.cn.w.kunlunar.com/
cdnEndPoint=

# Ueditor story or not story image to local direct, values true/false
# default value false
useLocalStorager=false

# default Ueditor upload base path, from config.json, when
# useLocalStorager=false, this values will work to delete upload 
# file, default value is "upload", unuse now.
#uploadBasePath=upload

# Ueditor use or not use asynchronous model to upload image to ALIYUN OSS
# default value false
useAsynUploader=false
```

### 技术支持

邮箱：me@xiexianbin.cn

QQ群：20038301


### 捐赠

本项目是个人业余时间开发和提供技术支持，欢迎捐赠！





