package com.vikky.roomie.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikky.roomie.modal.RoomieUser;
import com.vikky.roomie.repo.RoomieAddressProofRepo;
import com.vikky.roomie.repo.RoomieAddressRepo;
import com.vikky.roomie.repo.RoomieUserRepo;
import com.vikky.roomie.service.RoomieUserService;
import com.vikky.roomie.util.ResponseMessage;

@Service
public class RoomieUserServiceImpl implements RoomieUserService {

	@Autowired
	private RoomieUserRepo roomieUserRepo;
	
	@Autowired
	private RoomieAddressProofRepo addressProofRepo;
	
	@Autowired
	private RoomieAddressRepo addressRepo;
	
	@Override
	public RoomieUser createUser(RoomieUser user) {
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
