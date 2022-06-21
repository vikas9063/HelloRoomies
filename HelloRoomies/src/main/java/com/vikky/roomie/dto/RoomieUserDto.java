package com.vikky.roomie.dto;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.vikky.roomie.modal.UserRoles;

import java.util.*;

public class RoomieUserDto {

	private long id;
	private String fname;
	private String lname;
	private String userEmail;
	private String dob;
	private String gender;
	private boolean isEnabled;
	private boolean isDeleted;
	private String mobileNo;
	private String password;
	private String about;
	private String profile;
	private Timestamp regDate;

	//private Set<UserRoles> roles = new HashSet<UserRoles>();

	private List<Authority> authorities = new ArrayList<>();

	public RoomieUserDto(long id, String fname, String lname, String userEmail, String dob, String gender,
			boolean isEnabled, boolean isDeleted, String mobileNo, String password, String about, String profile,
			Timestamp regDate, Set<UserRoles> roles) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.userEmail = userEmail;
		this.dob = dob;
		this.gender = gender;
		this.isEnabled = isEnabled;
		this.isDeleted = isDeleted;
		this.mobileNo = mobileNo;
		this.password = password;
		this.about = about;
		this.profile = profile;
		this.regDate = regDate;
		//this.roles = roles;
	}

	public RoomieUserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	/*
	 * public Set<UserRoles> getRoles() { return roles; }
	 */

	/*
	 * public void setRoles(Set<UserRoles> roles) { this.roles = roles; }
	 */
	public List<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
	}
	
	

}
