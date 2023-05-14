package com.seidelsoft.rest.controller;

import com.seidelsoft.rest.model.Customer;
import com.seidelsoft.rest.service.CustomerService;
import com.seidelsoft.rest.util.MediaTypes;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/customers")
@Produces(MediaTypes.APPLICATION_JSON)
@Consumes(MediaTypes.APPLICATION_JSON)
public class CustomerResource {

    @Inject
    CustomerService service;

    @GET
    @RolesAllowed("manager")
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
    @RolesAllowed("manager")
    public void addCustomer(Customer c) {
        service.addCustomer(c);
    }
}
