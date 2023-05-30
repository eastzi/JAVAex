package java_lab;

public class ForEx2 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i < 11; i++) {
			System.out.println("안녕하세요 " + i);
			sum += i;
		}
		
		System.out.println(sum);
	}

}
