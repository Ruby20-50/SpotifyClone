public class Rock extends Song {

    public Rock(String title, String artist, int duration){
        super(title, artist,duration, Genre.ROCK);
    }
    @Override
    public String describeSong() {
        return "RockSong: " + title + " by " + artist + ". Duration: " + duration + " seconds";
    }

}
