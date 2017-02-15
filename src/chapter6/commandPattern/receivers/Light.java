package chapter6.commandPattern.receivers;

public class Light {
	private String type;
	
	public Light() {
		// TODO Auto-generated constructor stub
	}
	
	public Light(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void on() {
		System.out.println(type + " light is on ...");
	}
	public void off() {
		System.out.println(type + " light is off ...");
	}
}
