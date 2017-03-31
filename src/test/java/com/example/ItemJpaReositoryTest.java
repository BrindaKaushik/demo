package com.example;

import com.example.domain.Customer;
import com.example.domain.Item;
import com.example.domain.Menu;
import com.example.repository.ItemRepository;
import com.example.repository.LocationRepository;
import com.example.repository.MenuRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brindank on 3/28/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemJpaReositoryTest {

    @Autowired
    ItemRepository itemRepository;
    @Test
    //@Transactional//Automatically rollback once transaction will complete.
    public void testItem()
    {
         Menu menu1=new Menu();
         menu1.setName("NonVeg");
         Item item1=new Item("Limca",20L);
         item1.setMenu(menu1);
         itemRepository.save(item1);

        Menu menu2=new Menu();
        menu2.setName("Veg");
        Item item2=new Item("coke",20L);
        item2.setMenu(menu2);
        itemRepository.save(item2);

    }






    }

