package maven_project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sampledemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asula\\OneDrive\\Documents\\Dinesh\\Automation\\ChromeWebdriver Latest Version\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		driver.getPageSource().contains("Swag Labs");
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(3000);
		if (driver.getPageSource().contains("Remove"))
		{
			System.out.println("The page source contains Remove option");
		}
		else {
		System.out.println("Page does not contains Remove option");
		}
		
		driver.findElement(By.id("shopping_cart_container")).click();
		
		if (driver.getPageSource().contains("Checkout"))
		{
			System.out.println("Page contains Checkout option");
		}
		else 
		{
			System.out.println("Page does not contains Checkout option");
		}
		
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2500);
		driver.findElement(By.id("first-name")).sendKeys("Ram");
		driver.findElement(By.id("last-name")).sendKeys("A");
		driver.findElement(By.id("postal-code")).sendKeys("500081");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("finish")).click();
		
		if (driver.getPageSource().contains("Thank you for your order!"))
		{
			System.out.println("Payment has been completed! Thank you for your order!");
		}
		else 
		{
			System.out.println("Payement is failed");
		}
		//driver.close();
		
		driver.findElement(By.id("back-to-products")).click();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		driver.findElement(By.className("product_sort_container")).click();
		
		
		List <WebElement> dropdown = (List<WebElement>) driver.findElement(By.className("product_sort_container"));
		
		//Select list =new Select (dropdown);
		//list.selectByIndex(3);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                /.,/>/>
		
	}
		
		}

		
	


