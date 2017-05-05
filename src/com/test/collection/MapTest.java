package com.test.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	public Map<String, Student> students;
	public Scanner console;
	public MapTest() {
		this.students = new HashMap<String, Student>();
		this.console = new Scanner(System.in);
	}
	
	/**
	 * 添加
	 */
	public void testPut(){
        for (int i = 0; i < 3; i++) {
            System.out.println("输入学生ID：");
            String studentId = console.next();
            //判断该ID是否被占用
            Student st = students.get(studentId);
            if (st == null) {
                //提示输入学生姓名
                System.out.println("输入学生姓名：");
                String studentName = console.next();
                //创建学生对象
                Student newStudent = new Student(studentId, studentName);
                //通过调用students的put方法，添加ID-学生映射
                students.put(studentId, newStudent);
                System.out.println("成功添加学生：" + students.get(studentId).name);
            } else {
                System.out.println("该学生ID被占用");
                continue;
            }
        }
    }
	/**
	 * 通过keySet方法遍历Map
	 */
    public void testKeySet() {
        //通过keySet方法，返回Map中所有“键”的Set集合
        Set<String> keySet = students.keySet();
        //获得students的容量
        System.out.println("总共有" + students.size() + "个学生");
        //遍历keySet，取得每一个键，再调用get方法取得每一个键对应的value
        for (String stuId : keySet) {
            Student st = students.get(stuId);
            if (st != null) {
                System.out.println("学生：" + st.name);
            }
        } 
    }
	/**
	 * 删除
	 */
	public void testRemove() {
		while (true) {
			System.out.println("请输入要删除学生的ID：");
			String studentId = console.next();
			Student st = students.get(studentId);
			if (st == null) {
				System.out.println("该学生ID不存在");
				continue;
			}
			students.remove(studentId);
			System.out.println("成功删除学生：" + st.name);
			break;
		}
	}
	/**
	 * 通过entrySet方法遍历Map
	 */
	public void testEntrySet() {
		Set<Entry<String, Student>> entrySet = students.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("key值为：" + entry.getKey());
			System.out.println("对应的value为：" + entry.getValue().name);
		}
	}
	
	/**
	 * 测试Map中，是否包含某个Key值或某个Value值
	 * @param args
	 */
	public void testContainsKeyOrValue() {
		System.out.println("请输入学生ID：");
		String stuId = console.next();
		System.out.println("是否有ID为" + stuId + "的学生:" + students.containsKey(stuId));
		if (students.containsKey(stuId)) {
			System.out.println("ID为" + stuId + "的学生的名字是：" + students.get(stuId).name);
		}
		System.out.println("请输入学生的姓名：");
		String stuName = console.next();
		Student st = new Student(null, stuName);
		System.out.println("是否有姓名为" + stuName + "的学生：" + students.containsValue(st));

	}

	public static void main(String[] args) {
		MapTest mt = new MapTest();
		mt.testPut();
		//mt.testKeySet();
		//mt.testRemove();
		//mt.testEntrySet();
		mt.testContainsKeyOrValue();
	}
}
