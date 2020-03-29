package com.service;

import org.springframework.stereotype.Service;

import com.entities.Invoice;
import com.persistence.InvoiceRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class InvoiceService {
	
	@Autowired
    private InvoiceRepository invoiceRepository;

    public List getAllInvoices() {
        List invoices = new ArrayList<>();
        invoiceRepository.findAll().forEach(invoices::add);
        return invoices;
    }

    public Invoice getInvoice(Long id) {
        return invoiceRepository.findOne(id);
    }

    public void addInvoice(Invoice invoice) {
    	invoiceRepository.save(invoice);
    }


}
