package com.api.vmware.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.vmware.dao.StudentDAO;
import com.api.vmware.logic.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO stuDAO;
	
	@Override
	public List<Student> getStudentList() {
		return stuDAO.getlist();
	}

	
	
}
