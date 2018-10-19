package WDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptExecDemo {

	public static void main(String[] args) {
			
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor jsexec = (JavascriptExecutor)driver;
		jsexec.executeScript("alert('Hi... This alert is from selenium program.');");
		
		WebDriverWait wbWait = new WebDriverWait(driver, 30);
    	wbWait.until(ExpectedConditions.alertIsPresent());
    	    	
		driver.switchTo().alert().accept();
		
		String currentURLUsingJS=(String)jsexec.executeScript("return document.domain");
		System.out.println("Domain Name :" + currentURLUsingJS);
		
		
	}

}
