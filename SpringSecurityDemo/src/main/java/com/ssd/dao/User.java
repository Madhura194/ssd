package com.ssd.dao;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {
	
	@Id
	private Long userId;
	private String username;
	private String password;
	private String email;
	@ManyToOne
	@JoinColumn(name = "roleId")
	private Role role;
	
	
	

}
