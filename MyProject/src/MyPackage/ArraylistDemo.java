package MyPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingDeque;

//Arraylist can store multiple data type data and also no need to define size

public class ArraylistDemo {

	public static void main(String[] args) {
		
		ArrayList list1=new ArrayList();   ///NON-GENERIC type of arraylist
		list1.add("amol");
		list1.add(11);
		list1.add(1.2);
		
		Iterator itr1=list1.iterator();
			
		while(itr1.hasNext())
				{
					System.out.println(itr1.next());
				}
		
		System.out.print("********");
		//or Using for
		for(Object obj:list1)
			System.out.println(obj);
		
		System.out.print("********");
		//or
		System.out.println(list1);
		System.out.print("********");

		
		///Above should not be a good practice
		
		ArrayList <String>list2=new ArrayList<String>();  
		
		list2.add("AA");
		list2.add("CC");
		list2.add(0,"BB");
		
		Iterator<String> itr2=list2.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		System.out.println("********");
        //Or Using For
		for(String obj:list2)
		{
			System.out.println(obj);
		}
		System.out.println("********");
		
		
		ListIterator<String> listitr1=list2.listIterator();
		System.out.println("In forward directiion...");
		while(listitr1.hasNext())
		{
			System.out.println(listitr1.next());
		}
		System.out.println("********");
		
		System.out.println("In backward directiion...");
		while(listitr1.hasPrevious())
		{
			System.out.println(listitr1.previous());
		}
		System.out.println("********");
		
		
		
		ArrayList<String> list3=new ArrayList<String>();
		list3.add("EE");
		list3.add(0,"DD");
		
		list2.addAll(1,list3);
		//Or Using For
				for(String obj:list2)
				{
					System.out.println(obj);
				}
				System.out.println("********");
		
		ArrayList<String> list4= new ArrayList<String>();
		list4.add("AA");
		list4.add("BB");
		list4.add("GG");
		list4.add("PP");
		
		list2.addAll(list4);
		list2.remove(1);
		for(String obj:list2)
		{
			System.out.println(obj);
		}
		System.out.println("********");
		
		list2.removeAll(list4);
		for(String obj:list2)
		{
			System.out.println(obj);
		}
		System.out.println("********");
		
		list2.retainAll(list4);
		for(String obj:list2)
		{
			System.out.println(obj);
		}
		System.out.println("********");
		
		ArrayList<Employee> listEmp1=new ArrayList<Employee>();
		listEmp1.add(new Employee(001,"amol"));
		listEmp1.add(new Employee(002,"Ashish"));
		
		ArrayList<Employee> listEmp2=new ArrayList<Employee>();
		listEmp2.add(new Employee(003,"Lohit"));
		
		listEmp1.addAll(listEmp2);
		
		Iterator <Employee> itrEmp= listEmp1.iterator();
		
		while(itrEmp.hasNext())
		{
		 itrEmp.next().display();	
		}
		
		System.out.println("********");
		
	//	listEmp1.removeAll(listEmp2) ;  THIS WILL NOT WORK
		
/*		while(itrEmp.hasNext())
		{
		 itrEmp.next().display();	
		}
		*/
		
		
		///Diff Between SET and LIST is that List can have duplicate elements but Set can't have
		// Also 
		
	///// SEQ: Array >> ArrayList >> LinkedList (same like Arraylist) only storing of elements  differs >> HashSet (Stores Unique elements) >> TreeSet (Stores Unique elements and sort them by default
		
	
		HashSet <String>HS1= new HashSet<String>();
		HS1.add("AA");
		HS1.add("BB");
		HS1.add("GG");
		HS1.add("AA");
		HS1.add("BB");
		

		Iterator<String> itr3=HS1.iterator();    ///Can't use ListIteraor for HashSet
	
		while(itr3.hasNext())
		{
			System.out.println(itr3.next());
		}
		System.out.println("********");
		
		TreeSet <String>TS1= new TreeSet<String>();
		TS1.add("XYZ");
		TS1.addAll(list4);
		TS1.add("MM");
		TS1.add("BB");
		TS1.add("GG");
		TS1.add("AA");
		TS1.add("BB");
				

		Iterator<String> itr4=TS1.iterator();    ///Can't use ListIteraor for HashSet
	
		while(itr4.hasNext())
		{
			System.out.println(itr4.next());
		}
		System.out.println("********");
		
	}

}
