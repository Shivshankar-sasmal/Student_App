package com.app.student.DTO;

import org.springframework.data.jpa.repository.JpaRepository;



import com.app.student.entity_model.StudentEntity;



public interface StudentDTO extends JpaRepository<StudentEntity, Long>{
}
