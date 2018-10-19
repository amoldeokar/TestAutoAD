/** Day1 - Java
 * 
 */
package MyPackage;

import java.util.Scanner;

public class Program1 {

	
	public static void main(String[] args) {
		System.out.println("Welcome to Java");	
		System.out.println();
		int pointsearned;
		
		Boy objR,objP;
		objR= new Boy();
		objP= new Boy();
		
		objR.Name="Raju";
		objR.age=15;
		objR.ht=5;
		objR.wt=50;
		objR.hobby="playing cricket ";
		objR.run();
		objR.display();
		pointsearned=objR.pointsEarned(objR.ht, objR.wt);
		System.out.println(objR.Name + " has earned " + pointsearned + " points");
		objR.displayHobby();
		
		objP.Name="Pappu";
		objP.age=20;
		objP.ht=6;
		objP.wt=45;
		objP.hobby="playing football ";
		objP.run();
		objP.display();
		pointsearned=objP.pointsEarned(objR.ht, objR.wt);
		System.out.println(objP.Name + " has earned " + pointsearned + " points");
		objP.displayHobby();
		
		
		Boy objC=new Boy();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter name :"); objC.Name=scan.next();
		System.out.print("Enter age :" );  objC.age=scan.nextInt();
		System.out.print("Enter height :");  objC.ht= scan.nextInt();
		System.out.print("Enter weight :"); objC.wt = scan.nextInt();
		System.out.print("Enter hobby :");  objC.hobby = scan.next();
		
		objC.run();
		objC.display();
		pointsearned=objC.pointsEarned(objC.ht, objC.wt);
		System.out.println(objC.Name + " has earned " + pointsearned + " points");
		objC.displayHobby();
		
				
		Boy objM = new Boy("Manish",40,6,87);
		objM.run();
		objM.display();
		
	}

}




