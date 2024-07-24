package com.macarenastorebackend.msbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.macarenastorebackend.msbackend.entity.Cliente;

@RepositoryRestResource(collectionResourceRel = "cliente", path="cliente")
@CrossOrigin(origins = "http://localhost:3000")

public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}