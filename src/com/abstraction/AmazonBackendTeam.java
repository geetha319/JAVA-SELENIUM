package com.abstraction;

public class AmazonBackendTeam extends AmazonDemoUser {
	
	@Override
	public void demouserName(String uname) {
		
		super.demouserName(uname);
	}

	@Override
	public void demoUserPassword() {
		System.out.println("1234567");
		
		
	}
	public static void main(String[]args) {
		AmazonBackendTeam obj= new AmazonBackendTeam();
		obj.demouserName("demo user1");
		obj.demoUserPassword();
	}
}
