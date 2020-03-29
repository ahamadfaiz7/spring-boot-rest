package com.persistence;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.entities.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository <Invoice, Long>{
	
}
