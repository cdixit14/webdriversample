package testscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExlicitWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://uitestingplayground.com/ajax");
		WebDriver wait = (WebDriver) new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(By.id("ajaxutton")).click();
		
		
		wait.until(ExpectedConditions.textToBePresentInElement(
				driver.findElement(By.cssSelector("div#content")), "DATA loaded with AJAX"));
		
		S
		
	}
	

}
