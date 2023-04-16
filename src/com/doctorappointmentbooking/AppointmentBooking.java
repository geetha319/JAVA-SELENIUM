
package com.doctorappointmentbooking;

import java.util.ArrayList;

import java.util.Scanner;

public class AppointmentBooking {
	
	ArrayList<String> doctorName = new ArrayList<String>();
	ArrayList<String> doctorQualification = new ArrayList<String>();
	ArrayList<String> doctorGender = new ArrayList<String>();
	ArrayList<String> doctorPassword = new ArrayList<String>();
	ArrayList<Integer> doctorAge = new ArrayList<Integer>();
	ArrayList<Long> doctorMobileNumber = new ArrayList<Long>();
	ArrayList<String> doctorCity = new ArrayList<String>();
	
	ArrayList<Integer> PatientAge = new ArrayList<Integer>();
	ArrayList<String> PatientName = new ArrayList<String>();
	ArrayList<String> patientGender = new ArrayList<String>();
	ArrayList<String> patientPassword = new ArrayList<String>();
	ArrayList<Integer> patientConfirmPassword = new ArrayList<Integer>();
	ArrayList<Long> patientMobileNumber = new ArrayList<Long>();
	
	ArrayList<Integer> PatientAgeBooking = new ArrayList<Integer>();
	ArrayList<String> PatientNameBooking = new ArrayList<String>();
	ArrayList<String> patientGenderBooking = new ArrayList<String>();
	ArrayList<Byte> DoctorID = new ArrayList<Byte>();
	
	
	void dataAdd() { // method for creating default doctors list present in the database
		
		doctorName.add("Murugan");
		doctorName.add("Ganesh");
		doctorName.add("siva");
		doctorName.add("aravind");
		doctorName.add("Ravi");
		doctorName.add("Karan");
		doctorName.add("tamil");
		
		doctorQualification.add("MBBS");
		doctorQualification.add("Er, MBBS");
		doctorQualification.add("MBBS, MD");
		doctorQualification.add("MBBS, MD");
		doctorQualification.add("BAMS");
		doctorQualification.add("MBBS, BD, Surgeon");
		doctorQualification.add("BAMS");
		
		doctorGender.add("M");
		doctorGender.add("M");
		doctorGender.add("M");
		doctorGender.add("M");
		doctorGender.add("M");
		doctorGender.add("M");
		doctorGender.add("M");
		
		doctorPassword.add("murugan1234");
		doctorPassword.add("ganesh12");
		doctorPassword.add("siva124");
		doctorPassword.add("aravind1234");
		doctorPassword.add("ravi1234");
		doctorPassword.add("karan1");
		doctorPassword.add("tamil234");
		
		doctorAge.add(25);
		doctorAge.add(30);
		doctorAge.add(29);
		doctorAge.add(28);
		doctorAge.add(23);
		doctorAge.add(29);
		doctorAge.add(24);
		
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		
		doctorCity.add("Chennai");
		doctorCity.add("Coimbatore");
		doctorCity.add("salem");
		doctorCity.add("Madurai");
		doctorCity.add("Thirchy");
		doctorCity.add("Thuthukudi");
		doctorCity.add("Thanjavur");
			
		}
	
	    void admin() throws Exception {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        byte choice;
	    	
	        boolean flag = true;
	        
	        while(flag) {
	        	
	        	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        	
	        	System.out.println("\t\t  ___________________");
	        	System.out.println("\t\t |                   |");
	        	System.out.println("\t\t |   Welcome Admin   |");
	        	System.out.println("\t\t |___________________|");
	        	System.out.println("\n\n1.Doctor List \t2.Registered Patients \t3.Patients with Appointment \n4.Main Menu \n\nExit");
	        	
	        	choice = sc.nextByte();
	        	
	        	switch(choice) {
	        	
	        	case 1:
	        		 for(int i = 0; i<=doctorName.size()-1; i++) {
	        			 
	        			 System.out.println("Name: \t " + doctorName.get(i));
	        			 
	        		 }
	        		 
	        		 byte menuChoice;
	        		 
	        		 System.out.println("\n\n1.Main Menu\t 2. Previous menu");
	        		 
	        		 menuChoice = sc.nextByte();
	        		 
	        		 if(menuChoice==1) {
	        			 
	        			 flag = false;
	        			 
	        		 } else {
	        			 
	        			 break;
	        			 
	        		 }
	        	   
	        		 break;
	        		 
	        	case 2: 
	        		
	        		if(PatientName.isEmpty()) {
	        			
	        			System.out.println("No Registered Patients Yet");
	        			
	        			break;
	        		
	        		} else {
	        			
	        			for(int i = 0; i<=PatientName.size()-1; i++) {
	        				
	        				System.out.println(i + " " + PatientName.get(i));
	        				
	        			}
	        			
	        			System.out.println("\"\\n\\n1.Main Menu\\t 2. Previous menu\"");
	        			
	        		    menuChoice = sc.nextByte();
	        		    
	        		    if(menuChoice==1) {
		        			 
		        			 flag = false;
		        			 
		        		 } else {
		        			 
		        			 break;
		        			 
		        		 }
		        	  	
	        		}
	        		
	        		break;
	        		
	        	case 3:
	        		
	        		if(PatientNameBooking.isEmpty()) {
	        			
	        			System.out.println("\nNo Appointments Yet.");
	        			break;
	        		 
	        		} else {
	        			
	        			for(int i = 0; i<=PatientNameBooking.size()-1; i++) {
	        				
	        				System.out.println(i + " " + PatientNameBooking.get(i));
	        				
	        			} 
	        			
                        System.out.println("\"\\n\\n1.Main Menu\\t 2. Previous menu\"");
	        			
	        		    menuChoice = sc.nextByte();
	        		    
	        		    if(menuChoice==1) {
		        			 
		        			 flag = false;
		        			 
		        		 } else {
		        			 
		        			 break;
		        			 
		        		 }
		        	  	
	        		}
	        		
	        		break;
	        			
	        	case 4: 
	        		
	        		flag = false;
	        		
	        		break;
	        		
	        	default:
	        			
	        		    System.out.println("Wrong Choice");
	        		    
	        		     flag = true;
	        		}
	        		
	        	}
	        	
	       }
	    
	    void patient() throws Exception {
	    	
	    	    Scanner sc = new Scanner(System.in);
		  		    	
		        boolean flag = true;
		        
		        while(flag) {
		        	
		        	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        	
		        	System.out.println("\t\t  _______________________________");
		        	System.out.println("\t\t |                              |");
		        	System.out.println("\t\t |   Welcome to Patient Page!   |");
		        	System.out.println("\t\t |______________________________|");
		        	
		        	System.out.println("1.Login \t 2.New Registration\n");
		        	
		        	int ch = sc.nextInt();
		        	
		        	switch(ch) {
		        	
		        	case 1:
		        		
		        		if(patientMobileNumber.isEmpty()) {
		        			
		        			System.out.println("First Register yourself then login...!");
		        			
		        			break;
		        			
		        		} else {
		        			
		        			patientLogin();  
		        			flag = false;
		        			
		        		}
		        		
		        		break;
		        		
		        	case 2:
		        		
		        		patientRegistration();
		        		flag = false;
		        		break;
		        		
		        	default: 
		        		
		        		System.out.println("You entered wrong choice. enter your choice again....!!!!");
		        		flag = true;
		        	    break;
		        	}
		        	
		        }
	    	
	    }
	    
	    void doctor() throws Exception {
	    	
	    	Scanner sc = new Scanner(System.in);
	    	
	    	int choice = 0;
	    	
	    	boolean flag = true;
	    	
	    	while(flag) {
	    		
	    		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    		
	    		System.out.println("\t\t  _______________________________");
	        	System.out.println("\t\t |                               |");
	        	System.out.println("\t\t |   Welcome to Doctors Page!    |");
	        	System.out.println("\t\t |_______________________________|");
	        	
	        	System.out.println("1.Login \t 2.New Registration\n");
	        	
	        	choice = sc.nextInt();
	        	
	        	switch(choice) {
	        	
	        	case 1:
	        		
	        		if(doctorMobileNumber.isEmpty()) {
	        			
	        			System.out.println("Register First.....!");
	        			flag = false;
	        			break;
	        		
	        		} else {
	        			
	        			doctorLogin();
	        			flag = false;
	        			break;
	        		}
	        		
	        		
	        		
	        	case 2:
	        		
	        		doctorRegistration();
	        		flag = false;
	        		break;
	        		
	        	default:
	        		
	        		System.out.println("You entered wrong choice. enter your choice again....!!!!");
	        		flag = true;
	        		break;
	        		
	        	}
	       }	
	 }
	    
	 void patientLogin() throws Exception {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 boolean flag = true;
		 
		 long mobileNumber;
		 byte choice;
		 
		 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		 
		System.out.println("\t\t  ___________________________");
     	System.out.println("\t\t |                           |");
     	System.out.println("\t\t |   Patient Login Details   |");
     	System.out.println("\t\t |___________________________|");
     	
     	System.out.println("Enter Your Username(mobilenumber)");
     	
     	mobileNumber = sc.nextLong();
     	
     	System.out.println("Enter Your Password");
     	
     	String password = sc.next();
     	
     	boolean flag1 = false;
     	
     	int j;
     	
     	for(j=0; j<=patientMobileNumber.size()-1; j++) {
     		
     		
     		if(patientMobileNumber.get(j).equals(mobileNumber)&&patientPassword.get(j).equals(password)) {
     			
     			flag1=true;
     			
     			break;
     		}
     		
     	}
     	
     	if(flag1==true) {
     		
     		 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    		 
     		System.out.println("\t\t  ___________________________");
          	System.out.println("\t\t |                           |");
          	System.out.println("\t\t |   Book the Appointment    |");
          	System.out.println("\t\t |___________________________|");
          	
          	System.out.println("\n Welcome " + PatientName.get(j) + "To book appointment, choose your doctor..");
          	
          	for(int i = 0; i<=doctorName.size()-1; i++) {
          		
          		System.out.println((i+1) + ". " + doctorName.get(i));
          		
          	}
          	
          choice = sc.nextByte();
          
          DoctorID.add(choice);
          
          while(flag) {
        	  
        	  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
     		 
       		    System.out.println("\t\t  ___________________________");
            	System.out.println("\t\t |                           |");
            	System.out.println("\t\t |   Book the Appointment    |");
            	System.out.println("\t\t |___________________________|");
            	
            	if(choice<=doctorName.size() && choice>0) {
            		
            		System.out.println("\n\n Name: \t" + doctorName.get(choice-1) + "\nAge: \t " + doctorAge.get(choice-1) + "\nQualification: \t" + doctorQualification.get(choice-1) );
            		
            		System.out.println("\n Enter Your Name: \t");
            		
            		sc.nextLine();
            		
            		PatientNameBooking.add(sc.nextLine());
            		
            		System.out.println("\n Enter Your age: \t");
            		
            		PatientAgeBooking.add(sc.nextInt());
            		
            		System.out.println("\n Enter Your gender: \t");
            		
            		patientGenderBooking.add(sc.next());
            		
            		System.out.println("\n Booking Successfull...");
            		
            		flag = false;
            		
            		break;
            	
            	} else {
            		
            		System.out.println("\n enter the correct input...");
            		
            		flag = true;
            		
   
            	}
        	  
            	
          }
     	
     	} else {
     		
     		System.out.println("Login Unsuccessfull...");
     		
     		flag=false;
     		
     	}
		 
	 }
	 
	 void patientRegistration() throws Exception {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int i = 0;
		 
		 long mobileNumber;
		 
		 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		  
		 System.out.println("\n");
		 
		 System.out.println("\t\t | Welcome To Patient Registration Page! |");
		 
		 System.out.println("\n");
		 
		 System.out.println("Please Enter Your Name:- ");
		 
		 PatientName.add(sc.nextLine());
		 
		 System.out.println("Please Enter Your age:- ");
		 
		 PatientAge.add(sc.nextInt());
		 
		 System.out.println("Please enter your mobile Number:- ");
		 
		 mobileNumber = sc.nextLong(); 
		 
		 Long mno;
		 
		 boolean flag = true, flag1 = true;
		 
		 if(patientMobileNumber.isEmpty()) {
			 
			 patientMobileNumber.add((mobileNumber));
			 
			 System.out.println("Enter Password");
			 
			 patientPassword.add(sc.next());
			 
			 System.out.println("Registration is Successfull...");
			 
			 flag1=false;
			 
		 } else {
			 
			 for(i=0; i<=patientMobileNumber.size()-1; i++) {
				 
				 
				 mno=patientMobileNumber.get(i);
				 
				 if(mno==mobileNumber) {
					 
					 flag1 = false;
					 
					 break;
					 
				 }
				 
			 }
			 
			 if(flag1==true) {
				 
				 
				 patientMobileNumber.add(mobileNumber);
				 
				 System.out.println("Enter Password");
				 
				 patientPassword.add(sc.next());
				 
				 System.out.println("Registration Is successfull.");
				 
			 } else {
				 
				 System.out.println("same mobile number is not allowed");
				 
			 }
			 
		 }
		 
	 }
	 
	 void doctorRegistration() throws Exception {
		 
         Scanner sc = new Scanner(System.in);
		 
		 int i = 0;
		 
		 long mobileNumber;
		 
		 boolean flag = true, flag1 = true;
		 
		 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		  
		 System.out.println("\n");
		 
		 System.out.println("\t\t | Welcome To Doctor Registration Page! |");
		 
		 System.out.println("\n");
		 
		 System.out.println("Please Enter Your Name:- ");
		 
		 PatientName.add(sc.nextLine());
		
		 System.out.println("Please enter your mobile Number:- ");
		 
		 mobileNumber = sc.nextLong(); 
		 
		 Long mno;
		 
		        if(doctorMobileNumber.isEmpty()) {
		        	
		        	doctorMobileNumber.add(mobileNumber);
		        	
		        	System.out.println("Enter The Password");
		        	
		        	doctorPassword.add(sc.next());
		        	
		        	System.out.println("Registration is Successfull.");
		        	
		        	flag1 = false;
		        	
		        } else {
		        	
		        	for(i=0; i<doctorMobileNumber.size()-1; i++) {
		        		
		        		
		        		mno = doctorMobileNumber.get(i);
		        		
		        		if(mno==mobileNumber) {
		        			
		        			flag1 = false;
		        			break;
		        			
		        		}
		        		
		        	}
		        	
		        	if(flag1==true) {
		        		
		        		  doctorMobileNumber.add(mobileNumber);
		        		  System.out.println("Enter Age: ");
		        		  doctorAge.add(sc.nextInt());
		        		  
		        		  System.out.println("Enter the city");
		        		  doctorCity.add(sc.next());
		        		  
		        		  System.out.println("Enter the password");
		        		  doctorPassword.add(sc.next());
		        		  System.out.println("Regitration is Successfull");
		        		  
		        		  System.out.println("Details: Name: " + doctorName + " number: " + doctorMobileNumber);
		        	 	
		        	} else {
		        		
		        		System.out.println("same mobile number is not allowed");
		        		
		        		int index = doctorName.size()-1;
		        		
		        		doctorName.remove(index);
		        		
		        	}
		        	
		    } 
	 }
	 
	 void doctorLogin() throws Exception {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 long mobileNumber;
		 
		 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		 
		    System.out.println("\t\t  _______________________________");
	     	System.out.println("\t\t |                               |");
	     	System.out.println("\t\t |   This is Doctor login Page   |");
	     	System.out.println("\t\t |_______________________________|");
	     	
	     	System.out.println("Enter Your Username(mobilenumber)");
	     	
	     	mobileNumber = sc.nextLong();
	     	
	     	System.out.println("Enter Your Password");
	     	
	     	String password = sc.next();
	     	
	     	int i = 0;
	     	
	     	byte choice;
	     	
	     	boolean flag = false;
	     	
	        boolean flag2 = true;
	        
	        for(i=0; i<=doctorMobileNumber.size()-1; i++) {
	        	
	        	
	        	if(doctorMobileNumber.get(i).equals(mobileNumber) && doctorPassword.get(i).equals(password)) {
	        		
	        		flag = true;
	        		
	        		break;
	        		
	        	}
	        	
	        }
		 
		    if(flag==true) {
		    	
		    	while(flag2) {
		    		
		    		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		    		
		    		System.out.println("\t\t  ____________________________________________________");
			     	System.out.println("\t\t |                                                    |");
			     	System.out.println("\t\t |   Welcome Doctor " + doctorName.get(i) + " " +   " |");
			     	System.out.println("\t\t |____________________________________________________|");
		    		
			     	System.out.println("\n\nPress 1 to see your Appoinments. \n");
			     	
			     	choice = sc.nextByte();
			     	
			     	byte j = 0;
			     	
			     	switch(choice) {
			     	
			     	case 1: 
			     		
			     		if(DoctorID.isEmpty()!=true) {
			     			
			     			while(j<=DoctorID.size()-1) {
			     				
			     				
			     				if((i+1) == DoctorID.get(j)) {
			     					
			     					
			     					System.out.println("Patient name: " + PatientNameBooking.get(j));
			     					
			     					j++;
			     					
			     				}
			     				
			     			}
			     			
			     			
			     		} else {
			     			
			     			System.out.println("No Appointments....!");
			     			
			     			flag2=true;
			     			
			     		}
			     	
			     	}
			     	
			     	break;
			     	
		    	}
		    	
		    }
		    
		    else {
		    	
		    	System.out.println("Login Unsuccessful..!");
		    	
		    }
	 }
	    
}


