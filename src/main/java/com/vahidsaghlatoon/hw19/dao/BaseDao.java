package com.vahidsaghlatoon.hw19.dao;

import com.vahidsaghlatoon.hw19.entity.BaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public abstract class BaseDao<T extends BaseEntity<ID>, ID extends Number> {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("bus-ticket");
    private final EntityManager entityManager = emf.createEntityManager();

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void save(T entity) {
        getEntityManager().getTransaction().begin();
        getEntityManager().persist(entity);
        getEntityManager().getTransaction().commit();
        getEntityManager().close();
    }

    public T loadById(ID id) {
        getEntityManager().getTransaction().begin();
        T entity = getEntityManager().find(getEntityClass(), id);
        getEntityManager().getTransaction().commit();
        getEntityManager().close();
        return entity;
    }

    public List<T> loadAll() {
        getEntityManager().getTransaction().begin();
        Query query = getEntityManager().createQuery("From " + getEntityClass().getSimpleName());
        getEntityManager().getTransaction().commit();
        getEntityManager().close();
        return query.getResultList();
    }

    public void update(T entity) {
        getEntityManager().getTransaction().begin();
        getEntityManager().merge(entity);
        getEntityManager().getTransaction().commit();
        getEntityManager().close();
    }

    public void delete(T entity) {
        getEntityManager().getTransaction().begin();
        getEntityManager().remove(entity);
        getEntityManager().getTransaction().commit();
        getEntityManager().close();
    }

    public abstract Class<T> getEntityClass();
}
