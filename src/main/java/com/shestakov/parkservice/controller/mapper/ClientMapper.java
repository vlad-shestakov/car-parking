package com.shestakov.parkservice.controller.mapper;


import com.shestakov.parkservice.controller.model.ClientDto;
import com.shestakov.parkservice.database.model.ClientEntity;
import org.mapstruct.Mapper;

/**
 * <Маппер полей для управления парковкой
 */
@Mapper(componentModel = "spring")
public interface ClientMapper {

//    @Mappings({
//            @Mapping(source = "client.clientid", target = "clientid"),
//            @Mapping(source = "client.licensenumber",target = "licensenumber")
//            @Mapping(source = "parkspace.parkspacenum", target = "parkspacenum"),
//            @Mapping(source = "bookingtime.datestart",target = "datestart"),
//            @Mapping(source = "bookingtime.datefinish",target = "datefinish"),
//            @Mapping(source = "bookingtime.renttariff",target = "renttariff"),
//            @Mapping(source = "bookingtime.rentsum",target = "rentsum"),
//            @Mapping(source = "bookingtime.payedsum",target = "payedsum"),
//            @Mapping(source = "bookingtime.ispaid",target = "ispaid")
//    })
    ClientDto fromClientDto(ClientEntity client);

//    ClientResponseDto fromClientResponseDto(ClientEntity client);
}