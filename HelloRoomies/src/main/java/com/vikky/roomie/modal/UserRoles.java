package com.vikky.roomie.modal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class UserRoles {

	@Id
	@GeneratedValue()
	private int roleId;
	private int roleName;
	private int roleDesc;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private RoomieUser user;

	public UserRoles(int roleId, int roleName, int roleDesc) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleDesc = roleDesc;
	}

	public UserRoles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getRoleName() {
		return roleName;
	}

	public void setRoleName(int roleName) {
		this.roleName = roleName;
	}

	public int getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(int roleDesc) {
		this.roleDesc = roleDesc;
	}

}
