package creatingAccount;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		Thread.sleep(Duration.ofSeconds(2));

		WebElement from = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input"));
		from.click();
		from.sendKeys("Pune");
		driver.quit();

	}

}
