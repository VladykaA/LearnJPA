package com.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Region {

    @Column(name = "region_name")
    private String name;

    @Column(name = "count_citizens")
    private int countCitizens;

    public Region(String name, int countCitizens) {
        this.name = name;
        this.countCitizens = countCitizens;
    }

    public Region() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountCitizens() {
        return countCitizens;
    }

    public void setCountCitizens(int countCitizens) {
        this.countCitizens = countCitizens;
    }
}
