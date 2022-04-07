package com.example.onetomany.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetomany.Entity.CourseEntity;
import com.example.onetomany.Entity.StudentEntity;
import com.example.onetomany.Service.AppService;


@RestController

public class AppController {
	@Autowired
	AppService appservice;
	
	@PostMapping("/insert")
	public List<CourseEntity> insertcoursedetails(@RequestBody List<CourseEntity> courseentity) 
	{
		return appservice.insertcoursedetails(courseentity);
		
	}
	
	@PostMapping("/stdinsert")
	public String insertstuddetails(@RequestBody List<StudentEntity> studentity)
	{
	return appservice.insertstuddetails(studentity);
		
	}

	
	@GetMapping("/display")
	public List<CourseEntity>getcoursedetails(){
		return appservice.getcoursedetails();
	}
	
	@GetMapping("/stddisplay")
	public List<StudentEntity>getstuddetails(){
		return appservice.getstuddetails();
	}
////////////////////////////////////////////////////////////////////
	
	@PostMapping("/post/coursestudent")
	public String selectCourse(@RequestParam String coursename,@RequestParam String emailid ) 
	{
		System.out.println(coursename+" "+emailid);
		return appservice.selectCourse(coursename,emailid);
	}
	
	@GetMapping("/get/{emailid}")
	public Optional<StudentEntity> CoursesDetailsBystudent(@PathVariable  String emailid)
	{
		return appservice.CoursesDetailsBystudent(emailid);
	}
	
	
	@GetMapping("/get1/{coursename}")
	public List<StudentEntity> studentDetailsByCourses(@PathVariable  String coursename)
	{
		return appservice.studentDetailsByCourses(coursename);
	}
	

	
}
