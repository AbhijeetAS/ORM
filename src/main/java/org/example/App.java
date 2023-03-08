package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{


    public static void main(String[] args )
    {
        System.out.println( "Hello World!" );

        SessionFactory sessFac= new Configuration().configure().addAnnotatedClass(Alien.class).buildSessionFactory();
        Session Session1= sessFac.openSession();
        Session1.beginTransaction();

        Query q=Session1.createQuery("from Alien_full where Id=10");
//        List<Alien> aliens =query.list();

//        for (Alien i:aliens)
//        {
//            System.out.println(i);
//        }

        //for unique output
//        Alien obj=  (Alien) q.uniqueResult();
//        System.out.println(obj);

        Alien[] o=(Alien[]) q.uniqueResult();

        for (Alien i:o)
        {
            System.out.println(i);
        }

        Session1.getTransaction().commit();
        Session1.close();


    }
}
