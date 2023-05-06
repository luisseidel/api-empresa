package com.seidelsoft.rest.service;

import com.seidelsoft.rest.model.Customer;
import com.seidelsoft.rest.repository.CustomerRespository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class CustomerService {

    @Inject
    CustomerRespository customerRespository;

    public List<Customer> findAll() {
        return customerRespository.findAll().list();
    }

    public void addCustomer(Customer c) {
        customerRespository.persist(c);
    }

}
