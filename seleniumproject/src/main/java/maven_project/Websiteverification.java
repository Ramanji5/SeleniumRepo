package maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Websiteverification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asula\\OneDrive\\Documents\\Dinesh\\Automation\\ChromeWebdriver Latest Version\\chromedriver_win32\\chromedriver.exe");
		// Instantiate a ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		if(title.equals("google")) 
		{
			System.out.println("Pass: Title is google");
		}
		else
		{
			System.out.println("Fail: Title is not google: actual title is " +title);	
	}
		String url=driver.getCurrentUrl();
		if (url.contains("google.co.in"))
		{
			System.out.println("Pass: url has co.in");
		}
		else
		{
			System.out.println("Fail: url don't have co.in" +url);
		}
		}
		
		
	}
		

