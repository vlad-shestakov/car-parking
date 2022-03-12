package com.shestakov.carparking.inter;


import com.shestakov.carparking.entity.BookingtimeEntity;
import com.shestakov.carparking.entity.ClientEntity;
import com.shestakov.carparking.entity.ParkspaceEntity;
import com.shestakov.carparking.vo.ClientParkingVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * <pre>
 * @desc: Маппер полей для управления парковкой
 * </pre>
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
    ClientParkingVo fromClientParkingDTO(ClientEntity client, ParkspaceEntity parkspace, BookingtimeEntity bookingtime);
}