package com.macarenastorebackend.msbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.macarenastorebackend.msbackend.entity.Factura;

@RepositoryRestResource(collectionResourceRel = "factura", path="factura")
@CrossOrigin(origins = "http://localhost:3000")

public interface FacturaRepository extends CrudRepository<Factura, Long>{

}