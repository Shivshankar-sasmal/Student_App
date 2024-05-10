package com.app.student.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.student.entity_model.StudentEntity;
import com.app.student.DTO.StudentDTO;

@Service
public class HomeService {
	@Autowired
	StudentDTO studentDTO_objectDto;
	
	public List<StudentEntity> GetAllfromStudent () {
		return studentDTO_objectDto.findAll();
	}
	
	public void add_student(StudentEntity student) {
		studentDTO_objectDto.save(student);
	}
	
	public void update_student(StudentEntity student) {
		studentDTO_objectDto.save(student);
	}
	
	public void delete_student(Long id) {
		studentDTO_objectDto.deleteById(id);
	}
	
	@SuppressWarnings("deprecation")
	public StudentEntity findByStudentId(Long id) {
		return studentDTO_objectDto.getById(id);
	}
}
