package chapter7;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i = 0;  i < cards.length; i++) {
			int num = i % 10 + 1; 
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8); 
			
			cards[i] = new SutdaCard(num, isKwang); 
		}
		
	}
	
	//1. shuffle 메서드
	void shuffle() {
		for(int i = 0; i < cards.length; i++) {
			int j = (int)(Math.random() * cards.length);
			
			SutdaCard tmp = cards[i]; 
			cards[i] = cards[j]; 
			cards[j] = tmp; 
		}
	}
	
	//2. pick 메서드
	SutdaCard pick(int index) {
		if(index < 0 || index >= CARD_NUM) {
			return null; 
		}
		return cards[index]; 
	}
	
	//3. pick 메서드 
	SutdaCard pick() {
		int index = (int)(Math.random() * cards.length); 
		return pick(index); 
	}
	
}

class SutdaCard	{
	final int NUM; 
	final boolean ISKWANG; 
	
	SutdaCard() {
		this(1, true); 
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.NUM = num; 
		this.ISKWANG = isKwang; 
	}
	
	public String toString() {
		return NUM + (ISKWANG ? "K" : "");
	}
	
}

public class Ex7_1 {

	public static void main(String[] args) {

		SutdaDeck deck = new SutdaDeck(); 
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle(); 
		
		for(int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
		
		
	}

}


