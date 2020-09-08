package com.rk.beans;

public final class BlueDart implements Courier {
	
	public BlueDart() {
		
	System.out.println("bluedart :: 0 param counsoctor");
	}

	@Override
	public String deliver(int oid) {
		
		System.out.println("BlueDart.deliver order(---------)");
		
		return "BlueDart Courier deliver order id::"+oid+" order product";
	}

}
