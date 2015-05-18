package cn.c.module.skating.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.c.core.controller.CrudController;
import cn.c.module.skating.domain.Student;
import cn.c.module.skating.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController extends CrudController<Student, StudentService> {

	@Override
	protected String getPathDirector(){
		this.addAttribute("uriDirector", this.getUriDirector());
		return "/skating/student";
	}
	
}
