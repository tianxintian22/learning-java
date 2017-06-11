package com.test.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressTest {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("计算机名：" + address.getHostName());
		System.out.println("IP地址：" + address.getHostAddress());
		byte[] bytes = address.getAddress();
		System.out.println("字节数组形式的IP:" + Arrays.toString(bytes));
		System.out.println(address);
		
		InetAddress address2 = InetAddress.getByName("192.168.0.104");
		//InetAddress address2 = InetAddress.getByName("USER-20151129OL");
		System.out.println("计算机名：" + address2.getHostName());
		System.out.println("IP地址：" + address2.getHostAddress());
		System.out.println(Integer.toBinaryString(128));

	}

}
