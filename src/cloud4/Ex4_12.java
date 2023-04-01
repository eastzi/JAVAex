package cloud4;

public class Ex4_12 {

	public static void main(String[] args) {
		/*
		 * 펀치 대상의 정보가 함께 나타나도록, 
		 * 코드를 추가하여 출력 예와 같은 결과를 얻으시오.
		 * [토르]의 펀치!! 타노스의 HP: 160 -> 150
		 * [타노스]의 펀치!! 토르의 HP: 150 -> 140
		 * [타노스]의 펀치!! 토르의 HP: 140 -> 130
		 */
		
		Hero2 h1 = new Hero2("토르", 150);
		Hero2 h2 = new Hero2("타노스", 160);

		h1.punch(h2);
		h2.punch(h1);
		h2.punch(h1);
	}

}

class Hero2 {
	String name;
	int hp;
	
	public Hero2(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	void punch(Hero2 hero) {
		System.out.printf("[%s]의 펀치!! ", name);
		System.out.printf("%s의 HP: %d -> ", hero.name, hero.hp);
		hero.hp -= 10;
		System.out.printf("%d\n", hero.hp);
	}
	
}
