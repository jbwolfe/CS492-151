import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		ElectronicDevice newDevice = TVRemote.getDevice();
		
		TurnTVOn onCommand = new TurnTVOn(newDevice);
		
		DeviceButton onPressed = new DeviceButton(onCommand);
		
		onPressed.press();
		
		TurnTVOff offCommand = new TurnTVOff(newDevice);
		
		DeviceButton offPressed = new DeviceButton(offCommand);

		offPressed.press();offPressed.press();
		
		TurnTVVolumeUp volumeUpCommand = new TurnTVVolumeUp(newDevice);
		
		DeviceButton volumeUpPressed = new DeviceButton(volumeUpCommand);

		volumeUpPressed.press();
		volumeUpPressed.press();
		volumeUpPressed.press();
		volumeUpPressed.pressUndo();
		volumeUpPressed.pressUndo();
		volumeUpPressed.pressUndo();
	}
}
