
public class TurnTVVolumeUp implements Command{

	ElectronicDevice theDevice;
	
	public TurnTVVolumeUp(ElectronicDevice newDevice) {
		this.theDevice = newDevice;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		theDevice.volumeUp();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		this.theDevice.volumeDown();
	}

}
