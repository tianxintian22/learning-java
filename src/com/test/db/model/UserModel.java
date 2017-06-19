package com.test.db.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test.db.DBUitl;

public class UserModel {
	public void addUser() {
		
	}
	public void updateUser() {
		
	}
	public void delUser() {
		
	}
	public List<Users> query() {
		List<Users> user = new ArrayList<Users>();
		Users u = null;
		try {
			Connection conn = DBUitl.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select user_name, age from test_users");
			while (rs.next()) {
				u = new Users();
				u.setUser_name(rs.getString("user_name"));
				u.setAge(rs.getInt("age"));
				
				user.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	public Users get() {
		return null;
	}
}
