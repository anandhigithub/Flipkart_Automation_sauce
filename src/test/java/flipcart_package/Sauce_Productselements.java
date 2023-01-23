package flipcart_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sauce_Productselements {
	
	WebDriver driver;
	
	//2nd page
	
	By item_backpack = By.xpath("//div[text()='Sauce Labs Backpack']");
	By item_tshirt= By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']");
	By item_onesie=By.xpath("//div[text()='Sauce Labs Onesie']");
	By item_bikelight=By.xpath("//div[text()='Sauce Labs Bike Light']");
	By item_fleece=By.xpath("//div[text()='Sauce Labs Fleece Jacket']");
	By item_tshirt_red=By.xpath("//div[contains(text(),'Test.allTheThings')]");
	
	
	//addcart buttons
	By addcart_backpack= By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
	By addcart_tshirt= By.xpath("//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']");
	By addcart_onesie= By.xpath("//button[@name='add-to-cart-sauce-labs-onesie']");
	By addcart_bikelight= By.xpath("//button[@name='add-to-cart-sauce-labs-bike-light']");
	By addcart_fleece= By.xpath("//button[@name='add-to-cart-sauce-labs-fleece-jacket']");
	By addcart_tshirtred= By.xpath("//button[@name='add-to-cart-test.allthethings()-t-shirt-(red)']");
	
	//remove cart buttons
	By removecart_backpack= By.xpath("//button[@name='remove-sauce-labs-backpack']");
	By removecart_tshirt= By.xpath("//button[@name='remove-sauce-labs-bolt-t-shirt']");
	By removecart_onesie= By.xpath("//button[@name='remove-sauce-labs-onesie']");
	By removecart_bikelight= By.xpath("//button[@name='remove-sauce-labs-bike-light']");
	By removecart_fleece= By.xpath("//button[@name='remove-sauce-labs-fleece-jacket']");
	By removecart_tshirtred= By.xpath("//button[@name='remove-test.allthethings()-t-shirt-(red)']");

	//3rd page elements
	By button_backtoproducts = By.xpath("//button[@name='back-to-products']");	
	
	By button_shoppingcart = By.xpath("//a[@class='shopping_cart_link']");
	
	By button_continueshopping =By.xpath("//button[@name='continue-shopping']");
	
	By button_checkout = By.xpath("//button[@name='checkout']");
	
	By button_menu =By.xpath("//button[@id='react-burger-menu-btn']");
	
	By button_logout = By.xpath("//a[@id='logout_sidebar_link']");
	
	Sauce_Productselements(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//each product picture click

	//add to cart buttons
	public void item_backpack()
	{
	 driver.findElement(item_backpack).click();
	}
		
	public void item_tshirt()
	{
	 driver.findElement(item_tshirt).click();
	}
	
	public void item_onesie()
	{
	 driver.findElement(item_onesie).click();
	}
		
	public void item_bikelight()
	{
	 driver.findElement(item_bikelight).click();
	}
	public void item_fleece()
	{
	 driver.findElement(item_fleece).click();
	}
		
	public void item_tshirt_red()
	{
	 driver.findElement(item_tshirt_red).click();
	}
	
	
	
	
	//add to cart buttons
	public void button_addcart_backpack()
	{
	 driver.findElement(addcart_backpack).click();
	}
		
	public void button_addcart_tshirt()
	{
	 driver.findElement(addcart_tshirt).click();
	}
	
	public void button_addcart_onesie()
	{
	 driver.findElement(addcart_onesie).click();
	}
		
	public void button_addcart_bikelight()
	{
	 driver.findElement(addcart_bikelight).click();
	}
	public void button_addcart_fleece()
	{
	 driver.findElement(addcart_fleece).click();
	}
		
	public void button_addcart_tshirtred()
	{
	 driver.findElement(addcart_tshirtred).click();
	}
	
	
	/////// remove from cart buttons
	
	public void button_removecart_backpack()
	{
	 driver.findElement(removecart_backpack).click();
	}
		
	public void button_removecart_tshirt()
	{
	 driver.findElement(removecart_tshirt).click();
	}
	
	public void button_removecart_onesie()
	{
	 driver.findElement(removecart_onesie).click();
	}
		
	public void button_removecart_bikelight()
	{
	 driver.findElement(removecart_bikelight).click();
	}
	public void button_removecart_fleece()
	{
	 driver.findElement(removecart_fleece).click();
	}
		
	public void button_removecart_tshirtred()
	{
	 driver.findElement(removecart_tshirtred).click();
	}
		
	
	public void button_backtoproducts()
	{
	 driver.findElement(button_backtoproducts).click();
	}
	
	
	
}
