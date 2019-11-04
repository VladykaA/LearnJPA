package com.domain;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class LearnCriteriaQuery {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test_jpa");

        EntityManager em = factory.createEntityManager();

        EntityTransaction tran = em.getTransaction();

        tran.begin();

        CriteriaBuilder builder = em.getCriteriaBuilder();

        CriteriaQuery<Man> query = builder.createQuery(Man.class);

        Root<Man> root = query.from(Man.class);

        CriteriaQuery<Man> select = query.select(root);

        TypedQuery<Man> query1 = em.createQuery(select);

        query1.getResultStream().forEach(System.out::println);

        tran.commit();

        em.close();
        factory.close();
    }
}
