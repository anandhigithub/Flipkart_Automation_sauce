package flipcart_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sauce_Menu {
	
	WebDriver driver;
	
	By button_menu =By.xpath("//button[@id='react-burger-menu-btn']");
	
	By button_inventory = By.xpath("//a[@id='inventory_sidebar_link']");
	
	By button_closemenu = By.xpath("//button[text()='Close Menu']");
	
	By button_logout = By.xpath("//a[@id='logout_sidebar_link']");
	
	Sauce_Menu(WebDriver driver)
	{
		this.driver=driver;
	}

	//menu button
	
	public void button_menu()
	{
	 driver.findElement(button_menu).click();
	}
	public void button_inventory()
	{
	 driver.findElement(button_inventory).click();
	}
	
	public void button_closemenu()
	{
	 driver.findElement(button_closemenu).click();
	}
	public void button_logout()
	{
	 driver.findElement(button_logout).click();
	}
	
}
