package aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("musicPlayerBean")
public class MusicPlayer {
    private Genre genre; // какой жанр преобладает в плеере
    @Value("${player.rating}")
    private int rating; // рейтинг плеера в Appstore

    @Value("${player.lang}")
    private String lang; // язык программирования на котором написан


    @Autowired
    @Qualifier("rockBean")
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getRating() {
        System.out.println(rating);
        return rating;
    }

    public String getLang() {
        System.out.println(lang);
        return lang;
    }

    public Genre getGenre() {
        return genre;
    }

    public void sayGenre () {
        System.out.println("My genre " + genre.name());
    }
}
