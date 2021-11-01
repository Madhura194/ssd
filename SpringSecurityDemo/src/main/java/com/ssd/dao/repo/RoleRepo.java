package com.ssd.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssd.dao.Permisssion;
import com.ssd.dao.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {

}
