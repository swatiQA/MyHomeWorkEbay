package testcases;

import java.time.Duration;

import java.lang.Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ebay.mavenproject.App;
import com.ebay.mavenproject.Cart;
import com.ebay.mavenproject.HomePage;
import com.ebay.mavenproject.Search;

public class AppLuanchTest {

	WebDriver driver = null;
	String product = "Iphone";
	String category = "Cell Phones & Accessories";

	/*
	 * @BeforeTest
	 * 
	 * @Parameters("browser") public void setup(String browser) throws Exception{
	 * //Check if parameter passed from TestNG is 'firefox'
	 * if(browser.equalsIgnoreCase("firefox")){ //create firefox instance
	 * System.setProperty("webdriver.firefox.driver",
	 * "D:\\Test Automation\\geckodriver.exe"); driver = new FirefoxDriver(); }
	 * //Check if parameter passed as 'chrome' else
	 * if(browser.equalsIgnoreCase("chrome")){ //set path to chromedriver.exe
	 * System.setProperty("webdriver.chrome.driver",
	 * "D:\\Test Automation\\chromedriver.exe"); driver = new ChromeDriver(); } else
	 * if(browser.equalsIgnoreCase("Edge")){ //set path to Edge.exe
	 * System.setProperty("webdriver.edge.driver",
	 * "D:\\Test Automation\\msedgedriver.exe"); driver = new EdgeDriver(); } }
	 */

	@Test(priority = 0)
	public void launchChrome() {

		System.setProperty("webdriver.chrome.driver", "D:\\Test Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		App ap = new App();
		ap.invokeBrowser(driver);

		System.out.println("Successfully Launched the webpage");
		String logo = driver.findElement(By.id("gh-eb-My")).getText();
		System.out.println(logo);
		Assert.assertEquals(logo, "My eBay");
	}

	@Test(priority = 1)
	public void validateSearch() throws InterruptedException {
		
		Search s = null;
		s = HomePage.NavigateToSearch(driver, product, category);
		Thread.sleep(3000);
		String ActualName = s.getNthProduct(1,driver);
		String ExpectedName = "iPhone";
		Assert.assertTrue(ActualName.contains(ExpectedName));
		Search.SearchResultPage(driver);

		}

	 @Test(priority=2) 
	public void ValidateCart() throws InterruptedException {
	String ExpectedPrice= Search.AddtoCart(driver);
	Cart ca= new Cart();
	String ActualPriceInCart = ca.cartPage(driver);
	Assert.assertEquals(ActualPriceInCart, ExpectedPrice);
	System.out.println("Expected Price"+ExpectedPrice);
	System.out.println("Actual Price"+ActualPriceInCart);
	 
	  }
	 

	@AfterClass
	public void CleanUpDriver() throws Exception {
		// Quit current driver instance.
		try {
			driver.quit();
		} catch (Exception ex) {
			throw ex;
		}

	}
}
