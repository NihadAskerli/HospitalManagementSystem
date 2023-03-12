package com.company.hospitalmanagementsystem.repo;

import com.company.hospitalmanagementsystem.models.Doctor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
}
