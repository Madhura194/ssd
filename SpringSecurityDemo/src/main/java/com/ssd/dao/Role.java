package com.ssd.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Role {
	
	@Id
	private Long roleId;
	private String rolename;
	@ManyToMany(mappedBy = "roles")
	private List<Permisssion> authorities;
	@OneToMany(mappedBy = "role")
	private List<User> users;

}
