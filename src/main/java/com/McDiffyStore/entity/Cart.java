package com.McDiffyStore.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartId;
	private double totalAmaount;
	@OneToOne
	private User user;
	//@ManyToOne
	//private CartProduct cartproduct;
}
