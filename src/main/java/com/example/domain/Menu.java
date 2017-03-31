package com.example.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by brindank on 3/28/2017.
 */
@Entity
@Table(name = "MENU")
public class Menu  implements Serializable{
    private static final long serialVersionUID = -3009157732242241106L;
    @Id
    @Column(name = "MENU_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long menuId;

    @Column(name = "MENU_NAME")
    private String name;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL,targetEntity = Item.class)
    private List<Item> items;


    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }


    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
