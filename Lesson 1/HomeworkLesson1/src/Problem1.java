import java.util.Scanner;


public class Problem1 {

	public static void main(String[] args) {
		
		//Problem 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double firstInput = sc.nextDouble();
		System.out.println("Enter second number: ");
		double secondInput = sc.nextDouble();
		System.out.println("Enter third number: ");
		double thirdInput = sc.nextDouble();
		
		if (thirdInput > secondInput || thirdInput < firstInput  ) {
			 
	    System.out.println("Your " + thirdInput +" is between " + firstInput +" and "+ secondInput );

		}else {
			
			System.out.println("Your number is aout of scope,please insert anouther third number");
		}
		
		
		 
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
