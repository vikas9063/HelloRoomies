package com.vikky.roomie.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vikky.roomie.modal.RoomieUser;
import com.vikky.roomie.repo.RoomieUserRepo;
import java.util.*;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private RoomieUserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		RoomieUser user = this.userRepo.findByUserEmail(username);
		
		return user;
	}

	
	
	
}
