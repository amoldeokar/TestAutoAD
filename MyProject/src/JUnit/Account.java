package JUnit;

import java.util.ArrayList;

public class Account {
	
	
	public static ArrayList getList()
	{
		ArrayList arrList = new ArrayList();
		arrList.add(10);
		arrList.add(20);
		arrList.add(30);
		arrList.add(40);
		
		return arrList;
	}
	
	public static int getInterest(int principal,int term,int interest )
	{
		return (principal*term*interest)/100;
	}
	

}

