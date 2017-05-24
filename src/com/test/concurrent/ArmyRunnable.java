package com.test.concurrent;

/**
 * 军队线程
 * 模拟双方作战的行为
 */
public class ArmyRunnable implements Runnable {

	//volatile保证了线程可以正确读取其他线程写入的值
	volatile boolean keepRunning = true;

	@Override
	public void run() {
		while(keepRunning) {
			//发动五连击
			for (int i = 0; i < 5 ; i++) {
				System.out.println(Thread.currentThread().getName() + "进攻对方[" + i + "]");
			}
			//暂停
			Thread.yield();
		}
		System.out.println(Thread.currentThread().getName() + "结束了战斗");
	}

}
