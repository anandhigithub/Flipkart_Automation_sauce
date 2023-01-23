package flipcart_package;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*Problem Statement 2:
• Do login and validate if Login is successful.
• Search for ‘iPhone 12’ and select a 64GB phone on product details page after
selecting the phone from product listing page.
• Add the product to cart and validate if the product added and available in Cart.
• Add a new address for shipping and proceed to checkout page then validate it.
• Same test to be repeated on Chrome browser (assuming you’re using Firefox as
default browser else vice-versa).
• Any actions in any page are welcome (like sorting the products in product listing
page, page header assertions in each page to validate if on right page, etc).*/

public class TestingSauce {
	public static WebDriver driver;
	Sauce_loginelements login;
	Sauce_Productselements products;
	Sauce_Menu menu;
	Sauce_AddtoCart addtocart;
	Sauce_Checkout checkout;
	Sauce_Finish  consolidate;
	Sauce_Complete lastpage;
  
	@BeforeClass
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe")	;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();	
		Thread.sleep(5000);
		
		login= new Sauce_loginelements(driver);
		products = new Sauce_Productselements(driver);
		menu = new Sauce_Menu(driver);
		addtocart = new Sauce_AddtoCart(driver);
		checkout = new Sauce_Checkout(driver);
		consolidate = new Sauce_Finish(driver);
		lastpage = new Sauce_Complete(driver);
		
	}
	
  @Test(priority = 1)
  public void verify_Login() {
	  login.input_username("standard_user");
	  login.input_password("secret_sauce");
	  login.login_button();
	  String expectedurl ="https://www.saucedemo.com/inventory.html";
	  String actualurl = driver.getCurrentUrl();	 
	 // assertEquals(actualurl, expectedurl,"wrong login credentials");	
	 if(expectedurl.equals(actualurl))
	  {
		  System.out.println("Login success");		  
	  }
	 else
	 {
		//taking screen shot for login failed and close the webpage
		 System.out.println("Login failed"); 
		 WebElement errmsg= driver.findElement(By.xpath("//*[contains(text(),'Epic sadface')]"));
		 TakesScreenshot shot = (TakesScreenshot)errmsg;			

		 try {
			 File src= shot.getScreenshotAs(OutputType.FILE);
			 File dest = new
					 File("E:\\INTELLIPAAT\\java_src_files\\com.pom.flipcart\\src\\test\\resources\\defect.jpeg");
			 FileUtils.copyFile(src, dest);
		 }
		 catch (IOException e) {		
			 e.printStackTrace();
		 }
		 driver.close();
		}
	 }
	  

  
  @Test(priority = 2)
  public void addingcart() throws InterruptedException
  {
	  //selecting the items
	  products.item_backpack();
	  Thread.sleep(2000);
	  products.button_addcart_backpack();
	  Thread.sleep(2000);
	  products.button_backtoproducts();
	  Thread.sleep(2000);
	  products.item_fleece();
	  Thread.sleep(2000);
	  products.button_addcart_fleece();
	  Thread.sleep(2000);
	  products.button_backtoproducts();
	  Thread.sleep(2000);
	  products.item_onesie();
	  Thread.sleep(2000);
	  products.button_addcart_onesie();
	  Thread.sleep(2000);
	  products.button_backtoproducts();
	  Thread.sleep(2000); 
	  
	 //clicking the cart badge  
	  addtocart.button_shoppingcart();
	  Thread.sleep(2000);
	  //verifying the cart items
	  addtocart.verify_items_cart();
	  Thread.sleep(3000);
	  
	  //checkout the cart items
	  addtocart.button_checkout();
	  Thread.sleep(2000);
	  
	  //Giving the address
	  checkout.firstname("Anandhi");
	  Thread.sleep(2000);
	  checkout.lastname("S");
	  Thread.sleep(2000);
	  checkout.postalcode("123456");
	  Thread.sleep(2000);
	  
	  //proceed to payment
	  checkout.button_continue();
	  Thread.sleep(2000);
	  
	  //verify the cart items and its total cost
	  consolidate.verify_cartitems_totalcost();	 
	  Thread.sleep(3000);
	  consolidate.button_finish();
	  Thread.sleep(3000);
  }

	
@AfterClass
public void teardown() throws InterruptedException
{
	Thread.sleep(2000);
	driver.quit();
}

}