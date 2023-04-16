package com.abstraction1;

public class Daughter implements Mother, Father {

	@Override
	public void bike() {
	System.out.println("Vespa");	
		
	}

	@Override
	public void ring() {
		System.out.println("silver ring");
		
	}

	@Override
	public void watch() {
		System.out.println("titan");
		
	}

	@Override
	public void saree() {
		System.out.println("cotton saree");
		
		
	}
	
	public static void main(String[]args) {
		Daughter obj=new Daughter();
		obj.bike();
		obj.ring();
		obj.saree();
		obj.watch();
	}
	

}
