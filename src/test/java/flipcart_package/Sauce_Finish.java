package flipcart_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sauce_Finish {
	
	WebDriver driver;
	By button_finish = By.xpath("//button[@name='finish']");
	
	By button_cancel =By.xpath("//button[@name='cancel']");
	

	By button_checkout = By.xpath("//button[@name='checkout']");
	
	By button_menu =By.xpath("//button[@id='react-burger-menu-btn']");
	
	By button_logout = By.xpath("//a[@id='logout_sidebar_link']");
	
	
	Sauce_Finish(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void button_finish()
	{
	 driver.findElement(button_finish).click();
	}
	public void button_cancel()
	{
	 driver.findElement(button_cancel).click();
	}	
		
	public void verify_cartitems_totalcost()
	{
		List<WebElement> itemslist = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		int no_items= itemslist.size();
		System.out.println("No of Items bought :" +no_items);
		for (WebElement i: itemslist) {
			System.out.println("The Items are :"+i.getText());			
		}		
		WebElement total = driver.findElement(By.xpath("//div[@class='summary_total_label']"));
		System.out.println("Total cost is :"+ total.getText());
		
	}
	
}
