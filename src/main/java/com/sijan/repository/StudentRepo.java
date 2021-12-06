package com.sijan.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.sijan.model.Student;


public interface StudentRepo extends JpaRepository<Student, Long>  {

}
