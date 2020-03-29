package com.entities;

import javax.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "lineItem")
public class LineItem {
	@Id
	private long lineItemId;
	private Long quantity;
	private String description;
	private BigDecimal unitPrice;
	
	@OneToOne(mappedBy = "invoice")
	private Invoice invoice;
	
	
	public LineItem() {

	}

	
	public LineItem(long lineItemId, Long quantity, String description, BigDecimal unitPrice) {
		super();
		this.lineItemId = lineItemId;
		this.quantity = quantity;
		this.description = description;
		this.unitPrice = unitPrice;
	}



	public long getLineItemId() {
		return lineItemId;
	}


	public void setLineItemId(long lineItemId) {
		this.lineItemId = lineItemId;
	}


	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	

}
