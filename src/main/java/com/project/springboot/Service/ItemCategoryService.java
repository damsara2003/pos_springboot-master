package com.project.springboot.Service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.project.springboot.entity.ItemCategory;

@Service
public interface ItemCategoryService {
    List<ItemCategory> getAllCategories();

    ItemCategory getCategoryById  (Long id);

    ItemCategory createCategory(ItemCategory itemCategory);

    void deleteItemCategory (Long id);



}
