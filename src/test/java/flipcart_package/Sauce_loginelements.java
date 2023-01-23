package flipcart_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sauce_loginelements {
	
	WebDriver driver;
	By username = By.xpath("//input[@id='user-name']");
	By password = By.xpath("//input[@id='password']");
	By loginbutton = By.xpath("//input[@id='login-button']");
	
	
	
	Sauce_loginelements(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void input_username(String user)
	{
	 driver.findElement(username).sendKeys(user);	
	}
	
	public void input_password(String pwd)
	{
	 driver.findElement(password).sendKeys(pwd);	
	}
	
	public void login_button()
	{
	 driver.findElement(loginbutton).click();
	}

}
