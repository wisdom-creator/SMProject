package org.yang.service;

import org.yang.entity.Student;

public interface IStudentService {
	public void addStudent(Student student);
	public Student queryStudentByStuNo(int stuNo);
}
