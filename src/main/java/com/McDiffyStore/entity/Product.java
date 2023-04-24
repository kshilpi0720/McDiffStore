package com.McDiffyStore.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
@Table

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private String productName;
	private double price;
	@ManyToOne
	private User seller;
	@ManyToOne
	private Category category;
}
