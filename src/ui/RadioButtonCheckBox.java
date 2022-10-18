package ui;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonCheckBox {

	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ankurjain\\Desktop\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
				ChromeDriver driver= new ChromeDriver();
				// Arrangement
				driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
				// Action
//				WebElement checkBoxOne = driver.findElement(By.cssSelector("input[value=\"option-1\"]"));
//				checkBoxOne.click();
//				checkBoxOne.click();
//				// Assertion
//				if(checkBoxOne.isSelected()) {
//					System.out.println("Checkbox is selected");
//				}
//				else {
//					System.out.println("Check box is not selected");
//				}
//				
				
				
				// selecting all the check box
				
				List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
				
				for(int i = 0 ; i < checkboxes.size() ; i++ ) {
					System.out.println(i);
					if(!checkboxes.get(i).isSelected()) {
						checkboxes.get(i).click();
					}
					
				}
				// Radio buttons
				
				driver.findElement(By.cssSelector("input[value=\"green\"]")).click();
				
				if(driver.findElement(By.cssSelector("input[value=\"green\"]")).isSelected()){
					System.out.println("Radio button selected");
				}
				else {
					System.out.println("Radio button not selected");
				}
				
				// Click on every radio button
				
	
				
				
				
				

	}

}
