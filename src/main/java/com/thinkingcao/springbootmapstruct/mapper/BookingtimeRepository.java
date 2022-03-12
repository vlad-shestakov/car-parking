package com.thinkingcao.springbootmapstruct.mapper;

import com.thinkingcao.springbootmapstruct.entity.BookingtimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "bookingtime", path = "bookingtime")
public interface BookingtimeRepository extends JpaRepository<BookingtimeEntity, Integer> {
}