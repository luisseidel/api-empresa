package com.seidelsoft.rest;

import com.seidelsoft.dao.PaisDAO;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/paises")
public class PaisResource {

    @Inject
    PaisDAO dao;

    @GET
    public String get(){
        return dao.getNome();
    }
}
