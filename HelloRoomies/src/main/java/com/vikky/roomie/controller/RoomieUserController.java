package com.vikky.roomie.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikky.roomie.modal.RoomieUser;
import com.vikky.roomie.service.RoomieUserService;

@RestController
@RequestMapping("/api/v1/user")
public class RoomieUserController {

	@Autowired
	private RoomieUserService roomieUserService;

	@PostMapping("/create")
	public ResponseEntity<RoomieUser> insertUser(@RequestBody RoomieUser user) {
		
		user.setRegDate(new Timestamp(System.currentTimeMillis()));
		user.setEnabled(true);
		user.setIsDeleted(false);
		RoomieUser roomieUser = this.roomieUserService.createUser(user);

		return new ResponseEntity<RoomieUser>(roomieUser, HttpStatus.OK);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<RoomieUser> getUserById(@PathVariable long userId){
		RoomieUser roomieUser =  this.roomieUserService.getUserById(userId);
		return new ResponseEntity<RoomieUser>(roomieUser,HttpStatus.OK);
		
	}

}
