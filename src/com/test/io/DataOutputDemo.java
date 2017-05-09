package com.test.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputDemo {

	public static void main(String[] args) throws IOException {
		String file = "F:\\javaio\\b.txt";
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
		dos.writeInt(10);
		dos.writeInt(-10);
		dos.writeLong(10l);
		dos.writeDouble(10.5);
		dos.writeUTF("你好");
		dos.writeChars("中国");
		dos.close();
		IOUtils.printHex(file);
	}

}
