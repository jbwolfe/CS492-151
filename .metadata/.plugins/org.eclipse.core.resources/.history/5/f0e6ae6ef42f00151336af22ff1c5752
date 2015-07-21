import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator {
	Hashtable<Integer, SongInfo> bestSongs;
	
	int hashKey;
	
	public SongsOfThe90s() {
		this.bestSongs = new Hashtable<Integer, SongInfo>();
		this.hashKey = 0;
		
		addSong("Walk on the Ocean", "Toad he Wet Sprocket", 1991);
		addSong("Creep", "Radiohead", 1993);
		addSong("Loosing My Religion", "REM", 1991);
	}
	
	public void addSong(String songName, String bandName, int yearReleased) {
		SongInfo song = new SongInfo(songName, bandName, yearReleased);
		
		this.bestSongs.put(this.hashKey, song);
		
		this.hashKey++;
	}
	
	public Hashtable<Integer, SongInfo> getBestSongs() {
		return this.bestSongs;
	}

	@Override
	public Iterator createIterator() {
		return this.bestSongs.values().iterator();
	}
}
