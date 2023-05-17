package com.coderhouse.clase10.ApiRest.Postman.repository;

import com.coderhouse.clase10.ApiRest.Postman.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}
