package maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebStart {

	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\asula\\OneDrive\\Documents\\Dinesh\\Automation\\chromedriver_win32_89\\chromedriver.exe");
			
	        
	        WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
	

	}

}
