package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Song {
    @Value("2010")
    int year;
    @Value("I kissed a girl")
    String name;



    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }
}
