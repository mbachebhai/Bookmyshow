package creatingAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTheMovie {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://in.bookmyshow.com/explore/home/mumbai");
		Thread.sleep(3000);
		
		WebElement searchBar=driver.findElement(By.xpath("//span[@id='4']"));
		searchBar.click();
		searchBar.sendKeys("Problem Toh Hai (UA)");
				
	}

}
