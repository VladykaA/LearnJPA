package com.inheritance.mapped_super_class;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestMSC {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test_jpa");

        EntityManager em = factory.createEntityManager();

        EntityTransaction tran = em.getTransaction();

        tran.begin();

        Mercedes mercedes = new Mercedes(12, "Merc", "X5");

        em.persist(mercedes);

        tran.commit();

        em.close();

    }
}
