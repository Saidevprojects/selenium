package sikuli;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class WebAutomation {
	WebDriver driver;
	Screen s = new Screen();
  @Test
  public void f() throws InterruptedException, FindFailed {
	  driver.get("https://www.techlearn.in/");
	  Thread.sleep(3000);
	  s.click("C:\\Users\\Documents\\lib\\sikuli\\downloads.png");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  }

}
