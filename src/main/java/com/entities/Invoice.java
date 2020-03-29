package com.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "invoice")
public class Invoice {
	@Id
	private long id;
	private String client;
	private long vatRate;
	private Date invoiceDate;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lineItemId", referencedColumnName = "id")
    private LineItem lineItem;

	public Invoice() {

	}

	public Invoice(long id, String client, long vatRate, Date invoiceDate) {
		super();
		this.id = id;
		this.client = client;
		this.vatRate = vatRate;
		this.invoiceDate = invoiceDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public long getVatRate() {
		return vatRate;
	}

	public void setVatRate(long vatRate) {
		this.vatRate = vatRate;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public LineItem getLineItem() {
		return lineItem;
	}

	public void setLineItem(LineItem lineItem) {
		this.lineItem = lineItem;
	}
	

}
