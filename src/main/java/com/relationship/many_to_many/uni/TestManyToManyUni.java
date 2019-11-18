package com.relationship.many_to_many.uni;

import com.relationship.one_to_many.uni.Administrator;
import com.relationship.one_to_many.uni.Email;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestManyToManyUni {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test_jpa");

        EntityManager em = factory.createEntityManager();

        EntityTransaction tran = em.getTransaction();

        tran.begin();

       Citizen citizen = new Citizen("Ben");
       Citizen citizen1 = new Citizen("John");

       City city = new City("Kiev");
       City city1 = new City("Dnepr");

       city.addCitizen(citizen);
       city.addCitizen(citizen1);

       city1.addCitizen(citizen);
       city1.addCitizen(citizen1);

        em.persist(city);
        em.persist(city1);

        tran.commit();

        em.close();
        factory.close();
    }
}
