package org.vit.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.vit.employee.Service.StudentService;

@Controller
public class StudentsDetailsController {
	
	private StudentService studentsService;

	public StudentsDetailsController(StudentService studentsService) {
		super();
		this.studentsService = studentsService;
	}
	
	@GetMapping("/studentDetails")
	public String studentDetails(Model model) {
	}
	}
	
