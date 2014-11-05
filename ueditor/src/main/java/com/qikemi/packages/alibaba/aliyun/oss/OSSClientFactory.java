package com.qikemi.packages.alibaba.aliyun.oss;

import org.apache.log4j.Logger;

import com.aliyun.openservices.oss.OSSClient;
import com.qikemi.packages.alibaba.aliyun.oss.properties.OSSClientProperties;

/**
 * OSSClient是OSS服务的Java客户端，它为调用者提供了一系列的方法，用于和OSS服务进行交互<br>
 * 
 * @create date : 2014年10月28日 上午11:20:56
 * @Author XieXianbin<a.b@hotmail.com>
 * @Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class OSSClientFactory {

	private static Logger logger = Logger.getLogger(OSSClientFactory.class);
	
	/**
	 * 新建OSSClient 
	 * 
	 * @return
	 */
	public static OSSClient createOSSClient(){
		OSSClient client = new OSSClient(OSSClientProperties.key, OSSClientProperties.secret);
		return client;
	}
	
}
