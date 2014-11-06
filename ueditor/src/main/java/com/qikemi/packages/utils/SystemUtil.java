package com.qikemi.packages.utils;

/**
 * System Utils 
 * 
 * @create date : 2014年10月28日 上午9:13:10
 * @Author XieXianbin<a.b@hotmail.com>
 * @Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class SystemUtil {

	private static String rootPath = null;
	private static String classesPath = null;
	
	/**
	 * GET Project Root Path 
	 * @return
	 * 		/var/opt/tomcat/../project_name/
	 */
	public static String getProjectRootPath(){
		if(rootPath == null){
			String classesPath = SystemUtil.class.getClassLoader().getResource("").getPath().replaceFirst("/", "").trim();
			// java
			if(classesPath.endsWith("build/classes/")) {
				rootPath = classesPath.replace("build/classes/", "");
			}else if(classesPath.endsWith("WEB-INF/classes/")){
				// java web 
				rootPath = classesPath.replace("WEB-INF/classes/", "");
			}
		}
		return rootPath;
	}
	
	/**
	 * 获取系统编译文件的路径 
	 * @return
	 */
	public static String getProjectClassesPath(){
		if(classesPath == null){
		    classesPath = SystemUtil.class.getClassLoader().getResource("").getPath().replaceFirst("/", "").trim();
		}
		return classesPath;
	}
	
//	public static void main(String[] args) {
//		System.out.println(getProjectRootPath());
//	}
}