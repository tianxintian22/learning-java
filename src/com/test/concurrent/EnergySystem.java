package com.test.concurrent;

public class EnergySystem {
	//能量盒子，能量存储的地方
	private final double[] energyBoxes;
	private final Object lockObj = new Object();
	
	/**
	 * 
	 * @param n 能量盒子的数量
	 * @param initialEnergy 每个能量盒子初始化含有的能量值
	 */
	public EnergySystem(int n, double initialEnergy) {
		energyBoxes = new double[n];
		for (int i = 0; i < energyBoxes.length; i++) {
			energyBoxes[i] = initialEnergy;
		}
	}
	/**
	 * 能量的转移，从一个盒子到另一个盒子
	 * @param from 能量源
	 * @param to 能量终点
	 * @param amount 能量值
	 */
	public void transfer(int from, int to, double amount) {
		//通过synchronized 关键字来实现互斥，synchronized既可以出现在方法之上，也能以块的形式出现在方法体之中
		//通过对lockObj加锁实现互斥
		//加锁操作是有开销的，多次加锁操作会降低系统的性能
		synchronized (lockObj) {
//			if (energyBoxes[from] < amount) {
//				return ;
//			}
			//while循环，保证条件不满足时任务都会被条件阻挡，而不是继续竞争CPU资源
			while (energyBoxes[from] < amount) {
				try {
					//条件不满足，将当前线程放入锁对象（lockObj）上的wait set
					//wait set 是线程的休息室
					lockObj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName());
			energyBoxes[from] -= amount;
			System.out.printf("从%d转移%10.2f单位能量到%d", from, amount, to);
			energyBoxes[to] += amount;
			System.out.printf("能量总和：%10.2f%n",getTotalEnergies());
			
			//唤醒所有在lockObj对象上等待的线程
			lockObj.notifyAll();
		}
		
	}
	/**
	 * 获取能量世界的能量总和
	 * @return sum
	 */
	public double  getTotalEnergies() {
		double sum = 0;
		for (double amount : energyBoxes) {
			sum += amount;
		}
		return sum;
	}
	/**
	 * 返回能量盒子的长度
	 * @return
	 */
	public int getBoxAmount(){
		return energyBoxes.length;
	}
	
}
