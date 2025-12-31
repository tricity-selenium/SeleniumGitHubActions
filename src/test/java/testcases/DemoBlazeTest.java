package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBlazeTest {
  @Test
  public void verifyPageTitle() {
	  
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--headless");
	  options.addArguments("--no-sandbox");
	  options.addArguments("--disable-dev-shm-usage");

	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver = new ChromeDriver(options);
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  driver.get("https://demoblaze.com/index.html");
	  
	  Assert.assertEquals("QASTORE", driver.getTitle());
	  
	  
	  
  }
}
