package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class relativeLocators {

	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ankurjain\\Desktop\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
				ChromeDriver driver= new ChromeDriver();
				driver.get("https://www.saucedemo.com/");
				
				//Above
				By username  = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
				driver.findElement(username).sendKeys("standard_user");
				
				//Below
				By password  = RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
				driver.findElement(password).sendKeys("secret_sauce");
				
				
				
				//left-of
				
				
				//right-of
				
				
				//near
		
				
				
			
			
				

	}

}
