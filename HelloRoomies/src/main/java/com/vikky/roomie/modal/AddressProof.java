package com.vikky.roomie.modal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class AddressProof {

	@Id
	@GeneratedValue
	private int addressProofId;
	private String addressProof;
	private String addressProofPhoto;
	private String addressProofDetails;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonIgnore
	private RoomieUser user;

	public AddressProof() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddressProof(int addressProofId, String addressProof, String addressProofPhoto, String addressProofDetails,
			RoomieUser user) {
		super();
		this.addressProofId = addressProofId;
		this.addressProof = addressProof;
		this.addressProofPhoto = addressProofPhoto;
		this.addressProofDetails = addressProofDetails;
		this.user = user;
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

	public RoomieUser getUser() {
		return user;
	}

	public void setUser(RoomieUser user) {
		this.user = user;
	}

}
