package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {

	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ankurjain\\Desktop\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
				ChromeDriver driver= new ChromeDriver();
				
				driver.get("https://www.saucedemo.com/");
	
				// sendKeys()
				WebElement username = driver.findElement(By.id("user-name"));
				username.sendKeys("chinmay");
				
				// clear()
				username.clear();
				
				//getText()
				
				String q1 = driver.findElement(By.tagName("h4")).getText();
				System.out.println(q1);
				
				
				
				// WebElements 
				// url  - practice
				//https://webdriveruniversity.com
				
				
				
			
		

	}

}
