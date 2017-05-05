package com.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	public List<Course> coursesToSelect;
	private Scanner console;
	public static Student student;
	public SetTest() {
		coursesToSelect = new ArrayList<Course>();
		console = new Scanner(System.in);
	}
	public void testAdd() {
		Course c1 = new Course("1", "数据结构");//创建课程对象的实例
		Course c2 = new Course("2", "C语言");
		Course c3 = new Course("3", "离散数学");
		Course c4 = new Course("4", "汇编语言");
		Course c5 = new Course("5", "数据结构");
		Course[] course = {c1, c2, c3, c4, c5};
		coursesToSelect.addAll(Arrays.asList(course));
	}
	
	public void testForEach() {
		System.out.println("有以下课程可以选择：(通过For Each)");
		for (Object obj : coursesToSelect) {
			Course c = (Course) obj;
			System.out.println("课程：" + c.id + ":" + c.name);
		}
	}

	/**
	 * 测试List 的contains()方法
	 */
	public void testListContains() {
		/*Course c = coursesToSelect.get(0);
		System.out.println("取得课程：" + c.name);
		System.out.println("课程【" + c.name + "】是否在备选课程中：" + coursesToSelect.contains(c));
		
		Course c2 = new Course(c.id, c.name);
		System.out.println("新创建课程：" + c2.name);
		System.out.println("课程【" + c2.name + "】是否在备选课程中：" + coursesToSelect.contains(c2));
		*/
		System.out.println("请输入课程名称：");
		String courseName = console.next();
		Course c3 = new Course();
		c3.name = courseName;
		System.out.println("课程【" + c3.name + "】是否在备选课程中：" + coursesToSelect.contains(c3));
		if (coursesToSelect.contains(c3)) {
			System.out.println("课程：" + c3.name + "第一次出现的索引位置为：" + coursesToSelect.indexOf(c3));
			System.out.println("课程：" + c3.name + "最后一次出现的索引位置为：" + coursesToSelect.lastIndexOf(c3));
		}
	}
	
	/*
	 * 创建学生并选课
	 */
	public void createStudentAndSelectCourse() {
		student = new Student("1", "李雷");
		
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入课程编号：");
			String courseId = console.next();
			for(Course c : coursesToSelect ) {
				if (c.id.equals(courseId)) {
					student.courses.add(c);
				}
			}
		}
	}
	
	public void testForEachForSet(Student student) {
		System.out.println("共选择了" + student.courses.size() + "门课程！");
		for (Course c : student.courses) {
			System.out.println("选择了课程：" + c.id + ":" + c.name);
		}
	}
	/**
	 * 测试Set的contains()方法
	 */
	public void testSetContains() {
		System.out.println("请输入课程名称：");
		String courseName = console.next();
		Course c = new Course();
		c.name = courseName;
		System.out.println("所选择的课程中是否包含" + courseName + ":" + student.courses.contains(c));
		
	}
	
	public static void main(String[] args) {
		SetTest st = new SetTest();
		st.testAdd();
		st.testForEach();
		st.testListContains();
		//st.createStudentAndSelectCourse();
		//st.testForEachForSet(SetTest.student);
		//st.testSetContains();
	}
}
