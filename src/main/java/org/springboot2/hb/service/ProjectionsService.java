package org.springboot2.hb.service;

import org.springboot2.hb.dao.ProjectionDao;
import org.springboot2.hb.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProjectionsService {

    @Autowired
    private ProjectionDao projectionDao;

    @Transactional(readOnly = true)
    public Patient getPatient() {
        return projectionDao.getPatient();
    }
}
