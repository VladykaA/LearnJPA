package com.domain;

import javax.persistence.*;
import javax.persistence.criteria.*;
import java.util.List;

public class LearnCriteriaQuery {
    public static void main(String[] args) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test_jpa");
//
//        EntityManager em = factory.createEntityManager();
//
//        EntityTransaction tran = em.getTransaction();
//
//        tran.begin();
//
//        CriteriaBuilder builder = em.getCriteriaBuilder();
//
//        CriteriaQuery<Man> query = builder.createQuery(Man.class);
//
//        Root<Man> root = query.from(Man.class);
//
//        Path<Integer> pathId = root.get(Man_.id);
//
//        query.where(builder.equal(pathId, 1));
//
//        CriteriaQuery<Man> select = query.select(root);
//
//        TypedQuery<Man> query1 = em.createQuery(select);
//
////        query1.getResultStream().forEach(System.out::println);
//
//        Man man = query1.getSingleResult();
//
//        man.setAge(155);
//
//        tran.commit();
//
//        em.close();
//        factory.close();
    }
}

class LearnCriteriaUpdate {
    public static void main(String[] args) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test_jpa");
//
//        EntityManager em = factory.createEntityManager();
//
//        EntityTransaction tran = em.getTransaction();
//
//        tran.begin();
//
//        CriteriaBuilder builder = em.getCriteriaBuilder();
//
//        CriteriaUpdate<Man> update = builder.createCriteriaUpdate(Man.class);
//        CriteriaDelete<Man> delete = builder.createCriteriaDelete(Man.class);
//
//        Root<Man> root = update.from(Man.class);
//
//        Path<Integer> path = root.get(Man_.id);
//
//        Path<Integer> age = root.get(Man_.age);
//
//        update.set(age, 210);
//
//        update.where(builder.equal(path, 1));
//
//        em.createQuery(update).executeUpdate();
//
//        tran.commit();
//
//        em.close();
    }
}

class LearnMultiSelectCriteria {
    public static void main(String[] args) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test_jpa");
//
//        EntityManager em = factory.createEntityManager();
//
//        EntityTransaction tran = em.getTransaction();
//
//        tran.begin();
//
//        CriteriaBuilder builder = em.getCriteriaBuilder();
//
//        CriteriaQuery<Tuple> tupleQuery = builder.createTupleQuery();
//
//        Root<Man> root = tupleQuery.from(Man.class);
//
//        Path<Integer> pathId = root.get(Man_.id);
//
//        Path<String> pathName = root.get(Man_.name);
//
//        tupleQuery.multiselect(pathId, pathName);
//
//        TypedQuery<Tuple> query = em.createQuery(tupleQuery);
//
//        List<Tuple> list = query.getResultList();
//
//        list.forEach(tuple -> {
//            System.out.println(tuple.get(pathId) + "\t" + tuple.get(pathName));
//        });
//
//        tran.commit();
//
//        em.close();
    }
}
