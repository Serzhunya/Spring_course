package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("personBean")
//@Scope("singletone")
public class Person {
    private Pet pet;
    private String lastname;
    private int age;

//    @Autowired
    public Person() {
        System.out.println("I create Person");
    }

    @Autowired
    @Qualifier("catBean")
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
