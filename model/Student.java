package org.web.model;

import javax.persistence.*;

@Entity
@Table(name = "student_table")
public class Student {
	@Column(name = "FIRSTNAME", nullable = false)
	private String FirstName;
	@Column(name = "LASTNAME", nullable = false)
	private String LastName;
	@Column(name = "GENDER", nullable = false)
	private boolean gender;
	@Id
	@Column(name = "EMAIL", nullable = false)
	private String email;
	@Column(name = "PHNO")
	private String phno;
	@Column(name = "DOB")
	private String dob;
	@Column(name = "COURSE")
	private String course;
	@Column(name = "YOP")
	private String yop;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getYop() {
		return yop;
	}

	public void setYop(String yop) {
		this.yop = yop;
	}

	public Student() {
		super();
	}
	

}
