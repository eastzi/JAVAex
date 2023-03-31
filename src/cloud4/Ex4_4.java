package cloud4;

public class Ex4_4 {

	public static void main(String[] args) {
		/*
		 * 주어진 코드는 고양이 객체에게 meow() 메소드를 수행토록 명령하여,
		 * 아래와 같은 결과를 출력한다.
		 * claw() 메소드를 완성 및 호출하여, 출력 예와 같은 결과를 얻으시오.
		 * 야옹~
		 * 야옹~
		 * 할퀴기!! 슥샥!
		 * 할퀴기!! 슥샥!
		 */
		
		Cat2 cat1 = new Cat2(); 
		Cat2 cat2 = new Cat2(); 
		
		cat1.meow();
		cat2.meow();
		
		cat1.claw();
		cat2.claw();
	}

}

class Cat2 {
	/* 필드(상태) */
	String name;    // 이름
	String breeds;  // 품종
	int age;        // 나이
	  
	/* 메소드(동작) */
	void meow() {
		System.out.println("야옹~");
	}
	  
	void claw() {
	/* 2. 할퀴기 메소드를 완성하시오. */
		System.out.println("할퀴기!! 슥샥!");
	}
}