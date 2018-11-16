package com.api.vmware.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.api.vmware.logic.Student;

@Repository
public class StudentDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NS = "com.api.vmware.mapper.userMapper.";
	
	public List<Student> getlist() {
		return sqlSession.selectList(NS+"getstulist");
	}

}
