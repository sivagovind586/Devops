package com.student.info.Controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.info.Entity.Student;
import com.student.info.Service.StudentService;

@Controller
public class StudentController {
	
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/students")
	public String  getAllStudent( Model model)
	{
		model.addAttribute("students", service.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String  createStudendForm( Model model)
	{
		Student student=new Student();
		
		model.addAttribute("student", student);
		return "create_student";
	}
	
	@PostMapping("/students")
	public String savestudents(@ModelAttribute("student") Student student)
	{
		
		service.savStudent(student);
		return "redirect:/students";
		
		
	}
	@GetMapping("/students/edit/{id}")
	public String editStudendFrom(@PathVariable long id,Model model)
	{
		
		model.addAttribute("student", service.getStudentById(id));
		//System.out.println("id by" +model);
		return "edit_student";
		
		
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,@ModelAttribute("student") Student student,Model model) {
		
		Student estudent=service.getStudentById(id);
		estudent.setId(student.getId());
		 estudent.setFirsName(student.getFirsName());
		 estudent.setLastName(student.getLastName());
		 estudent.setEmailId(student.getEmailId());
		 
		 service.updateStudent(estudent);
		
		return "redirect:/students";
	}
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id)
	{
		   service.deleteStudentById(id);
		return "redirect:/students";
		
	}
	

}
