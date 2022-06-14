package com.vikky.roomie.modal;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class UserRoles {

	@Id
	@GeneratedValue
	private int userRoleId;

	
	@ManyToOne(fetch = FetchType.EAGER)
	private RoomieUser roomieUser;

	
	@ManyToOne(fetch = FetchType.EAGER)
	private Roles roles;

	public UserRoles(int userRoleId, RoomieUser roomieUser, Roles roles) {
		super();
		this.userRoleId = userRoleId;
		this.roomieUser = roomieUser;
		this.roles = roles;
	}

	public UserRoles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}

	public RoomieUser getRoomieUser() {
		return roomieUser;
	}

	public void setRoomieUser(RoomieUser roomieUser) {
		this.roomieUser = roomieUser;
	}

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

}
