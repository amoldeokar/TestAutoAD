package MyPackage;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		//String grade="C";
		//char grade='C';
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Grade :");
		String input = scan.next();
		char grade=input.charAt(0);
		
		switch(grade)
		{
		 case 'A':
			 System.out.println("Excellent"); break;
		 case 'B':
			 System.out.println("Well Done"); break;
		 case 'C':
		 case 'D':
			 System.out.println("You passed"); break;
		 case 'F':
			 System.out.println("Better try again");break;
		 default:      // this is optional	 
			 System.out.println("Invalid grade"); 
		}
		 System.out.println("Your grade is => "+grade ); 
		
	}

}
