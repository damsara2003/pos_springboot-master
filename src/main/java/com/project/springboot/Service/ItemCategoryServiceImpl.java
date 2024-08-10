package com.project.springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.springboot.Repository.ItemCategoryRepository;
import com.project.springboot.entity.ItemCategory;

@Service
public class ItemCategoryServiceImpl implements ItemCategoryService {

    @Autowired
    private ItemCategoryRepository itemCategoryRepository;

    @Override
    public List<ItemCategory> getAllCategories() {
        return itemCategoryRepository.findAll();
    }

    @Override
    public ItemCategory getCategoryById(Long id) {
        return itemCategoryRepository.findById(id).orElse(null);
    }

    @Override
    public ItemCategory createCategory(ItemCategory itemCategory) {
        return itemCategoryRepository.save(itemCategory);
    }

    @Override
    public void deleteItemCategory (Long id){
        itemCategoryRepository.deleteById(id);
    }

}
