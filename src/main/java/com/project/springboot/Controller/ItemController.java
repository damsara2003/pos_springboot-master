package com.project.springboot.Controller;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.project.springboot.Service.ItemService;
import com.project.springboot.entity.Item;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin(origins = "*")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public List <Item> getAllItems () {
        return itemService.getAllItems();
    }

    @GetMapping("/items/{id}")
    public ResponseEntity<Item> getProductById(@PathVariable Long id) {
        Item item = itemService.getItemById(id);

        if (item == null) {
            return ResponseEntity.status(404).build();

        } else {
            return ResponseEntity.status(200).body(item);
        }

    }

    @PostMapping("/items")
    public Item createItem (@RequestBody Item item) {
        
        return itemService.createItem(item);
    }
    
    
}
