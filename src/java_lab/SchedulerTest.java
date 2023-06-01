package java_lab;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 방식을 선택하세요.");
		System.out.println("A: 상담원이 전화 가져가기");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch == 'A' || ch == 'a') {
			scheduler = new AgentGetCall();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
	}
}
