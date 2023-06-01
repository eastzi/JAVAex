package java_lab;

public class Taxi {
	int passengerCount;
	int money;
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("택시 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다." );
	}
}
