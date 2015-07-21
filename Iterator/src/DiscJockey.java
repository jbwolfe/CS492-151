import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJockey {
	
	SongsOfThe70s songsOfThe70s;
	SongsOfThe80s songsOfThe80s;
	SongsOfThe90s songsOfThe90s;
	
	SongIterator songIter70sSongs;
	SongIterator songIter80sSongs;
	SongIterator songIter90sSongs;
	
	public DiscJockey(SongIterator newSongsOf70s, SongIterator newSongsOf80s, SongIterator newSongsOf90s) {
		this.songIter70sSongs = newSongsOf70s;
		this.songIter80sSongs = newSongsOf80s;
		this.songIter90sSongs = newSongsOf90s;
	}
	
	public void showSongs() {
		Iterator iter70sSongs = this.songIter70sSongs.createIterator();
		Iterator iter80sSongs = this.songIter80sSongs.createIterator();
		Iterator iter90sSongs = this.songIter90sSongs.createIterator();

		System.out.println("\nSongs of the 70s");
		printSongs(iter70sSongs);
		System.out.println("\nSongs of the 80s");
		printSongs(iter80sSongs);
		System.out.println("\nSongs of the 90s");
		printSongs(iter90sSongs);
	}
	
	public void printSongs(Iterator iterator) {
		while(iterator.hasNext()) {
			SongInfo songInfo = (SongInfo)iterator.next();

			System.out.print(songInfo.getSondName() + " ");
			System.out.print(songInfo.getBandName() + " ");
			System.out.print(songInfo.getYearReleased() + " ");
			System.out.print("\n");
		}
	}
	
}