package com.coderhouse.clase11.ApiRest.PostmanII.model;

import java.util.List;

public class InvoiceDTO {
    private int invoice_id;
    private String created_at;
    private double total;

    public InvoiceDTO(int invoice_id, String created_at, double total) {
        this.invoice_id = invoice_id;
        this.created_at = created_at;
        this.total = total;
    }

    public int getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "InvoiceDTO{" +
                "invoice_id=" + invoice_id +
                ", created_at='" + created_at + '\'' +
                ", total=" + total +
                '}';
    }
}
