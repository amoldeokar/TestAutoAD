package WDriver;

import java.io.File;


import java.io.FileReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*    statement 1;  
    statement 2;  
    statement 3;  
    statement 4;  
    statement 5;//exception occurs  
    statement 6;  
    statement 7;  
    statement 8;  
    statement 9;  
    statement 10;  

Suppose there is 10 statements in your program and there occurs an exception at statement 5, rest of the code will not be executed i.e. statement 6 to 10 will not run. If we perform exception handling, rest of the statement will be executed. That is why we use exception handling in java.*/


public class ExceptionHandlingDemo {
	
	WebDriver driver= new FirefoxDriver();
	
	File f1=new File("E://1.txt");
	
	//FileReader fr=new FileReader(f1);
	
	

}
