package maven_project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindowhandler {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asula\\OneDrive\\Documents\\Dinesh\\Automation\\ChromeWebdriver Latest Version\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		//Opening all child windows
		
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();
		
		//Main window handle
		
		String Mainwindow=driver.getWindowHandle();
		System.out.println("Main window handle is " +Mainwindow);
		
		//To handle all new opened window
		Set <String>s1= driver.getWindowHandles();
		System.out.println("Child window handle is " +s1);
		
		Iterator<String> i1=s1.iterator();
		
		//Here we will check if child window has other child windows and when the child window is the main window it will come out of loop
		
		while(i1.hasNext()) {
			String childwindow=i1.next();
			if(!Mainwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.close();
				System.out.println("Child window is closed");
			}
		}
		
	}

}
