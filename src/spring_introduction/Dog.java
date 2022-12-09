package spring_introduction;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Dog implements Pet{
    Dog() {
        System.out.println("I create Dog");
    }
//    @PostConstruct
    public void init () {
        System.out.println("start");
    }

//    @PreDestroy
    public void destroy () {
        System.out.println("end");
    }
    public void say() {
        System.out.println("Gav");
    }
}
