package com.shestakov.parkservice.controller.mapper;


import com.shestakov.parkservice.controller.model.*;
import com.shestakov.parkservice.database.model.ClientEntity;
import org.mapstruct.Mapper;

/**
 * <Маппер полей для управления парковкой
 */
@Mapper(componentModel = "spring")
public interface ClientMapper {

//  Example mapping
//    @Mappings({
//            @Mapping(source = "client.clientid", target = "clientid"),
//            @Mapping(source = "client.licensenumber",target = "licensenumber")
//    })
    ClientEntity fromClientPostRqDto(ClientPostRqDto clientPostRqDto);
    ClientEntity fromClientPutRqDto(ClientPutRqDto clientPutRqDto);

    ClientGetDto toClientGetDto(ClientEntity client);
    ClientPostRsDto toClientPostRsDto(ClientEntity client);
    ClientPutRsDto toClientPutRsDto(ClientEntity client);


}