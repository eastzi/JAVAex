package cloud4;

public class Ex4_7 {

	public static void main(String[] args) {
		/*
		 * 정사각형 클래스를 구현하려 한다.
		 * 이는 한 변의 길이를 가지며, 그 넓이를 반환할 수 있다.
		 * 한 변의 길이가 4인 정사각형의 넓이: 16
		 */

		Square s = new Square();
		s.length = 4;
		
		System.out.printf("한 변의 길이가 %s인 정사각형의 넓이: %d", s.length, s.area());
	}

}

class Square {
	int length;
	
	public int area() {
		return length * length;
	}
}