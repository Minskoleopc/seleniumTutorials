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
				//driver.get("https://www.saucedemo.com/");
				
				//Above
//				By username  = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
//				driver.findElement(username).sendKeys("standard_user");
//				
//				//Below
//				By password  = RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
//				driver.findElement(password).sendKeys("secret_sauce");
				
				
				// Above eg2
				
//				driver.get("https://webdriveruniversity.com/Data-Table/index.html");
//				By teaElement = RelativeLocator.with(By.id("tea")).above(By.id("milk"));
//				String q = driver.findElement(teaElement).getText();
//				System.out.println(q);
					
				driver.get("https://webdriveruniversity.com/Data-Table/index.html");
				By q = RelativeLocator.with(By.tagName("div")).above(By.className("active"));
				
				// below not correct
				driver.get("https://webdriveruniversity.com/Data-Table/index.html");
				By q1 = RelativeLocator.with(By.tagName("li")).below(By.id("espresso"));
				System.out.println(driver.findElement(q1).getText());
				
				
				//left-of
				
				By q2 = RelativeLocator.with(By.tagName("button")).toLeftOf(By.cssSelector("input[value=\"Submit\"]"));
				System.out.println(driver.findElement(q2).getText());
				
				//right-of
				
				By q3 = RelativeLocator.with(By.tagName("button")).toRightOf(By.cssSelector("input[value=\"Submit\"]"));
				System.out.println(driver.findElement(q2).getText());
				
			
				//near
		
				By q4 = RelativeLocator.with(By.tagName("button")).near(By.cssSelector("a[role=\"button\"]"));
				
				
				
			
			
				

	}

}
