package MyPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IfDemo {

	public static void main(String[] args) {
		
		int a=100;
		int b=50;
		String c;
		
		/*DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2014/08/06 15:59:48*/
		
	
		
		if (a==b){
			System.out.println("a is equal to b");
		 }
		else if(a>b){
			System.out.println("a is greater than b");
		}
			else if (a<b) {
			System.out.println("a is less than b");
		}
			else{
				System.out.println("None of the condition is matching.");
				}
		

 c = (a==b)? "a is equal to b" : (a>b)? "a is greater than b" : (a<b)? "a is less than b":"None of the condition matching";
 System.out.println(c); 
 
}
}
