package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ankurjain\\Desktop\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// sendKeys()
//		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
//		driver.findElement(By.cssSelector("input[name=\"first_name\"]")).sendKeys("Chinmay");
//		Thread.sleep(2000);
//		// clear()
//		driver.findElement(By.cssSelector("input[name=\"first_name\"]")).clear();

		//// click()
//		driver.findElement(By.cssSelector("input[name=\"first_name\"]")).sendKeys("Chinmay");
//		driver.findElement(By.cssSelector("input[name=\"last_name\"]")).sendKeys("Deshpande");
//		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("chinmaydeshpande010@gmail.com");
//		driver.findElement(By.cssSelector("textarea[name=\"message\"]")).sendKeys("I am learning python");
//		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		
		
		// getAttribute()
//		String val = driver.findElement(By.cssSelector("input[name=\"first_name\"]")).getAttribute("class");
//		System.out.println(val);
//		//class = "abc cde"
//	
//		// getText()
//		String val2 = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(val2);
//		
//		//getTagName()
//		String val3  = driver.findElement(By.cssSelector("[name=\"contactme\"]")).getTagName();
//		System.out.println(val3);
		
		

		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		// isDisplayed()
		boolean val4 = driver.findElement(By.cssSelector("input[value=\"cabbage\"]")).isDisplayed();
		System.out.println(val4);
		
		// isEnabled()
		boolean val5 = driver.findElement(By.cssSelector("input[value=\"cabbage\"]")).isEnabled();
		System.out.println(val5);
		
		boolean val6 = driver.findElement(By.cssSelector("input[value=\"pumpkin\"]")).isEnabled();
		System.out.println(val6);
		
		
		// isSelected()
		driver.findElement(By.cssSelector("input[value=\"pumpkin\"]")).click();
		boolean val7 = driver.findElement(By.cssSelector("input[value=\"pumpkin\"]")).isSelected();
		System.out.println(val7);
		
		boolean val8 = driver.findElement(By.cssSelector("input[value=\"lettuce\"]")).isSelected();
		System.out.println(val8);
		
		// getSize()
		
		System.out.println(driver.findElement(By.cssSelector(".thumbnail")).getSize());
		//getLocation()
		
		System.out.println(driver.findElement(By.cssSelector(".thumbnail")).getLocation());
		
		// getCssValue()
		
		String val9 = driver.findElement(By.tagName("h1")).getCssValue("color");
		System.out.println(val9);
		
		
		
		
		driver.quit();
		
		
		

	}

}
