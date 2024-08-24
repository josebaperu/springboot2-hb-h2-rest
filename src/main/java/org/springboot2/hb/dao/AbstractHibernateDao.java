package org.springboot2.hb.dao;

import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AbstractHibernateDao {
    @PersistenceContext
    protected EntityManager entityManager;

    protected Session getCurrentSession(){
        return entityManager.unwrap(Session.class);
    }
}
