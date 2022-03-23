package com.shestakov.parkservice.controller;

import com.shestakov.parkservice.controller.mapper.ClientServiceMapper;
import com.shestakov.parkservice.controller.model.*;
import com.shestakov.parkservice.database.model.ClientEntity;
import com.shestakov.parkservice.exceptions.ClientNotFoundException;
import com.shestakov.parkservice.interactor.ClientService;
import com.shestakov.parkservice.interactor.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Контроллер для управления парковкой
 */
@RestController
@RequestMapping("/service")
public class ClientServiceController {

    @Autowired
    private ClientServiceMapper clientServiceMapper;

    @Autowired
    private ClientServiceImpl clientServiceImpl;

    @GetMapping
    public List<ClientResponse> listAll(){
        List<ClientResponse> list = new ArrayList<>();
        clientServiceImpl.listAll().iterator().forEachRemaining(t -> list.add(clientServiceMapper.map(t)));
        return list;
    }

    @GetMapping(value = "/{clientid}")
    public ResponseEntity<ClientResponse> select(
            @PathVariable(value = "clientid")
            int clientid
            ) {
        ClientEntity clientInfo = clientServiceImpl.get(clientid);
        return new ResponseEntity<>(
                clientServiceMapper.map(clientInfo),
                HttpStatus.OK

        );
    }

    @PutMapping
    public ResponseEntity<ClientPutResponse> insert(@Valid @RequestBody ClientPutRequest clientPutRequest) {
        ClientEntity clientEntity = clientServiceMapper.map(clientPutRequest);
        clientServiceImpl.save(clientEntity);
        return new ResponseEntity<>(
                clientServiceMapper.mapPut(clientEntity),
                HttpStatus.CREATED
        );
    }

    @PostMapping
    public ResponseEntity<ClientPostResponse> insert(@Valid @RequestBody ClientPostRequest clientPostRequest) {

        ClientEntity clientEntity = clientServiceMapper.map(clientPostRequest);
        clientServiceImpl.save(clientEntity);

//        Optional<ClientEntity> clientEntity = clientServiceMapper.map(clientPostRequest);
//        if(clientEntity.isPresent()) {
//            clientServiceImpl.update(clientEntity);
//        } else {
//            clientServiceImpl.save(clientEntity);
//        }
        return new ResponseEntity<>(
                clientServiceMapper.mapPost(clientEntity),
                HttpStatus.OK
        );
    }

    @DeleteMapping(value = "/{clientid}")
    public ResponseEntity delete(
            @PathVariable(value = "clientid")
            int clientid
            ) {
        clientServiceImpl.delete(clientid);
        return ResponseEntity.ok().build();
    }

}

