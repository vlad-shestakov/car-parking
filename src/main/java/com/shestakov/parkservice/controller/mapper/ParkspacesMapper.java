package com.shestakov.parkservice.controller.mapper;


import com.shestakov.parkservice.controller.model.*;
import com.shestakov.parkservice.database.model.ParkspacesEntity;
import org.mapstruct.Mapper;

/**
 * Маппер полей для управления парковкой
 */
@Mapper(componentModel = "spring")
public interface ParkspacesMapper {

//  Example mapping
//    @Mappings({
//            @Mapping(source = "client.clientid", target = "clientid"),
//            @Mapping(source = "client.licensenumber",target = "licensenumber")
//    })
    ParkspacesEntity map(ParkspacesRequest parkspacesRequest);
    ParkspacesResponse map(ParkspacesEntity parkspacesEntity);
}