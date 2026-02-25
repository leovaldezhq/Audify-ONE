package br.com.xena.audify.models;

public class Podcast extends Audio {
    private String host;
    private String language;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public double getRating(){
        if (this.getTotalPlays() > 3000 && this.getTotalLikes() >= 2000) {
            return 10;
        } else {
            return 5;
        }
    }
}