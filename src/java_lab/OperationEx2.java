package java_lab;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		
		int lastScore2 = gameScore++;
		System.out.println(lastScore2);
		
		int lastScore3 = --gameScore;
		System.out.println(lastScore3);
		
		int lastScore4 = --gameScore;
		System.out.println(lastScore4);
		
		int lastScore5 = gameScore++;
		System.out.println(lastScore5);
		
		int lastScore6 = ++gameScore;
		System.out.println(lastScore6);
	}

}
