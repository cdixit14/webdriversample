package testscript;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownloadTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		
//		Map<String, Object> prefs = new HashMap<String, Object>();
//		pref.put("download.prompt_for_download", false);
//		options.setExperimentalOption("pref", prefs);
		WebDriver driver = new ChromeDriver(options);
		
		//FirefoxProfile profile=new FirefoxProfile();
	//	profile.setPreference("browser.helperApps.neverAsk.openFile", 
	//	
		
	//	
		driver.manage().window().maximize();
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=79.0.3945.36/");
		Thread.sleep(2000);
		WebElement btnDownload = driver.findElement(By.xpath(".//a[text()='chromedriver_win32.zip']"));
		btnDownload.click();
		Thread.sleep(7000);
		

	}

}
