package com.relationship.one_to_many.bi;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tree {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "tree")
    private List<Leaf> leaves = new ArrayList<>();

    public Tree(String name) {
        this.name = name;
    }

    public Tree() {
    }

    public void addLeaf(Leaf leaf) {
        leaves.add(leaf);
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

    public List<Leaf> getLeaves() {
        return leaves;
    }

    public void setLeaves(List<Leaf> leaves) {
        this.leaves = leaves;
    }
}
