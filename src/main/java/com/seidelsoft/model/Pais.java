package com.seidelsoft.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

@Data
public class Pais extends PanacheEntity implements Serializable {

    private Long id;
    private String nome = "Uragyat";

}
