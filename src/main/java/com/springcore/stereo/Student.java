package com.springcore.stereo;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // This will make a bean without using xml. ID will be taken as the camelcase
			// name of the class by default. This name can be used to access this bean
//@Component("student1") //If you want to give another name to the bean or id, you can give the id as this also. Then use this id to get the bean.
public class Student {
	@Value("Ayush Singh")
	private String studentName;
	@Value("Mumbai")
	private String city;

	public HashSet<String> getCities() {
		return cities;
	}

	public void setCities(HashSet<String> cities) {
		this.cities = cities;
	}

	@Value("#{list}")
	private List<String> address;

	@Value("#{set}")
	private HashSet<String> cities;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
}
