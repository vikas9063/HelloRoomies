package com.vikky.roomie.dto;

public class RoomieAddressDto {

	private int addressId;
	private String village;
	private String city;
	private int pinCode;
	private String state;

	public RoomieAddressDto(int addressId, String village, String city, int pinCode, String state) {
		super();
		this.addressId = addressId;
		this.village = village;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
	}

	public RoomieAddressDto() {
		super();
		// TODO Auto-generated constructor stub
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

}
