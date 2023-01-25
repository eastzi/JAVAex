package chapter4;

public class Ex4_4 {

	public static void main(String[] args) {
		int sum = 0;
		int m = 1;
		int num = 0;
		
		for(int i = 1; sum < 100; i++, m = -m) {
			num = i * m;
			sum += num;
		}
		
		System.out.println("num = " + num);
		System.out.println("sum = " + sum);

	}

}
