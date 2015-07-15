
public class Television implements ElectronicDevice {
	
	private int volume = 0;
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("TV is ON");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("TV is OFF");
		
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		this.volume += 1;
		System.out.println("TV Volume is at " + this.volume);
		
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		this.volume -= 1;
		System.out.println("TV Volume is at " + this.volume);
		
	}

}
