package Lecture7;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number : ");
		Integer number = sc.nextInt();
		//sc.close();
		
		int[] arrayNumber =  new int [10];
		arrayNumber[0]= number;
		arrayNumber[1]= number;
		
		for (int i = 2; i < arrayNumber.length  ; i++) {
			
			arrayNumber[i] = arrayNumber[i - 1] + arrayNumber[i - 2];
			
		}
		
		System.out.println(Arrays.toString( arrayNumber).replace("[", " ").replace("]", " "));
		
		
		
		
		// TODO Auto-generated method stub

	}

}
