public class Pop extends Song{
    public Pop(String title, String artist, int duration){
        super(title, artist,duration, Genre.POP);
    }
    @Override
    public String describeSong() {
        return "Pop Song: " + title + " by " + artist + ". Duration: " + duration + " seconds";
    }

}
