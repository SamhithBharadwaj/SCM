package com.general.users;

public class Product {
	private static long idSeq = 0;
	private final long productId;

	public Product() {
		idSeq++;
		;// get the highest Id of table product here instead of idSeq
		productId = idSeq;// setting incrementing unique values for productId
	}

	private String productName;
	public void hey(){
		System.out.println("guru aytu guru");
	}
}
