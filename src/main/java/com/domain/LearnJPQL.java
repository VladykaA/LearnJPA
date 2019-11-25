package com.domain;

public class LearnJPQL {
    public static void main(String[] args) {
        //        TypedQuery<Man> query = em.createQuery("FROM Man m WHERE m.name = :tempName", Man.class);
        /*TypedQuery<Man> query = em.createQuery("FROM Man m", Man.class);

//        query.setParameter("tempName", "John");

        Man result = query.getSingleResult();*/

       /* TypedQuery<Man> allMen = em.createNamedQuery("Get all men", Man.class);

        List<Man> resultList = allMen.getResultList();*/

        /*Query query =
                em.createQuery("UPDATE Man m SET m.name = :newName WHERE m.id = :manId");
        query.setParameter("newName", "Joshua");
        query.setParameter("manId", 1);

        query.executeUpdate();*/
    }
}
