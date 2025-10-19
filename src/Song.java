import java.util.Objects;
public abstract class Song {
    protected String title;
    protected String artist;
    protected int duration;
    protected Genre genre;

    public Song(String title, String artist, int duration, Genre genre) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    public abstract String describeSong();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Song song = (Song) obj;
        return duration == song.duration &&
                title.equals(song.title) &&
                artist.equals(song.artist) &&
                genre == song.genre;
    }
}
