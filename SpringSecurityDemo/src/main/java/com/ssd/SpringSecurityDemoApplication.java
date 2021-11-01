package com.ssd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ssd.dao.Permisssion;
import com.ssd.dao.Role;
import com.ssd.dao.User;
import com.ssd.dao.repo.PermissionsRepo;
import com.ssd.dao.repo.RoleRepo;
import com.ssd.dao.repo.UserRepo;

@SpringBootApplication
public class SpringSecurityDemoApplication {

	@Autowired
	
	UserRepo userRepo;
	
	@Autowired
	static
	
	RoleRepo rolerepo;
	
	@Autowired
	static
	
	PermissionsRepo perrepo ; 
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDemoApplication.class, args);
		initializedata();
		
	}
	
	private static  void initializedata() {
		List<Role> roles = rolerepo.findAll();
		List<Permisssion> permissions = perrepo.findAll();
		for (Role role : roles) {
			if(role.getRoleId()==1)
				role.setAuthorities(permissions);
			if(role.getRoleId()==2)
				role.setAuthorities(permissions.subList(0,2));
			if(role.getRoleId()==3)
				role.setAuthorities(permissions.subList(1, 2));
			
			rolerepo.save(role);
		}
	
	}

}
