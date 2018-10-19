package WDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver= new FirefoxDriver();
		
		driver.get("file://///DRONA/Selenium%20Data/Aashish%20Pandey/HTML/HTMLTag11.html");
		driver.manage().window().maximize();
		
		WebElement chkbox = driver.findElement(By.xpath("//input[@value='Travelling']"));
		chkbox.click();
		Thread.sleep(2000);
				
		System.out.println(driver.findElement(By.name("rbGender")).isSelected());
		
		Select mydrpdowncity=new Select(driver.findElement(By.id("selCity")));
		
		if (mydrpdowncity.isMultiple() != true )
		{
			System.out.println(driver.findElement(By.id("selCity")).getText());
			mydrpdowncity.selectByVisibleText("Pune");  Thread.sleep(2000);
			mydrpdowncity.selectByValue("ADI"); Thread.sleep(2000);
			mydrpdowncity.selectByIndex(1); Thread.sleep(2000);
		}
		
		Select mydrpdownMulticity=new Select(driver.findElement(By.name("selCity1")));
		System.out.println(mydrpdownMulticity.isMultiple());
		System.out.println(driver.findElement(By.name("selCity1")).getText());
		
		mydrpdownMulticity.selectByVisibleText("Pune");	Thread.sleep(2000);
		mydrpdownMulticity.selectByVisibleText("Ahmedabad");	Thread.sleep(2000);
		mydrpdownMulticity.selectByVisibleText("Indor");Thread.sleep(2000);
		mydrpdownMulticity.selectByIndex(0);Thread.sleep(2000);
		
		driver.close();
	}

}
