package com.example.services;

import com.example.domain.Customer;
import com.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by brindank on 3/31/2017.
 */
@Service
public class CustomerService
{
    @Autowired
    CustomerRepository customerRepository;

    @Transactional
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Transactional
    public Iterable<Customer> findAll() {
       return customerRepository.findAll();
    }

    @Transactional
    public String findOne(long id) {
       return customerRepository.findOne(id).toString();
    }

    @Transactional
    public Iterable<? extends Customer> findByLastName(String lastName) {
        return customerRepository.findByLastName(lastName);
    }
}
