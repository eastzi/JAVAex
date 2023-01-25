package chapter4;

public class Ex4_1 {

	public static void main(String[] args) {
		//1.
		int x = 11;
		if(10 < x && x < 20) {
			System.out.println("x : " + true);
		}else {
			System.out.println("x : " + false);
		}
		
		//2. 
		char ch = 'a';
		if(!(ch == ' ' || ch == '\t')) {
			System.out.println("ch : " + true);
		}else {
			System.out.println("ch : " + false);
		}
		
		//3. 
		char ch2 = 'x';
		if(ch2 == 'x' || ch2 == 'X') {
			System.out.println("ch2 : " + true);
		}
		
		//4. 
		char ch3 = '5';
		if('0' <= ch3 && ch3 <= '9') {
			System.out.println("ch3 : " + true);
		}else {
			System.out.println("ch3 : " + false);
		}
		
		//5. 
		char ch4 = 'a';
		if(('a' <= ch4 && ch4 <= 'z') 
				|| ('A' <= ch4 && ch4 <= 'Z')) {
			System.out.println("ch4 : " + true);
		}
		
		//6. 
		int year = 5000;
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("year : " + true);
		}else {
			System.out.println("year : " + false);
		}
		
		//7. 
		boolean powerOn = false;
		if(!powerOn || powerOn == false) {
			System.out.println("powerOn : " + true);
		}
		
		//8.
		String str = "yes";
		if(str.equals("yes") || str.equals(str)) {
			System.out.println("str : " + true);
		}
	}

}
