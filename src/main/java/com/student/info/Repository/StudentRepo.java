package com.student.info.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.info.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>
{

	
}
