package com.coderhouse.clase9.JPAII.Workshop.repository;

import com.coderhouse.clase9.JPAII.Workshop.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}
