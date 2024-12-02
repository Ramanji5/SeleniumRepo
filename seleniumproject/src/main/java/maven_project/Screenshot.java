package maven_project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\asula\\OneDrive\\Documents\\Dinesh\\Automation\\chromedriver_win32_114\\chromedriver.exe");
		
        
        WebDriver driver= new ChromeDriver();
		//Navigate to URL
		
		driver.get("https://toolsqa.com/selenium-webdriver/selenium-tutorial/");
		
		//Wait condition
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		
		//Take the screen shot
		File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
        //Copy the file to a location and use try catch block to handle exceptions
		try {
			
			FileUtils.copyDirectory(Screenshot, new File("C:\\Users\\asula\\OneDrive\\Documents\\Dinesh\\AutomationScreenshots\\Dinesh.png"));
		} catch(IOException e) {
			
			System.out.println(e.getMessage());
		}
		driver.close();
		

	}

}
