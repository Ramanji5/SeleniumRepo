package maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asula\\OneDrive\\Documents\\Dinesh\\Automation\\ChromeWebdriver Latest Version\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://demoqa.com/buttons");
		 driver.manage().window().maximize();
		//Instantiate Action Class
		Actions action= new Actions();
	   WebElement button= driver.findElement(By.id("item-4"));
	   

	}

}
