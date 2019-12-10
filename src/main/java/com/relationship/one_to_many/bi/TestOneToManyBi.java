package com.relationship.one_to_many.bi;

import com.relationship.EntityManagerUtil;
import com.relationship.one_to_many.uni.Administrator;
import com.relationship.one_to_many.uni.Email;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOneToManyBi {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test_jpa");

//        EntityManager em = factory.createEntityManager();
        EntityManager em = EntityManagerUtil.getEntityManager();

        EntityTransaction tran = em.getTransaction();

        tran.begin();

        Tree tree = new Tree("Oak");

        Leaf leaf = new Leaf("One", tree);
        Leaf leaf1 = new Leaf("Two", tree);

        tree.addLeaf(leaf);
        tree.addLeaf(leaf1);

        leaf.setTree(tree);

//        em.persist(tree);

        Tree tree1 = em.find(Tree.class, 4);
/*
        tree1.getLeaves().set(0, null);
        tree1.getLeaves().clear();
*/

//        System.out.println(tree1.getLeaves());

        tran.commit();

        em.close();

        EntityManager em1 = factory.createEntityManager();

        EntityTransaction tran1 = em1.getTransaction();

        tran1.begin();

        tree1.setName("Klyon");

        Tree tree2 = em1.merge(tree1);

        em1.persist(tree2);

        tran1.commit();

        em1.close();

        factory.close();
    }
}

/*
* get() -> Tree(id != 0)
* update(Tree(id != 0))
*
* */
