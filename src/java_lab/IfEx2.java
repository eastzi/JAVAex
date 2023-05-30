package java_lab;

public class IfEx2 {

	public static void main(String[] args) {
		int age = 62;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("취한 전 아동");
		}else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생");
		}else if(age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생");
		}else if(age > 60) {
			charge = 0;
			System.out.println("경로우대");
		}else {
			charge = 3000;
			System.out.println("일반인");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
		
	}

}
