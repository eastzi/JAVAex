package cloud4;

public class Ex4_17 {

	public static void main(String[] args) {
		/*
		 샘숭전자의 갤럭시 스마트폰은 고유의 시리얼 넘버를 가지고 있다.
		 이 시리얼 넘버는 임의의 알파벳과 생성 순서를 번호로 가진다.
		 주어진 코드에 클래스 변수를 적용하여, 출력 예와 같은 결과를 얻으시오.
		 Galaxy { serialNum: I-1 }
		 Galaxy { serialNum: V-2 }
		 Galaxy { serialNum: U-3 }
		 Galaxy { serialNum: P-4 }
		 Galaxy { serialNum: S-5 }
		 =========================
		 Galaxy 객체의 개수: 5
		 */

		Galaxy[] phones = new Galaxy[5];
		
		for(int i = 0; i < phones.length; i++) {
			phones[i] = new Galaxy();
		}
		
		for(int i = 0; i < phones.length; i++) {
			phones[i].print();
		}
		
		System.out.println("=========================");
		System.out.printf("Galaxy 객체의 개수: %d", Galaxy.count);
	}

}

class Galaxy {
	String serialNum;
	
	static int count = 0;

	public Galaxy() {
		count++;
		char c = randomAlphabet();
		serialNum = String.format("%c-%d", c, count);
	} 
	
	char randomAlphabet() {
	    return (char)('A' + Math.random() * 26); // A to Z
	}
	
	void print() {
	    System.out.printf("Galaxy { serialNum: %s }\n", serialNum);
	}
	
}
