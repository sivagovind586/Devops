package com.student.info.Service;

import java.util.List;

import com.student.info.Entity.Student;

public interface StudentService {

	
	List<Student> getAllStudents();
	Student savStudent(Student student);
      
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
	
}
