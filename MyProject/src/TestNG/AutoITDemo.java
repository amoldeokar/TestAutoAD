package TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITDemo {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file://///DRONA/Selenium%20Data/AshishP/HTML/HTMLTag1.html");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.cssSelector("input#txtUN"));
		username.clear();
		username.sendKeys("autoit");
		
		WebElement pwd1=driver.findElement(By.xpath("//input[@id='txtPassowrd']"));
		pwd1.clear();
		pwd1.sendKeys("autoit");
		
		driver.findElement(By.cssSelector("input#File1")).click();;
		
		
		//AutoIT
		//1. Download AutoIT tool, then using Finder & Editor , spy object and write code, build the script, Run executable
		
		try {
			Runtime.getRuntime().exec("//DRONA/Selenium Data/AshishP/Batch_75/AmolD/MyProject/src/AutoIT/WinFileUpload.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		WebElement name=driver.findElement(By.xpath("//input[@id='txtName']"));
		name.clear();
		name.sendKeys("111111111");

	}

}
