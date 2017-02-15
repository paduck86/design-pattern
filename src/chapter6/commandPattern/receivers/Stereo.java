package chapter6.commandPattern.receivers;

public class Stereo {
	private String type;
	private int volume;
	
	public Stereo() {
		// TODO Auto-generated constructor stub
	}
	
	public Stereo(String type) {
		this.type = type;
	}

	public void on() {
		System.out.println(type + " stereo is on ...");
	}

	public void setCD() {
		System.out.println("Set CD...");
	}

	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("Set volume " + volume + " ...");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void off() {
		System.out.println(type + " stereo is off ...");
	}
	
	

}
