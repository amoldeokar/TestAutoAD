package WDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		
		driver.get("file://///DRONA/Selenium%20Data/Aashish%20Pandey/HTML/Alert.html");
		driver.manage().window().maximize();
		
		//Open Alert
		if (driver.findElement(By.xpath("//input[@id='numb']")).isDisplayed())
		{
			if(driver.findElement(By.xpath("//input[@id='numb']")).isEnabled())
			driver.findElement(By.xpath("//input[@id='numb']")).sendKeys("11");
		}
				
		driver.findElement(By.cssSelector("input#btnAlert")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		///IMP steps
		driver.switchTo().window("");
		System.out.println(driver.findElement(By.cssSelector("span#output")).getText());
		
		//Open Confirmbox
		driver.findElement(By.cssSelector("input#btnConfirm")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		driver.switchTo().window("");
		System.out.println(driver.findElement(By.cssSelector("span#output")).getText());
		
		driver.findElement(By.cssSelector("input#btnConfirm")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().window("");
		System.out.println(driver.findElement(By.cssSelector("span#output")).getText());
		
		
		//Open Prompt
		driver.findElement(By.cssSelector("input#btnPrompt")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		driver.findElement(By.cssSelector("input#btnPrompt")).click();
		
		driver.switchTo().alert().sendKeys("I am fine!");
		driver.switchTo().alert().accept();
		driver.switchTo().window("");
		System.out.println(driver.findElement(By.cssSelector("span#output")).getText());
		
		
		
	//	driver.close();
		
	}

}
