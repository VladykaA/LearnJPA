package com.relationship.one_to_many.uni;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Administrator {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "admin_email",
            joinColumns = @JoinColumn(name = "admin_fk_id"),
    inverseJoinColumns = @JoinColumn(name = "email_fk_id"))
    private List<Email> emails = new ArrayList<>();

    public Administrator(String name) {
        this.name = name;
    }

    public Administrator() {
    }

    public void addEmail(Email email) {
        emails.add(email);
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


