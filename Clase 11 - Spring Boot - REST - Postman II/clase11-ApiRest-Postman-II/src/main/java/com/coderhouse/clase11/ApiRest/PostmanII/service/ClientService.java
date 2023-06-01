package com.coderhouse.clase11.ApiRest.PostmanII.service;

import com.coderhouse.clase11.ApiRest.PostmanII.model.Client;
import com.coderhouse.clase11.ApiRest.PostmanII.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Client postClient(Client client) throws Exception {
        return clientRepository.save(client);
    }

    public Client getClient(int id) throws Exception {
        Optional<Client> cliente = clientRepository.findById(id);
        if(cliente.isEmpty()){
            return null;
        } else {
            return cliente.get();
        }
    }

    public void updateClient(Client client, int id) throws Exception {
        Optional<Client> clienteExistente = clientRepository.findById(id);
        if(clienteExistente.isEmpty()){
            throw new Exception("Client not exist");
        } else {
            clienteExistente.get().setDocnumber(client.getDocnumber());
            clienteExistente.get().setName(client.getName());
            clienteExistente.get().setLastname(client.getLastname());
            clientRepository.save(clienteExistente.get());
        }
    }

    public void deleteClient (int id) throws Exception {
        Optional<Client> clienteExistente = clientRepository.findById(id);
        if(clienteExistente.isEmpty()){
            throw new Exception("Client not exist");
        } else {
            clientRepository.deleteById(id);
        }
    }
}
