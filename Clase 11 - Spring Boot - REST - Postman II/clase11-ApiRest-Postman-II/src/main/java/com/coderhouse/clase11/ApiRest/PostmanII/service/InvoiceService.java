package com.coderhouse.clase11.ApiRest.PostmanII.service;

import com.coderhouse.clase11.ApiRest.PostmanII.model.Client;
import com.coderhouse.clase11.ApiRest.PostmanII.model.Invoice;
import com.coderhouse.clase11.ApiRest.PostmanII.model.InvoiceDTO;
import com.coderhouse.clase11.ApiRest.PostmanII.model.RequestInvoice;
import com.coderhouse.clase11.ApiRest.PostmanII.repository.ClientRepository;
import com.coderhouse.clase11.ApiRest.PostmanII.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;
    @Autowired
    private ClientRepository clientRepository;
    public InvoiceDTO postInvoice (RequestInvoice requestInvoice) throws Exception {
        //Instanciar un objeto invoice
        Invoice invoiceCreated = new Invoice();

        //Setteamos la fecha del invoice
        invoiceCreated.setCreated_at(new Date().toString());

        //Para debugging, obtenemos el clientId por consola
        System.out.println(requestInvoice.getClient_id());

        //Buscamos al cliente a través de su id
        Optional<Client> clientExist = clientRepository.findById(requestInvoice.getClient_id());
        System.out.println(clientExist.isEmpty());
        if (clientExist.isEmpty()) {
            throw new Exception("Client not found");
        }

        //Setteamos al cliente dentro del invoice
        invoiceCreated.setClient(clientExist.get());

        //Llamamos al repository
        invoiceCreated = invoiceRepository.save(invoiceCreated);

        //Por último retornamos el DTO
        return new InvoiceDTO(
                invoiceCreated.getId(),
                invoiceCreated.getCreated_at(),
                invoiceCreated.getTotal()
        );
    }

    public List<InvoiceDTO> getInvoicesByClientId (int clientId) throws Exception {
        System.out.println(clientId);
        return invoiceRepository.getInvoicesByClientById(clientId);
    }

    public InvoiceDTO getInvoiceById (int invoice_id) throws Exception {
        Optional<Invoice> invoiceFound = invoiceRepository.findById(invoice_id);
        if (invoiceFound.isEmpty()) {
            throw new Exception("Invoice not found");
        }
        return new InvoiceDTO(
                invoiceFound.get().getId(),
                invoiceFound.get().getCreated_at(),
                invoiceFound.get().getTotal()
        );
    }
}
