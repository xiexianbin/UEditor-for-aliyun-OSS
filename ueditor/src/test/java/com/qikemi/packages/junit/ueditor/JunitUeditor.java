package com.qikemi.packages.junit.ueditor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.qikemi.packages.utils.SystemUtil;

public class JunitUeditor extends HttpServlet {
	private static final long serialVersionUID = -4500613200275499491L;
	
	private static Logger logger = Logger.getLogger(JunitUeditor.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet");
		logger.info("getProjectName->"+SystemUtil.getProjectName());
		logger.info("getProjectClassesPath->"+SystemUtil.getProjectClassesPath());
		logger.info("getProjectRootPath->"+SystemUtil.getProjectRootPath());
		// super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doPost");
		req.setCharacterEncoding("UTF-8");
		System.out.println(req.getParameter("myEditors"));

		// super.doPost(req, resp);
	}
}
