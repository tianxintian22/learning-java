package com.test.db.controller;

import java.util.Date;
import java.util.List;

import com.test.db.model.UserModel;
import com.test.db.model.Users;

public class UserController {
	public static void main(String[] args) {
		UserModel userModel = new UserModel();
		List<Users> users = userModel.query();
		for (Users user : users) {
			System.out.println(user.getUser_name() + "," + user.getAge());
		}
		
		Users user = new Users();
		user.setUser_name("小夏");
		user.setAge(21);
		user.setSex(1);
		user.setMobile("13111111111");
		user.setEmail("xiaoxia@163.com");
		user.setBirthday(new Date());
		user.setCreate_user("admin");
		user.setCreate_date(new Date());
		user.setUpdate_user("admin");
		user.setCreate_date(new Date());
		user.setIsdel(0);
		user.setId(8);
		
		//userModel.addUser(user);
		//userModel.updateUser(user);
		//userModel.delUser(8);
		Users user1 = userModel.get(2);
		System.out.println(user1.toString());

	}
}
