package cloud4;

public class Ex4_1 {

	public static void main(String[] args) {
		/*
     	주어진 코드는 두 개의 클래스, Main과 Dog로 이루어져있다. 
		아래의 클래스 다이어그램을 참조하여 Dog 클래스를 완성하고, 
		출력 예와 같은 결과를 얻으시오.
		이름: null
		품종: null
		나이: 0
		*/
		
		Dog d = new Dog();
		
		System.out.printf("이름: %s\n", d.name);
		System.out.printf("품종: %s\n", d.breeds);
		System.out.printf("나이: %s\n", d.age);
		
	}

}

class Dog {
	String name;
	String breeds;
	int age;
	
	void wag() {
		System.out.println("꼬리치기");
	}
	
	void bark() {
		System.out.println("짖기");
	}
}
