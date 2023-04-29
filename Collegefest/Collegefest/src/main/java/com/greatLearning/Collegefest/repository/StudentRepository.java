package com.greatLearning.Collegefest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.Collegefest.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
