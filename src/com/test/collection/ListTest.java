package com.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 备选课程类
 * @author Administrator
 *
 */
public class ListTest {
	/**
	 * 用于存放备选课程的List
	 */
	public List coursesToSelect;
	public ListTest() {
		this.coursesToSelect = new ArrayList();
	}
	
	/**
	 * 用于向coursesToSelect中添加备选课程
	 */
	public void testAdd() {
		Course c1 = new Course("1", "数据结构");//创建课程对象的实例
		coursesToSelect.add(c1);//调用add方法，添加课程到备选课程List中
		Course temp = (Course) coursesToSelect.get(0);//对象存入集合都变成Object，忽略对象之前的类型，取出时需类型转换
		System.out.println("添加了课程：" + temp.id + ":" + temp.name);
		
		Course c2 = new Course("2", "C语言");
		coursesToSelect.add(0, c2);//List中重载的另一个add()方法，可指定元素所添加的位置
		Course temp2 = (Course) coursesToSelect.get(0);
		System.out.println("添加了课程：" + temp2.id + ":" + temp2.name);
		
		coursesToSelect.add(c1);//调用add方法，添加课程到备选课程List中
		Course temp0 = (Course) coursesToSelect.get(2);//对象存入集合都变成Object，忽略对象之前的类型，取出时需类型转换
		System.out.println("添加了课程：" + temp0.id + ":" + temp0.name);
		
		//以下方法会抛出数组下标越界异常
		//Course c3 = new Course("3", "Java");
		//coursesToSelect.add(4, c3);
		
		Course[] course = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) coursesToSelect.get(3);
		Course temp4 = (Course) coursesToSelect.get(4);
		System.out.println("添加了两门课程：" + temp3.id + ":" + temp3.name + 
				temp4.id + ":" + temp4.name);
		
		Course[] course2 = {new Course("5", "高等数学"), new Course("6", "网络技术")};
		coursesToSelect.addAll(2, Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);
		System.out.println("添加了两门课程：" + temp5.id + ":" + temp5.name + 
				temp6.id + ":" + temp6.name);
	}
	
	public void testIterator() {
		Iterator it = coursesToSelect.iterator();
		System.out.println("有以下课程可以选择：");
		while (it.hasNext()) {
			Course c = (Course) it.next();
			System.out.println("课程：" + c.id + ":" + c.name);
		}
	}
	
	public void testForEach() {
		System.out.println("有以下课程可以选择：(通过For Each)");
		for (Object obj : coursesToSelect) {
			Course c = (Course) obj;
			System.out.println("课程：" + c.id + ":" + c.name);
		}
	}
	
	public void testModify() {
		Course c = new Course("7", "毛概");
		coursesToSelect.set(4, c);
		testForEach();
	}
	
	public void testDelete() {
		/*coursesToSelect.remove(4);*/
		/*Course c = (Course) coursesToSelect.get(4);
		coursesToSelect.remove(c); */
		Course[] courses = {(Course) coursesToSelect.get(4), (Course) coursesToSelect.get(5)};
		coursesToSelect.removeAll(Arrays.asList(courses));
		System.out.println("=======删除了课程");
		testForEach();
	}
	
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.testAdd();
		lt.testIterator();
		lt.testModify();
		lt.testDelete();
	}
}
