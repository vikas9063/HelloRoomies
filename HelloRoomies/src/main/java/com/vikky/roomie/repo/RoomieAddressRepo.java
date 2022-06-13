package com.vikky.roomie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikky.roomie.modal.RoomieAddress;

@Repository
public interface RoomieAddressRepo extends JpaRepository<RoomieAddress, Integer>{

}
