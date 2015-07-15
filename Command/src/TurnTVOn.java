
public class TurnTVOn implements Command{

	ElectronicDevice theDevice;
	
	public TurnTVOn(ElectronicDevice newDevice) {
		this.theDevice = newDevice;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.theDevice.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		this.theDevice.off();
		
	}

}
