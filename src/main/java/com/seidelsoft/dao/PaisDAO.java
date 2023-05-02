package com.seidelsoft.dao;

import com.seidelsoft.model.Pais;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PaisDAO implements PanacheRepository<Pais> {

    public String getNome() { return new Pais().getNome(); }

}
