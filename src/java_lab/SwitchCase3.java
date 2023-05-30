package java_lab;

public class SwitchCase3 {

	public static void main(String[] args) {
		int floor = 7;
		
		switch(floor) {
			case 1:
				System.out.println(floor + " 층 약국");
				break;
			case 2:
				System.out.println(floor + " 층 정형외과");
				break;
			case 3:
				System.out.println(floor + " 층 피부과");
				break;
			case 4:
				System.out.println(floor + " 층 치과");
				break;
			case 5:
				System.out.println(floor + " 층 헬스클럽");
				break;
			default:
				System.out.println("해당 층은 없습니다.");
				break;
		}
	}

}
