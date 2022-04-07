package com.example.onetomany.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name = "Course")

public class CourseEntity {
	@Id
	int courseid;
	String coursename;
	
	public CourseEntity(int courseid, String coursename) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
	}
	
	
	public CourseEntity() {
		
	}


	@Override
	public String toString() {
		return "CourseEntity [courseid=" + courseid + ", coursename=" + coursename + "]";
	}


	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "course")
	private List<StudentEntity>student;
	
	public List<StudentEntity> getStudent() {
		return student;
	}
	public void setStudent(List<StudentEntity> student) {
		this.student = student;
	}
	public int getCourseid() {   
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	

}
