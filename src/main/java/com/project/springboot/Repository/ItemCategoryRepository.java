package com.project.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.springboot.entity.ItemCategory;

@Repository
public interface ItemCategoryRepository extends JpaRepository <ItemCategory , Long>{
    
}
