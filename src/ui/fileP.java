package ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class fileP {

	public static void main(String[] args) throws InterruptedException, IOException {

		Properties pro = new Properties();	
		FileInputStream input = new FileInputStream("C:\\Users\\ankurjain\\eclipse-workspace\\seleniumTutorials\\src\\ui\\testdata.properties");
		pro.load(input);
		System.out.println(pro.getProperty("brower"));
		System.out.println(pro.getProperty("baseurl"));
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\ankurjain\\Desktop\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
//		ChromeDriver driver= new ChromeDriver(); 
//		driver.get(pro.getProperty("baseurl"));
		
		
		FileOutputStream output = new FileOutputStream("C:\\Users\\ankurjain\\eclipse-workspace\\seleniumTutorials\\src\\ui\\testdata.properties");
		pro.setProperty("city", "pune");
		pro.store(output, "storing the city");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
