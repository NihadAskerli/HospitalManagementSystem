package com.company.hospitalmanagementsystem.services.impl;

import com.company.hospitalmanagementsystem.models.Doctor;
import com.company.hospitalmanagementsystem.repo.DoctorRepository;
import com.company.hospitalmanagementsystem.services.inter.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;

    @Override
    public List<Doctor> getAllDoctor() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getById(long id) {
        return doctorRepository.findById(id).get();
    }

    @Override
    public Doctor save(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public void delete(long id) {
        doctorRepository.delete(doctorRepository.findById(id).get());
    }

    @Override
    public void update(long id) {

    }
}
