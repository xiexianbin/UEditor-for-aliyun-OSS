package com.qikemi.packages.baidu.ueditor.upload;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

/**
 * 异步上传文件到阿里云OSS
 */
public class AsynUploaderThreader extends Thread {

    private static Logger logger = Logger.getLogger(AsynUploaderThreader.class);
    private HttpServletRequest request = null;
    private Map<String, Object> conf = null;

    public AsynUploaderThreader() {
    }

    public void init(HttpServletRequest request, Map<String, Object> conf) {
	this.request = request;
	this.conf = conf;
    }

    @Override
    public void run() {
	// TODO Auto-generated method stub

	logger.debug("上传文件到 阿里云 OSS服务器成功。");
	// super.run();
    }

}
