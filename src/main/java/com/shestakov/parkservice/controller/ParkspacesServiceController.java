package com.shestakov.parkservice.controller;

import com.shestakov.parkservice.controller.mapper.ParkspacesMapper;
import com.shestakov.parkservice.controller.model.*;
import com.shestakov.parkservice.interactor.ParkspacesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Контроллер для управления парковочными местами
 */
@RestController
@RequestMapping("/parkspaces")
public class ParkspacesServiceController {


    @Autowired
    private ParkspacesServiceImpl parkspacesServiceImpl;

    @Autowired
    private ParkspacesMapper parkspacesMapper;

    /**
     * @return Список всех парковочных мест
     */
    @GetMapping
    public List<ParkspacesResponse> listAll(){
        List<ParkspacesResponse> list = new ArrayList<>();
        parkspacesServiceImpl.listAll().iterator().forEachRemaining(t -> list.add(parkspacesMapper.map(t)));
        return list;
    }

    /**
     * @return Возвращает количество свободных парковочных мест
     */
    @GetMapping(value = "/freespaces")
    public ResponseEntity<Object> freeSpaces() {
        long freeSpaces = parkspacesServiceImpl.getFreeSpaces();
        ParkspacesFreeResponse parkspacesFreeResponse = new ParkspacesFreeResponse();
        parkspacesFreeResponse.setFreespaces(freeSpaces);
        return new ResponseEntity<>(parkspacesFreeResponse, HttpStatus.OK);
    }

    /**
     * @return Метод занятия парковочного места
     */
    @PostMapping(value = "/enter")
    public ResponseEntity<ParkspacesResponse> enterParking(
            @Valid @RequestBody ParkspacesRequest parkspacesRequest) {

        int parkspacesid = parkspacesMapper.map(parkspacesRequest).getParkspaceid();

        return new ResponseEntity<>(
                parkspacesMapper.map(parkspacesServiceImpl.enterParking(parkspacesid)),
                HttpStatus.OK
        );

    }

    /**
     * @return Освобождение парковочного места
     */
    @PostMapping(value = "/leave")
    public ResponseEntity<ParkspacesResponse> leaveParking(
            @Valid @RequestBody ParkspacesRequest parkspacesRequest) {

        int parkspacesid = parkspacesMapper.map(parkspacesRequest).getParkspaceid();

        return new ResponseEntity<>(
                parkspacesMapper.map(parkspacesServiceImpl.leaveParking(parkspacesid)),
                HttpStatus.OK
        );

    }



}

