package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void facebook() {
	  driver.get("https://www.zomato.com");
  }
  @BeforeTest(groups="ai")
  public void beforeTest() {
  	driver = new ChromeDriver();
  	driver.manage().window().maximize();
  }
}
