package com.vikky.roomie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikky.roomie.modal.UserRoles;

@Repository
public interface UserRolesRepo extends JpaRepository<UserRoles, Integer> {

}
