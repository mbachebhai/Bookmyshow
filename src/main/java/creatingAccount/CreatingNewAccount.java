package creatingAccount;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingNewAccount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://in.bookmyshow.com/explore/home/mumbai");
		driver.findElement(By.xpath("//div[text()='Sign in']")).click();
		Thread.sleep(3000);

		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		for (String windowHandle : allWindowHandles) {
			if (!windowHandle.equals(mainWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		// now we are in the pop-up window
		WebElement phoneNumberField = driver.findElement(By.xpath("//input[@type='tel']"));
		phoneNumberField.sendKeys("9511885678");
		WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
		continueButton.click();
		driver.quit();
	}
}
