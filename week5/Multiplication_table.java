package week5;
import java.util.Scanner;

public class week5{
	public static void main (String [] args) {
		System.out.println("Welcome to the Multiplication Table");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Wich number's multiplication table would you like to see ?");
		int table = input.nextInt();
		System.out.println("What is the length of the table? ");
		int counter = input.nextInt();
		
		for (int i = 1; i <= counter; i++) {
			int total = table * i;
			System.out.println(table + " x " + i + " = " + total);
		}
		
	}
}
