
import java.util.*;
public class Spotify {
    private ArrayList<Song> songs;
    private HashSet<Song> songSet;

    public Spotify() {
        this.songs = new ArrayList<>();
        this.songSet = new HashSet<>();
    }

    public boolean addSong(Song song) {
        if (songSet.add(song)) {
            songs.add(song);
            System.out.println( song.title + " by " + song.artist + " is added");
            return true;
        } else {
            System.out.println( song.title + " by " + song.artist+ " is already added");
            return false;
        }
    }

    public void removeSong(Song song) {
        if (songSet.remove(song)) {
            songs.remove(song);
            System.out.println( song.title + " by " + song.artist + " is removed");
        } else {
            System.out.println(song.title + " by " + song.artist + "is not found");
        }
    }

    public void describeAlleSongs() {
        for (Song song : songs) {
            song.describeSong();
        }
    }

    public void showSongDetails() {
        for (Song song : songs) {
            if (song instanceof Pop) {
                Pop popSong = (Pop) song;
                System.out.println("Details für  " + popSong.describeSong());
            } else if (song instanceof Rock) {
                Rock rockSong = (Rock) song;
                System.out.println("Details für " + rockSong.describeSong());
            } else if (song instanceof Jazz) {
                Jazz jazzSong = (Jazz) song;
                System.out.println("Details für " + jazzSong.describeSong());            }
        }
    }
}
