package chapter7;

public class Ex7_17 {

}

abstract class Unit {
	int x, y;
	//클래스마다 동작이 다르므로 추상메서드
	abstract void move(int x, int y);
	//클래스마다 동일한 동작
	void stop() {
		/* 현재 위치에 정지 */
	}
}

class Marine extends Unit { // 보병
	void move(int x, int y) { /* 보병 지정된 위치로 이동 */ } 
	void stimPack() { /* 스팀팩을 사용한다 */} 
}

class Tank extends Unit { // 탱크
	void move(int x, int y) { /* 탱크 지정된 위치로 이동 */ } 
	void changeMode() { /* 공격모드를 변환한다. */} 
}

class Dropship extends Unit { // 수송선
	void move(int x, int y) { /* 수송선 지정된 위치로 이동 */ } 
	void load() { /* 선택된 대상을 태운다.*/ } 
	void unload() { /* 선택된 대상을 내린다.*/ } 
}

