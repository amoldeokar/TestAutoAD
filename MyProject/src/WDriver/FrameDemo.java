package WDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameDemo {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		
		driver.get("file://///DRONA/Selenium%20Data/Aashish%20Pandey/HTML/frame123.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("Frame1");
		driver.findElement(By.cssSelector("input#txtUserName")).sendKeys("amol123");
		driver.findElement(By.cssSelector("input#txtPassowrd")).sendKeys("password");
		
		//to navigate to main window
		driver.switchTo().window("");		

		driver.switchTo().frame("Frame2");
		driver.findElement(By.cssSelector("input#txtUserName")).sendKeys("amol123Frame2");
		driver.findElement(By.cssSelector("input#txtPassowrd")).sendKeys("passwordFrame2");
		
		
		driver.switchTo().window("");		

		driver.switchTo().frame("Frame3");
		driver.findElement(By.cssSelector("input#txtUserName")).sendKeys("amol123Frame3");
		driver.findElement(By.cssSelector("input#txtPassowrd")).sendKeys("passwordFrame3");
		
		driver.close();
	}

}
