package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ankurjain\\Desktop\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
				ChromeDriver driver= new ChromeDriver(); 
				
//				Javascript Executor
//				driver.get("https://www.makemytrip.com/");
//				driver.manage().window().maximize();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]")).click();
//				driver.findElement(By.id("fromCity")).click();
			
			
				// example
				driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
				driver.findElement(By.id("myInput")).sendKeys("Av");
				driver.findElement(By.id("myInput")).sendKeys(Keys.ARROW_DOWN);
				driver.findElement(By.id("myInput")).sendKeys(Keys.ENTER);
				driver.findElement(By.id("submit-button")).click();
				
				// validate url
			

	}

}
