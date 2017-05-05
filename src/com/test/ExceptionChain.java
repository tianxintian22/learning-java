package com.test;

public class ExceptionChain {
	public static void main(String[] args) {
		ExceptionChain ec = new ExceptionChain();
		try {
			ec.test2();
			//ec.test3();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void test1() throws Exception {
		throw new Exception("抛出异常1");
	}
	public void test2() {
		try{
			test1();
		} catch (Exception e) {
			RuntimeException newExc = new RuntimeException("抛出异常2");
			newExc.initCause(e);
			throw newExc;
		}
		
	}
	public void test3() {
		try{
			test1();
		} catch (Exception e) {
			RuntimeException newExc = new RuntimeException(e);
			throw newExc;
		}
		
	}
}
