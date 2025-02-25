
public class Tablet implements MusicPlayer, ScreenFeatures {

	// constructor
	public Tablet() {
		System.out.println("creating tablet");
	}

	// TODO: methods from MusicPlayer interface

	public void playSong(String songTitle) {
		System.out.println("Playing " + songTitle);
	}

	public void downloadSong(String songTitle) {
		System.out.println("Downloading " + songTitle);
	}

	// TODO: methods from ScreenFeatures interface

	public int getScreenSize() {
		return 4;
	}

	public boolean isTouchScreen() {
		return false;
	}

}
