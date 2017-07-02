package com.test.db.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.test.db.DBAccess;

public class UserDao {
	public List<Users> query(){
		DBAccess dbAccess = new DBAccess();
		List<Users> usersList = new ArrayList<Users>();
		SqlSession sqlSession = null;
		try {
			sqlSession = dbAccess.getSqlSesstion();
			usersList = sqlSession.selectList("User.queryUsersList");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return usersList;
	}
	
	public static void main(String[] args) {
		System.out.println("111");
		UserDao userDao = new UserDao();
		List<Users> users = userDao.query();
		for (int i = 0;i < users.size(); i++) {
			System.out.println(users.get(i).toString());
		}
		
	}
}
