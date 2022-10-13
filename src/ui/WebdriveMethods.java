package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriveMethods {

	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ankurjain\\Desktop\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
				ChromeDriver driver= new ChromeDriver();
		
//				// get()
//				driver.get("https://www.saucedemo.com/");
//				
//				//manage()
//				driver.manage().window().maximize();
//				
//				// title()
//				
//				String title = driver.getTitle();
//				System.out.println(title);
//				
//				// driver.getPageSource()
//				
//				String pageSource = driver.getPageSource();
//				//System.out.println(pageSource);
//				
//				// getCurrentUrl()
//	
//				String currentUrl = driver.getCurrentUrl();
//				System.out.println(currentUrl);
//				
//				// navigate();
//				//driver.navigate().to("https://www.tutorialspoint.com/how-to-get-page-source-as-it-is-in-browser-using-selenium");
//				
//				
//				// close()
//				//driver.close();
//				
//				// quit()
//				
//				// findElement() // one webElement
//				WebElement e = driver.findElement(By.cssSelector("#user-name"));
//				WebElement e2 = driver.findElement(By.id("user-name"));
//				
//				
//				
//				// findElements()
//				// auto shift + ctrl + O
//				
//				
				 driver.get("https://www.saucedemo.com/");
				 driver.findElement(By.id("user-name")).sendKeys("standard_user");
				 driver.findElement(By.id("password")).sendKeys("secret_sauce");
				 driver.findElement(By.id("login-button")).click();
				 List<WebElement> k = driver.findElements(By.className("inventory_item"));
				 System.out.println(k.size());
				 
				
			
				driver.quit();
				
				
				// Iframe
				// getWindowHandle()
				// getWindowHandles()
				// SwitchTo()
				
				
				
				
			
		

	}

}
