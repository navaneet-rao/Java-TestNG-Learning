package TestNgPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver = new ChromeDriver();

	@Test
	public void testcase1() {
	}

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Dev\\eclipse-workspace\\Simple-TestNG-Program\\server\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mvnrepository.com/");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
