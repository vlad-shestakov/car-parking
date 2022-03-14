package com.shestakov.parkservice.database.repository;

import com.shestakov.parkservice.database.model.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Репозиторий клиентов
 */
//@RepositoryRestResource(collectionResourceRel = "client", path = "client")
public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {
}