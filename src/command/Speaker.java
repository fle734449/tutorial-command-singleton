package command;

// REFACTOR ME. I SHOULD BE A SINGLETON!

public class Speaker {
	private static Speaker uniqueInstance = new Speaker(); 
    private Speaker() {
    }

    public void beep() {
	System.out.println("Speaker BEEP!");
    }
    
    public static Speaker getInstance() {
    	return uniqueInstance;
    }
}