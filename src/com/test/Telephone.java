package com.test;

public class Telephone {
	private double screen;
	private double cpu;
	private double mem;
	public double getScreen() {
		return screen;
	}
	public void setScreen(double newScreen) {
		screen = newScreen;
	}
	public Telephone(){
		System.out.println("com.test.Telephone无参数的构造方法");
	}
	public Telephone(double screen, double newSpu, double newMem){
		this.screen = screen;
		cpu = newSpu;
		mem = newMem;
		System.out.println("有参数的构造方法");
	}
	public void sendMessage() {
		System.out.println("screen:" + screen + ";cup:" + cpu + ";mem:" + mem);
	}
}
