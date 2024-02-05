package org.vit.employee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema="MobileAPP",name="StudentsDetails")
public class StudentsModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="std_name",nullable=false)
	private String StdName;
	
	@Column(name="phno.")
	private String PhoneNo;
	
	
	public StudentsModel(int id, String stdName, String phoneNo) {
		super();
		id = id;
		StdName = stdName;
		PhoneNo = phoneNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		id = id;
	}
	
	public String getStdName() {
		return StdName;
	}
	public void setStdName(String stdName) {
		StdName = stdName;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	
	
	
	
}
