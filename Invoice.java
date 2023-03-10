package com.fmt;

import java.util.ArrayList;

public class Invoice {
	
	private Store s;
	private String invoice;
	private Person customer;
	private Person salesPerson;
	private String date;
	private ArrayList<InvoiceItem> it;
	private String s1;
	
	public Invoice(String invoiceCode) {
		this.invoice=invoiceCode;
	}


	public Invoice(String invoice, Store c, Person customer, Person salesPerson, String date, ArrayList<InvoiceItem> it) {
		this.invoice = invoice;
		this.s=c;
		this.customer=customer;
		this.salesPerson=salesPerson;
		this.date=date;
		this.it= new ArrayList<InvoiceItem>();
	}


	public Invoice(String invoiceCode, String s1) {
		this.invoice=invoiceCode;
		this.s1=s1;
	}


	public Store getS() {
		return s;
	}


	public String getInvoice() {
		return invoice;
	}


	public Person getCustomer() {
		return customer;
	}


	public Person getSalesPerson() {
		return salesPerson;
	}


	public String getDate() {
		return date;
	}
	public double getTotalPrice() {
		double total=0;
		for(int i =0;i<it.size();i++) {
			
		}
		return total;
	}
	
	


	public ArrayList<Invoiceable> getIt() {
		return it;
	}

	
	
	
	public String toString() {
		return invoice + "\t\t" + s.getCode() + "\t\t" + customer.getLastName() + ", " + customer.getFirstName() +"\t\t"+ salesPerson.getLastName() + ", " + salesPerson.getFirstName() + "\t\t" + getTotalPrice();
	}


	public void getInfo() {
		System.out.println("Invoice: " + invoice);
		System.out.println("Store: " + s.getCode());
		System.out.println("Date: " + date);
		System.out.println("Customer: ");
		System.out.print(customer.getLastName()+ ", " + customer.getFirstName());
		System.out.println("    (" + customer.getCode() + ": " + customer.getEmails() + ")");
		System.out.println(customer.getAddress());
		System.out.println("\n");
		System.out.println("Sales Person: ");
		System.out.print(salesPerson.getLastName()+ ", " + salesPerson.getFirstName());
		System.out.println("    (" + salesPerson.getCode() + ": " + salesPerson.getEmails() + ")");
		System.out.println(salesPerson.getAddress());
		for(int i =0; i<it.size();i++) {
			
			
		}
		
		
	}
	

	}




	
	
	

