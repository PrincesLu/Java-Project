import java.util.Scanner;

public class BmiCalcu {
	public static double calculate (double weight, double height) {
		 double bmi = weight / (height * height);
		return bmi;
	}
	public static void main (String[] args) {
		// we'll use the scanner method to get the user input
		
		Scanner scanner = new Scanner(System.in); // we are creating an instance of a scanner 	
		System.out.println("What is your height in m?: ");
		double height = scanner.nextDouble();
		System.out.println("What is your weight in kg?: ");
		double weight = scanner.nextDouble(); 
		double bmi = calculate(weight, height); 
		System.out.println(bmi);
		
		if (bmi < 18.5) {
			System.out.println("Underweight ");
		} else if (bmi < 25) {
			System.out.println("Healthy weight ");
		} else { 
			System.out.println("Overweight ");

		}
		
	}

}
