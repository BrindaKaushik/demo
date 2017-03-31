package com.example;

import com.example.domain.Customer;
import com.example.domain.Item;
import com.example.domain.Menu;
import com.example.repository.CustomerRepository;
import com.example.repository.MenuRepository;
import com.example.repository.MenuRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by brindank on 3/28/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MenuJpaRepositoryTest
{

    @Autowired
    DataSource dataSource;
    @Autowired
    MenuRepository menuRepository;

    @Test
    public void contextLoads() throws SQLException {
        Assert.assertNotNull(dataSource.getConnection());
    }
    /*@Test
    public void testMenu()
    {

        Item item=new Item("chicken8",250L);

        List<Item> items=new ArrayList<Item>();
        items.add(item);

        Menu menu=new Menu();
        menu.setName("NonVegMenu");
        menu.setItems(items);

        item.setMenu(menu);

       menuJpaRepository.save(menu);

    }
*/
}
