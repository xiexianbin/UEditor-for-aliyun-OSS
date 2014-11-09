package com.qikemi.packages.junit.alibaba.aliyun.oss;

import java.util.Properties;

import org.junit.Test;

public class FileJunit {

	@Test
	public void t(){
//		try {
//			File file = new File(new URI("http://bucketmy-bucket-nameamesdfswers.oss-cn-hangzhou.aliyuncs.com/upload/image/wechat.sql"));
//			BufferedReader reader = null;
//			reader = new BufferedReader(new FileReader(file));
//            String tempString = null;
//            int line = 1;
//            // 一次读入一行，直到读入null为文件结束
//            while ((tempString = reader.readLine()) != null) {
//                // 显示行号
//                System.out.println("line " + line + ": " + tempString);
//                line++;
//            }
//            reader.close();
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (URISyntaxException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Properties prop = System.getProperties();

		String os = prop.getProperty("os.name");
		System.out.println(os);

		if(os.startsWith("win") || os.startsWith("Win")){
			System.out.println("windows");
		}
	}
}
