package com.fmt;

public class InvoiceItem extends Item{
	private String invoiceCode;
	private Item i;
	
	private String s;
	private String date1;
	private String date2;
	
	public String getInvoiceCode() {
		return invoiceCode;
	}
	
	public InvoiceItem(String invoiceCode, Item i, String s) {
		super(invoiceCode,s);
		this.invoiceCode=invoiceCode;
		this.i=i;
		this.s=s;
	}

	public InvoiceItem(String invoiceCode, Item q, String date1, String date2) {
		super(invoiceCode);
		this.invoiceCode=invoiceCode;
		this.i=q;
		this.date1=date1;
		this.date2=date2;
		
	}
	public String getInvoiceCode1() {
		return invoiceCode;
	}
	public Item getI() {
		return i;
	}

	public String getDate1() {
		return date1;
	}

	public String getDate2() {
		return date2;
	}




	

	
}
