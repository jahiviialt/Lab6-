
public class SmartPhone implements MusicPlayer, GPS, ScreenFeatures {

	// constructor
	public SmartPhone() {
		System.out.println("creating smartphone");
	}

	// TODO: methods from MusicPlayer interface
	public void playSong(String songTitle) {
		System.out.println("Now Playing: Smooth Criminal By Micheal Jackson");
	}

	public void downloadSong(String songTitle) {
		System.out.println("Now Downloading Thriller By Micheal Jackson.");
	}

	// TODO: methods from GPS interface
	public String getCurrentLocation() {
		System.out.println("Getting Location...");
		return "123 S Broad Street, Philadelphia.";
	}

	// TODO: methods from ScreenFeatures interface
	public int getScreenSize() {
		int length = 3;
		int width = 4;
		return (length * width);
	}

	public boolean isTouchScreen() {

		return true;
	}
}
