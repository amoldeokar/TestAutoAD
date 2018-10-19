package WDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondP {

	public static void main(String[] args) throws InterruptedException {
		String expTitle="Welcome: Mercury Tours";
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("file://///DRONA/Selenium%20Data/AshishP/HTML/HTMLTag1.html");
		driver.manage().window().maximize();
		
		// with By.tagName
		List <WebElement> listEdit=driver.findElements(By.tagName("input"));
		listEdit.get(0).clear();
		listEdit.get(0).sendKeys("tagname");
		
		
		// with By.CssSelector
		WebElement username=driver.findElement(By.cssSelector("input#txtUN"));
		username.clear();
		username.sendKeys("css1");
		
		WebElement username2=driver.findElement(By.cssSelector("input[id=txtUN]"));
		username2.clear();
		username2.sendKeys("css2");
		
		WebElement username3=driver.findElement(By.xpath("html/body/form[1]/input[1]"));
		username3.clear();
		username3.sendKeys("xpathUsername");
		


		WebElement pwd1=driver.findElement(By.xpath("//input[@id='txtPassowrd']"));
		pwd1.clear();
		pwd1.sendKeys("xpath1");
		
		WebElement pwd2=driver.findElement(By.xpath("//input[2]"));
		pwd2.clear();
		pwd2.sendKeys("xpath2");
		
		
			
		List <WebElement> listEdit1=driver.findElements(By.className("textboxcss"));
		//List <WebElement> listEdit1=driver.findElements(By.cssSelector("input.textboxcss"));
		listEdit1.get(0).clear();
		listEdit1.get(0).sendKeys("classname");
		
		/* with By.id
		 * WebElement username=driver.findElement(By.id("txtUN"));
		 * WebElement username=driver.findElement(By.name("userName"));
		username.clear();
		username.sendKeys("amol");*/

		WebElement pwd=driver.findElement(By.id("txtPassowrd"));
		pwd.clear();
		pwd.sendKeys("Passw0rd");
		
		//WebElement appURL=driver.findElement(By.linkText("newtours.demoaut.com"));
		WebElement appURL=driver.findElement(By.partialLinkText("newtours.demoaut"));
		appURL.click();
		
		String actTitle= driver.getTitle();
		
		if (actTitle.contentEquals(expTitle)== true) 
			System.out.println("Page title is matched with the expected title => "+expTitle);
		else if (actTitle.isEmpty())
			System.out.println("Page title is empty");
		else 	
			System.out.println("Page title: "+actTitle + " does NOT match with expected title: "+expTitle);

		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		driver.navigate().to("https://www.google.co.in");
		
		Thread.sleep(2500);
		driver.navigate().back();
		Thread.sleep(2500);
		driver.navigate().forward();
		Thread.sleep(2500);
		Thread.sleep(2500);
		driver.navigate().refresh();
		System.out.println("Page Refreshed...");
		//driver.close();
		driver.quit();
		
	
		
		
		
		
	}

}
