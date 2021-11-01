package com.ssd.dao;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
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
public class Permisssion {
	
	@Id
	private Long authorityId;
	private String authority;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name="authorities_role",
			joinColumns = {@JoinColumn(name = "authorityId")},
			inverseJoinColumns = {@JoinColumn ( name = "roleId")}
			)
	private List<Role> roles;

}
