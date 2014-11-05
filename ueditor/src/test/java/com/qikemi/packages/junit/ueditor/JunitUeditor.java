package com.qikemi.packages.junit.ueditor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JunitUeditor extends HttpServlet {
    private static final long serialVersionUID = -4500613200275499491L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	    throws ServletException, IOException {
	System.out.println("doGet");
	
	
	
//	super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	    throws ServletException, IOException {
	System.out.println("doPost");
	req.setCharacterEncoding("UTF-8");
	System.out.println(req.getParameter("myEditors"));
	
//	super.doPost(req, resp);
    }
}
