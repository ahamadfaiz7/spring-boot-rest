package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Invoice;
import com.service.InvoiceService;


@RestController
public class InvoiceController {
	

@Autowired
private InvoiceService invoiceService;
	
	@RequestMapping(value = "/invoices", method = RequestMethod.GET)
    public List viewAllInvoices() {
        return invoiceService.getAllInvoices();
    }

   
    @RequestMapping(value = "/invoices/{id}", method = RequestMethod.GET)
    public Invoice viewInvoice( Long invoiceId){
        return invoiceService.getInvoice(invoiceId);
    }

   
    @RequestMapping(value = "/invoices", method = RequestMethod.POST)
    public void addInvoice( Invoice invoice) {
    	invoiceService.addInvoice(invoice);
}
}
