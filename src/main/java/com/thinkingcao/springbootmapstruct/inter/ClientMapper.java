package com.thinkingcao.springbootmapstruct.inter;


import com.thinkingcao.springbootmapstruct.entity.BookingtimeEntity;
import com.thinkingcao.springbootmapstruct.vo.ClientVo;
import com.thinkingcao.springbootmapstruct.entity.ClientEntity;
import com.thinkingcao.springbootmapstruct.entity.ParkspaceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Date;

@Mapper(componentModel = "spring")
public interface ClientMapper {
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

    ClientVo fromClientsDTO(ClientEntity client, ParkspaceEntity parkspace, BookingtimeEntity bookingtime);
}