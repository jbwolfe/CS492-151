
public class TVRemoteMute extends RemoteButton {

	public TVRemoteMute(EntertainmentDevice newDevice) {
		super(newDevice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("TV was muted.");
	}
	
}
