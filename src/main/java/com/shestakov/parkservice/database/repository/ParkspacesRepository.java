package com.shestakov.parkservice.database.repository;

import com.shestakov.parkservice.database.model.ParkspacesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Репозиторий парковочных мест
 */
public interface ParkspacesRepository extends JpaRepository<ParkspacesEntity, Integer> {

    /**
     * @param status статус парковочного места / 1-0
     * @return Количество парковочных мест по статусу
     */
    @Query("select count(p.parkspaceid) from ParkspacesEntity p where p.status = :status")
    long countByStatus(@Param("status") int status);

}