
package com.doctorappointmentbooking;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		AppointmentBooking ap = new AppointmentBooking();
		
		Scanner sc = new Scanner(System.in);
		
		ap.dataAdd();
		
		boolean flag = true;
		
		while(flag=true) {
			
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
			System.out.println("----------------------------------------------------------------------------");
			
			System.out.println("\t\t | Welcome To Doctor AppointmentBooking |");
			
			System.out.println("------------------------------------------------------------------------------");
			
			System.out.println("\n1. Doctor \t 2. Patient \t 3. Admin \t 4. Exit");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1: 
				
				ap.doctor();
				flag=true;
				break;
				
			case 2:
				
				ap.patient();
				flag=true;
			    break;
			    
			case 3:
				
				ap.admin();
			    flag=true;
			    break;
			    
			default:
				
				System.exit(0);
			
			}
		}
		
	}

}
