
public class DumbPhone implements GPS, ScreenFeatures {

	// constructor
	public DumbPhone() {
		System.out.println("creating dumbphone");
	}

	// TODO: methods from GPS interface

	public String getCurrentLocation() {
		return "Ur in philly";
	}

	// TODO: methods from ScreenFeatures interface

	public int getScreenSize() {
		return 4;
	}

	public boolean isTouchScreen() {
		return false;
	}

}
