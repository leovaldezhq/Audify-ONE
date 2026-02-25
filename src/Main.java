import br.com.xena.audify.models.Favorites;
import br.com.xena.audify.models.Podcast;
import br.com.xena.audify.models.Song;

public class Main {
    public static void main (String[] args) {
        Song songA = new Song();
        songA.setTitle("Going Nowhere");
        songA.setArtist("Fifth Harmony");
        songA.setAlbum("Reflection");
        songA.setGenre("Pop");
        songA.setDuration(3.32);

        for (int i = 0; i <= 1000; i++) {
            songA.plays();
        }

        for (int i = 0; i <= 500; i++) {
            songA.likes();
        }

        songA.displayMetadata();

        Song songB = new Song();
        songB.setTitle("Kiss You");
        songB.setArtist("One Direction");
        songB.setAlbum("Take Me Home");
        songB.setGenre("Pop");
        songB.setDuration(3.3);

        for (int i = 0; i <= 1000; i++) {
            songB.plays();
        }

        for (int i = 0; i <= 500; i++) {
            songB.likes();
        }

        songB.displayMetadata();

        Podcast podcast = new Podcast();
        podcast.setTitle("Brabascast - Podcast sobre o Corinthians Feminino");
        podcast.setHost("Brabascast");
        podcast.setLanguage("Portuguese");

        Favorites favorites = new Favorites();
        favorites.includes(songA);
        favorites.includes(songB);
        favorites.includes(podcast);
    }
}