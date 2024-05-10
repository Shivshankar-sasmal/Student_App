package com.app.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.student.entity_model.StudentEntity;
import com.app.student.service.HomeService;



@Controller
@RequestMapping("/")
public class HomeController {
	@Autowired
	HomeService homeService_object;
	
	@GetMapping
	public String home(Model model) {
		model.addAttribute("students", homeService_object.GetAllfromStudent());
		return "/html/home";
	}
	
	
	@GetMapping("/new")
	public String add_student(Model model) {
		model.addAttribute("student", new StudentEntity());
		return "/html/create_student";
	}
	
	
	@PostMapping("/save_student") 
	public String add_student(@ModelAttribute("student") StudentEntity student) {
		homeService_object.add_student(student);
		return "redirect:/";
	}
	
	
	@GetMapping("update/{id}")
	public String update_student(@PathVariable Long id, Model model) {
 		model.addAttribute("student", homeService_object.findByStudentId(id));
		return "html/update_student";
	}
	
	@PostMapping("update_save_student/{id}")
	public String update_save_student(@PathVariable long id, @ModelAttribute("student") StudentEntity object) {
		StudentEntity studentEntity_object = homeService_object.findByStudentId(id);
		studentEntity_object.setFirst_name(object.getFirst_name());
		studentEntity_object.setLast_name(object.getLast_name());
		studentEntity_object.setMail_id(object.getMail_id());
		homeService_object.update_student(studentEntity_object);
		return "redirect:/";
	}
	
	
	@GetMapping("delete/{id}")
	public String delete_student(@PathVariable Long id) {
		homeService_object.delete_student(id);
		return "redirect:/";
	}
	
}
