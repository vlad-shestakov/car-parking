package com.shestakov.parkservice.controller;

import com.shestakov.parkservice.controller.mapper.ClientMapper;
import com.shestakov.parkservice.controller.model.*;
import com.shestakov.parkservice.database.model.ClientEntity;
import com.shestakov.parkservice.database.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

/**
 * Контроллер для управления парковкой
 */
@RestController
@RequestMapping("/carparking")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ClientMapper clientMapper;

    @GetMapping
    public List<ClientGetDto> selectall() {
        List<ClientGetDto> list = new ArrayList<ClientGetDto>();

        clientRepository.findAll().iterator().forEachRemaining(t -> list.add(clientMapper.toClientGetDto(t)));
//        clientRepository.findAll().forEach( p -> list.add(clientMapper.toClientGetDto(p)));

        return list;
    }


    @GetMapping(value = "/{clientid}")
    public ResponseEntity<ClientGetDto> select(@PathVariable(value = "clientid") Integer clientid) {

        ClientEntity clientInfo = clientRepository.findById(clientid).get();
        return new ResponseEntity<>(
                clientMapper.toClientGetDto(clientInfo),
                HttpStatus.OK
        );
    }

    @PostMapping()
    public ResponseEntity<ClientPostRsDto> update(@Valid @RequestBody ClientPostRqDto clientPostRqDto) {

        ClientEntity clientInfo = clientMapper.fromClientPostRqDto(clientPostRqDto);
        clientRepository.save(clientInfo);
        return new ResponseEntity<>(
                clientMapper.toClientPostRsDto(clientInfo),
                HttpStatus.CREATED);

    }

    @PutMapping
    public ResponseEntity<ClientPutRsDto> insert(@Valid @RequestBody ClientPutRqDto clientPutRqDto) {

        ClientEntity clientInfo = clientMapper.fromClientPutRqDto(clientPutRqDto);
        clientRepository.save(clientInfo);
        return new ResponseEntity<>(
                clientMapper.toClientPutRsDto(clientInfo),
                HttpStatus.CREATED);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        clientRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}

