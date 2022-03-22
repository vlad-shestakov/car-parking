package com.shestakov.parkservice.interactor;

import com.shestakov.parkservice.database.model.ClientEntity;

import java.util.List;

public interface ClientService {

    public List<ClientEntity> listAll();

    public ClientEntity get(int clientid) ;

    public void save(ClientEntity clientEntity);

    public void update(ClientEntity clientEntity);

    public void delete(int clientid);

}
