package java_lab;

public class CarTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		CarFactory factory2 = CarFactory.getInstance();
		System.out.println(factory == factory2);
		
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
	}

}
