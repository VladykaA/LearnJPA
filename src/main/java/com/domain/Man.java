package com.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@NamedQueries(
        @NamedQuery(name = "Get all men",
        query = "FROM Man m")
)
public class Man {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int age;

    @Embedded
    private Region region;

    @Transient
    private int countChildren;

    private LocalDateTime time;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Enumerated(EnumType.STRING)
    private Phone phone;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Man() {
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Man{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", region=" + region +
                ", countChildren=" + countChildren +
                ", time=" + time +
                ", date=" + date +
                ", phone=" + phone +
                '}';
    }
}
