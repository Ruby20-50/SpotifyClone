public class Jazz extends Song{
    public Jazz(String title, String artist, int duration){
        super(title, artist,duration, Genre.JAZZ);
    }
    @Override
    public String describeSong() {
        return "RockSong: " + title + " by " + artist + ". Duration: " + duration + " seconds";
    }
}
