package com.inheritance.mapped_super_class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mercedes extends Car {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    public Mercedes(int age, String model, String name) {
        super(age, model);
        this.name = name;
    }
}
