package flipcart_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Flipcart_Elements {

	WebDriver driver;
	By loginbutton= By.xpath("//a[text() ='Login']");
	By closebutton = By.xpath("//button[text()='✕']");
	By searchbox   =By.xpath("//input[@name='q']");
	By searchbutton = By.xpath("//button[@type='submit']");
	
	Flipcart_Elements(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void input_SearchBox(String searchstr) throws Exception
	{
		driver.findElement(searchbox).sendKeys(searchstr);
		Thread.sleep(2000);
	}
	
	public void click_SearchButton() throws InterruptedException {
		driver.findElement(searchbutton).click();
		Thread.sleep(2000);
	}
	public void click_CloseButton() throws InterruptedException
	{
		driver.findElement(closebutton).click();
		Thread.sleep(2000);
	}
	
}
