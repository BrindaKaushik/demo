package com.example;

import com.example.domain.Branch;
import com.example.domain.Customer;
import com.example.domain.Location;
import com.example.repository.BranchRepository;
import com.example.repository.MenuRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by brindank on 3/28/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BranchJpaRepository {

    @Autowired
    DataSource dataSource;
    @Autowired
    BranchRepository branchRepository;

    @Test
    public void contextLoads() throws SQLException {
        Assert.assertNotNull(dataSource.getConnection());
    }
@RequestMapping
    @Test
    public void testLocation() {
        Location loc1 = new Location();
        loc1.setState("karnataka");
        loc1.setCountry("india");

        Branch b1 = new Branch();
        b1.setFoundedDate("march-2-1999");
        b1.setLocation(loc1);
        branchRepository.save(b1);

        Location loc2 = new Location();
        loc2.setState("tamilnadu");
        loc2.setCountry("india");

         Branch b2 = new Branch();
         b2.setFoundedDate("December-2-2002");
         b2.setLocation(loc2);
          branchRepository.save(b2);

        Location loc3 = new Location();
        loc3.setState("Maharashtra");
        loc3.setCountry("india");

        Branch b3 = new Branch();
    b3.setFoundedDate("feb-23-2010");
        b3.setLocation(loc3);
        branchRepository.save(b3);


}

    @RequestMapping("/findall")
    public String findAll(){
        String result = "<html>";

        for(Branch b : branchRepository.findAll()){
            result += "<div>" + b.toString() + "</div>";
        }

        return result + "</html>";
    }
}
