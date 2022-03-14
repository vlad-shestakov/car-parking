package com.shestakov.parkservice.database.repository;

import com.shestakov.parkservice.database.model.ParkspaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Репозиторий парковочных мест
 */
//@RepositoryRestResource(collectionResourceRel = "parkspace", path = "parkspace")
public interface ParkspaceRepository extends JpaRepository<ParkspaceEntity, Integer> {
}