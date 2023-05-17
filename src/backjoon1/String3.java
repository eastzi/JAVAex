package backjoon1;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			int j = s.length();
			String a = String.valueOf(s.charAt(0));
			String b = String.valueOf(s.charAt(j-1));
			
			System.out.println(a+b);
		}
	}

}
