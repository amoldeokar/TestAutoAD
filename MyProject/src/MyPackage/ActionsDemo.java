package MyPackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ActionsDemo {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("file://///drona/Selenium%20Data/Aashish%20Pandey/HTML/WebPage/Welcome%20%20Mercury%20Tours.htm");
		
		WebElement lnkHome=driver.findElement(By.linkText("Home"));
		WebElement RowTag=driver.findElement(By.xpath("//td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"));
		
			
		Actions actiobBuilder = new Actions(driver);
		Action mouseoverHomeAction= actiobBuilder.moveToElement(lnkHome)
									.build();
		
		String bgcolor = RowTag.getCssValue("background-color");
		System.out.println("Before Hover :" + bgcolor);
		mouseoverHomeAction.perform();
		bgcolor = RowTag.getCssValue("background-color");
		System.out.println("Before Hover :" + bgcolor);
		 
		WebElement txtUName=driver.findElement(By.name("userName"));
		Action multipleActions =  actiobBuilder
				.moveToElement(txtUName)
				.click()
				.keyDown(txtUName, Keys.SHIFT)
				.sendKeys("Hi")
				.sendKeys("Hello")
				.keyUp(txtUName, Keys.SHIFT)
				.sendKeys("WORLD")
				.build();
				
		multipleActions.perform();
		
		//Drag n Drop
		
				WebDriver driver1 = new FirefoxDriver();
				driver1.get("file://///DRONA/Selenium%20Data/AshishP/Batch_75/AmolD/Droppable_%20jQueryUI.htm");
				driver1.manage().window().maximize();
				Actions actionsbuilder1 = new Actions(driver1);
			
				WebElement iframe = driver1.findElement(By.tagName("iframe"));
				System.out.println(iframe.getSize());
				driver1.switchTo().frame(iframe);
				
				WebElement From = driver1.findElement(By.id("draggable"));
				System.out.println(From.getLocation());
				
				WebElement To = driver1.findElement(By.id("droppable"));
				System.out.println(To.getLocation());
				
		  //  actionsbuilder1.dragAndDrop(From, To).build().perform();
 		//	actionsbuilder1.dragAndDropBy(From, 140, 18).build().perform();
				
				Action newaction = actionsbuilder1
									.clickAndHold(From)
									.moveToElement(To)
									.release(To)
									.build();
				
				newaction.perform();						
				
		
		
	}

}
