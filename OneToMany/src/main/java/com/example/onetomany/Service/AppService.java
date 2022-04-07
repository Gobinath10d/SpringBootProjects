package com.example.onetomany.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.onetomany.Entity.CourseEntity;
import com.example.onetomany.Entity.StudentEntity;
import com.example.onetomany.Repository.CourseRepository;
import com.example.onetomany.Repository.StudentRepository;

@Service

public class AppService {
	@Autowired
	CourseRepository courserepo;
	@Autowired
	StudentRepository studrepo;
	
	public List<CourseEntity> insertcoursedetails(@RequestBody List<CourseEntity> courseentity) 
	{
		return courserepo.saveAll(courseentity);
	}
	
	public String insertstuddetails(@RequestBody List<StudentEntity> studentity)
	{
		studrepo.saveAll(studentity);
		return "insert sucessfully";
	}
		
	
	public List<CourseEntity>getcoursedetails()
	{
		return courserepo.findAll();
		
	}
	
	public List<StudentEntity>getstuddetails()
	{
		return studrepo.findAll();
	}
	

	public  String selectCourse(String coursename,String emailid) 
	{
	    Optional<CourseEntity>couOpt=courserepo.findBycoursename(coursename);
		Optional<StudentEntity>stdOpt=studrepo.findByemailid(emailid);
		
		
	if(couOpt.isPresent() && stdOpt.isPresent())
	{
		CourseEntity courseentity=couOpt.get();
		List<StudentEntity>stud = courseentity.getStudent();
		StudentEntity studentEntity=stdOpt.get();
		studentEntity.setCourse(courseentity);
        stud.add(studentEntity);
		
		
		courseentity.setStudent(stud);
		studrepo.save(studentEntity);
		courserepo.save(courseentity);
		
		return "successfully";
	}
	    return "failed";
}
	
	
public Optional<StudentEntity> CoursesDetailsBystudent(String emailid)
{
	return studrepo.findByemailid(emailid);
}
public List<StudentEntity> studentDetailsByCourses(String courseName)
{

	Optional<CourseEntity>couOpt=courserepo.findBycoursename(courseName);
	
	if(couOpt.isPresent())
	{
	
		return couOpt.get().getStudent();
	}
	else
	{
	
	   return null;
	}
}



}
