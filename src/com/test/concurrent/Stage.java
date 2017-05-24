package com.test.concurrent;

/**
 * 大戏舞台
 * @author Administrator
 *
 */
public class Stage extends Thread {
	
	public void run() {
		//创建两支军队
		ArmyRunnable armyTaskOfDynasty = new ArmyRunnable();
		ArmyRunnable armyTaskOfRevolt = new ArmyRunnable();
		
		//创建线程
		Thread armyOfDynasty = new Thread(armyTaskOfRevolt, "隋军");
		Thread armyOfRevolt = new Thread(armyTaskOfRevolt, "农民起义军");
		
		//启动线程
		armyOfDynasty.start();
		armyOfRevolt.start();
		
		//舞台线程休眠
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		armyTaskOfDynasty.keepRunning = false;
		armyTaskOfRevolt.keepRunning = false;
		
		try {
			armyOfRevolt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Stage().start();
	}

}
