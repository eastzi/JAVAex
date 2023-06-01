package java_lab;

public class Function {

	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 10; 
		
		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum);
		
		int sum2 = substract(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + sum2);
		
		int sum3 = multiply(num1, num2);
		System.out.println(num1 + " * " + num2 + " = " + sum3);
		
		int sum4 = division(num1, num2);
		System.out.println(num1 + " / " + num2 + " = " + sum4);
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result; 
	}
	
	public static int substract(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int multiply(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public static int division(int n1, int n2) {
		int result = n1 / n2; 
		return result;
	}

}
