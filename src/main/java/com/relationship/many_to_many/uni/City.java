package com.relationship.many_to_many.uni;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class City {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "city_citizen",
            joinColumns = @JoinColumn(name = "city_fk_id"),
            inverseJoinColumns = @JoinColumn(name = "citizen_fk_id"))
    private List<Citizen> citizens = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    public City() {
    }

    public void addCitizen(Citizen citizen) {
        citizens.add(citizen);
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

    public List<Citizen> getCitizens() {
        return citizens;
    }

    public void setCitizens(List<Citizen> citizens) {
        this.citizens = citizens;
    }
}
