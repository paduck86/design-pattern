package chapter6.commandPattern.commanders;

public interface Command {
	public void execute();
	public void undo();
}
