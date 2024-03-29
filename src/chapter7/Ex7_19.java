package chapter7;

public class Ex7_19 {

	public static void main(String args[]) {
		Buyer b = new Buyer();
		
		b.buy(new Tv2());
		b.buy(new Computer());
		b.buy(new Tv2());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		//잔액부족지점
		b.buy(new Computer());
		
		b.summary();
	}
}

class Buyer {
	int money = 1000;
	
	Product2[] cart = new Product2[3]; // 구입한 제품을 저장하기 위한 배열
	
	int i = 0; // Product cart index 배열 에 사용될
	
	void buy(Product2 p) {
		/*
		(1) . 아래의 로직에 맞게 코드를 작성하시오
		1.1 . 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다*/
		if(money < p.price) {
			System.out.println("잔액부족" + p + "를 살 수 없음.");
			return;
		}
		//1.2 , 가진 돈이 충분하면 제품의 가격을 가진 돈에서 빼고
		money -= p.price;
		
		//1.3 장바구니에 구입한 물건을 담는다.(add메서드 호출) 
		add(p);
		
	}

	void add(Product2 p) {
		/*
		(2) . 아래의 로직에 맞게 코드를 작성하시오
		1.1 i의 값이 장바구니의 크기보다 같거나 크면*/
		if(i >= cart.length) {
			//1.1.1. 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다
			Product2[] cart2 = new Product2[cart.length * 2];
			
			//1.1.2. 기존의 장바구니의 내용을 새로운 배열에 복사한다
			System.arraycopy(cart, 0, cart2, 0, cart.length);
			
			//1.1.3. 새로운 장바구니와 기존의 장바구니를 바꾼다
			cart = cart2;
		}
		
		//1.2. 물건을 장바구니(cart)에 저장한다 그리고 i의 값을 1 증가시킨다
		cart[i++] = p;
		
	} // add(Product p)
	
	void summary() {
		String itemList = "";
		
		int sum = 0;
		
		for(int i=0; i < cart.length; i++) {
			if(cart[i] == null) {
				break;
			}
			/*
			(3) . 아래의 로직에 맞게 코드를 작성하시오
			1.1 . 장바구니에 담긴 물건들의 목록을 만들어 출력한다*/
			itemList += cart[i] + ", ";
		//1.2 . 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다
			sum += cart[i].price;
		}
		
		//1.3 (money) . 물건을 사고 남은 금액 를 출력한다
		System.out.println("구입한 물건 : "+ itemList); 
		System.out.println("사용한 금액 : "+ sum); 
		System.out.println("남은 금액 : "+ money);
	} // summary()
}

class Product2 {
	int price; // 제품의 가격
	
	Product2(int price) {
		this.price = price;
	}
}

class Tv2 extends Product2 {
	Tv2() { super(100); }
	public String toString() { return "Tv"; }
}

class Computer extends Product2 {
	Computer() { super(200); }
	public String toString() { return "Computer";}
}

class Audio extends Product2 {
	Audio() { super(50); }
	public String toString() { return "Audio"; }
}

