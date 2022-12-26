package hibernate_test2;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Justin", "Bieber", "HR", 450);
            session.beginTransaction();
            session.persist(emp);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }

    }
}
