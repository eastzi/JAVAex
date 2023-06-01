package java_lab;

public class Car2Test {

	public static void main(String[] args) {
		System.out.println("========자율주행========");
		Car2 myCar = new AICar();
		myCar.run();
		
		System.out.println("========사람운전========");
		Car2 hisCar = new ManualCar();
		hisCar.run();
	}

}
