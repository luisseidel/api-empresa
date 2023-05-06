package com.seidelsoft.rest.repository;


import com.seidelsoft.rest.model.Customer;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerRespository implements PanacheRepository<Customer> {
}
