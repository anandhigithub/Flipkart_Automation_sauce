package flipcart_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sauce_Complete {
	
	WebDriver driver;
	By button_backhome = By.xpath("//button[@name='back-to-products']");	
	
	By button_menu =By.xpath("//button[@id='react-burger-menu-btn']");
	
	By button_logout = By.xpath("//a[@id='logout_sidebar_link']");
	
	
	Sauce_Complete(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void button_backhome()
	{
	 driver.findElement(button_backhome).click();
	}
	
	
}
