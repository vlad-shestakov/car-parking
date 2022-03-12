package com.thinkingcao.springbootmapstruct.controller;

import com.thinkingcao.springbootmapstruct.vo.ClientVo;
import com.thinkingcao.springbootmapstruct.entity.ClientEntity;
//import com.thinkingcao.springbootmapstruct.entity.Order;
import com.thinkingcao.springbootmapstruct.inter.ClientMapper;
import com.thinkingcao.springbootmapstruct.mapper.ClientRepository;
//import com.thinkingcao.springbootmapstruct.mapper.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

//    @Autowired
//    private OrdersRepository ordersRepository;

    @Autowired
    private ClientMapper clientMapper;

    @RequestMapping(value = "/detail/{clientid}", method = RequestMethod.GET)
    public ClientVo details(@PathVariable(value = "clientid") Integer clientid) {

        ClientEntity clientInfo = clientRepository.findById(clientid).get();
//        Optional<Order> optionalT = ordersRepository.findById(clientId);
//        Order order = optionalT.isPresent() ? optionalT.get() : null;
//        return clientMapper.fromGoodOrderDTO(goodInfo, order);
        return clientMapper.fromClientsDTO(clientInfo);


//        Good goodInfo = goodsRepository.findById(goodId).get();
//        Optional<Order> optionalT = ordersRepository.findById(goodId);
//        Order order = optionalT.isPresent() ? optionalT.get() : null;
//        return goodOrderMapper.fromGoodOrderDTO(goodInfo, order);
    }
}

