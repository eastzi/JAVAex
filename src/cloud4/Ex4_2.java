package cloud4;

public class Ex4_2 {

	public static void main(String[] args) {
		/*
		 * 네로는 3살 된 페르시안 고양이다. 주어진 코드를 통해 이를 출력하려 한다. 
		 * 이름: 네로
		 * 품종: 페르시안
		 * 나이: 3
		 */
		Cat c = new Cat();
		
		c.name = "네로";
		c.breeds = "페르시안";
		c.age = 3;
		
		System.out.printf("이름: %s\n", c.name);
	    System.out.printf("품종: %s\n", c.breeds);
	    System.out.printf("나이: %s\n", c.age);
	}

}

class Cat {
	String name;
	String breeds;
	int age;
	
	void claw() {
		System.out.println("할퀴기!!");
	}
	  
	void meow() {
		System.out.println("야옹~");
	}
}
