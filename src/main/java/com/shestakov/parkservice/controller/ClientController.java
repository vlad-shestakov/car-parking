package com.shestakov.parkservice.controller;

import com.shestakov.parkservice.controller.mapper.ClientMapper;
import com.shestakov.parkservice.controller.model.ClientDto;
import com.shestakov.parkservice.database.model.ClientEntity;
import com.shestakov.parkservice.database.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Контроллер для управления парковкой
 */
@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ClientMapper clientMapper;

    @RequestMapping(value = "/detail/{clientid}", method = RequestMethod.GET)
    public ClientDto details(@PathVariable(value = "clientid") Integer clientid) {

        ClientEntity clientInfo = clientRepository.findById(clientid).get();
        return clientMapper.fromClientDto(clientInfo);
    }

}

