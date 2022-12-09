package spring_introduction;

import org.springframework.stereotype.Component;


public class Cat implements Pet{
    public Cat() {
        System.out.println("I create Cat");
    }



    public void say() {
        System.out.println("Mew");
    }
}
