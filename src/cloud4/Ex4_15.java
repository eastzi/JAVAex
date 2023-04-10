package cloud4;

public class Ex4_15 {

	public static void main(String[] args) {
		/*
		 양궁 국가 대표 선발전 결과가 아래와 같다.
		 	선수명	 득점 상황
			Kim	    10, 9, 9, 8
			Lee	     9, 10, 9, 9
			Park    10, 9, 10, 10
		
		 출력 예와 같은 결과를 얻도록, 코드를 완성하시오.
		 	Kim -> 36점
			Lee -> 37점
			Park -> 39점
		 */

		int[] point0 = {10, 9, 9, 8};
		int[] point1 = {9, 10, 9, 9};
		int[] point2 = {10, 9, 10, 10};
		 
		Player p0 = new Player("kim", point0);
		Player p1 = new Player("lee", point1);
		Player p2 = new Player("park", point2);
		
		Player[] players = {p0, p1, p2};
		
		for(int i = 0; i < players.length; i++) {
			players[i].printTotalPoints();
		}
	}

}

class Player {
	String name;
	int[] points;
	
	public Player(String name, int[] points) {
		this.name = name;
		this.points = points;
	}
	
	void printTotalPoints() {
		System.out.printf("%s -> %d점\n", name, totalPoints());
	}
	
	int totalPoints() {
		int sum = 0;
		for(int i = 0; i < points.length; i++) {
			sum += points[i];
		}
		return sum;
	}
	
}
