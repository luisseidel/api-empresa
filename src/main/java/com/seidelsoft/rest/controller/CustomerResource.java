package com.seidelsoft.rest.controller;

import com.seidelsoft.rest.model.Customer;
import com.seidelsoft.rest.service.CustomerService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.ArrayList;
import java.util.List;

@Path("/customers")
public class CustomerResource {

    @Inject
    private CustomerService service;


    @GET
    public List<Customer> retrieveCustomers() {
        List<Customer> list = new ArrayList<>();

        try {
            list = service.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @POST
    @Transactional
    public void addCustomer(Customer c) {
        service.addCustomer(c);
    }
}
