package creatingAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActionsClass {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		/*
		 * WebElement move =
		 * driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
		 * a.moveToElement(move).build().perform();
		 */

		
		
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")))
.click().keyDown(Keys.SHIFT).sendKeys("mobiles").build().perform();
	}

}
