package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Chrome Driver and Browser should match
		// Set the Path of Executable Browser Driver
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ankurjain\\Desktop\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
				ChromeDriver driver= new ChromeDriver(); //Parent p=new Child   (WebDriver is Parent & ChromeDriver is Child)
//				driver.get("https://demoqa.com/automation-practice-form");  // opening url
//				
//				//  to get title of page
//				System.out.println(driver.getTitle());
//				
//				// assertion
//				if(driver.getTitle().contains("ToolsQA")) {
//					System.out.println("Test case pass");
//				}
//				else {
//					System.out.println("Test case fail");
//				}
//				
//				
//				// locate by ID attribute
//				driver.findElement(By.id("firstName")).sendKeys("chinmay");
//				driver.findElement(By.id("lastName")).sendKeys("deshpande");
//				//Thread.sleep(2000);
//				//driver.findElement(By.id("gender-radio-1")).click();
//				
//				
//				// Locate by name attribute
//				driver.findElement(By.name("gender"));
//				
//				// locate the element by className
//				driver.findElement(By.className("practice-form-wrapper"));
				
				
				// program2
				// locate by partial LinkText
				driver.get("https://webdriveruniversity.com/");
				driver.findElement(By.partialLinkText("CONTACT US")).click();
				// closing the broswer
				driver.quit();  //closing browser
				
				
				
				
				// locate --- by id attribute
				// by className 
				// by Name
				// by partialLink text  
				
				// <a >Contact us</a>
				// partialLinkText -- Contact
				// linkText --Contact us
				
				
				
			
				
				
				
				

	}

}
