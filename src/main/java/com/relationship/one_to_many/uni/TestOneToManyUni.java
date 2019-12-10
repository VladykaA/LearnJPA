package com.relationship.one_to_many.uni;

import com.relationship.one_to_one.uni.Address;
import com.relationship.one_to_one.uni.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOneToManyUni {
    public static void main(String[] args) {
        /*EntityManagerFactory factory = Persistence.createEntityManagerFactory("test_jpa");

        EntityManager em = factory.createEntityManager();

        EntityTransaction tran = em.getTransaction();

        tran.begin();

        Email email = new Email("@gmail");
        Email email1 = new Email("@mail.ua");

        Administrator administrator = new Administrator("Ben");

        administrator.addEmail(email);
        administrator.addEmail(email1);

        em.persist(administrator);

        tran.commit();

        em.close();
        factory.close();*/
    }
}
