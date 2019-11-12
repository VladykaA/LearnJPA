package com.relationship.one_to_one.uni;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "address_fk_id")
    private Address address;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
