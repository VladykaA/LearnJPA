package com.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


public class TestJPA {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test_jpa");

        EntityManager em = factory.createEntityManager();

        EntityTransaction tran = em.getTransaction();

        tran.begin();

        Man man = new Man("Graham", 25);

        man.setPhone(Phone.FAX);

        Region region = new Region("My", 120);

        man.setRegion(region);

        man.setDate(new Date());
        man.setTime(LocalDateTime.now());

//        em.persist(man);
        Man man1 = em.find(Man.class, 1);

//        man1.setAge(120);

//        TypedQuery<Man> query = em.createQuery("FROM Man m WHERE m.name = :tempName", Man.class);
        /*TypedQuery<Man> query = em.createQuery("FROM Man m", Man.class);

//        query.setParameter("tempName", "John");

        Man result = query.getSingleResult();*/

       /* TypedQuery<Man> allMen = em.createNamedQuery("Get all men", Man.class);

        List<Man> resultList = allMen.getResultList();*/

        Query query =
                em.createQuery("UPDATE Man m SET m.name = :newName WHERE m.id = :manId");
        query.setParameter("newName", "Joshua");
        query.setParameter("manId", 1);

        query.executeUpdate();

        tran.commit();

        em.close();
        factory.close();
    }
}

/*
* 1)
* 2)
* 3)
* 4)
*
* */
