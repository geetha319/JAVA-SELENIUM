package com.wordguessing;

import java.util.Scanner;

public class wordGuessingApp {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String secretWord="horse";
		String guess="";
		int guesscount=0;
		int guesslimit=4;
		boolean outofGuesses=false;
		while(!guess.equals(secretWord)&&!outofGuesses) {
			if(guesscount<guesslimit) {
				System.out.println("Guess the word:-"+"s_r_e_h_o");
				System.out.println();
				System.out.println("Hint:-Animals");
				System.out.println();
				System.out.println("Note:-you have only 4 guesses");
				System.out.println();
				System.out.println("Enter a guess:-");
				guess=sc.nextLine();
				guesscount ++;
			} else {
				outofGuesses=true;
			}
		}
		if(outofGuesses) {
			System.out.println("you lose:no more guesses");
		}else {
			System.out.println("you win the game!");
		}
		
	}

}
