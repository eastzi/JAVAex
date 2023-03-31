package cloud4;

public class Ex4_3 {

	public static void main(String[] args) {
		/*
		 * 주어진 코드는 Bicycle 객체 b1을 생성하고 그 정보를 출력하는 코드이다. 
		 * 해당 코드를 수정하여, 출력 예와 같은 결과를 얻으시오.
		 * b1->{로드형 자전거, 7.25, 326000}
		 * b2->{산악형 자전거, 10.68, 429000}
		 */
		Bicycle b1 = new Bicycle();
		Bicycle b2 = new Bicycle();
		
		b1.name = "로드형 자전거";
		b1.weight = 7.25;
		b1.price = 326000;
		
		b2.name = "산악형 자전거";
		b2.weight = 10.68;
		b2.price = 429000;
		
		System.out.printf("b1->{%s, %.2f, %d}\n", b1.name, b1.weight, b1.price);
		System.out.printf("b2->{%s, %.2f, %d}\n", b2.name, b2.weight, b2.price);
	}

}

class Bicycle {
	/* 필드 */
	String name;    // 이름
	double weight;  // 무게
	int price;      // 가격
	
	/* 메소드 */
	void move() {
		System.out.println("자전거를 타고 이동합니다.");
	}
	  
	void horn() {
		System.out.println("따르르릉! 지나갈게요~");
	}
}
