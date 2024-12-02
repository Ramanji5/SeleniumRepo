package maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asula\\OneDrive\\Documents\\Dinesh\\Automation\\ChromeWebdriver Latest Version\\chromedriver_win32\\chromedriver.exe");
		// Instantiate a ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();

        // Launch Website
		driver.get("https://www.cricbuzz.com/");
		
		//driver.quit();
		
		
	}

}
