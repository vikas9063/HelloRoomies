package com.vikky.roomie.modal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class RoomieAddress {

	@Id
	@GeneratedValue
	private int addressId;
	private String village;
	private String city;
	private int pinCode;
	private String state;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonIgnore
	private RoomieUser user;

	public RoomieAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoomieAddress(int addressId, String village, String city, int pinCode, String state, RoomieUser user) {
		super();
		this.addressId = addressId;
		this.village = village;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
		this.user = user;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public RoomieUser getUser() {
		return user;
	}

	public void setUser(RoomieUser user) {
		this.user = user;
	}

}
