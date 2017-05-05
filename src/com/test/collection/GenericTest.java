package com.test.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
	public List<Course> courses;
	
	public GenericTest() {
		courses = new ArrayList<Course>();
	}
	
	public void testAdd() {
		Course c1 = new Course("1", "大学物理");
		courses.add(c1);
		//泛型集合中，不能添加泛型规定的类型及其子类型以外的对象，否则会报错！
		//courses.add("能否添加一些奇怪的东西？");
		Course c2 = new Course("2", "复变函数");
		courses.add(c2);
	}
	
	public void testChild() {
		Course c1 = new ChildCourse();
		c1.id = "3";
		c1.name = "信号与系统";
		courses.add(c1);
	}
	
	public void testBasicType(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		System.out.println("基本数据类型必须使用包装类作为泛型！" + list.get(0));
	}
	
	public void testForEach() {
		for (Course c : courses) {
			System.out.println("课程：" + c.id + ":" + c.name);
		}
	}

	public static void main(String[] args) {
		GenericTest g = new GenericTest();
		g.testAdd();
		g.testForEach();
		g.testChild();
		g.testForEach();
		g.testBasicType();
	}

}
