package spring_introduction;

public class Dog implements Pet{
    Dog() {
        System.out.println("I create Dog");
    }
    public void init () {
        System.out.println("start");
    }
    public void destroy () {
        System.out.println("end");
    }
    public void say() {
        System.out.println("Gav");
    }
}
