package com.baidu.ueditor.upload;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import com.baidu.ueditor.define.State;
import com.qikemi.packages.alibaba.aliyun.oss.properties.OSSClientProperties;
import com.qikemi.packages.baidu.ueditor.upload.AsynUploaderThreader;
import com.qikemi.packages.utils.SystemUtil;

public class Uploader {
	private static Logger logger = Logger.getLogger(Uploader.class);

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
			JSONObject stateJson = new JSONObject(state.toJSONString());
			// 判别云同步
			if (OSSClientProperties.useStatus) {
				AsynUploaderThreader asynThreader = new AsynUploaderThreader();
				asynThreader.init(stateJson);
				Thread uploadThreader = new Thread(asynThreader);
				uploadThreader.start();
				state.putInfo("url", OSSClientProperties.endPoint + stateJson.getString("url"));
			} else {
				state.putInfo("url", "/" + SystemUtil.getProjectName() + stateJson.getString("url"));
			}
		}
		/*
		 * { "state": "SUCCESS", "title": "1415236747300087471.jpg", "original":
		 * "a.jpg", "type": ".jpg", "url":
		 * "/upload/image/20141106/1415236747300087471.jpg", "size": "18827" }
		 */
		logger.debug(state.toJSONString());
		return state;
	}
}
