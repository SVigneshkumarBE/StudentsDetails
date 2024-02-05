package org.vit.employee.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.vit.employee.Repository.StudentsRepository;
import org.vit.employee.Service.StudentService;
import org.vit.employee.model.StudentsModel;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentsRepository studentRepository;
	
	public StudentServiceImpl(StudentsRepository studentRepository) {
		super();
		this.studentRepository=studentRepository;
	}
	
	@Override
	public List<StudentsModel> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public StudentsModel saveStudent(StudentsModel studentsModel) {
		// TODO Auto-generated method stub
		return studentRepository.save(studentsModel);
	}

	@Override
	public StudentsModel getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public StudentsModel updadteStudent(StudentsModel studentsModel) {
		// TODO Auto-generated method stub
		return studentRepository.save(studentsModel);
	}

}
