package cloud4;

public class Ex4_9 {

	public static void main(String[] args) {
		/*
		 * 아래와 같은 4개의 Hero 객체를 생성하고, 이들에 대한 정보를 출력하려 한다. 
		 * 주어진 Hero 클래스에 생성자를 완성하여, 출력 예와 같은 결과를 얻으시오.
		 * 아이언맨(hp: 80)
		 * 타노스(hp: 160)
		 * 토르(hp: 150)
		 * 그루트(hp: 40)
		 */
		// 객체 생성
	    Hero ironMan = new Hero("아이언맨", 80);
	    Hero thanos = new Hero("타노스", 160);
	    Hero thor = new Hero("토르", 150);
	    Hero groot = new Hero("그루트", 40);

	    // 모든 객체 정보를 출력
	    System.out.println(ironMan.toStr());
	    System.out.println(thanos.toStr());
	    System.out.println(thor.toStr());
	    System.out.println(groot.toStr());

	}

}

//Hero 클래스
class Hero {
	// 필드
	String name;
	int hp;
	
	// 생성자
	Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	// 메소드
	String toStr() {
		return String.format("Hero { name: %s, hp: %d }", name, hp);
	}
}
