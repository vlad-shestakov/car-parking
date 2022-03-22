package com.shestakov.parkservice.interactor;

import com.shestakov.parkservice.database.model.ClientEntity;
import com.shestakov.parkservice.database.repository.ClientRepository;
import com.shestakov.parkservice.exceptions.ClientNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<ClientEntity> listAll() {
        return clientRepository.findAll();
    }

    public ClientEntity get(int clientid) {
        Optional<ClientEntity> clientEntity = clientRepository.findById(clientid);
        if(clientEntity.isPresent()) {
            return clientEntity.get();
        } else {
            throw new ClientNotFoundException("Client with clientId : "+clientid+" Not Found!!!");
        }
    }

    @Transactional
    public void save(ClientEntity clientEntity) {
        clientRepository.save(clientEntity);
    }

    @Transactional
    public void update(ClientEntity clientEntity) {
//        ClientEntity client = clientRepository.getOne(clientEntity.getClientid());
//        client.setLicensenumber(clientEntity.getLicensenumber());
        clientRepository.save(clientEntity);
//        return clientEntity;
    }

    @Transactional
    public void delete(int clientid) {
        clientRepository.deleteById(clientid);
    }

}
