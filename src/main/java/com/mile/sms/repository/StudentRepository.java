package com.mile.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mile.sms.entity.Student;

@Repository //optional line
public interface StudentRepository extends JpaRepository<Student, Long>{

}
