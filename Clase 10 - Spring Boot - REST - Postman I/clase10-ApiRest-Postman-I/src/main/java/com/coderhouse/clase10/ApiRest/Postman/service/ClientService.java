package com.coderhouse.clase10.ApiRest.Postman.service;

import com.coderhouse.clase10.ApiRest.Postman.model.Client;
import com.coderhouse.clase10.ApiRest.Postman.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Client postClient(Client client) throws Exception {
        return clientRepository.save(client);
    }
}
