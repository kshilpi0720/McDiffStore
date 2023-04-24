package com.McDiffyStore.ripository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.McDiffyStore.entity.User;

public interface UserRipository extends JpaRepository <User, Integer> {

}
