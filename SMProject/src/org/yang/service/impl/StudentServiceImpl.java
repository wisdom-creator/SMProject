package org.yang.service.impl;

import org.yang.entity.Student;
import org.yang.mapper.StudentMapper;
import org.yang.service.IStudentService;

public class StudentServiceImpl implements IStudentService{
	
	private StudentMapper StudentMapper;
	
	public void setStudentMapper(StudentMapper studentMapper) {
		StudentMapper = studentMapper;
	}

	@Override
	public void addStudent(Student student) {
		StudentMapper.addStudent(student);
	}

	@Override
	public Student queryStudentByStuNo(int stuNo) {
		return StudentMapper.queryStudentByStuNo(stuNo);
	}

}
