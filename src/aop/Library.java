package aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    Library() {
        System.out.println("i create library");
    }
    public void getBook() {
        System.out.println("I get book");
    }
}
