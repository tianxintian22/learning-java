package com.test.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 使用URL读取网页内容
 * @author Administrator
 *
 */
public class OpenStreamTest {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.cnblogs.com/tianxintian22/p/6858724.html");
			//获取URL对象所表示的资源的字节输入流
			InputStream is = url.openStream();
			//字节输入流转换为字符输入流
			InputStreamReader isr = new InputStreamReader(is);
			//为字符流添加缓冲
			BufferedReader br = new BufferedReader(isr);
			String data;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
