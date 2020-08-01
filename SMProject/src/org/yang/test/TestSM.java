package org.yang.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yang.entity.Student;
import org.yang.mapper.StudentMapper;
import org.yang.service.IStudentService;
import org.yang.service.impl.StudentServiceImpl;

public class TestSM {
	
	private static ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
	
	public static void main(String[] args) throws IOException {
		
//		addStudent();
		queryStudentByStuNo();
	}

	private static void queryStudentByStuNo() {
		
		StudentServiceImpl studentService = (StudentServiceImpl)context.getBean("studentService");
		Student student = studentService.queryStudentByStuNo(1);
		System.out.println(student);
	}
	private static void addStudent() {
		StudentServiceImpl studentService = (StudentServiceImpl)context.getBean("studentService");
		Student student = new Student();
		student.setStuName("gao");
		student.setStuAge(21);
		studentService.addStudent(student);
		System.out.println("增加成功");
	}

	
}
