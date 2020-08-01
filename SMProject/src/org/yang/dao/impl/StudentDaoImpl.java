package org.yang.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.yang.entity.Student;
import org.yang.mapper.StudentMapper;

public class StudentDaoImpl extends SqlSessionDaoSupport implements StudentMapper{
	
	@Override
	public void addStudent(Student student) {
		SqlSession sqlSession = super.getSqlSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		studentMapper.addStudent(student);
	}

	@Override
	public Student queryStudentByStuNo(int stuNo) {
		SqlSession sqlSession = super.getSqlSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		return studentMapper.queryStudentByStuNo(stuNo);
	}

}
