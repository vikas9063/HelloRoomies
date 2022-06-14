package com.vikky.roomie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikky.roomie.modal.RoomieUser;

@Repository
public interface RoomieUserRepo extends JpaRepository<RoomieUser, Long>{
	
	public RoomieUser findByUserEmail(String email);
	
	
}
