
public class Main {
	public static void main(String[] args) {
		SongsOfThe70s songsOf70s = new SongsOfThe70s();
		SongsOfThe80s songsOf80s = new SongsOfThe80s();
		SongsOfThe90s songsOf90s = new SongsOfThe90s();
		
		DiscJockey dj = new DiscJockey(songsOf70s, songsOf80s, songsOf90s);
		
		dj.showSongs();
	}
}
