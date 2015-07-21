import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator{
	SongInfo[] bestSongs;
	int arrayValue;
	
	public SongsOfThe80s() {
		this.bestSongs = new SongInfo[3];
		this.arrayValue = 0;
		
		addSong("Roam", "B52s", 1989);
		addSong("Cruil Summer", "Bananarama", 1984);
		addSong("Head Over Heels", "Rears for Fears", 1985);
	}
	
	public void addSong(String songName, String bandName, int yearReleased) {
		SongInfo song = new SongInfo(songName, bandName, yearReleased);
		
		this.bestSongs[this.arrayValue] = song;
		
		this.arrayValue++;
	}
	
	@Override
	public Iterator createIterator() {
		return Arrays.asList(this.bestSongs).iterator();
	}
}
