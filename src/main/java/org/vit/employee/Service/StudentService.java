package org.vit.employee.Service;

import java.util.List;

import org.vit.employee.model.StudentsModel;

public interface StudentService {

	List<StudentsModel> getAllStudents();

	StudentsModel saveStudent(StudentsModel studentsModel);
	
	StudentsModel getStudentById(int id);
	
	StudentsModel updadteStudent(StudentsModel studentsModel);
	
}
