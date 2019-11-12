package com.relationship.one_to_one.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOneToOneBi {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test_jpa");

        EntityManager em = factory.createEntityManager();

        EntityTransaction tran = em.getTransaction();

        tran.begin();

        Person person = new Person("Ben");

        Home home = new Home("Big", person);

        person.setHome(home);

//        em.persist(person);

        Person person1 = em.find(Person.class, 1);

        tran.commit();

        em.close();
        factory.close();
    }
}
