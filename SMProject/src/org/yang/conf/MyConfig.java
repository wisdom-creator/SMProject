package org.yang.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.yang.entity.Student;

@Configuration
public class MyConfig {
//	方法名为id值
	@Bean
	public Student student() {
		Student student = new Student(10,"yangjinzhi",23);
		return student;
	}
}
