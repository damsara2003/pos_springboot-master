package com.project.springboot.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.springboot.entity.Item;

@Service
public interface ItemService {
    List<Item> getAllItems();
    Item getItemById (Long id);
    Item createItem (Item item);
    Item updateItem (Long id, Item item);

}

