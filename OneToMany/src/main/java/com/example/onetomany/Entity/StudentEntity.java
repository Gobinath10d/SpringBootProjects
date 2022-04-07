package com.example.onetomany.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Student")

public class StudentEntity {
	@Id

	int studid;
	@Override
	public String toString() {
		return "StudentEntity [studid=" + studid + ", studname=" + studname + ", emailid=" + emailid + ", mobno="
				+ mobno + "]";
	}
	String studname;
	String emailid;
    long mobno;
    
    
    
    public StudentEntity() {
		
	}
	public StudentEntity(int studid, String studname, String emailid, long mobno) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.emailid = emailid;
		this.mobno = mobno;
	}
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
     CourseEntity course;
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	public CourseEntity getCourse() {
		return course;
	}
	public void setCourse(CourseEntity course) {
		this.course = course;
	}
    
	

	
	

}
