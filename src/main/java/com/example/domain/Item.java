package com.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by brindank on 3/28/2017.
 */
@Entity
@Table
public class Item implements Serializable{
    private static final long serialVersionUID = -30091577142241606L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ITEM_ID")
    private Long Id;

    public Item(String name, Long price) {
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Long getPrice() {

        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Column(name="ITEM_NAME")
    private String name;
    @Column(name="PRICE")
    private Long price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "MENU_ID")
    private Menu menu;

}
