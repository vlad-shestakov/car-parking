package com.shestakov.parkservice.controller;

import com.shestakov.parkservice.controller.mapper.ParkserviceMapper;
import com.shestakov.parkservice.controller.model.ParkserviceDto;
import com.shestakov.parkservice.database.model.BookingtimeEntity;
import com.shestakov.parkservice.database.model.ClientEntity;
import com.shestakov.parkservice.database.model.ParkspaceEntity;
import com.shestakov.parkservice.database.repository.BookingtimeRepository;
import com.shestakov.parkservice.database.repository.ClientRepository;
import com.shestakov.parkservice.database.repository.ParkspaceRepository;
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
@RequestMapping("/parkservice")
public class ParkserviceController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ParkspaceRepository parkspaceRepository;

    @Autowired
    private BookingtimeRepository bookingtimeRepository;

    @Autowired
    private ParkserviceMapper parkserviceMapper;

    @RequestMapping(value = "/detail/{clientid}", method = RequestMethod.GET)
    public ParkserviceDto details(@PathVariable(value = "clientid") Integer clientid) {


        ClientEntity clientInfo = clientRepository.findById(clientid).get();

        Optional<ParkspaceEntity> optionalT = parkspaceRepository.findById(clientid);
        ParkspaceEntity parkspaceInfo = optionalT.isPresent() ? optionalT.get() : null;

        Optional<BookingtimeEntity> optionalB = bookingtimeRepository.findById(clientid);
        BookingtimeEntity bookingtimeInfo = optionalB.isPresent() ? optionalB.get() : null;


        return parkserviceMapper.fromParkserviceDto(clientInfo, parkspaceInfo, bookingtimeInfo);
    }

}

