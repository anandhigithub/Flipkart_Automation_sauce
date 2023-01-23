package flipcart_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sauce_Checkout {
	
	WebDriver driver;
	
	
	//3rd page elements
	By firstname = By.xpath("//input[@name='firstName']");	
	
	By lastname = By.xpath("//input[@name='lastName']");
	
	By postalcode =By.xpath("//input[@name='postalCode']");
	
	By button_continue = By.xpath("//input[@name='continue']");
	
	By button_cancel =By.xpath("//button[@name='cancel']");
	

	By button_checkout = By.xpath("//button[@name='checkout']");
	
	By button_menu =By.xpath("//button[@id='react-burger-menu-btn']");
	
	By button_logout = By.xpath("//a[@id='logout_sidebar_link']");
	
	
	Sauce_Checkout(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void firstname(String fn)
	{
	 driver.findElement(firstname).sendKeys(fn);	
	}
	
	public void lastname(String ln)
	{
	 driver.findElement(lastname).sendKeys(ln);	
	}
	
	public void postalcode(String postal)
	{
	 driver.findElement(postalcode).sendKeys(postal);	
	}
	public void button_continue()
	{
	 driver.findElement(button_continue).click();
	}
	public void button_cancel()
	{
	 driver.findElement(button_cancel).click();
	}	

	
	
}
