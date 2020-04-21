package command;

// REFACTOR ME. I SHOULD BE A SINGLETON!

public class VibrationMotor {
	private static VibrationMotor uniqueInstance = new VibrationMotor();
    private VibrationMotor() {
    }

    public void vibrate() {
	System.out.println("Motor VIBRATE");
    }
    
    public static VibrationMotor getInstance() {
    	return uniqueInstance;
    }
}