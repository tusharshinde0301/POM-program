package test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		GoogleSearchPage.textbox_search(driver).sendKeys("Amazon");
		GoogleSearchPage.button_search(driver).submit();
		Thread.sleep(2000);
		
		driver.close();		
		}

}
