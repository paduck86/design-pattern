package chapter6.commandPattern.commanders;

import chapter6.commandPattern.receivers.GarageDoor;

public class GarageDoorOpenCommand implements Command {
	GarageDoor door;
	
	public GarageDoorOpenCommand(GarageDoor door) {
		this.door = door;
	}
	
	
	@Override
	public void execute() {
		door.open();

	}


	@Override
	public void undo() {
		door.close();
		
	}

}
