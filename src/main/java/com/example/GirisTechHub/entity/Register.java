package com.example.GirisTechHub.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="RegisterStudent")
public class Register {
	@Id
	@Column(name="eid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="email")
	private String email;
	@Column(name="mobileno")
	private String mobileno;
	@Column(name="Address")
	private String Address;
	@Column(name="state")
	private String state;
	@Column(name="Degree")
	private String Degree;
	@Column(name="branch")
	private String branch;
	@Column(name="yearofpassing")
	private String yearofpassing;
	@Column(name="collegename")
	private String collegename;
	@Column(name="DegreeScore")
	private String DegreeScore;
	@Column(name="twelvescore")
	private String twelvescore;
	@Column(name="tenthscore")
	private String tenthscore;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getYearofpassing() {
		return yearofpassing;
	}
	public void setYearofpassing(String yearofpassing) {
		this.yearofpassing = yearofpassing;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getDegreeScore() {
		return DegreeScore;
	}
	public void setDegreeScore(String degreeScore) {
		DegreeScore = degreeScore;
	}
	public String getTwelvescore() {
		return twelvescore;
	}
	public void setTwelvescore(String twelvescore) {
		this.twelvescore = twelvescore;
	}
	public String getTenthscore() {
		return tenthscore;
	}
	public void setTenthscore(String tenthscore) {
		this.tenthscore = tenthscore;
	}
	
	

}
