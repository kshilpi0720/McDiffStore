package com.McDiffyStore.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name= "Categories")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "categoryId")
	private int categoryId;
	@Column(name= "categoryName")
	private String categoryName;
}
