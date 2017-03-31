package com.example.controller;

import com.example.domain.Customer;
import com.example.domain.Item;
import com.example.domain.Menu;
import com.example.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by brindank on 3/31/2017.
 */

@RestController
public class ItemController {
    @Autowired
    ItemService service;

    @RequestMapping("/item/save")
    public String process() {

        Menu menu1 = new Menu();
        menu1.setName("NonVeg");
        Item item1 = new Item("Limca", 20L);
        item1.setMenu(menu1);
        service.save(item1);

        Menu menu2 = new Menu();
        menu2.setName("Veg");
        Item item2 = new Item("coke", 20L);
        item2.setMenu(menu2);

        service.save(item2);
        return "Done";
    }
    @RequestMapping("/customer/findall")
    public String findAll(){
        String result = "<html>";

        for(Item item : service.findAll()){
            result += "<div>" + item.toString() + "</div>";
        }

        return result + "</html>";
    }

}
