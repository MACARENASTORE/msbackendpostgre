package com.macarenastorebackend.msbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.macarenastorebackend.msbackend.entity.Proveedor;

@RepositoryRestResource(collectionResourceRel = "proveedor", path="proveedor")
@CrossOrigin(origins = "http://localhost:3000")

public interface ProveedorRepository extends CrudRepository<Proveedor, Long>{

}