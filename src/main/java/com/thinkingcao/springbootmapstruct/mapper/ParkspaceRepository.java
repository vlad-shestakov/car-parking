package com.thinkingcao.springbootmapstruct.mapper;

import com.thinkingcao.springbootmapstruct.entity.ParkspaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "parkspace", path = "parkspace")
public interface ParkspaceRepository extends JpaRepository<ParkspaceEntity, Integer> {

}