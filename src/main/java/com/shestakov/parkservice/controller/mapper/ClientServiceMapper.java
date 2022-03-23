package com.shestakov.parkservice.controller.mapper;


import com.shestakov.parkservice.controller.model.*;
import com.shestakov.parkservice.database.model.ClientEntity;
import org.mapstruct.Mapper;

/**
 * <Маппер полей для управления парковкой
 */
@Mapper(componentModel = "spring")
public interface ClientServiceMapper {

//  Example mapping
//    @Mappings({
//            @Mapping(source = "client.clientid", target = "clientid"),
//            @Mapping(source = "client.licensenumber",target = "licensenumber")
//    })
    ClientResponse map(ClientEntity client);
    ClientPutResponse mapPut(ClientEntity client);
    ClientPostResponse mapPost(ClientEntity client);
    ClientEntity map(ClientPutRequest clientPutRequest);
    ClientEntity map(ClientPostRequest clientPostRequest);


}