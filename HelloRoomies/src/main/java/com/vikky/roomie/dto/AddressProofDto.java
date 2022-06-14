package com.vikky.roomie.dto;

public class AddressProofDto {

	private int addressProofId;
	private String addressProof;
	private String addressProofPhoto;
	private String addressProofDetails;

	public AddressProofDto(int addressProofId, String addressProof, String addressProofPhoto,
			String addressProofDetails) {
		super();
		this.addressProofId = addressProofId;
		this.addressProof = addressProof;
		this.addressProofPhoto = addressProofPhoto;
		this.addressProofDetails = addressProofDetails;
	}

	public AddressProofDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAddressProofId() {
		return addressProofId;
	}

	public void setAddressProofId(int addressProofId) {
		this.addressProofId = addressProofId;
	}

	public String getAddressProof() {
		return addressProof;
	}

	public void setAddressProof(String addressProof) {
		this.addressProof = addressProof;
	}

	public String getAddressProofPhoto() {
		return addressProofPhoto;
	}

	public void setAddressProofPhoto(String addressProofPhoto) {
		this.addressProofPhoto = addressProofPhoto;
	}

	public String getAddressProofDetails() {
		return addressProofDetails;
	}

	public void setAddressProofDetails(String addressProofDetails) {
		this.addressProofDetails = addressProofDetails;
	}

}
