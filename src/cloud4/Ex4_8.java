package cloud4;

public class Ex4_8 {

	public static void main(String[] args) {
		/*
		 * 주어진 코드는 자전거 객체를 생성하고, 그 정보를 아래와 같이 출력한다.
		 * Bicycle { 부릉2, 21.74kg, 899000원 }
		 * Bicycle { 씽씽2, 12.57kg, 495000원 }
		 */
		Bicycle2 b1  = new Bicycle2("부릉2", 21.74, 899000);
		Bicycle2 b2  = new Bicycle2("씽씽2", 12.57, 495000);
		
		System.out.printf("Bicycle { %s, %.2fkg, %d원 }\n", b1.name, b1.weight, b1.price);
		System.out.printf("Bicycle { %s, %.2fkg, %d원 }\n", b2.name, b2.weight, b2.price);
	}

}

class Bicycle2 {
	  // 필드
	  String name;
	  double weight;
	  int price;
	  
	  // 생성자 - 파라미터를 통한 초기화
	  Bicycle2(String n, double w, int p) {
	    name = n;
	    weight = w;
	    price = p;
	  }
	}