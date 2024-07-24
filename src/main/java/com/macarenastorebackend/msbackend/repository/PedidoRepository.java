package com.macarenastorebackend.msbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.macarenastorebackend.msbackend.entity.Pedido;

@RepositoryRestResource(collectionResourceRel = "pedido", path="pedido")
@CrossOrigin(origins = "http://localhost:3000")

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}