package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mondayclass {
	WebDriver driver;  
	@Test
  public void gmail() {
			  driver.get("https://www.gmail.com");
  }
  @BeforeTest
  public void beforeTest() { 
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
//Kalavathi
