package chapter7;

class Outer2 {
	static class Inner2 {
		int iv = 200;
	}
}

public class Ex7_26 {

	public static void main(String[] args) {
		Outer2.Inner2 in2 = new Outer2.Inner2();
		System.out.println(in2.iv);
	}

}
