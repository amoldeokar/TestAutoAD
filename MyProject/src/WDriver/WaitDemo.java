package WDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		
		driver.get("file://///DRONA/Selenium%20Data/Aashish%20Pandey/HTML/HTMLTag11.html");
		driver.manage().window().maximize();
		
		if(driver.findElement(By.xpath("//input[@id='txtUN']")).isEnabled())
			driver.findElement(By.xpath("//input[@id='txtUN']")).sendKeys("Uname");
        
		driver.findElement(By.xpath("//input[@id='txtPassowrd']")).sendKeys("Passowrd");
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
    	WebDriverWait wbWait = new WebDriverWait(driver, 30);
    	wbWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUN")));
    	
    
    	
    	
    	driver.findElement(By.xpath("//input[@id='txtUN']")).sendKeys("UnameNEW");
    	
    	
    	driver.findElement(By.linkText("newtours.demoaut.com")).click();
		
	}

}
