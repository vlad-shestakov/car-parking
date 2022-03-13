package com.shestakov.carparking.database.repository;

import com.shestakov.carparking.database.model.BookingtimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Репозиторий бронирований
 */
@RepositoryRestResource(collectionResourceRel = "bookingtime", path = "bookingtime")
public interface BookingtimeRepository extends JpaRepository<BookingtimeEntity, Integer> {
}