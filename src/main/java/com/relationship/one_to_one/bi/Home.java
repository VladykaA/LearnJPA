package com.relationship.one_to_one.bi;

import javax.persistence.*;

@Entity
public class Home {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToOne
    @JoinColumn(name = "person_fk_id")
    private Person person;

    public Home(String name, Person person) {
        this.name = name;
        this.person = person;
    }

    public Home() {
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
