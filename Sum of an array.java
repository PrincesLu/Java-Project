package week10;
import java.util.ArrayList;
import java.util.Scanner;
public class week10 {

	public static void main(String[] args) {
		// adding value to the arraylist 
		
		Scanner input = new Scanner (System.in);
		ArrayList <Integer> myArray = new ArrayList<Integer>(); 
		System.out.println("Please enter a list of numbers and enter -1 to exit: ");
		
		int num = input.nextInt();
		while (num!= -1) {
			myArray.add(num);
			num = input.nextInt(); 
			}
		
		// the user types -1
		System.out.println("#########################################");
		System.out.println("#The numbers entered in the ArrayList are: #");
		System.out.println("############################################");
		
		// using enhanced for Loop to print all the elements in the ArrayList
		for (int i : myArray) {
			System.out.println(i);
		}
		
		
