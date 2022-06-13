package com.vikky.roomie.service;

import org.springframework.stereotype.Service;

import com.vikky.roomie.modal.RoomieUser;
import com.vikky.roomie.util.ResponseMessage;

@Service
public interface RoomieUserService {

	public RoomieUser createUser(RoomieUser user);
	
	public ResponseMessage updateUser(RoomieUser user, long user_id);
	
	public ResponseMessage deleteUser(long user_id);
	
	public RoomieUser getUserById(long userId);
	
	public RoomieUser getAllRooieUser();
	
}
