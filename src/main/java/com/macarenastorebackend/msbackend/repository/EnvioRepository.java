package com.macarenastorebackend.msbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.macarenastorebackend.msbackend.entity.Envio;

@RepositoryRestResource(collectionResourceRel = "envio", path="envio")
@CrossOrigin(origins = "http://localhost:3000")

public interface EnvioRepository extends CrudRepository<Envio, Long>{

}