package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ankurjain\\Desktop\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
				ChromeDriver driver= new ChromeDriver(); 
				driver.get("https://webdriveruniversity.com/IFrame/index.html");
				WebElement frame = driver.findElement(By.id("frame"));
				driver.switchTo().frame(frame);
				driver.findElement(By.cssSelector("a[href=\"index.html\"]")).click();
				System.out.println(driver.getTitle());
				driver.switchTo().parentFrame();
				
				
				

	}

}
