package org.yang.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.yang.conf.MyConfig;
import org.yang.entity.Student;

//测试基于注解的spring

public class testAnnotation {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}
}
