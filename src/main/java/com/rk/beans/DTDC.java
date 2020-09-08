package com.rk.beans;

public final class DTDC implements Courier {
	
	public DTDC() {
	
		System.out.println("DTDC ::o param counstroctor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver order(=========)");
		
		return "DTDC Courier deliver order id::"+oid+" order product";
	}

}
