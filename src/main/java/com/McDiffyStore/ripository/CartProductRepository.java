package com.McDiffyStore.ripository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.McDiffyStore.entity.CartProduct;


public interface CartProductRepository extends JpaRepository <CartProduct, Integer> {

}
