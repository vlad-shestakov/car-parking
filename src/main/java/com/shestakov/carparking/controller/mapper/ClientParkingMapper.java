package com.shestakov.carparking.controller.mapper;


import com.shestakov.carparking.database.model.BookingtimeEntity;
import com.shestakov.carparking.database.model.ClientEntity;
import com.shestakov.carparking.database.model.ParkspaceEntity;
import com.shestakov.carparking.controller.model.ClientParkingDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * <Маппер полей для управления парковкой
 */
@Mapper(componentModel = "spring")
public interface ClientParkingMapper {
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
    ClientParkingDTO fromClientParkingDTO(ClientEntity client, ParkspaceEntity parkspace, BookingtimeEntity bookingtime);
}