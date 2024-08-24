package org.springboot2.hb.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springboot2.hb.entity.Patient;
import org.springframework.stereotype.Repository;

@Repository("TestDao")
public class ProjectionDao extends AbstractHibernateDao {

    public Patient getPatient() {
        Criteria criteria = getCurrentSession().createCriteria(Patient.class)
                .add(Restrictions.eq("name", "carlos"));
        return (Patient) criteria.uniqueResult();
    }
}
