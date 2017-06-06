package com.test.concurrent;

class MyThread2 implements Runnable {

	volatile int ticketCount = 5;
	
	@Override
	public void run() {
		while(ticketCount > 0) {
			ticketCount--;
			System.out.println(Thread.currentThread().getName() + "卖了一张票，还剩" + ticketCount + "张票");
		}
	}
}

public class TicketRunnable {
	public static void main(String[] args) {
		MyThread2 mt = new MyThread2();
		Thread td = new Thread(mt, "窗口1");
		Thread td2 = new Thread(mt, "窗口2");
		Thread td3 = new Thread(mt, "窗口3");
		td.start();
		td2.start();
		td3.start();
	}
}
