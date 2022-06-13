package com.vikky.roomie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikky.roomie.modal.AddressProof;

@Repository
public interface RoomieAddressProofRepo extends JpaRepository<AddressProof, Integer>{

}
