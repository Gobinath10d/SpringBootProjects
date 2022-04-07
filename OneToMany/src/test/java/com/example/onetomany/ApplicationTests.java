package com.example.onetomany;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.onetomany.Entity.CourseEntity;
import com.example.onetomany.Entity.StudentEntity;
import com.example.onetomany.Service.AppService;

@SpringBootTest
@RunWith(SpringRunner.class)
class ApplicationTests {
	
	@MockBean
	AppService appService; 

	@Test
	void contextLoads() {	
	}
	
	@Test
	void getcoursedetails() {
	List<CourseEntity>  courseEntity =new ArrayList<>();
	courseEntity.add(new CourseEntity(1, "CIVIL"));
	courseEntity.add(new CourseEntity(2, "ECE"));
	
	Mockito.when(appService.getcoursedetails()).thenReturn(courseEntity);
	List<CourseEntity> expected = appService.getcoursedetails();
	assertEquals(expected, courseEntity);
	}
	
	@Test
	void insertcoursedetailsTest() {
		List<CourseEntity>  courseEntity =new ArrayList<>();
		courseEntity.add(new CourseEntity(1, "CIVIL"));
		courseEntity.add(new CourseEntity(2, "ECE"));
	
		Mockito.when(appService.insertcoursedetails(courseEntity)).thenReturn(courseEntity);
		List<CourseEntity> expected = appService.insertcoursedetails(courseEntity);
		assertEquals(expected,courseEntity);
	}
	
   @Test
	void getstuddetails() {
		List<StudentEntity> studententity = new ArrayList<>();
		studententity.add(new StudentEntity(1, "gobi", "gobi@gmail.com", 9875432));
		studententity.add(new StudentEntity(2, "jeeva","jeeva@mail.com", 89045322));
		
		Mockito.when(appService.getstuddetails()).thenReturn(studententity);
		List<StudentEntity> expected = appService.getstuddetails();
		assertEquals(expected, studententity);
	}
	
	@Test
	void insertstuddetails() {
		List<StudentEntity> studententity = new ArrayList<>();
		studententity.add(new StudentEntity(1, "gobi", "gobi@gmail.com", 94323404l));
		studententity.add(new StudentEntity(2, "jeeva", "jeeva@gmail.com", 9203231l));
		studententity.add(new StudentEntity(2, "sakthi", "sakthi@gmail.com", 9876543210l));
		
		Mockito.when(appService.insertstuddetails(studententity)).thenReturn("insert succesfully");
		String expected = appService.insertstuddetails(studententity);
		System.out.println(expected);
		assertEquals(expected,"insert succesfully");
		
}
    
   
    
    
     
}   
	
		



