package com.seidelsoft.rest.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "customer")
public class Customer extends PanacheEntity {

    private String name;
    private Integer age;
    private String email;

}
