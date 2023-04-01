package cloud4;

public class Ex4_10 {

	public static void main(String[] args) {
		/*
		 * 주어진 코드가 실행되지 않는 이유를 분석하고 수정하여, 
		 * 출력 예와 같은 결과를 얻으시오.
		 * Drink { name: 포카리, price: 1000 }
		 * Drink { name: 박카스, price: 800 }
		 */
		Drink d1 = new Drink();
		Drink d2 = new Drink("박카스", 800);
		
		d1.name = "포카리";
		d1.price = 1000;

		System.out.println(d1.toStr());
		System.out.println(d2.toStr());
		
	}

}

class Drink {
	// 필드
	String name;
	int price;
	  
	/* 1. 디폴트 생성자를 추가하세요. */
	Drink() {
		
	}
	
	// 생성자
	Drink(String n, int p) {
		name = n;
		price = p;
	}
	  
	// 메소드
	String toStr() {
		return String.format("Drink { name: %s, price: %d }", name, price);
	}
}