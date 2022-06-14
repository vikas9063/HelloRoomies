package com.vikky.roomie.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.vikky.roomie.modal.RoomieUser;
import com.vikky.roomie.modal.UserRoles;
import com.vikky.roomie.util.ResponseMessage;

@Service
public interface RoomieUserService {

	public RoomieUser createUser(RoomieUser user, Set<UserRoles> userRoles) throws Exception;
	
	public ResponseMessage updateUser(RoomieUser user, long user_id);
	
	public ResponseMessage deleteUser(long user_id);
	
	public RoomieUser getUserById(long userId);
	
	public RoomieUser getAllRooieUser();
	
}
