package com.shestakov.parkservice.database.repository;

import com.shestakov.parkservice.database.model.BookingtimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Репозиторий бронирований
 */
@RepositoryRestResource(collectionResourceRel = "bookingtime", path = "bookingtime")
public interface BookingtimeRepository extends JpaRepository<BookingtimeEntity, Integer> {
}