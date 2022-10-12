package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class WebdriveMethods {

	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ankurjain\\Desktop\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
				ChromeDriver driver= new ChromeDriver();
		
				// get()
				driver.get("https://www.saucedemo.com/");
				
				// manage()
				driver.manage().window().maximize();
				
				// getCurrentUrl()
				
				String url = driver.getCurrentUrl();
				System.out.println(url);
				
				// getTitle()
				String title = driver.getTitle();
				System.out.println(title);
		
				// quit() // closes all browser tabs
		
				driver.quit();
				
				// close() //closes current tab
				driver.close();
				
				
				

		
				
				
			
			
				

	}

}
