
public class Main {
	public static void main(String[] args) {
		RemoteButton theTV1 = new TVRemoteMute(new TVDevice(10, 200));
		
		RemoteButton theTV2 = new TVRemotePause(new TVDevice(1, 100));
		
		System.out.println("Test TV mute");
		theTV1.buttonFivePressed();
		theTV1.buttonSixPressed();
		theTV1.buttonNinePressed();

		System.out.println("");

		System.out.println("Test TV pause");
		theTV2.deviceFeedback();
		theTV2.buttonFivePressed();
		theTV2.buttonSixPressed();
		theTV2.buttonSixPressed();
		theTV2.buttonSixPressed();
		theTV2.buttonSixPressed();
		theTV2.buttonFivePressed();
		theTV2.buttonFivePressed();
		theTV2.buttonNinePressed();
		theTV2.deviceFeedback();
	}
}
