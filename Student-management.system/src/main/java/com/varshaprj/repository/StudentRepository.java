package com.varshaprj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.varshaprj.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
