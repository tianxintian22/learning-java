package com.test.db.controller;

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
	}
}
