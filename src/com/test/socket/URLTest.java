package com.test.socket;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {

	public static void main(String[] args) {
		try {
			URL test = new URL("http://www.cnblogs.com:80");
			URL url = new URL(test, "/tianxintian22/p/6858724.html?a=1#test");
			System.out.println("协议：" + url.getProtocol());
			System.out.println("主机：" + url.getHost());
			System.out.println("端口：" + url.getPort());
			System.out.println("路径：" + url.getPath());
			System.out.println("文件名：" + url.getFile());
			System.out.println("查询字符串：" + url.getQuery());
			System.out.println("锚点：" + url.getRef());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}

}
