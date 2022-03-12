package com.shestakov.carparking.mapper;

import com.shestakov.carparking.entity.ParkspaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Репозиторий парковочных мест
 */
@RepositoryRestResource(collectionResourceRel = "parkspace", path = "parkspace")
public interface ParkspaceRepository extends JpaRepository<ParkspaceEntity, Integer> {
}