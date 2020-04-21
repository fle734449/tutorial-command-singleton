package command;

public class ConsoleCommand implements Command {
	private Console console;
	private String toPrint;
	
	public ConsoleCommand(Console console, String toPrint) {
		this.console = console;
		this.toPrint = toPrint;
	}
	

	public void execute() {
		console.print(toPrint);
	}
    // IMPLEMENT ME!

}