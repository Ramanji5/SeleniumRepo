package maven_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asula\\OneDrive\\Documents\\Dinesh\\Automation\\chromedriver_win32_108\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//Navigate to URL
		
		driver.get("https://toolsqa.com/selenium-webdriver/selenium-tutorial/");
		
		//Wait condition
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);

	}

}
