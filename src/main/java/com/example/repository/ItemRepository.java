package com.example.repository;

import com.example.domain.Item;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by brindank on 3/28/2017.
 */
public interface ItemRepository extends CrudRepository<Item,Long> {
}
