package maven_project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asula\\OneDrive\\Documents\\Dinesh\\Automation\\ChromeWebdriver Latest Version\\chromedriver_win32\\chromedriver.exe");
		// Instantiate a ChromeDriver class
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("new-tab-button")).click();
		
		Set<String> windows =driver.getWindowHandles();
		
		for(String windowhandle: windows ) {
			driver.switchTo().window(windowhandle);
			String title= driver.getTitle();
			System.out.println("Title of the window: " + title);
			
			System.out.println(driver.getPageSource().contains("Here are the list of all the components"));
		}
		
		
	//driver.quit();
	}

}
