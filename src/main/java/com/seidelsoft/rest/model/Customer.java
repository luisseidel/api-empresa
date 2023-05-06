package com.seidelsoft.rest.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Customer extends PanacheEntity {

    private String name;
    private Integer age;
    private String email;

}
