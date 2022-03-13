package com.shestakov.carparking.controller;

import com.shestakov.carparking.database.model.BookingtimeEntity;
import com.shestakov.carparking.database.model.ClientEntity;
import com.shestakov.carparking.database.model.ParkspaceEntity;
import com.shestakov.carparking.controller.mapper.ClientParkingMapper;
import com.shestakov.carparking.database.repository.BookingtimeRepository;
import com.shestakov.carparking.database.repository.ClientRepository;
import com.shestakov.carparking.database.repository.ParkspaceRepository;
import com.shestakov.carparking.controller.model.ClientParkingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Контроллер для управления парковкой
 */
@RestController
@RequestMapping("/clientParking")
public class ClientParkingController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ParkspaceRepository parkspaceRepository;

    @Autowired
    private BookingtimeRepository bookingtimeRepository;

    @Autowired
    private ClientParkingMapper clientParkingMapper;

    @RequestMapping(value = "/detail/{clientid}", method = RequestMethod.GET)
    public ClientParkingDTO details(@PathVariable(value = "clientid") Integer clientid) {


        ClientEntity clientInfo = clientRepository.findById(clientid).get();

        Optional<ParkspaceEntity> optionalT = parkspaceRepository.findById(clientid);
        ParkspaceEntity parkspaceInfo = optionalT.isPresent() ? optionalT.get() : null;

        Optional<BookingtimeEntity> optionalB = bookingtimeRepository.findById(clientid);
        BookingtimeEntity bookingtimeInfo = optionalB.isPresent() ? optionalB.get() : null;


        return clientParkingMapper.fromClientParkingDTO(clientInfo, parkspaceInfo, bookingtimeInfo);
    }
}

