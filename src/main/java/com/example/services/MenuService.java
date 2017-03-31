package com.example.services;

import com.example.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by brindank on 3/31/2017.
 */
@Service
public class MenuService {
    @Autowired
    MenuRepository menuRepository;

}
