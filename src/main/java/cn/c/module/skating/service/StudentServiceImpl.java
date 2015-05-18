package cn.c.module.skating.service;

import org.springframework.stereotype.Service;

import cn.c.core.service.CrudServiceImpl;
import cn.c.module.skating.domain.Student;
import cn.c.module.skating.repository.StudentRepository;

@Service
public class StudentServiceImpl extends CrudServiceImpl<Student, StudentRepository> implements StudentService {

}
