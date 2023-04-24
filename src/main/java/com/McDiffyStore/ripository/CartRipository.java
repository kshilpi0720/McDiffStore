package com.McDiffyStore.ripository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.McDiffyStore.entity.Cart;
import com.McDiffyStore.entity.Role;
import com.McDiffyStore.entity.User;

public interface CartRipository extends JpaRepository <Cart, Integer> {

}
