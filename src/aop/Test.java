package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);
//        player.sayGenre();
        Song song = context.getBean("song", Song.class);
        player.setLang("Java", 3);
        player.addSong(song);
//        player.getGenre();
        context.close();
    }
}
