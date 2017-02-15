package chapter6.commandPattern.commanders;

import chapter6.commandPattern.receivers.Stereo;

public class StereoOnWithCDCommand implements Command {
	Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

	@Override
	public void undo() {
		stereo.off();
		
	}

}
