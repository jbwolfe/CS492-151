
public class TurnTVVolumeDown implements Command{

	ElectronicDevice theDevice;
	
	public TurnTVVolumeDown(ElectronicDevice newDevice) {
		this.theDevice = newDevice;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.theDevice.volumeDown();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		this.theDevice.volumeUp();
		
	}

}
