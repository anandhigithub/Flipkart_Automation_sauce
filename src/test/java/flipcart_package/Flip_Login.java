package flipcart_package;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/*Problem Statement 1:
 * Search for ‘Mobile Phone’ on the ‘flipkart.com’ homepage.
 * Fetch all the mobile phones listed in the product listing page along with their prices and output them to an excel file and store them inside folder ‘testresult’ in
‘src/test/resources’
 */

public class Flip_Login {
	static WebDriver driver;
	static Flipcart_Elements elementobj;

	@Test
	public static void login_flipkart() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		elementobj = new Flipcart_Elements(driver);	 
		elementobj.click_CloseButton();
		driver.manage().window().maximize();
		elementobj.input_SearchBox("Mobile Phone");

		Thread.sleep(2000);
		elementobj.click_SearchButton();
		Thread.sleep(2000);

		//writing in excel sheet
		List<WebElement> mobilelist = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> pricelist = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		int no_mobiles = mobilelist.size();
		System.out.println("no of rows :"+no_mobiles);
		for(int i=0;i<no_mobiles;i++)
		{	 
			System.out.println(mobilelist.get(i).getText());
			System.out.println(pricelist.get(i).getText());

		}		  
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		XSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("Mobile Names");
		row.createCell(1).setCellValue("Price");
		int rows= no_mobiles;	
		for(int i=0;i<rows;i++)
		{

			XSSFRow r1 = sheet.createRow(i+1);			
			r1.createCell(0).setCellValue(mobilelist.get(i).getText());
			r1.createCell(1).setCellValue(pricelist.get(i).getText());

		}

		String filepath ="E:\\INTELLIPAAT\\java_src_files\\com.pom.flipcart\\src\\test\\java\\testresult.xlsx";
		File file=new File(filepath);
		FileOutputStream fop=new FileOutputStream(file);
		workbook.write(fop);
		workbook.close();
		System.out.println("Successfully written in excel");	
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
