package com.test.concurrent;

/**
 * 大戏舞台
 * @author Administrator
 *
 */
public class Stage extends Thread {
	
	public void run() {
		System.out.println("欢迎观看...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("大戏正式开始");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
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
		
		
		System.out.println("正在激战，关键人物出场...");
		
		Thread MrCheng = new KeyPerson();
		MrCheng.setName("程先生");
		
		//停止军队作战
		//停止线程的方法
		armyTaskOfDynasty.keepRunning = false;
		armyTaskOfRevolt.keepRunning = false;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		//关键人物进程执行
		MrCheng.start();
		
		//所有线程等待程先生完成
		try {
			MrCheng.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("农民取得了胜利！");
		
		
	}
	
	public static void main(String[] args) {
		new Stage().start();
	}

}
