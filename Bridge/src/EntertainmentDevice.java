
public abstract class EntertainmentDevice {
	public int deviceState;
	public int maxSetting;
	
	public int volumeLevel = 0;
	
	public abstract void buttonFivePressed();
	public abstract void buttonSixPressed();
	
	public void deviceFeedback() {
		if(deviceState > maxSetting || deviceState < 0) {
			this.deviceState = 0;
		}
		
		System.out.println("On " + this.deviceState);
	}
	
	public void buttonSevenPressed() {
		this.volumeLevel += 1;
		
		System.out.println("Volumt at: " + this.volumeLevel);
	}
	public void buttonEightPressed() {
		this.volumeLevel -= 1;
		
		System.out.println("Volumt at: " + this.volumeLevel);
	}
}
