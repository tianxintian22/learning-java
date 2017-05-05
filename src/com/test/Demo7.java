package com.test;
//import com.test.second.Telephone;

public class Demo7 {

	public static void main(String[] args) {
		Telephone phone = new Telephone();
		//phone.screen = 4.5;
		phone.setScreen(5.2);
		System.out.println(phone.getScreen());
		//phone.cpu = 1.2;
		//phone.mem = 6.0;
		phone.sendMessage();
		
		Telephone phone1 = new Telephone(5.0, 1.5, 4.0);
		phone1.sendMessage();
	}

}
