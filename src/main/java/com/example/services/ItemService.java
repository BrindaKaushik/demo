package com.example.services;

import com.example.domain.Item;
import com.example.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by brindank on 3/31/2017.
 */
@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    @Transactional
    public void save(Item item) {
        itemRepository.save(item);
    }

    @Transactional
    public Iterable<Item> findAll() {
        return itemRepository.findAll();
    }
}
