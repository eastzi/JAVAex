package java_lab;

public class IfEx3 {

	public static void main(String[] args) {
		int score = 90;
		char grade;
		
		if(score < 101 || score > 89) {
			grade = 'A';
		}else if(score < 90 || score > 79) {
			grade = 'B';
		}else if(score < 80 || score > 69) {
			grade = 'C';
		}else if(score < 70 || score > 59) {
			grade = 'D';
		}else {
			grade = 'F'; 
		}
		
		System.out.println("성적은 " + score + "점, " + grade + "입니다.");
	}
}
