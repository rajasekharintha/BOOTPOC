package com.java.model;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Students
{
//Defining book id as primary key
@Id
@Column
private int studentId;
@Column
private String name;
@Column
private String surname;
@Column
private int pincode;
@Column
private Date dob;
@Column
private Date jod;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public Date getJod() {
	return jod;
}
public void setJod(Date jod) {
	this.jod = jod;
}


}