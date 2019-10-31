package com.domain;

import javax.persistence.*;

public class TestJPA {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test_jpa");

        EntityManager em = factory.createEntityManager();

        EntityTransaction tran = em.getTransaction();

        tran.begin();

        Man man = new Man("Jack", 25);

//        em.persist(man);

//        TypedQuery<Man> query = em.createQuery("FROM Man m WHERE m.name = :tempName", Man.class);
        TypedQuery<Man> query = em.createQuery("FROM Man m", Man.class);

        query.setParameter("tempName", "John");

        Man result = query.getSingleResult();

        tran.commit();

        em.close();
        factory.close();
    }
}
