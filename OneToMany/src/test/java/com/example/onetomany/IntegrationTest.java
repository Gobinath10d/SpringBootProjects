package com.example.onetomany;

import com.example.onetomany.Entity.CourseEntity;
import com.example.onetomany.Entity.StudentEntity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest(classes = Application.class,webEnvironment = WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class IntegrationTest {

	
	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate = new TestRestTemplate();

	
	@Test
	public void getcoursedetailsList() {
		
		String url = "http://localhost:"+port+"/display";
		HttpEntity<String>entity=new HttpEntity<String>(null,null);
		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
		System.out.println(responseEntity);
	}
	@Test
   public void insertcoursedetails(){
		String url = "http://localhost:"+port+"/insert";
		CourseEntity courseEntity = new CourseEntity(1,"ECE");
		HttpEntity<CourseEntity>entity=new HttpEntity<CourseEntity>(courseEntity,null );
		ResponseEntity<String> response = restTemplate.exchange(url,HttpMethod.POST,entity,String.class);
		System.out.println(response);
	}
	
	@Test
	public void getstuddetails()
	{
		String url = "http://localhost:"+port+"/stddisplay";
		HttpEntity<String>entity= new HttpEntity<String>(null, null);
	   ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET,entity,String.class);
	   System.out.println(response);
	}

	@Test
	public void insertstuddetails()
	{
		String url = "http://localhost:"+port+"/stdinsert";
		StudentEntity studententity =  new StudentEntity(1, "gobi", "gobi@gmail.com", 98321321);
		HttpEntity<StudentEntity>entity = new HttpEntity<StudentEntity>(studententity, null);
		ResponseEntity<StudentEntity> response = restTemplate.exchange(url, HttpMethod.POST, entity, StudentEntity.class);
	    System.out.println(response);	
		
	}
	
	
	

		
	
	
	
}
