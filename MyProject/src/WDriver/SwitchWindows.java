package WDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchWindows {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		
		driver.get("file://///DRONA/Selenium%20Data/AshishP/HTML/OpenWindow.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='numb']")).sendKeys("11");
		String fWndHandle = driver.getWindowHandle();
		
		driver.findElement(By.cssSelector("input#btnConfirm")).click();
		driver.findElement(By.xpath("//input[@id='numb']")).sendKeys("12");
		
		
		Set<String> wndHandles = driver.getWindowHandles();
		
		String sWH = null;
		
		for(String wndH:wndHandles)
		{
			driver.switchTo().window(wndH);
			driver.manage().window().maximize();
			sWH =wndH;
		}
		
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("amol");
		
		driver.switchTo().window(fWndHandle);
		driver.findElement(By.xpath("//input[@id='numb']")).clear();
		driver.findElement(By.xpath("//input[@id='numb']")).sendKeys("13");
		
		
		driver.switchTo().window(sWH);
		driver.findElement(By.cssSelector("input[name='firstName']")).clear();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("amolNEW");
		
		
	}

}
