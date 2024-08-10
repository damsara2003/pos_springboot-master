package com.project.springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.springboot.Repository.ItemRepository;
import com.project.springboot.entity.Item;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List <Item> getAllItems(){
        return itemRepository.findAll();
    }
     
    @Override
    public Item getItemById (Long id){
        return itemRepository.findById(id).orElse(null);

    }

    @Override
    public Item createItem (Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item updateItem(Long id, Item item) {
        Item existItem = itemRepository.findById(id).orElse(null);

        if (existItem == null){
            return null;
        }
        

        existItem.setName(item.getName());
        existItem.setPrice(item.getPrice());
        existItem.setQuantity(item.getQuantity());

        return itemRepository.save(existItem);
    }
       
}
