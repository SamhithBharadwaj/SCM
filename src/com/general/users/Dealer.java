package com.general.users;

public class Dealer {
	private static long idSeq = 0;
	private final long dealerId;

	public Dealer() {
		idSeq++;
		;// get the highest Id of table dealer here instead of idSeq
		dealerId = idSeq;// setting incrementing unique values for dealerId
	}

	private String dealerName;
}
