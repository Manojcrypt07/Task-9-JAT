package seleniumTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstQ {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		System.out.println("The current page URL is:-" + driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();


	}

}
