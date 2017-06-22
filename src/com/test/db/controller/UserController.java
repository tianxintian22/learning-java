package com.test.db.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.test.db.model.UserModel;
import com.test.db.model.Users;

public class UserController {
	public static void main(String[] args) {
		UserModel userModel = new UserModel();
		//List<Users> users = userModel.query();
		//List<Users> users = userModel.query("小");
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
		List<Users> users = userModel.query(params);
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).toString());
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
		//Users user1 = userModel.get(2);
		//System.out.println(user1.toString());

	}
}
