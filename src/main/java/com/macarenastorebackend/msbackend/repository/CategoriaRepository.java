package com.macarenastorebackend.msbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.macarenastorebackend.msbackend.entity.Categoria;

@RepositoryRestResource(collectionResourceRel = "categoria", path="categoria")
@CrossOrigin(origins = "http://localhost:3000")

public interface CategoriaRepository extends CrudRepository<Categoria, Long>{

}
