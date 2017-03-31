package com.example;

import com.example.domain.*;
import com.example.repository.BranchRepository;
import com.example.repository.LocationRepository;
import com.sun.istack.internal.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by brindank on 3/28/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LocationJpaRepository {


    @Autowired
     @NotNull
    DataSource dataSource;
    @Autowired
    LocationRepository locationRepository;

    @Test
    public void contextLoads() throws SQLException {

        Assert.assertNotNull(dataSource.getConnection());
    }


}




