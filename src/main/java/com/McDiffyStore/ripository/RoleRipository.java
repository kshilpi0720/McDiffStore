package com.McDiffyStore.ripository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.McDiffyStore.entity.Role;
import com.McDiffyStore.entity.User;

public interface RoleRipository extends JpaRepository <Role, Integer> {

}
