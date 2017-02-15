package chapter6.commandPattern.receivers;

public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	private String type;
	private int speed;
	
	public CeilingFan() {
		// TODO Auto-generated constructor stub
	}
	
	public CeilingFan(String type) {
		this.type = type;
		speed = OFF;
	}
	
	public void high() {
		speed = HIGH;
		System.out.println("set the " + type + " ceiling fan high ...");
	}
	
	public void medium() {
		speed = MEDIUM;
		System.out.println("set the " + type + " ceiling fan medium ...");
	}
	
	public void low() {
		speed = LOW;
		System.out.println("set the " + type + " ceiling fan low ...");
	}

	public void on() {
		System.out.println(type + " ceiling fan is on ...");
		
	}
	public void off() {
		speed = OFF;
		System.out.println(type + " ceiling fan is off ...");
		
	}
	
	public int getSpeed() {
		return speed;
	}

}
