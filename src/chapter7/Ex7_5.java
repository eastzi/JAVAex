package chapter7;

class Product {
	int price; 
	int bonusPoint; 
	
	Product() {

	}
	
	Product(int price) {
		this.price = price; 
		bonusPoint = (int)(price / 10.0); 
	}
}

class Tv extends Product {
	Tv() {}
	
	public String toString() {
		return "Tv";
	}
}

public class Ex7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
