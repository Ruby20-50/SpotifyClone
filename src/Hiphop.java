public class Hiphop extends Song{
    public Hiphop(String title, String artist, int duration){
        super(title, artist,duration, Genre.HIPHOP);
    }
    @Override
    public String describeSong() {
        return "Hiphop song: " + title + " by " + artist + ". Duration: " + duration + " seconds";
    }
}
