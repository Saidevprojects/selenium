package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.className("gLFyf")).sendKeys("Sai");
		Thread.sleep(2000);
	//	driver.manage().window().minimize();
	//	driver.manage().window().fullscreen();
	//	driver.close();
	//	driver.quit();

	}

}
