package br.com.xena.audify.models;

public class Song extends Audio {
    private String artist;
    private String album;
    private String genre;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public double getRating(){
        if (this.getTotalPlays() > 5000 && this.getTotalLikes() >= 3800) {
            return 10;
        } else {
            return 5;
        }
    }
}