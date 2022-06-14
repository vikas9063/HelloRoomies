package com.vikky.roomie.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikky.roomie.exceptionHandler.UserAlreadyPresentException;
import com.vikky.roomie.modal.RoomieUser;
import com.vikky.roomie.modal.UserRoles;
import com.vikky.roomie.repo.RolesRepo;
import com.vikky.roomie.repo.RoomieUserRepo;
import com.vikky.roomie.service.RoomieUserService;
import com.vikky.roomie.util.ResponseMessage;

@Service
public class RoomieUserServiceImpl implements RoomieUserService {

	@Autowired
	private RoomieUserRepo roomieUserRepo;


	@Autowired
	private RolesRepo rolesRepo;

	@Override
	public RoomieUser createUser(RoomieUser user, Set<UserRoles> userRoles) throws Exception {

		if(this.roomieUserRepo.findByUserEmail(user.getUserEmail()) != null) {
			
			throw new UserAlreadyPresentException("User is already present");
		}
		
		for (UserRoles ur : userRoles) {
			this.rolesRepo.save(ur.getRoles());
		}
		user.setUserRoles(userRoles);

		return this.roomieUserRepo.save(user);
	}

	@Override
	public ResponseMessage updateUser(RoomieUser user, long user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseMessage deleteUser(long user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoomieUser getUserById(long userId) {

		return this.roomieUserRepo.findById(userId).get();
	}

	@Override
	public RoomieUser getAllRooieUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
