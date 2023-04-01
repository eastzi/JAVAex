package cloud4;

public class Ex4_13 {

	public static void main(String[] args) {
		/*
		 * [레이너]의 스팀팩! HP: 80 -> 70
		 * [모랄레스]의 치유! => [레이너] HP(70 -> 80)
		 */
		Marin ma = new Marin("레이너", 80);
		Medic me = new Medic("모랄레스", 60, 60);
		
		ma.stimpack();
		me.heal(ma);
	}

}

class Marin {
	String name;
	int hp;

	public Marin(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	void stimpack() {
		System.out.printf("[%s]의 스팀팩! HP: %d -> ", name, hp);
		hp -= 10; 
		System.out.printf("%d\n", hp);
	}
}

class Medic {
	String name;
	int hp;
	int mp;

	public Medic(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	void heal(Marin marin) {
		System.out.printf("[%s]의 치유! => [%s] HP(%d -> ", name, marin.name, marin.hp);
		marin.hp += 10;
		System.out.printf("%d)", marin.hp);
	}
}