package com.McDiffyStore.entity;



import java.util.*;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
	private String username;
	private String password;
	@ManyToMany(mappedBy= "user")
	private List<Role> role=new ArrayList<>(); 
	
	
}
