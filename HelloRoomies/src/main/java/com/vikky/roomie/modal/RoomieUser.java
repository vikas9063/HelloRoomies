package com.vikky.roomie.modal;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class RoomieUser{

	@Id
	@GeneratedValue
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
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<UserRoles> roles = new HashSet<UserRoles>();
	
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	
	private Set<RoomieAddress> address = new HashSet<RoomieAddress>();
	

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<AddressProof> addressProof = new HashSet<>();

	public RoomieUser(long id, String fname, String lname, String userEmail, String dob, String gender,
			boolean isEnabled, boolean isDeleted, String mobileNo, String password, String about, String profile,
			Timestamp regDate, Set<RoomieAddress> address, Set<AddressProof> addressProof) {
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
		this.address = address;
		this.addressProof = addressProof;
	}

	public RoomieUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getid() {
		return id;
	}

	public void setid(long id) {
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

	public boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
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

	public Set<RoomieAddress> getAddress() {
		return address;
	}

	public void setAddress(Set<RoomieAddress> address) {
		this.address = address;
	}

	public Set<AddressProof> getAddressProof() {
		return addressProof;
	}

	public void setAddressProof(Set<AddressProof> addressProof) {
		this.addressProof = addressProof;
	}
	
	
	
	
}
