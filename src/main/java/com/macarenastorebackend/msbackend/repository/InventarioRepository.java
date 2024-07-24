package com.macarenastorebackend.msbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.macarenastorebackend.msbackend.entity.Inventario;

@RepositoryRestResource(collectionResourceRel = "inventario", path="inventario")
@CrossOrigin(origins = "http://localhost:3000")

public interface InventarioRepository extends CrudRepository<Inventario, Long>{

}