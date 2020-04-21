package command;

// REFACTOR ME. I SHOULD BE A SINGLETON!

public class Console{
	private static Console uniqueInstance = new Console();
    private Console(){
    }

    public void print(String toPrint){
	System.out.println(toPrint);
    }
    
    public static Console getInstance() {
    	return uniqueInstance;
    }
}