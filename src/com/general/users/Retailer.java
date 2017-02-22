package com.general.users;

public class Retailer {
	private static long idSeq = 0;
	private final long retailerId;

	public Retailer() {
		idSeq++;
		;// get the highest Id of table retailer here instead of idSeq
		retailerId = idSeq;// setting incrementing unique values for retailerId
	}

	private String retailerName;
}
