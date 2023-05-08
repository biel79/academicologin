package com.fieb.tcc.academicologin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.fieb.tcc.academicologin.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
	
	
	}
