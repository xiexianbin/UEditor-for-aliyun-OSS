package com.baidu.ueditor.upload;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.baidu.ueditor.define.State;
import com.qikemi.packages.alibaba.aliyun.oss.properties.OSSClientProperties;
import com.qikemi.packages.baidu.ueditor.upload.AsynUploaderThreader;

public class Uploader {
	private HttpServletRequest request = null;
	private Map<String, Object> conf = null;

	public Uploader(HttpServletRequest request, Map<String, Object> conf) {
		this.request = request;
		this.conf = conf;
	}

	public final State doExec() {
		String filedName = (String) this.conf.get("fieldName");
		State state = null;

		if ("true".equals(this.conf.get("isBase64"))) {
			state = Base64Uploader.save(this.request.getParameter(filedName),
					this.conf);
		} else {
			state = BinaryUploader.save(this.request, this.conf);
			// 判别云同步 
			if(OSSClientProperties.useStatus){
        			AsynUploaderThreader asynThreader = new AsynUploaderThreader();
        			asynThreader.init(state.toJSONString());
        			Thread uploadThreader = new Thread(asynThreader);
        			uploadThreader.start();
			}
		}
		/* {
		 * 	"state": "SUCCESS",
		 * 	"title": "1415236747300087471.jpg",
		 * 	"original": "a.jpg",
		 * 	"type": ".jpg",
		 * 	"url": "/upload/image/20141106/1415236747300087471.jpg",
		 * 	"size": "18827"
		 * }
		*/
		return state;
	}
}
