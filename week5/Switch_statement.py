package week5; 

import java.util.Scanner;

public class week5{
	public static void main (String [] args) {
		System.out.println("What's your name? ");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		switch(name) {
		    case "Gloria":
		    	System.out.println("Welcome miss! ");
		    	break;
		    case "Hopper":
		    	System.out.println("Please go to the other floor ");
		    	break;
		    default:
		    	System.out.println("Try again later");
		    	break;
		}
		
	}
}
