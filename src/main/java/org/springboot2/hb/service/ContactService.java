package org.springboot2.hb.service;


import org.springboot2.hb.dao.ProjectionDao;
import org.springboot2.hb.entity.Contact;
import org.springboot2.hb.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private ProjectionDao projectionDao;

    @Transactional(readOnly = true)
    public List<Contact> getAll() {
        return contactRepository.findAll();
    }
}
