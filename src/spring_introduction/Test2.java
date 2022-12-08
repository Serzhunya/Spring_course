package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog dog = context.getBean("myPet", Dog.class);
        Dog myDog = context.getBean("myPet", Dog.class);
        System.out.println(dog == myDog);
        System.out.println(dog);
        System.out.println(myDog);
        context.close();

    }
}
