package com.student.info.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.info.Entity.Student;
import com.student.info.Repository.StudentRepo;
import com.student.info.Service.StudentService;

@Service
public class StudentServiceImpl implements  StudentService {

	
	private  StudentRepo  repo;
	
	
	
	public StudentServiceImpl(StudentRepo repo) {
		super();
		this.repo = repo;
	}
   


	@Override
	public List<Student> getAllStudents() {
		
		return repo.findAll();
	}



	@Override
	public Student savStudent(Student student) {
		
		return repo.save(student);
	}



	@Override
	public Student getStudentById(Long id) {
		
		return repo.findById(id).get();
	}



	@Override
	public Student updateStudent(Student student) {
		
		return repo.save(student);
	}



	@Override
	public void deleteStudentById(Long id) {
		repo.deleteById(id);
	}

}
