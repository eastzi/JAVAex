package cloud4;

public class Ex4_11 {

	public static void main(String[] args) {
		/*
		 * 아래와 같은 노래 목록이 있다.
		 * 별헤는 밤 - 유재하
		 * 비상 - 임재범
		 * 비밀 - 박완규
		 * 이들을 객체 배열로 만들어,
		 * 반복문을 통해 출력 예와 같은 결과를 얻으시오.
		 */
		Song s0 = new Song("별헤는 밤", "유재하");
		Song s1 = new Song("비상", "임재범");
		Song s2 = new Song("비밀", "박완규");

		Song[] songs = {s0, s1, s2};
		
		for(int i = 0; i < songs.length; i++) {
			System.out.println(songs[i].toStr());
		}
	}

}

class Song {
	String name;
	String singer;
	
	public Song(String name, String singer) {
		this.name = name;
		this.singer = singer;
	}
	
	String toStr() {
		return String.format("Song { name: %s, singer: %s }", name, singer);
	}
}
