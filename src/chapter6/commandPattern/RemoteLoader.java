package chapter6.commandPattern;

import chapter6.commandPattern.commanders.CeilingFanHighCommand;
import chapter6.commandPattern.commanders.CeilingFanMediumCommand;
import chapter6.commandPattern.commanders.CeilingFanOffCommand;
import chapter6.commandPattern.commanders.CeilingFanOnCommand;
import chapter6.commandPattern.commanders.Command;
import chapter6.commandPattern.commanders.GarageDoorCloseCommand;
import chapter6.commandPattern.commanders.GarageDoorOpenCommand;
import chapter6.commandPattern.commanders.LightOffCommand;
import chapter6.commandPattern.commanders.LightOnCommand;
import chapter6.commandPattern.commanders.MacroCommand;
import chapter6.commandPattern.commanders.StereoOffCommand;
import chapter6.commandPattern.commanders.StereoOnWithCDCommand;
import chapter6.commandPattern.invokers.RemoteControl;
import chapter6.commandPattern.receivers.CeilingFan;
import chapter6.commandPattern.receivers.GarageDoor;
import chapter6.commandPattern.receivers.Light;
import chapter6.commandPattern.receivers.Stereo;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo("Living Room");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
		
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		Command[] partyOn = {livingRoomLightOn, kitchenLightOn, ceilingFanOn, garageDoorOpen, stereoOnWithCD};
		Command[] partyOff = {livingRoomLightOff, kitchenLightOff, ceilingFanOff, garageDoorClose, stereoOff};
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPushed(0);
		/*remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);*/
		
		/*remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		
		
		remoteControl.onButtonWasPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();*/
		
		/*remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);*/
	}
}
