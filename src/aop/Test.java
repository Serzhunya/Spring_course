package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.LinkedBlockingDeque;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(myConfig.class);
        Library library = context.getBean("libraryBean", Library.class);
        library.getBook();
        context.close();
    }
}
