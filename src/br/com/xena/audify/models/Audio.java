package br.com.xena.audify.models;

public class Audio {
    private String title;
    private double duration;
    private int totalPlays;
    private double totalLikes;
    private double rating;

    public void displayTechnicalSpecs() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration);
        System.out.println("Total Plays: " + totalPlays);
        System.out.println("Likes: " + totalLikes);
        System.out.println("Rating: " + rating);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(double totalLikes) {
        this.totalLikes = totalLikes;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getTotalPlays() {
        return totalPlays;
    }

    public void setTotalPlays(int totalPlays) {
        this.totalPlays = totalPlays;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}