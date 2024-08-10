package com.project.springboot.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.springboot.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository <Item, Long> {
    
}
