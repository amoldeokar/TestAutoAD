package WDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstP {

	public static void main(String[] args) {
		
		String expTitle="Welcome: Mercury Tours";
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("file://///DRONA/Selenium%20Data/AshishP/HTML/HTMLTag1.html");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("txtUN"));
		username.clear();
		username.sendKeys("amol");

		WebElement pwd=driver.findElement(By.id("txtPassowrd"));
		pwd.clear();
		pwd.sendKeys("Passw0rd");
		
		WebElement appURL=driver.findElement(By.linkText("newtours.demoaut.com"));
		appURL.click();
		
		String actTitle= driver.getTitle();
		
		if (actTitle.contentEquals(expTitle)== true) 
			System.out.println("Page title is matched with the expected title => "+expTitle);
		else if (actTitle.isEmpty())
			System.out.println("Page title is empty");
		else 	
			System.out.println("Page title: "+actTitle + " does NOT match with expected title: "+expTitle);
	}

}
