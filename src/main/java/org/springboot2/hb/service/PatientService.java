package org.springboot2.hb.service;

import org.springboot2.hb.entity.Patient;
import org.springboot2.hb.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;
    @Transactional(readOnly = true)
        public List<Patient> getAll(){
            return  patientRepository.findAll();
        }
}
