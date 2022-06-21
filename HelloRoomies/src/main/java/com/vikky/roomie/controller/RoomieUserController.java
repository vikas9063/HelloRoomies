package com.vikky.roomie.controller;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
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
@RequestMapping("/api/v1")
public class RoomieUserController {
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private RoomieUserService roomieUserService;

	@Autowired
	private PasswordEncoder passwordEncoder;

//	Create  User controller 
	@PostMapping("/auth/create")
	public ResponseEntity<RoomieUserDto> insertUser(@RequestBody RoomieUserDto userDto) throws Exception {

		userDto.setRegDate(new Timestamp(System.currentTimeMillis()));
		userDto.setEnabled(true);
		userDto.setDeleted(false);

		// Set user Role
		Roles role = new Roles();
		role.setRoleId(101);
		role.setRoleName("ROLE_NORMAL");
		role.setRoleDesc("This is a normal user");

		RoomieUser user = this.modelMapper.map(userDto, RoomieUser.class);
		user.setPassword(this.passwordEncoder.encode(userDto.getPassword()));

		UserRoles userRole = new UserRoles();
		userRole.setRoles(role);
		userRole.setRoomieUser(user);

		Set<UserRoles> userRoles = new HashSet<>();
		userRoles.add(userRole);

		RoomieUser roomieUser = this.roomieUserService.createUser(user, userRoles);
		return new ResponseEntity<RoomieUserDto>(this.modelMapper.map(roomieUser, RoomieUserDto.class), HttpStatus.OK);
	}

//	

	
	@PreAuthorize("hasAnyRole('ADMIN','NORMAL')")
	@GetMapping("/user/{userId}")
	public ResponseEntity<RoomieUserDto> getUserById(@PathVariable long userId) {
		RoomieUser roomieUser = this.roomieUserService.getUserById(userId);
		return new ResponseEntity<RoomieUserDto>(this.modelMapper.map(roomieUser, RoomieUserDto.class), HttpStatus.OK);

	}

	

}
