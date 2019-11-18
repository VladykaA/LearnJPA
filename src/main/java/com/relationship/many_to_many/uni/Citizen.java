package com.relationship.many_to_many.uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Citizen {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    public Citizen(String name) {
        this.name = name;
    }

    public Citizen() {
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
}
