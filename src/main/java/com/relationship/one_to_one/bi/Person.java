package com.relationship.one_to_one.bi;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToOne(cascade = CascadeType.PERSIST, mappedBy = "person")
    private Home home;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }
}
