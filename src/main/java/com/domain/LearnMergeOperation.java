package com.domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LearnMergeOperation {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test_jpa");

        EntityManager em = factory.createEntityManager();

        EntityTransaction tran = em.getTransaction();

        tran.begin();

        Man man1 = em.find(Man.class, 5);

        tran.commit();

        em.close();

        EntityManager em1 = factory.createEntityManager();

        EntityTransaction tran1 = em1.getTransaction();

        tran1.begin();

        man1.setName("Jack");

        Man man = em1.merge(man1);

        em1.persist(man);

        tran1.commit();

        em1.close();

        factory.close();
    }
}
