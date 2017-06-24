package com.test.db.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.test.db.model.UserModel;
import com.test.db.model.Users;

public class UserController {
	public void add(Users user) {
		UserModel u = new UserModel();
		u.addUser(user);
	}
	
	public Users get(Integer id) {
		UserModel u = new UserModel();
		return u.get(id);
	}
	
	public void edit(Users user) {
		UserModel u = new UserModel();
		u.updateUser(user);
		
	}
	
	public void del(Integer id) {
		UserModel u = new UserModel();
		u.delUser(id);
	}
	
	public List<Users> query() {
		UserModel u = new UserModel();
		return u.query();
	}
	
	public List<Users> query(List<Map<String, Object>> params) {
		UserModel u = new UserModel();
		return u.query(params);
	}
	
	
	public static void main(String[] args) {
		UserController control = new UserController();
		
		//带参数查询
		List<Map<String, Object>> params = new ArrayList<Map<String, Object>>();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("name", "user_name");
		param.put("rela", "=");
		param.put("value", "'小水'");
		params.add(param);
		param = new HashMap<String, Object>();
		param.put("name", "create_date");
		param.put("rela", "=");
		param.put("value", "'2015-01-08'");
		params.add(param);
		List<Users> users1 = control.query(params);
		System.out.println("姓名小水、创建日期2015-01-08的用户：");
		for (int i = 0; i < users1.size(); i++) {
			System.out.println(users1.get(i).toString());
		}
		
		//新增
		Users user = new Users();
		user.setUser_name("小秋");
		user.setAge(18);
		user.setSex(1);
		user.setMobile("13266666666");
		user.setEmail("xiaoqiu@163.com");
		user.setBirthday(new Date());
		user.setCreate_user("admin");
		user.setUpdate_user("admin");
		user.setIsdel(0);
		user.setId(8);
		control.add(user);
		
		//修改
		Users user1 = new Users();
		user1.setUser_name("小夏");
		user1.setAge(21);
		user1.setSex(1);
		user1.setMobile("13111111122");
		user1.setEmail("xiaoxia@163.com");
		user1.setBirthday(new Date());
		user1.setUpdate_user("admin");
		user1.setIsdel(0);
		user1.setId(7);
		//control.edit(user1);
		
		//查询
		List<Users> users = control.query();
		System.out.println("所有用户：");
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).toString());
		}
		
		//查询某个用户的信息：
		Users user2 = control.get(8);
		System.out.println("id为8的用户："+ user2.toString());
	}
}
