package com.niit.hibernatejava.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
int empid;
String empname;
String empdesig;
String empdept;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpdesig() {
	return empdesig;
}
public void setEmpdesig(String empdesig) {
	this.empdesig = empdesig;
}
public String getEmpdept() {
	return empdept;
}
public void setEmpdept(String empdept) {
	this.empdept = empdept;
}

}
