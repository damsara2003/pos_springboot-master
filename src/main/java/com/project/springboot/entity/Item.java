package com.project.springboot.entity;

import java.util.Locale.Category;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Item {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;


    private Double price;

   
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    



    

}
