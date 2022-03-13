package com.shestakov.parkservice.controller.mapper;


import com.shestakov.parkservice.controller.model.ClientDto;
import com.shestakov.parkservice.database.model.BookingtimeEntity;
import com.shestakov.parkservice.database.model.ClientEntity;
import com.shestakov.parkservice.database.model.ParkspaceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * <Маппер полей для управления парковкой
 */
@Mapper(componentModel = "spring")
public interface ClientDtoMapper {
    @Mappings({
            @Mapping(source = "client.clientid", target = "clientid"),
            @Mapping(source = "client.licensenumber",target = "licensenumber"),
            @Mapping(source = "parkspace.parkspacenum", target = "parkspacenum"),
            @Mapping(source = "bookingtime.datestart",target = "datestart"),
            @Mapping(source = "bookingtime.datefinish",target = "datefinish"),
            @Mapping(source = "bookingtime.renttariff",target = "renttariff"),
            @Mapping(source = "bookingtime.rentsum",target = "rentsum"),
            @Mapping(source = "bookingtime.payedsum",target = "payedsum"),
            @Mapping(source = "bookingtime.ispaid",target = "ispaid")
    })
    ClientDto fromClientDTO(ClientEntity client, ParkspaceEntity parkspace, BookingtimeEntity bookingtime);
}