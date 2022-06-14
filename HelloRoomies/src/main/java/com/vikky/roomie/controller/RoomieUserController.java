package com.vikky.roomie.controller;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikky.roomie.dto.RoomieUserDto;
import com.vikky.roomie.modal.Roles;
import com.vikky.roomie.modal.RoomieUser;
import com.vikky.roomie.modal.UserRoles;
import com.vikky.roomie.service.RoomieUserService;

@RestController
@RequestMapping("/api/v1/user")
public class RoomieUserController {

	@Autowired
	private RoomieUserService roomieUserService;

	
	


//	Create  User controller 
	@PostMapping("/create")
	public ResponseEntity<RoomieUser> insertUser(@RequestBody RoomieUserDto userDto) throws Exception {

		userDto.setRegDate(new Timestamp(System.currentTimeMillis()));
		userDto.setEnabled(true);
		userDto.setDeleted(false);

		// Set user Role
		Roles role = new Roles();
		role.setRoleId(101);
		role.setRoleName("NORMAL");
		role.setRoleDesc("This is a normal user");
		
		RoomieUser user = roomieUserDtoToRoomieUser(userDto);
		
		UserRoles userRole =  new UserRoles();
		userRole.setRoles(role);
		userRole.setRoomieUser(user);
		
		Set<UserRoles> userRoles=new HashSet<>();
		userRoles.add(userRole);		
		RoomieUser roomieUser = this.roomieUserService.createUser(user,userRoles);
		return new ResponseEntity<RoomieUser>(roomieUser, HttpStatus.OK);
	}

//	

	@GetMapping("/{userId}")
	public ResponseEntity<RoomieUser> getUserById(@PathVariable long userId) {
		RoomieUser roomieUser = this.roomieUserService.getUserById(userId);
		return new ResponseEntity<RoomieUser>(roomieUser, HttpStatus.OK);

	}

	public RoomieUser roomieUserDtoToRoomieUser(RoomieUserDto roomieUserDto) {

		RoomieUser roomieUser = new RoomieUser();
		roomieUser.setId(roomieUserDto.getId());
		roomieUser.setAbout(roomieUserDto.getAbout());
		roomieUser.setDeleted(roomieUserDto.isDeleted());
		roomieUser.setEnabled(roomieUserDto.isEnabled());
		roomieUser.setDob(roomieUserDto.getDob());
		roomieUser.setFname(roomieUserDto.getFname());
		roomieUser.setLname(roomieUserDto.getLname());
		roomieUser.setGender(roomieUserDto.getGender());
		roomieUser.setMobileNo(roomieUserDto.getMobileNo());
		roomieUser.setPassword(roomieUserDto.getPassword());
		roomieUser.setProfile(roomieUserDto.getProfile());
		roomieUser.setRegDate(roomieUserDto.getRegDate());
		roomieUser.setUserRoles(roomieUserDto.getRoles());
		roomieUser.setUserEmail(roomieUserDto.getUserEmail());

		return roomieUser;
	}

}
