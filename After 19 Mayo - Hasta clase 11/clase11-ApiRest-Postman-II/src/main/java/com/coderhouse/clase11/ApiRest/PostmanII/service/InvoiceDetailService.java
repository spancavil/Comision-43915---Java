package com.coderhouse.clase11.ApiRest.PostmanII.service;

import com.coderhouse.clase11.ApiRest.PostmanII.model.InvoiceDetail;
import com.coderhouse.clase11.ApiRest.PostmanII.model.InvoiceDetailDTO;
import com.coderhouse.clase11.ApiRest.PostmanII.repository.InvoiceDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceDetailService {
    @Autowired
    private InvoiceDetailRepository invoiceDetailRepository;

    public void saveInvoiceDetail (InvoiceDetail invoiceDetail) throws Exception {
        invoiceDetailRepository.save(invoiceDetail);
    }

    public List<InvoiceDetailDTO> getInvoiceDetailsByInvoiceId (int invoice_id) throws Exception {
        return invoiceDetailRepository.getInvoiceDetailsByInvoiceId(invoice_id);
    }
}
