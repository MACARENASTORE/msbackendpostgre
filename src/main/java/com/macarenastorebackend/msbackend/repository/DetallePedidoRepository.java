package com.macarenastorebackend.msbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.macarenastorebackend.msbackend.entity.DetallePedido;

@RepositoryRestResource(collectionResourceRel = "detallepedido", path="detallepedido")
@CrossOrigin(origins = "http://localhost:3000")

public interface DetallePedidoRepository extends CrudRepository<DetallePedido, Long>{

}