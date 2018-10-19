package MyPackage;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter Age :");
		int age=scan.nextInt();
		
		System.out.print("Enter Name:");
		String Name=scan.next();
		
		System.out.println("Age :" + age);
		System.out.println("Name :" + Name);
		
		scan.close();		

	}

}
