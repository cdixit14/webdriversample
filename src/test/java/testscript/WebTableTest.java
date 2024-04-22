package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		List<WebElement> items = driver.findElements(By.xpath("//td[text()='B. Wagner']//following-sibling::td"));
	//	List<WebElement> items1 = driver.findElements(By.xpath("//td[contains(text(),'San Francisco')])//preceding-sibling::td"));
		System.out.println("Number of items..." + items.size());
		for(WebElement cell:items)
		{
			System.out.println(cell.getText());
		}
	}

}
