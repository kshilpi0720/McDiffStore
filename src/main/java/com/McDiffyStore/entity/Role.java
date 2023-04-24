package com.McDiffyStore.entity;





import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ROLE")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roleId;
	
	private String role;
	@ManyToMany(cascade= CascadeType.MERGE)
	private List<User> user=new ArrayList<>();
}
