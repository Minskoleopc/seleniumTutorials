package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe2 {

	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ankurjain\\Desktop\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
				ChromeDriver driver= new ChromeDriver(); 
				driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
				WebElement  e =driver.findElement(By.id("iframeResult"));
				driver.switchTo().frame(e);
				driver.findElement(By.cssSelector("body > button")).click();
				Thread.sleep(2000);
				System.out.println(driver.switchTo().alert().getText());
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				
				
				

	}

}
