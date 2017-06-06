package com.test.concurrent;

class MyThread extends Thread {
	volatile int ticketCount = 5;
	private String name;
	
	public MyThread(String name) {
		this.name = name;
	}
	@Override
	public void run(){
		while(ticketCount > 0) {
			ticketCount--;
			System.out.println(name + "卖了一张票，还剩" + ticketCount + "张票");
		}
	}
}

public class TicketThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread("窗口1");
		MyThread mt2 = new MyThread("窗口2");
		MyThread mt3 = new MyThread("窗口3");
		mt.start();
		mt2.start();
		mt3.start();
	}
}
