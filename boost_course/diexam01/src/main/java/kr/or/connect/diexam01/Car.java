package kr.or.connect.diexam01;

public class Car {
	private Engine v8;
	
	public Car() {
		System.out.println("init Car!");
	}
	
	public void setEngine(Engine e) {
		this.v8 = e;
	}
	
	public void run() {
		v8.exec();
		System.out.println("car is running");
	}
}
