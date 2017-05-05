package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest {

	/**
	 * Integer泛型的List进行排序
	 */
	public void testSort1(){
		List<Integer> integerList = new ArrayList<Integer>();
		//插入10个100以内不重复的随机整数
		Random random = new Random();
		Integer num;
		for (int i = 0; i < 10; i++) {
			do {
				num = random.nextInt(100);
			} while(integerList.contains(num));
			integerList.add(num);
			System.out.println("成功插入整数：" + num);
		}
		System.out.println("==============排序前=============");
		for (Integer integer : integerList) {
			System.out.print(integer + " ");
		}
		System.out.println("");
		//调用Collections.sort()方法排序
		Collections.sort(integerList);
		System.out.println("==============排序后=============");
		for (Integer integer : integerList) {
			System.out.print(integer + " ");
		}
	}
	/**
	 * String泛型的List进行排序
	 */
	public void testSort2() {
		List<String> stringList = new ArrayList<String>();
		//添加3个乱序的String元素
		stringList.add("google");
		stringList.add("lenovo");
		stringList.add("baidu");
		System.out.println("==============排序前=============");
		for (String string : stringList) {
			System.out.println(string);
		}
		Collections.sort(stringList);
		System.out.println("==============排序后=============");
		for (String string : stringList) {
			System.out.println(string);
		}
	}
	
	public void testSort3() {
		List<Student> studentList = new ArrayList<Student>();
		Student st1 = new Student("32", "tom");
		Student st2 = new Student("22", "jack");
		Student st3 = new Student("43", "xiaoming");
		studentList.add(st1);
		studentList.add(st2);
		studentList.add(st3);
		System.out.println("==============排序前=============");
		for (Student st : studentList) {
			System.out.println("学生id：" + st.id + "，姓名：" + st.name);
		}
		Collections.sort(studentList);
		System.out.println("==============排序后=============");
		for (Student st : studentList) {
			System.out.println("学生id：" + st.id + "，姓名：" + st.name);
		}
	}
	
	public static void main(String[] args) {
		CollectionsTest ct = new CollectionsTest();
		//ct.testSort1();
		//ct.testSort2();
		ct.testSort3();
	}

}
