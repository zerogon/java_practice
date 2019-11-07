package commandPatten;

public class Button {
	private Command theCommand;

	public Button(Command theCommand) {
		setCommand(theCommand);
	}
//test
	public void setCommand(Command newCommand) {
		this.theCommand = newCommand;
	}
	
	public void pressed() {
		theCommand.execute();
	}
}
