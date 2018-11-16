package com.api.vmware.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.api.vmware.logic.Student;
import com.api.vmware.service.StudentService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class StudentController {

	  @Autowired
	    private StudentService stuService;
	    
	    @RequestMapping("studentList.do")
//	    세션을 사용하고 싶으면 세션 참조변수를 매개변수로 두면 기본객체 세션객체가 들어왔던거 처럼
//	    resp객체를 매개변수로 주면 기본객체 resp객체가 여길로 들어옴
	    public void studentList(HttpServletResponse resp){
	        List<Student> studentList = new ArrayList<Student>();
	        studentList = stuService.getStudentList();
	        ObjectMapper mapper = new ObjectMapper();
	        
	        try {
	            String str = mapper.writeValueAsString(studentList);
	            resp.setCharacterEncoding("UTF-8");
	            resp.getWriter().println(str);
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            System.out.println("???");
	        }
	    }
	    
	    @RequestMapping("studentList2.do")
	    @ResponseBody
	    public List<Student> studentList2(){
	    	System.out.println("???");
	    	return stuService.getStudentList();
	    }

	
	
}
