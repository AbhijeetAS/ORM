package org.example.RelationMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        //create the object of the laptop
        Laptop laptop=new Laptop();
        laptop.setlId(101);
        laptop.setlName("Dell");

        //craete the object of student class
        Student stu=new Student();
        stu.setName("abhijeet");
        stu.setRollNo(16);
        stu.setMarks(95);
        stu.getLaptop().add(laptop);

        Configuration config=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        SessionFactory obj=config.buildSessionFactory();
        Session session= obj.openSession();
        session.beginTransaction();

        session.save(stu);
        session.save(laptop);

        session.getTransaction().commit();




    }

}
