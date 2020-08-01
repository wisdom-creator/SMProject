package org.yang.mapper;

import org.yang.entity.Student;

public interface StudentMapper {
	
	public abstract void addStudent(Student student);
	public abstract Student queryStudentByStuNo(int stuNo);
	
}