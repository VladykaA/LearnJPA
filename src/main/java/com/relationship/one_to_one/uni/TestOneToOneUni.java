package com.relationship.one_to_one.uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOneToOneUni {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test_jpa");

        EntityManager em = factory.createEntityManager();

        EntityTransaction tran = em.getTransaction();

        tran.begin();

        Student student = new Student("Ben");

        Address address = new Address("Kiev");

        student.setAddress(address);

        em.persist(student);

        tran.commit();

        em.close();
        factory.close();
    }
}
