package com.thinkingcao.springbootmapstruct.mapper;

import com.thinkingcao.springbootmapstruct.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * <pre>
 * @desc: Репозиторий клиентов
 * </pre>
 */
@RepositoryRestResource(collectionResourceRel = "client", path = "client")
public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {
}