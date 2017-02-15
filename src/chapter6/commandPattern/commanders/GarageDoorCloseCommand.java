package chapter6.commandPattern.commanders;

import chapter6.commandPattern.receivers.GarageDoor;

public class GarageDoorCloseCommand implements Command {
	GarageDoor door;
	
	public GarageDoorCloseCommand(GarageDoor door) {
		this.door = door;
	}
	
	@Override
	public void execute() {
		door.close();

	}

	@Override
	public void undo() {
		door.open();
		
	}

}
