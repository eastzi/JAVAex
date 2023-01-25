package chapter4;

public class Ex4_3 {

	public static void main(String[] args) {
		int sum = 0; 
		int totalSum = 0;
		
		for(int i = 0; i < 11; i++) {
			sum = sum + i;
			totalSum = totalSum + sum;
		}
		
		System.out.println("totalSum = " + totalSum);
	}
}
