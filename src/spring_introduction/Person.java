package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Person {
    private Pet pet;
    @Value("${person.lastName}")
    private String lastname;
    @Value("${person.age}")
    private int age;

    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("I create Person");
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }


    public void setLastname(String lastName) {
        this.lastname = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastname() {
        System.out.println(lastname);
        return lastname;
    }

    public int getAge() {
        System.out.println(age);
        return age;
    }

    public void sayHelloMyPet() {
        System.out.println("Hello, my Pet");
        pet.say();
    }
}
