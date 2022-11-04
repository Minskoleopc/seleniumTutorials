package ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleAuthenAlert {

	public static void main(String[] args) throws InterruptedException, IOException {
		Properties pro = new Properties();
		FileInputStream input = new FileInputStream(
				"C:\\Users\\ankurjain\\eclipse-workspace\\seleniumTutorials\\src\\ui\\testdata.properties");
		pro.load(input);

		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		System.out.println(username);
		System.out.println(password);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ankurjain\\Desktop\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
