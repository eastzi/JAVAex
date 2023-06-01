package java_lab;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.age = 40;
		p.name = "James";
		p.isMarried = true;
		p.numOfChild = 3;
		
		System.out.println("나이 : " + p.age);
		System.out.println("이름 : " + p.name);
		System.out.println("결혼 : " + p.isMarried);
		System.out.println("자녀 : " + p.numOfChild);
	}

}
