package org.mycompany;

public class Employee {
	 private String refId;
	 private String reqTime;
	 private String idNo;
	 EmployeeProfile employeeProfile;


	 // Getter Methods 

	 public String getRefId() {
	  return refId;
	 }

	 public String getReqTime() {
	  return reqTime;
	 }

	 public String getIdNo() {
	  return idNo;
	 }

	 public EmployeeProfile getEmployeeProfile() {
	  return employeeProfile;
	 }

	 // Setter Methods 

	 public void setRefId(String refId) {
	  this.refId = refId;
	 }

	 public void setReqTime(String reqTime) {
	  this.reqTime = reqTime;
	 }

	 public void setIdNo(String idNo) {
	  this.idNo = idNo;
	 }

	 public void setEmployeeProfile(EmployeeProfile employeeProfile) {
	  this.employeeProfile = employeeProfile;
	 }

	 public class EmployeeProfile {
		 private String name;
		 private String employeeNo;
		 private String passportNo;
		 private String dob;
		 private String role;
		 private String employmentDate;
		 private String employmentStatus;


		 // Getter Methods 

		 public String getName() {
		  return name;
		 }

		 public String getEmployeeNo() {
		  return employeeNo;
		 }

		 public String getPassportNo() {
		  return passportNo;
		 }

		 public String getDob() {
		  return dob;
		 }

		 public String getRole() {
		  return role;
		 }

		 public String getEmploymentDate() {
		  return employmentDate;
		 }

		 public String getEmploymentStatus() {
		  return employmentStatus;
		 }

		 // Setter Methods 

		 public void setName(String name) {
		  this.name = name;
		 }

		 public void setEmployeeNo(String employeeNo) {
		  this.employeeNo = employeeNo;
		 }

		 public void setPassportNo(String passportNo) {
		  this.passportNo = passportNo;
		 }

		 public void setDob(String dob) {
		  this.dob = dob;
		 }

		 public void setRole(String role) {
		  this.role = role;
		 }

		 public void setEmploymentDate(String employmentDate) {
		  this.employmentDate = employmentDate;
		 }

		 public void setEmploymentStatus(String employmentStatus) {
		  this.employmentStatus = employmentStatus;
		 }
		}

}

