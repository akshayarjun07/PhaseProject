package com.simplilearn.models;

public class Student {
	
	private int id;
	private String fname;
	private String lname;
	private int age;
	private int aclasss;
	
	
	
	
	public Student(int id, String fname, String lname, int age, int aclasss) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.aclasss = aclasss;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAclasss() {
		return aclasss;
	}
	public void setAclass(int aclasss) {
		this.aclasss = aclasss;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", aclasss=" + aclasss
				+ "]";
	}
 
	

}
