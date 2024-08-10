package com.project.springboot.Controller;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.springboot.Service.ItemCategoryService;
// import com.project.springboot.entity.Item;
import com.project.springboot.entity.ItemCategory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "*")
public class ItemCategoryController {

    @Autowired
    private ItemCategoryService itemCategoryService;

    @GetMapping("/itemCategories")
    public List<ItemCategory> getAllCategories() {
        return itemCategoryService.getAllCategories();
    }

    @GetMapping("/itemCategories/{id}")
    public ItemCategory getCategoryById (@PathVariable Long id) {
        return itemCategoryService.getCategoryById(id);
    }


    @PostMapping("/itemCategories")
    public ItemCategory createCategory(@RequestBody ItemCategory itemCategory) {

        return itemCategoryService.createCategory(itemCategory);
    }

    @DeleteMapping("/itemCategories/{id}")
    public void deleteItemCategory (@PathVariable Long id){
        itemCategoryService.deleteItemCategory(id);
    }

    

}
