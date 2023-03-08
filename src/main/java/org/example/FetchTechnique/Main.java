package org.example.FetchTechnique;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Configuration config=new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
        SessionFactory obj=config.buildSessionFactory();
        Session session= obj.openSession();

        session.beginTransaction();

        Alien a1=session.get(Alien.class,1);
        session.getTransaction().commit();

    }
}
