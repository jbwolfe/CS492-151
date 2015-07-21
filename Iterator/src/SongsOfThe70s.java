import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator {
	ArrayList<SongInfo> bestSongs;
	
	public SongsOfThe70s() {
		this.bestSongs = new ArrayList<SongInfo>();
		
		addSong("Imagine", "John Lennon", 1971);
		addSong("American Pie", "Don McLean", 1971);
		addSong("I Will Survive", "Gloria Gaynor", 1979);
	}
	
	public void addSong(String songName, String bandName, int yearReleased) {
		SongInfo song = new SongInfo(songName, bandName, yearReleased);
		
		this.bestSongs.add(song);
	}

	@Override
	public Iterator createIterator() {
		return this.bestSongs.iterator();
	}
}
