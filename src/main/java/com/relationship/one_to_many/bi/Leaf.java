package com.relationship.one_to_many.bi;

import javax.persistence.*;

@Entity
public class Leaf {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "tree_fk_id")
    private Tree tree;

    public Leaf(String name, Tree tree) {
        this.name = name;
        this.tree = tree;
    }

    public Leaf() {
    }

    public void setTree(Tree tree) {
        this.tree = tree;
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

    public Tree getTree() {
        return tree;
    }
}
