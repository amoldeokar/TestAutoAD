package WDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenshotDemo {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new FirefoxDriver();
		
		driver.get("file://///DRONA/Selenium%20Data/AshishP/HTML/HTMLTag1.html");
		driver.manage().window().maximize();
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println("getTitle : "+driver.getTitle().toString());
		System.out.println("getCurrentURL : "+driver.getCurrentUrl());
		
		System.out.println("Program Start ....");
		try {
			FileUtils.copyFile(screenshot,new File("E:\\" + driver.getTitle().toString()+".jpg"));
		} 
		
//		catch (Exception e) {  // this should be below specific excepion
	//		e.printStackTrace(); 
		
		catch (IOException e) { //specific file IO related execption
					e.printStackTrace();
					throw e; //good practice to thorw the error
		}
		
		catch (Exception e) { //Generic exception
			e.printStackTrace();
			throw e;
		}
		
		finally {  ///to cleanup the memory blocked due to exception or any closing , this block will be executed atleast once irresptive of any exception
		
			System.out.println("Into Finally ...");
			
		}
		
		System.out.println("Program Contiue ....");
		
		// Try - catch block allows to do something if exception occurs for e.g. send an email etc.. 
		//whereas in case of Throws it doesn't allow

	}

}


