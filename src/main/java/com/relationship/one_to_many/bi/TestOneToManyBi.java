package com.relationship.one_to_many.bi;

import com.relationship.one_to_many.uni.Administrator;
import com.relationship.one_to_many.uni.Email;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOneToManyBi {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test_jpa");

        EntityManager em = factory.createEntityManager();

        EntityTransaction tran = em.getTransaction();

        tran.begin();

        Tree tree = new Tree("Oak");

        Leaf leaf = new Leaf("One", tree);
        Leaf leaf1 = new Leaf("Two", tree);

        tree.addLeaf(leaf);
        tree.addLeaf(leaf1);

        leaf.setTree(tree);

//        em.persist(tree);

        Tree tree1 = em.find(Tree.class, 1);

        tran.commit();

        em.close();
        factory.close();
    }
}
