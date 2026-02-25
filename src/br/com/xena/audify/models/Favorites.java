package br.com.xena.audify.models;

public class Favorites {
        public void includes(Audio audio) {
            if (audio.getRating() >= 9) {
                System.out.println(audio.getTitle() + " is the best song ever!");
            } else {
                System.out.println(audio.getTitle() + " is also in the charts!");
            }
        }
}