public class Main {
    public static void main(String[] args) {

        Spotify musicListe = new Spotify();

        Song popSong1 = new Pop("Shape of You", "Ed Sheeran", 240);
        Song rockSong1 = new Rock("Bohemian Rhapsody", "Queen", 355);
        Song jazzSong1 = new Jazz("Take Five", "Dave Brubeck", 324);

        musicListe.addSong(popSong1);
        musicListe.addSong(rockSong1);
        musicListe.addSong(jazzSong1);

        musicListe.describeAlleSongs();
        System.out.printf("%n%n----------Song Details----------%n");
        musicListe.showSongDetails();

//        musikListe.entferneSong(popSong1);
//        musikListe.beschreibeAlleSongs();

    }
}