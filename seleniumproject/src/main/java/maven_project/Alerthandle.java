package maven_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asula\\OneDrive\\Documents\\Dinesh\\Automation\\ChromeWebdriver Latest Version\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://demoqa.com/alerts");
		 driver.manage().window().maximize();
		 
		 //alert on screen
		driver.findElement(By.id("alertButton")).click();
		
		Alert Simplealert=driver.switchTo().alert();
         //Simplealert.accept();
		
		//Promt Alert
		
		WebElement element=driver.findElement(By.id("promtButton"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",element);
		    Alert prompt=driver.switchTo().alert();
		   String title= prompt.getText();
		   System.out.println("Alert text is " +title);
		   prompt.sendKeys("Ram");
		   prompt.accept();
		
				
		
		//Alert to perform an action to confirm
		driver.findElement(By.id("confirmButton")).click();
		Alert confirm= driver.switchTo().alert();
		String alerttext=confirm.getText();
		System.out.println("Alert Text is " +alerttext);
		confirm.accept();
		
		
		

	}

}
