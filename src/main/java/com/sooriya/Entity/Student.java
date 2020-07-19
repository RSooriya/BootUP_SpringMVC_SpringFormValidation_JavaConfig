package com.sooriya.Entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.sooriya.Validator.CourseCode;
import com.sooriya.Validator.PhoneNumber;

public class Student {

	@NotBlank
	@Size(max=12)
	private String name;
	@NotNull
	@Min(3)
	@Max(18)
	private String age;
	@Pattern(regexp="^[0-9]{6}")
	private String postalCode;
	@PhoneNumber
	private String phoneNumber;
	@CourseCode
	private String courseCode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
}
