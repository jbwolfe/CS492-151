
public class TurnTVOff implements Command{

	ElectronicDevice theDevice;
	
	public TurnTVOff(ElectronicDevice newDevice) {
		this.theDevice = newDevice;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.theDevice.off();
	}

	@Override
	public void undo() {
		this.theDevice.on();
	}

}