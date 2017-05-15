package com.test.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSerialzeTest {
	/**
	 * 对象的序列化
	 * @param file
	 * @throws Exception
	 */
	public void ObjectOutput (String file) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		Student stu = new Student("002", "张四", 12);
		oos.writeObject(stu);
		oos.flush();
		oos.close();
	}
	/**
	 * 对象的反序列化
	 * @param file
	 * @throws Exception
	 */
	public void ObjectInput(String file) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Student stu =  (Student)ois.readObject();
		System.out.println(stu.toString());
		ois.close();
	}

	public static void main(String[] args)  throws Exception {
		String file = "F:\\javaio\\obj.dat";
		ObjectSerialzeTest ost = new ObjectSerialzeTest();
		ost.ObjectOutput(file);
		ost.ObjectInput(file);
		
	}

}
