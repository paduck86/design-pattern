package chapter6.commandPattern.receivers;

public class GarageDoor {
	private String type;
	
	public GarageDoor() {
		// TODO Auto-generated constructor stub
	}
	
	public void open() {
		System.out.println("Garage door is open...");
		
	}

	public void close() {
		System.out.println("Garage door is close...");
		
	}

	public void stop() {
		System.out.println("Garage door is stop...");
		
	}

	public void lightOn() {
		System.out.println("Garage door light is on...");
		
	}

	public void lightOff() {
		System.out.println("Garage door light is off...");
		
	}

}
