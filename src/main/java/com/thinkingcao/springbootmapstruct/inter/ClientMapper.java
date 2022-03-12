package com.thinkingcao.springbootmapstruct.inter;


import com.thinkingcao.springbootmapstruct.vo.ClientVo;
import com.thinkingcao.springbootmapstruct.entity.ClientEntity;
//import com.thinkingcao.springbootmapstruct.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    @Mappings({
            @Mapping(source = "client.clientid", target = "clientid"),
            @Mapping(source = "client.licensenumber",target = "licensenumber")
//            @Mapping(source = "order.orderId", target = "orderId"),
//            @Mapping(source = "order.orderMoney", target = "orderMoney"),
//            @Mapping(source = "order.payState", target = "payState")
    })


//    ClientVo fromClientsDTO(ClientEntity client, Order order);
    ClientVo fromClientsDTO(ClientEntity client);
}