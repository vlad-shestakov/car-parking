package com.shestakov.parkservice.controller;

import com.shestakov.parkservice.controller.mapper.ClientMapper;
import com.shestakov.parkservice.controller.model.ClientGetDto;
import com.shestakov.parkservice.controller.model.ClientPostRqDto;
import com.shestakov.parkservice.controller.model.ClientPostRsDto;
import com.shestakov.parkservice.controller.model.ClientPutRqDto;
import com.shestakov.parkservice.controller.model.ClientPutRsDto;
import com.shestakov.parkservice.database.model.ClientEntity;
import com.shestakov.parkservice.database.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

//    @Value
//    private static class ClientsResponse {
//        private List<ClientEntity> clients;
//    }
//
//    @GetMapping
//    public StoreResponse stores() {
//        return new ClientsResponse(clientRepository.findAll());
//        ClientEntity clientInfo = clientRepository.findById(clientid).get();
//        return clientMapper.fromClientResponseDto(clientInfo);
//    }

    @GetMapping(value = "/{clientid}")
    public ResponseEntity<ClientGetDto> select(@PathVariable(value = "clientid") Integer clientid) {

        ClientEntity clientInfo = clientRepository.findById(clientid).get();
        // return clientMapper.fromClientResponseDto(clientInfo);
        return new ResponseEntity<>(
                clientMapper.toClientGetDto(clientInfo),
                HttpStatus.OK
        );
    }

    @PostMapping()
    public ResponseEntity<ClientPostRsDto> insert(@Valid @RequestBody ClientPostRqDto clientPostRqDto) {

        ClientEntity clientInfo = clientMapper.fromClientPostRqDto(clientPostRqDto);
        clientRepository.save(clientInfo);
        return new ResponseEntity<>(
                clientMapper.toClientPostRsDto(clientInfo),
                HttpStatus.CREATED);

    }

    @PutMapping
    public ResponseEntity<ClientPutRsDto> update(@Valid @RequestBody ClientPutRqDto clientPutRqDto) {

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

