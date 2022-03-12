package com.thinkingcao.springbootmapstruct.inter;


import com.thinkingcao.springbootmapstruct.vo.ClientVo;
import com.thinkingcao.springbootmapstruct.entity.ClientEntity;
import com.thinkingcao.springbootmapstruct.entity.ParkspaceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    @Mappings({
            @Mapping(source = "client.clientid", target = "clientid"),
            @Mapping(source = "client.licensenumber",target = "licensenumber"),
            @Mapping(source = "parkspace.parkspacenum", target = "parkspacenum")
    })


    ClientVo fromClientsDTO(ClientEntity client, ParkspaceEntity parkspace);
}