package cloud4;

public class Ex4_16 {

	public static void main(String[] args) {
		/*
		 양궁 국가 대항전의 득점 현황은 아래와 같다.

			대한민국 선수단	득점 현황
			Kim	9, 8, 10
			Lee	10, 9, 10
			Park 8, 10, 9
			
			중국 선수단	득점 현황
			Xiao 10, 9, 10
			Yu	8, 9, 10
			Xui	8, 9, 9
			
		주어진 코드를 분석 및 수정하여, 출력 예와 같은 결과를 얻으시오.
			KOREA -> 83 points
			CHINA -> 82 points
		 */
		Player2 kim = new Player2("kim", new int[] {9, 8, 10});
		Player2 lee = new Player2("lee", new int[] {10, 9, 10});
		Player2 park = new Player2("kim", new int[] {9, 8, 10});
		
		Player2 xiao = new Player2("xiao", new int[] {10, 9, 10});
		Player2 yu = new Player2("yu", new int[] {8, 9, 10});
		Player2 xui = new Player2("xui", new int[] {8, 9, 9});
		
		Player2[] koreap = {kim, lee, park};
		Player2[] chinap = {xiao, yu, xui};
		
		Team korea = new Team("korea", koreap);
		Team china = new Team("china", chinap);
		
		korea.printTeamPoints();
		china.printTeamPoints();
	}

}

class Team {
	String nation;
	Player2[] players;
	
	public Team(String nation, Player2[] players) {
		this.nation = nation;
		this.players = players;
	}
	
	void printTeamPoints() {
		int sum = 0;
		for(int i = 0; i < players.length; i++) {
			sum += players[i].totalPoints();
		}
		System.out.printf("%s -> %d points\n", nation, sum);
	}
	
}

class Player2 {
	String name;
	int[] points;
	
	public Player2(String name, int[] points) {
		this.name = name;
		this.points = points;
	}
	
	int totalPoints() {
		int sum = 0;
		for(int i = 0; i < points.length; i++) {
			sum += points[i];
		}
		return sum;
	}
}