package chapter7;

class MyTv3 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME) { //volume range 1~100
			return;
		}
		
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) { //channel range 0~100
			return;
		}
		
		//채널이 바뀔때 현재체널을 저장함. 
		//10 -> 20으로 채널이 변경될때 채널10이 저장됨.
		prevChannel = this.channel;
		this.channel = channel;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void gotoPrevChannel() {
		setChannel(prevChannel);
	}

}

public class Ex7_11 {

	public static void main(String[] args) {
		MyTv3 t = new MyTv3();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}

}
