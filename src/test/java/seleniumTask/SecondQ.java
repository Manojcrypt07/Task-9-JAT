package seleniumTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondQ {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		if(driver.getTitle().equals("STORE")) {
			System.out.println("Page Landed on correct website");
		}
		else {
			System.out.println("Page not Landed on correct website");
		}
		

	}

}
