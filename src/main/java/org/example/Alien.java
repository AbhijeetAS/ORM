package org.example;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Alien_full")
public class Alien {
    @Id

    private int Id;
    private String name;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Alien() {
    }

    @Override
    public String toString() {
        return "Alien{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
