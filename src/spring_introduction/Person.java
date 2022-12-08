package spring_introduction;

public class Person {
    private Pet pet;
    private String lastname;
    private int age;

    public Person() {
        System.out.println("i create new Person");
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
