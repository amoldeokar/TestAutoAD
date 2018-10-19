package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridDemo {

	public static void main(String[] args) {
		
		//Step1: Install Selenium Standalone Server from seleniumhq.org
		//Step2: java -jar <selenium server standlaone.jar> -role hub
		//Step3: Launch node into some other machine

		DesiredCapabilities c=DesiredCapabilities.firefox();
		
		c.setBrowserName("firefox");
		c.setPlatform(Platform.WINDOWS);
		
		WebDriver driver;
		try{
			driver = new RemoteWebDriver(new URL("http://192.168.1.60:4444/wd/hub"),c);
			driver.get("http://docs.seleniumhq.org/download/");
			
		}catch(MalformedURLException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
