package chapter4;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		//1~100 사이의 임의의 값을 answer에 저장
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		
		Scanner s = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요 :");
			input = s.nextInt();
			
			if(answer > input) {
				System.out.println("더 큰 숫자를 입력하세요.");
			}else if(answer < input) {
				System.out.println("더 작은 숫자를 입력하세요.");
			}else {
				System.out.println("맞췄습니다.");
				System.out.println("시도 횟수는" + count + "번 입니다.");
				break;
			}
		} while(true);

	}

}
