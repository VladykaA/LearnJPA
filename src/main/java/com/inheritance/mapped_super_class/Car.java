package com.inheritance.mapped_super_class;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Car {
    private int age;
    private String model;

    public Car(int age, String model) {
        this.age = age;
        this.model = model;
    }

}
