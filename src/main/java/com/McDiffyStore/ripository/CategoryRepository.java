package com.McDiffyStore.ripository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.McDiffyStore.entity.Category;


public interface CategoryRepository extends JpaRepository <Category, Integer> {

}
